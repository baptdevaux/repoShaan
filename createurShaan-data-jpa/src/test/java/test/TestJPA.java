package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import createurShaan.Application;
import createurShaan.model.Acquis;
import createurShaan.model.AlterationEtat;
import createurShaan.model.BonusPersonnage;
import createurShaan.model.Caste;
import createurShaan.model.Domaine;
import createurShaan.model.DomainePersonnage;
import createurShaan.model.Metier;
import createurShaan.model.Motivation;
import createurShaan.model.MotivationPersonnage;
import createurShaan.model.Personnage;
import createurShaan.model.Peuple;
import createurShaan.model.Pouvoir;
import createurShaan.model.PouvoirPersonnage;
import createurShaan.model.Race;
import createurShaan.model.Specialisation;
import createurShaan.model.TableDeJeu;
import createurShaan.repository.IAcquisRepository;
import createurShaan.repository.IAlterationEtatRepository;
import createurShaan.repository.IBonusPersonnageRepository;
import createurShaan.repository.ICasteRepository;
import createurShaan.repository.IDomainePersonnageRepository;
import createurShaan.repository.IDomaineRepository;
import createurShaan.repository.IMetierRepository;
import createurShaan.repository.IMotivationPersonnageRepository;
import createurShaan.repository.IMotivationRepository;
import createurShaan.repository.IPersonnageRepository;
import createurShaan.repository.IPeupleRepository;
import createurShaan.repository.IPouvoirPersonnageRepository;
import createurShaan.repository.IPouvoirRepository;
import createurShaan.repository.IRaceRepository;
import createurShaan.repository.ISpecialisationRepository;
import createurShaan.repository.ITableDeJeuRepository;




public class TestJPA {
	public static void main(String[] args) throws ParseException {

	EntityManagerFactory emf = Application.getInstance().getEmf();

	
	Personnage theau = new Personnage();
	
	IPersonnageRepository personnageRepository = Application.getInstance().getPersonnageRepo();
	
	theau.setAge(22);
	theau.setAme(5);
	theau=personnageRepository.save(theau);

	
	
	Peuple sable = new Peuple();
	
	IPeupleRepository peupleRepository = Application.getInstance().getPeupleRepo();
	
	sable.setNomPeuple("Sable");

	
	sable = peupleRepository.save(sable);
	
	
	
	Race delhion = new Race();
	
	IRaceRepository raceRepository = Application.getInstance().getRaceRepo();
	
	delhion.setCouleurSymbolique("gris");
	delhion.setElementTotem("nature");
	delhion.setLangues("la langue de chez les Delhion");
	delhion.setNomRace("Delhion");
	
	delhion = raceRepository.save(delhion);
	
	
	
	
	Metier prestidigitateur = new Metier();
	
	IMetierRepository metierRepository = Application.getInstance().getMetierRepo();			
	
	prestidigitateur.setNomMetier("Développeur Java");
	prestidigitateur.setVoie("voie ferrée");
	
	prestidigitateur = metierRepository.save(prestidigitateur);
	
	
	
	Caste artiste = new Caste();
	
	ICasteRepository casteRepository = Application.getInstance().getCasteRepo();
	
	artiste.setNomCaste("artiste");
	
	artiste = casteRepository.save(artiste);
	
	
	
	AlterationEtat aveugle = new AlterationEtat();
	
	IAlterationEtatRepository alterationEtatRepository = Application.getInstance().getAlterationEtatRepo();
	
	aveugle.setNom("aveuglé");
	
	aveugle = alterationEtatRepository.save(aveugle);
	
	
	
	TableDeJeu parapleteam = new TableDeJeu();
	
	ITableDeJeuRepository tableDeJeuRepository = Application.getInstance().getTableDeJeuRepo();
	
	parapleteam.setNotes("Il y a du gateau et des meufs dans le frigo. Oups");
	
	parapleteam = tableDeJeuRepository.save(parapleteam);
	
	
	
	DomainePersonnage combatTheau = new DomainePersonnage();
	
	IDomainePersonnageRepository domainePersonnageRepository = Application.getInstance().getDomainePersonnageRepo();
	
	combatTheau.setRangDomaine(5);
	
	combatTheau = domainePersonnageRepository.save(combatTheau);
	
	
	
	Domaine rituel = new Domaine();
	
	IDomaineRepository domaineRepository = Application.getInstance().getDomaineRepo();
	
	rituel.setDescription("Représente la foi dans ");
	rituel.setNom("Rituels");
	
	rituel = domaineRepository.save(rituel);
	
	
	
	BonusPersonnage bonus = new BonusPersonnage();
	
	IBonusPersonnageRepository bonusPersonnageRepository =  Application.getInstance().getBonusPersonageRepo();
	
	bonus.setBonusPerso(5);
	bonus.setBonusAcquis(3);
	
	bonus = bonusPersonnageRepository.save(bonus);
	
	
	
	Acquis roulotte = new Acquis();
	
	IAcquisRepository acquisRepository = Application.getInstance().getAcquisRepo();
	
	roulotte.setCategorie("roulotte attelée");
	roulotte.setType("véhicule");
	roulotte.setDescription("Ceci est une roulotte attelée");
	
	roulotte = acquisRepository.save(roulotte);
	
	
	Specialisation vigilance = new Specialisation();
	
	ISpecialisationRepository specialisationRepository = Application.getInstance().getSpecialisationRepo();
	
	vigilance.setDescription("Parce qu'il faut toujours être à l'affût");
	vigilance.setNom("vigilance");
	
	vigilance = specialisationRepository.save(vigilance);
	
	MotivationPersonnage motivTheau = new MotivationPersonnage();
	IMotivationPersonnageRepository motivationPersonnageRepository = Application.getInstance().getMotivationPersonnageRepo();
	motivTheau=motivationPersonnageRepository.save(motivTheau);
	
	Motivation motiv = new Motivation();
	motiv.setDescription("aucune");
	motiv.setNomMotivation("motivé");
	IMotivationRepository motivRepository = Application.getInstance().getMotivationRepo();
	motiv=motivRepository.save(motiv);
	
	PouvoirPersonnage artsThéau = new PouvoirPersonnage();
	IPouvoirPersonnageRepository pouvoirPersonnageRepository = Application.getInstance().getPouvoirPersonnageRepo();
	artsThéau= pouvoirPersonnageRepository.save(artsThéau);
	
	Pouvoir power = new Pouvoir();
	IPouvoirRepository pouvoirRepository = Application.getInstance().getPouvoirRepo();
	power.setActivation("activaio");
	power=pouvoirRepository.save(power);
	
	
		
		
	
	
	
	
	
	
	
	
	
	}}
