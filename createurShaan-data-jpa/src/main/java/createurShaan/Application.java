package createurShaan;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import createurShaan.repository.IAlterationEtatRepository;
import createurShaan.repository.IAlterationPersonnageRepository;
import createurShaan.repository.ICasteRepository;
import createurShaan.repository.IJoueurRepository;
import createurShaan.repository.IMaitreDuJeuRepository;
import createurShaan.repository.IMetierRepository;
import createurShaan.repository.IPersonnageRepository;
import createurShaan.repository.IPeupleRepository;
import createurShaan.repository.IRaceRepository;
import createurShaan.repository.ITableDeJeuRepository;
import createurShaan.repository.jpa.AlterationEtatRepositoryJpa;
import createurShaan.repository.jpa.AlterationPersonnageRepositoryJpa;
import createurShaan.repository.jpa.CasteRepositoryJpa;
import createurShaan.repository.jpa.JoueurRepositoryJpa;
import createurShaan.repository.jpa.MaitreDuJeuRepositoryJpa;
import createurShaan.repository.jpa.MetierRepositoryJpa;
import createurShaan.repository.jpa.PersonnageRepositoryJpa;
import createurShaan.repository.jpa.PeupleRepositoryJpa;
import createurShaan.repository.jpa.RaceRepositoryJpa;
import createurShaan.repository.jpa.TableDeJeuRepositoryJpa;


public class Application {
	private static Application instance = null;
	
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("createurShaan");
	
	private final IAlterationPersonnageRepository alterationPersonnageRepo = new AlterationPersonnageRepositoryJpa();
	private final IAlterationEtatRepository alterationEtatRepo = new AlterationEtatRepositoryJpa();
	private final ICasteRepository casteRepo = new CasteRepositoryJpa();
	private final IJoueurRepository joueurRepo = new JoueurRepositoryJpa();
	private final IMaitreDuJeuRepository maitreDuJeuRepo = new MaitreDuJeuRepositoryJpa();
	private final IMetierRepository metierRepo = new MetierRepositoryJpa();
	private final IPersonnageRepository personnageRepo = new PersonnageRepositoryJpa();
	private final IPeupleRepository peupleRepo = new PeupleRepositoryJpa();
	private final IRaceRepository raceRepo = new RaceRepositoryJpa();
	private final ITableDeJeuRepository tableDeJeuRepo = new TableDeJeuRepositoryJpa();
	
	
	private Application() {
	}
	
	public static Application getInstance() {
		if (instance == null) {
			instance = new Application();
		}

		return instance;
	}

	public EntityManagerFactory getEmf() {
		return emf;
	}
}
