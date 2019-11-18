package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import createurShaan.model.Acquis;
import createurShaan.model.AlterationEtat;
import createurShaan.model.AlterationPersonnage;
import createurShaan.model.BonusPersonnage;
import createurShaan.model.Caste;
import createurShaan.model.Domaine;
import createurShaan.model.DomainePersonnage;
import createurShaan.model.Joueur;
import createurShaan.model.MaitreDuJeu;
import createurShaan.model.Metier;
import createurShaan.model.Motivation;
import createurShaan.model.MotivationPersonnage;
import createurShaan.model.Personnage;
import createurShaan.model.PersonnageNonJoueur;
import createurShaan.model.Peuple;
import createurShaan.model.Pouvoir;
import createurShaan.model.PouvoirPersonnage;
import createurShaan.model.Race;
import createurShaan.model.Specialisation;
import createurShaan.model.SpecialisationAcquis;
import createurShaan.model.TableDeJeu;
import createurShaan.repository.IAcquisRepository;
import createurShaan.repository.IAlterationEtatRepository;
import createurShaan.repository.IAlterationPersonnageRepository;
import createurShaan.repository.IBonusPersonnageRepository;
import createurShaan.repository.ICasteRepository;
import createurShaan.repository.IDomainePersonnageRepository;
import createurShaan.repository.IDomaineRepository;
import createurShaan.repository.IJoueurRepository;
import createurShaan.repository.IMaitreDuJeuRepository;
import createurShaan.repository.IMetierRepository;
import createurShaan.repository.IMotivationPersonnageRepository;
import createurShaan.repository.IMotivationRepository;
import createurShaan.repository.IPersonnageRepository;
import createurShaan.repository.IPeupleRepository;
import createurShaan.repository.IPouvoirPersonnageRepository;
import createurShaan.repository.IPouvoirRepository;
import createurShaan.repository.IRaceRepository;
import createurShaan.repository.ISpecialisationAcquisRepository;
import createurShaan.repository.ISpecialisationRepository;
import createurShaan.repository.ITableDeJeuRepository;

