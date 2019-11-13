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
import tpVolRepository.IAeroportRepository;
import tpVolRepository.ICompagnieVolRepository;
import tpVolRepository.Jpa.AeroportRepositoryJpa;


public class Application {
	private static Application instance = null;
	
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("createurShaan");
	
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private final IAcquisRepository acquisRepo = new AcquisRepositoryJpa();
	private final IBonusPersonnageRepository bonusPersonageRepo = new BonusPersonnageRepositoryJpa();
	private final IDomainePersonnageRepository domainePersonnageRepo = new DomainePersonnageRepositoryJpa();
	private final IDomaineRepository domaineRepo = new DomaineRepositoryJpa();
	private final IMotivationPersonnageRepository motivationPersonnageRepo = new MotivationPersonnageRepositoryJpa();
	private final IMotivationRepository motivationRepo = new MotivationRepositoryJpa();
	private final IPouvoirPersonnageRepository pouvoirPersonnageRepo = new PouvoirPersonnageRepositoryJpa();
	private final IPouvoirRepository pouvoirRepo = new PouvoirRepositoryJpa();
	private final ISpecialisationRepository specialisationRepo = new SpecialisationRepositoryJpa();
	
	
	
}
