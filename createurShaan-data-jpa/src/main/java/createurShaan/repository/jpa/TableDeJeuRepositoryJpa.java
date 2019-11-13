package createurShaan.repository.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import createurShaan.Application;
import createurShaan.model.TableDeJeu;
import createurShaan.repository.ITableDeJeuRepository;


public class TableDeJeuRepositoryJpa implements ITableDeJeuRepository{
	
	@Override
	public List<TableDeJeu> findAll() {
		List<TableDeJeu> list = null;
		
		EntityManager em = null;
		EntityTransaction tx = null;
		
		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();
			
			tx.begin();
			
			TypedQuery<TableDeJeu> query = em.createQuery("from TableDeJeu", TableDeJeu.class);
			
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
	public TableDeJeu find(Long id) {
		TableDeJeu obj = null;

		EntityManager em = null;
		EntityTransaction tx = null;

		try {
			em = Application.getInstance().getEmf().createEntityManager();
			tx = em.getTransaction();

			tx.begin();

			obj = em.find(TableDeJeu.class, id);

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
	public TableDeJeu save(TableDeJeu obj) {
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
	public void delete(TableDeJeu obj) {
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