public class TestJPA {
	public static void main(String[] args) throws ParseException {


		Joueur theauj = new Joueur();
		Personnage theau = new Personnage();
		Peuple sable = new Peuple();
		Race delhion = new Race();
		Metier prestidigitateur = new Metier();
		Caste artiste = new Caste();
		AlterationEtat aveugle = new AlterationEtat();
		TableDeJeu parapleteam = new TableDeJeu();
		DomainePersonnage combatTheau = new DomainePersonnage();
		Domaine rituel = new Domaine();
		BonusPersonnage bonus = new BonusPersonnage();
		Acquis roulotte = new Acquis();
		Specialisation vigilance = new Specialisation();
		MotivationPersonnage motivTheau = new MotivationPersonnage();
		Motivation motiv = new Motivation();
		PouvoirPersonnage artsTheau = new PouvoirPersonnage();
		Pouvoir power = new Pouvoir();
		AlterationPersonnage aveugleTheau = new AlterationPersonnage();
		MaitreDuJeu baptiste = new MaitreDuJeu();
		SpecialisationAcquis speRoulotte = new SpecialisationAcquis();
		PersonnageNonJoueur pnj = new PersonnageNonJoueur();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		IAlterationPersonnageRepository alterationPersonnageRepository = context.getBean(IAlterationPersonnageRepository.class);
		IJoueurRepository joueurRepository = context.getBean(IJoueurRepository.class);
		IPeupleRepository peupleRepository = context.getBean(IPeupleRepository.class);
		IPersonnageRepository personnageRepository = context.getBean(IPersonnageRepository.class);
		IRaceRepository raceRepository = context.getBean(IRaceRepository.class);
		IMetierRepository metierRepository = context.getBean(IMetierRepository.class);
		ICasteRepository casteRepository = context.getBean(ICasteRepository.class);
		IAlterationEtatRepository alterationEtatRepository = context.getBean(IAlterationEtatRepository.class);
		ITableDeJeuRepository tableDeJeuRepository = context.getBean(ITableDeJeuRepository.class);
		IDomainePersonnageRepository domainePersonnageRepository = context.getBean(IDomainePersonnageRepository.class);
		IDomaineRepository domaineRepository = context.getBean(IDomaineRepository.class);
		IBonusPersonnageRepository bonusPersonnageRepository = context.getBean(IBonusPersonnageRepository.class);
		IAcquisRepository acquisRepository = context.getBean(IAcquisRepository.class);
		ISpecialisationRepository specialisationRepository = context.getBean(ISpecialisationRepository.class);
		IMotivationRepository motivationRepository = context.getBean(IMotivationRepository.class);
		IMotivationPersonnageRepository motivationPersonnageRepository = context.getBean(IMotivationPersonnageRepository.class);
		IMotivationRepository motivRepository = context.getBean(IMotivationRepository.class);
		IPouvoirPersonnageRepository pouvoirPersonnageRepository = context.getBean(IPouvoirPersonnageRepository.class);
		IPouvoirRepository pouvoirRepository = context.getBean(IPouvoirRepository.class);
		ISpecialisationAcquisRepository speAcquisRepository = context.getBean(ISpecialisationAcquisRepository.class);
		IMaitreDuJeuRepository maitreDuJeuRepository = context.getBean(IMaitreDuJeuRepository.class);


		

		rituel.setDescription("Représente la foi dans ");
		rituel.setNom("Rituels");
		rituel.getListePouvoir().add(power);
		rituel.getListeSpe().add(vigilance);
		rituel.getTypeMotivation().add(motiv);

		rituel = domaineRepository.save(rituel);

		vigilance.setDescription("Parce qu'il faut toujours être à l'affût");
		vigilance.setNom("vigilance");
		vigilance.setDomaineLie(rituel);

		vigilance = specialisationRepository.save(vigilance);

	

		sable.setNomPeuple("Sable");
		sable.setDomaine(rituel);
		sable.setSpecialisation1(vigilance);
		sable.setSpecialisation2(vigilance);

		sable = peupleRepository.save(sable);

		artiste.setNomCaste("artiste");
		artiste.setDomaine(rituel);
		artiste.getMetiers().add(prestidigitateur);

		artiste = casteRepository.save(artiste);
		
		delhion.setCouleurSymbolique("gris");
		delhion.setElementTotem("nature");
		delhion.setLangues("la langue de chez les Delhion");
		delhion.setNomRace("Delhion");
		delhion.setCastePredilection(artiste);
		delhion.setDomaine(rituel);
		delhion.setPeupleOrigine(sable);
		delhion.setSpecialisation1(vigilance);
		delhion.setSpecialisation2(vigilance);

		delhion = raceRepository.save(delhion);

		prestidigitateur.setNomMetier("Développeur Java");
		prestidigitateur.setVoie("voie ferrée");
		prestidigitateur.setCasteLie(artiste);
		prestidigitateur.setSpecialisation(vigilance);

		prestidigitateur = metierRepository.save(prestidigitateur);

		theauj.setPseudo("coucou");
		theauj.getPersonnages().add(theau);
		theauj = joueurRepository.save(theauj);

		baptiste.getCreation().add(parapleteam);
		baptiste=maitreDuJeuRepository.save(baptiste);

		pnj.setCreateur(baptiste);
		pnj.setCastePerso(artiste);
		pnj.setMetierPerso(prestidigitateur);
		pnj.setNom("Armand");
		pnj = (PersonnageNonJoueur) personnageRepository.save(pnj);

		parapleteam.setNotes("Il y a du gateau et des meufs dans le frigo. Oups");
		parapleteam.setMaitreDuJeu(baptiste);
		parapleteam.getPersonnages().add(theau);

		parapleteam = tableDeJeuRepository.save(parapleteam);

		aveugle.setNom("aveuglé");

		aveugle = alterationEtatRepository.save(aveugle);

		motiv.setDescription("aucune");
		motiv.setNomMotivation("motivé");
		motiv.setDomaineLie(rituel);

		motiv = motivRepository.save(motiv);

		power.setActivation("activation");
		power.setDomaineLie(rituel);

		power = pouvoirRepository.save(power);

		roulotte.setCategorie("roulotte attelée");
		roulotte.setType("véhicule");
		roulotte.setDescription("Ceci est une roulotte attelée");
		roulotte.getSpeListe().add(speRoulotte);

		roulotte = acquisRepository.save(roulotte);

		speRoulotte.setAcquis(roulotte);
		speRoulotte.setSpecialisation(vigilance);
		speRoulotte = speAcquisRepository.save(speRoulotte);

		theau.setAge(22);
		theau.setAme(5);
		theau.setNom("Theau");
		theau.setJoueur(theauj);
		theau.setMetierPerso(prestidigitateur);
		theau.setParties(parapleteam);
		theau.setRacePerso(delhion);
		theau.setCastePerso(artiste);
		theau.getAlterationPersonnage().add(aveugleTheau);
		theau.getBonusPerso().add(bonus);
		theau.getDomainesPerso().add(combatTheau);
		theau.getMotivationsPerso().add(motivTheau);
		theau.getPouvoirsPerso().add(artsTheau);
		theau = personnageRepository.save(theau);
		

		artsTheau.setPersoLie(theau);
		artsTheau.setPouvoir(power);

		artsTheau = pouvoirPersonnageRepository.save(artsTheau);

		combatTheau.setRangDomaine(5);
		combatTheau.setPersoLie(theau);
		combatTheau.setDomaineLie(rituel);

		combatTheau = domainePersonnageRepository.save(combatTheau);

		motivTheau.setPersoLie(theau);
		motivTheau.setMotivation(motiv);

		motivTheau = motivationPersonnageRepository.save(motivTheau);

		bonus.setBonusPerso(5);
		bonus.setBonusAcquis(3);
		bonus.setAcquis(roulotte);
		bonus.setPersoLie(theau);
		bonus.setSpecialisation(vigilance);

		bonus = bonusPersonnageRepository.save(bonus);

		aveugleTheau.setAlterationEtat(aveugle);
		aveugleTheau.setPersoLie(theau);
		aveugleTheau = alterationPersonnageRepository.save(aveugleTheau);

	}
}
