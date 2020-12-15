package examen.zeas.andres.dao;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import examen.zeas.andres.modelo.Paquete;

public class PaqueteDAO {
	
	@Inject
	private EntityManager em;
	
	public PaqueteDAO() {
		
	}
	
	
	public boolean insertJPA(Paquete entity) throws SQLException{
		Object em;
		em.persist(entity);
		return true;
	}

	public Paquete readJPA(int id) {
		Paquete paquete = em.find(Paquete.class, id);
		return paquete;
	}
	
	public boolean deleteJPA(int id) throws SQLException{
		Paquete paquete = this.readJPA(id);
		em.remove(paquete);
		return true;
	}
	
	public List<Paquete> getPaquete(){
		String jpql = "SELECT p FROM Paquete c WHERE id = ?";
		Query q = em.createQuery(jpql, q.setParameter(1, 1));
		return (List<Paquete>) q.getResultList();
	}
}
