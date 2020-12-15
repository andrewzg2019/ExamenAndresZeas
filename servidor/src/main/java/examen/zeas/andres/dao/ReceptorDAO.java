package examen.zeas.andres.dao;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import examen.zeas.andres.modelo.Receptor;

public class ReceptorDAO {
	
	@Inject
	private EntityManager em;
	
	public boolean insertJPA(Receptor entity) throws SQLException{
		Object em;
		em.persist(entity);
		return true;
	}

	public Receptor readJPA(int id) {
		Receptor receptor = em.find(Receptor.class, id);
		return receptor;
	}
	
	public boolean deleteJPA(int id) throws SQLException{
		Receptor receptor = this.readJPA(id);
		em.remove(receptor);
		return true;
	}
	
	public List<Receptor> getPaquete(){
		String jpql = "SELECT p FROM Paquete c WHERE id = ?";
		Query q = em.createQuery(jpql, q.setParameter(1, 1));
		return (List<Receptor>) q.getResultList();
	}
	

}
