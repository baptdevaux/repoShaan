package createurShaan.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import createurShaan.Application;
import createurShaan.model.Race;
import createurShaan.repository.IRaceRepository;

public class RaceRepositoryJpa implements IRaceRepository {

	@Override
	public List<Race> findAll() {
		List<Race> list = null;
		
		EntityManager em = null;
		EntityTransaction tx = null;
		
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			
			tx.begin();
			
			TypedQuery<Race> query = em.createQuery("from Race", Race.class);
			
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
	public Race find(Long id) {
		Race obj = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			obj = em.find(Race.class, id);

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
	public Race save(Race obj) {
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
	public void delete(Race obj) {
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
