package examen.zeas.andres.dao;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import examen.zeas.andres.modelo.Remitente;

public class RemitenteDAO {

	@Inject
	private EntityManager em;
	
	public boolean insertJPA(Remitente entity) throws SQLException{
		Object em;
		em.persist(entity);
		return true;
	}

	public Remitente readJPA(int id) {
		Remitente remitente = em.find(Remitente.class, id);
		return remitente;
	}
	
	public boolean deleteJPA(int id) throws SQLException{
		Remitente remitente = this.readJPA(id);
		em.remove(remitente);
		return true;
	}
	
	public List<Remitente> getPaquete(){
		String jpql = "SELECT p FROM Paquete c WHERE id = ?";
		Query q = em.createQuery(jpql, q.setParameter(1, 1));
		return (List<Remitente>) q.getResultList();
	}
}
