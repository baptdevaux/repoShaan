package test;

import java.text.ParseException;

import javax.persistence.EntityManagerFactory;

import createurShaan.Application;
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

public class DonneesPersonnage {
	public static void main(String[] args) throws ParseException {

		EntityManagerFactory emf = Application.getInstance().getEmf();
		IAlterationPersonnageRepository alterationPersonnageRepository = Application.getInstance()
				.getAlterationPersonnageRepo();
		IJoueurRepository joueurRepository = Application.getInstance().getJoueurRepo();
		IPeupleRepository peupleRepository = Application.getInstance().getPeupleRepo();
		IPersonnageRepository personnageRepository = Application.getInstance().getPersonnageRepo();
		IRaceRepository raceRepository = Application.getInstance().getRaceRepo();
		IMetierRepository metierRepository = Application.getInstance().getMetierRepo();
		ICasteRepository casteRepository = Application.getInstance().getCasteRepo();
		IAlterationEtatRepository alterationEtatRepository = Application.getInstance().getAlterationEtatRepo();
		ITableDeJeuRepository tableDeJeuRepository = Application.getInstance().getTableDeJeuRepo();
		IDomainePersonnageRepository domainePersonnageRepository = Application.getInstance().getDomainePersonnageRepo();
		IDomaineRepository domaineRepository = Application.getInstance().getDomaineRepo();
		IBonusPersonnageRepository bonusPersonnageRepository = Application.getInstance().getBonusPersonageRepo();
		IAcquisRepository acquisRepository = Application.getInstance().getAcquisRepo();
		ISpecialisationRepository specialisationRepository = Application.getInstance().getSpecialisationRepo();
		IMotivationPersonnageRepository motivationPersonnageRepository = Application.getInstance()
				.getMotivationPersonnageRepo();
		IMotivationRepository motivRepository = Application.getInstance().getMotivationRepo();
		IPouvoirPersonnageRepository pouvoirPersonnageRepository = Application.getInstance().getPouvoirPersonnageRepo();
		IPouvoirRepository pouvoirRepository = Application.getInstance().getPouvoirRepo();
		ISpecialisationAcquisRepository speAcquisRepository = Application.getInstance().getSpecialisationAcquisRepo();
		IMaitreDuJeuRepository maitreDuJeuRepository = Application.getInstance().getMaitreDuJeuRepo();

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET DOMAINE
//-------------------------------------------------------------------------------------------------------------------------
		Domaine technique = new Domaine();
		Domaine Savoir = new Domaine();

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET SPECIALISATION
//-------------------------------------------------------------------------------------------------------------------------	

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET RACE
//-------------------------------------------------------------------------------------------------------------------------	

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET PEUPLE
//-------------------------------------------------------------------------------------------------------------------------
		Peuple foretsBlanches = new Peuple();
		Peuple sable = new Peuple();

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET CASTE
//-------------------------------------------------------------------------------------------------------------------------

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET METIER
//-------------------------------------------------------------------------------------------------------------------------	

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET MOTIVATION
//-------------------------------------------------------------------------------------------------------------------------		

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET POUVOIR
//-------------------------------------------------------------------------------------------------------------------------	

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET ACQUIS
//-------------------------------------------------------------------------------------------------------------------------	

//*************************************************************************************************************************
//		REMPLISSAGE
//*************************************************************************************************************************

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET DOMAINE
//-------------------------------------------------------------------------------------------------------------------------
		technique.setDescription("traduit le savoir-faire");
		technique.setNom("Technique");
		technique.setElementLie("Objet");
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET SPECIALISATION
//-------------------------------------------------------------------------------------------------------------------------	

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET RACE
//-------------------------------------------------------------------------------------------------------------------------	

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET PEUPLE
//-------------------------------------------------------------------------------------------------------------------------

		foretsBlanches.setNomPeuple("Forêts Blanches");
//		foretsBlanches.setDomaine(domaine);
//		foretsBlanches.setSpecialisation1(specialisation1);
//		foretsBlanches.setSpecialisation2(specialisation2);
		foretsBlanches.setDescription(
				"De vastes forêts de conifères se recouvrent de neige l'hiver venu. La taïga, ou forêt boréale, étonne par sa densité et sa persistance à des altitudes défiant l'imagination. Les arbres sont moins grands que dans les régions chaudes mais les variétés de plantes sont tout aussi foisonnantes. De nombreux Temples rythment les haltes des Voyageurs.");

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET CASTE
//-------------------------------------------------------------------------------------------------------------------------

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET METIER
//-------------------------------------------------------------------------------------------------------------------------	

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET MOTIVATION
//-------------------------------------------------------------------------------------------------------------------------		

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET POUVOIR
//-------------------------------------------------------------------------------------------------------------------------	

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET ACQUIS
//-------------------------------------------------------------------------------------------------------------------------	

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE DONNEES PEUPLE
//-------------------------------------------------------------------------------------------------------------------------

	}
}
