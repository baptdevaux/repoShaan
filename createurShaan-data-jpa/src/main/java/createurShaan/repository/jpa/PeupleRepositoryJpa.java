package createurShaan.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import createurShaan.Application;
import createurShaan.model.Peuple;
import createurShaan.repository.IPeupleRepository;


public class PeupleRepositoryJpa implements IPeupleRepository{
	
	@Override
	public List<Peuple> findAll() {
		List<Peuple> list = null;
		
		EntityManager em = null;
		EntityTransaction tx = null;
		
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			
			tx.begin();
			
			TypedQuery<Peuple> query = em.createQuery("from Peuple", Peuple.class);
			
			list = query.getResultList();
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return list;
	}

	@Override
	public Peuple find(Long id) {
		Peuple obj = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			obj = em.find(Peuple.class, id);

			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}

		return obj;
	}

	@Override
	public Peuple save(Peuple obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			obj = em.merge(obj);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
		return obj;
	
	}

	@Override
	public void delete(Peuple obj) {
		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			em.remove(em.merge(obj));

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}

}
