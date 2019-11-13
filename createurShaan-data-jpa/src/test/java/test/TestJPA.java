package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import createurShaan.Application;
import createurShaan.model.AlterationEtat;
import createurShaan.model.Caste;
import createurShaan.model.DomainePersonnage;
import createurShaan.model.Metier;
import createurShaan.model.Personnage;
import createurShaan.model.Peuple;
import createurShaan.model.Race;
import createurShaan.model.TableDeJeu;
import createurShaan.repository.IAlterationEtatRepository;
import createurShaan.repository.ICasteRepository;
import createurShaan.repository.IDomainePersonnageRepository;
import createurShaan.repository.IMetierRepository;
import createurShaan.repository.IPersonnageRepository;
import createurShaan.repository.IPeupleRepository;
import createurShaan.repository.IRaceRepository;
import createurShaan.repository.ITableDeJeuRepository;




public class TestJPA {
	public static void main(String[] args) throws ParseException {

	EntityManagerFactory emf = Application.getInstance().getEmf();

	
	Personnage theau = new Personnage();
	
	IPersonnageRepository personnageRepository = Application.getInstance().getPersonnageRepo();
	
	
	
	
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
	
	
	
	
	
	}}
