package createurShaan;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import createurShaan.repository.IAcquisRepository;
import createurShaan.repository.IBonusPersonnageRepository;
import createurShaan.repository.IDomainePersonnageRepository;
import createurShaan.repository.IDomaineRepository;
import createurShaan.repository.IMotivationPersonnageRepository;
import createurShaan.repository.IMotivationRepository;
import createurShaan.repository.IPouvoirPersonnageRepository;
import createurShaan.repository.IPouvoirRepository;
import createurShaan.repository.ISpecialisationRepository;
import createurShaan.repository.jpa.AcquisRepositoryJpa;
import createurShaan.repository.jpa.BonusPersonnageRepositoryJpa;
import createurShaan.repository.jpa.DomainePersonnageRepositoryJpa;
import createurShaan.repository.jpa.DomaineRepositoryJpa;
import createurShaan.repository.jpa.MotivationPersonnageRepositoryJpa;
import createurShaan.repository.jpa.MotivationRepositoryJpa;
import createurShaan.repository.jpa.PouvoirPersonnageRepositoryJpa;
import createurShaan.repository.jpa.PouvoirRepositoryJpa;
import createurShaan.repository.jpa.SpecialisationRepositoryJpa;
import createurShaan.repository.IAlterationEtatRepository;
import createurShaan.repository.IAlterationPersonnageRepository;
import createurShaan.repository.ICasteRepository;
import createurShaan.repository.IJoueurRepository;
import createurShaan.repository.IMaitreDuJeuRepository;
import createurShaan.repository.IMetierRepository;
import createurShaan.repository.IPersonnageRepository;
import createurShaan.repository.IPeupleRepository;
import createurShaan.repository.IRaceRepository;
import createurShaan.repository.ISpecialisationAcquisRepository;
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
import createurShaan.repository.jpa.SpecialisationAcquisRepositoryJpa;
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
	private final IAcquisRepository acquisRepo = new AcquisRepositoryJpa();
	private final IBonusPersonnageRepository bonusPersonageRepo = new BonusPersonnageRepositoryJpa();
	private final IDomainePersonnageRepository domainePersonnageRepo = new DomainePersonnageRepositoryJpa();
	private final IDomaineRepository domaineRepo = new DomaineRepositoryJpa();
	private final IMotivationPersonnageRepository motivationPersonnageRepo = new MotivationPersonnageRepositoryJpa();
	private final IMotivationRepository motivationRepo = new MotivationRepositoryJpa();
	private final IPouvoirPersonnageRepository pouvoirPersonnageRepo = new PouvoirPersonnageRepositoryJpa();
	private final IPouvoirRepository pouvoirRepo = new PouvoirRepositoryJpa();
	private final ISpecialisationRepository specialisationRepo = new SpecialisationRepositoryJpa();
	private final ISpecialisationAcquisRepository specialisationAcquisRepo = new SpecialisationAcquisRepositoryJpa();
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

	public IAlterationPersonnageRepository getAlterationPersonnageRepo() {
		return alterationPersonnageRepo;
	}

	public IAlterationEtatRepository getAlterationEtatRepo() {
		return alterationEtatRepo;
	}

	public ICasteRepository getCasteRepo() {
		return casteRepo;
	}

	public IJoueurRepository getJoueurRepo() {
		return joueurRepo;
	}

	public IMaitreDuJeuRepository getMaitreDuJeuRepo() {
		return maitreDuJeuRepo;
	}

	public IMetierRepository getMetierRepo() {
		return metierRepo;
	}

	public IPersonnageRepository getPersonnageRepo() {
		return personnageRepo;
	}

	public IPeupleRepository getPeupleRepo() {
		return peupleRepo;
	}

	public IRaceRepository getRaceRepo() {
		return raceRepo;
	}

	public ITableDeJeuRepository getTableDeJeuRepo() {
		return tableDeJeuRepo;
	}

	public IAcquisRepository getAcquisRepo() {
		return acquisRepo;
	}

	public IBonusPersonnageRepository getBonusPersonageRepo() {
		return bonusPersonageRepo;
	}

	public IDomainePersonnageRepository getDomainePersonnageRepo() {
		return domainePersonnageRepo;
	}

	public IDomaineRepository getDomaineRepo() {
		return domaineRepo;
	}

	public IMotivationPersonnageRepository getMotivationPersonnageRepo() {
		return motivationPersonnageRepo;
	}

	public IMotivationRepository getMotivationRepo() {
		return motivationRepo;
	}

	public IPouvoirPersonnageRepository getPouvoirPersonnageRepo() {
		return pouvoirPersonnageRepo;
	}

	public IPouvoirRepository getPouvoirRepo() {
		return pouvoirRepo;
	}

	public ISpecialisationRepository getSpecialisationRepo() {
		return specialisationRepo;
	}


}
