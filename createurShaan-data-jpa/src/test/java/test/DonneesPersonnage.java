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
		Specialisation engrenages = new Specialisation();
		Specialisation pilotage = new Specialisation();
		Specialisation recuperation = new Specialisation();
		Specialisation sensDeLaPierre = new Specialisation();
		Specialisation sensDuBois = new Specialisation();
		Specialisation sensDuCuir = new Specialisation();
		Specialisation sensDuMetal = new Specialisation();
		Specialisation sensDuTissu = new Specialisation();
		Specialisation sensDuVerre = new Specialisation();
		Specialisation technologie = new Specialisation();
		Specialisation alchimie = new Specialisation();
		Specialisation bibliotheque = new Specialisation();
		Specialisation botanique = new Specialisation();
		Specialisation cultureHumaine = new Specialisation();
		Specialisation esoterisme = new Specialisation();
		Specialisation geologie = new Specialisation();
		Specialisation histoireDHeos = new Specialisation();
		Specialisation medecine = new Specialisation();
		Specialisation protocoles = new Specialisation();
		Specialisation zoologie = new Specialisation();
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
		Caste novateurs = new Caste();
		
		novateurs.setNomCaste("Les Novateurs");
		
		novateurs.setDescription("Cette Caste rassemble tous ceux qui travaillent le cuir, le métal, la pierre, le bois, le verre, le tissu, ainsi que les machinistes et ceux qui peuvent être amenés à utiliser de la technologie humaine. Cette Caste très influente dispose de nombreuses ramifications au sein des sociétés humaines et héossiennes grâce aux nombreux Ateliers de production qu'elle gère et qui constituent autant de points névralgiques de l'économie héossienne.");
		
//		novateurs.setDomaine(technique);
		
//		novateurs.getMetiers().add(batisseur);
//		novateurs.getMetiers().add(charpentier);
//		novateurs.getMetiers().add(couturier);
//		novateurs.getMetiers().add(forgeron);
//		novateurs.getMetiers().add(infotek);
//		novateurs.getMetiers().add(joaillier);
//		novateurs.getMetiers().add(mecaniste);
//		novateurs.getMetiers().add(pilote);
//		novateurs.getMetiers().add(recuperateur);
//		novateurs.getMetiers().add(tanneur);
		
		
		Caste erudits = new Caste();
		
		erudits.setNomCaste("Les Erudits");
		
		erudits.setDescription("C'est l'élite intellectuelle de la population héossienne. Tous les scientifiques, philosophes, littéraires, ingénieurs et juristes y sont représentés. Le Nouvel Ordre et les Grandes Familles se méfient toujours des Érudits, qui ont été les premiers à comprendre la culture technologique humaine.");
		
//		erudits.setDomaine(savoir);
		
//		erudits.getMetiers().add(alchimiste);
//		erudits.getMetiers().add(archiviste);
//		erudits.getMetiers().add(botaniste);
//		erudits.getMetiers().add(esoterisme);
//		erudits.getMetiers().add(geologue);
//		erudits.getMetiers().add(juriste);
//		erudits.getMetiers().add(historien);
//		erudits.getMetiers().add(medecin);
//		erudits.getMetiers().add(percepteur);
//		erudits.getMetiers().add(zoologue);
		
		
		Caste negociants = new Caste();
		
		negociants.setNomCaste("Les Négociants");
		
		negociants.setDescription("La Caste des Négociants accueille tous ceux qui tissent des liens sociaux, que ce soit à but lucratif ou par intérêt politique. Cette Caste constitue la pierre angulaire de l'économie héossienne, mais est surtout un trait d' union avec les civilisations humaines et nécrosiennes. Le Négociant sait toujours tirer profit d'une situation, quelle qu'elle soit. Peu importe son interlocuteur, il sait que chacun dispose d'une faille qu'il suffit d'exploiter pour prendre l'avantage.");
		
//		negociants.setDomaine(social);
		
//		negociants.getMetiers().add(courtisan);
//		negociants.getMetiers().add(cyberien);
//		negociants.getMetiers().add(diplomate);
//		negociants.getMetiers().add(enseignant);
//		negociants.getMetiers().add(informateur);
//		negociants.getMetiers().add(marchand);
//		negociants.getMetiers().add(politicien);
//		negociants.getMetiers().add(prospecteur);
//		negociants.getMetiers().add(tenancier);
//		negociants.getMetiers().add(traducteur);
		
		negociants = casteRepository.save(negociants);
		
		
		Caste artistes = new Caste();
		
		artistes.setNomCaste("Les Artistes");
		
		artistes.setDescription("La Caste des Artistes rassemble tous ceux dont le but est de divertir la population, que ce soit par la musique, la danse, la comédie, la peinture, la gastronomie, la jonglerie ou les acrobaties. Le Nouvel Ordre n'aimait pas les Artistes, réprimant immédiatement toute manifestation publique. Avec la Révolution et la chute du régime humain, les choses ont changé et les Artistes sont aujourd'hui encouragés à créer, à exposer et à s'exprimer pour revaloriser la culture héossienne. Certains courants artistiques engendrent d'ailleurs de véritables effets de modes qui, grâce à Arpège, se diffusent à l'ensemble du continent, offrant aux Artistes une renommée, une notoriété et une popularité parfois plus importante que celle de toutes les autres Castes.");
		
//		artistes.setDomaine(arts);
		
//		artistes.getMetiers().add(bateleur);
//		artistes.getMetiers().add(evocateur);
//		artistes.getMetiers().add(chanteur);
//		artistes.getMetiers().add(comedien);
//		artistes.getMetiers().add(costumier);
//		artistes.getMetiers().add(cuisinier);
//		artistes.getMetiers().add(danseur);
//		artistes.getMetiers().add(ecrivain);
//		artistes.getMetiers().add(musicien);
//		artistes.getMetiers().add(prestidigitateur);
			
		artistes = casteRepository.save(artistes);
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

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET SPECIALISATION
//-------------------------------------------------------------------------------------------------------------------------	
		engrenages.setDescription("Manipuler des petits mécanismes tels que serrures ou horloges. Poser et désarmocer des pièges complexes. Comprendre les systèmes à engrenages et poulies, mais également les machines à vapeur.");
		engrenages.setNom("Engrenages");
//		engrenages.setDomaineLie(technique);
//		engrenages.setMetier(mecaniste);
		engrenages=specialisationRepository.save(engrenages);
		pilotage.setDescription("Créer un objet à partir de déchets ou de pièces détachées. Cette Spécialisation peut être comparée aux pouvoirs des adeptes de Win, l’Objet, car elle permet d’obtenir des résultats sans aucun rapport avec la nature et la fonction originale des pièces détachées. Les objets créés pourront être de nature technologique.");
		pilotage.setNom("Pilotage");
//		pilotage.setDomaineLie(technique);
//		pilotage.setMetier(pilote);
		pilotage=specialisationRepository.save(pilotage);
		recuperation.setDescription("Conduire tout type de véhicule motorisé, du tank à la moto à réaction, en passant par l'aérojet, ou l'hydroglisseur. Connaître des rudiments techniques nécessaires à l'entretien et au bon fonctionnement du véhicule.");
		recuperation.setNom("Récupération");
//		recuperation.setDomaineLie(technique);
//		recuperation.setMetier(recuperateur);
		recuperation=specialisationRepository.save(recuperation);
		sensDeLaPierre.setDescription("Construire des murs, des ponts, des sols et des routes. Préparer de la trihnite pour en faire des portes de transfert. Connaître le modelage, la taille de pierre et l'architecture. Situer les sites riches en roche, en trihnite et savoir en extraire de la matière première. Apprécier la qualité, la valeur et la résistance d'un bâtiment ou d'une caverne.");
		sensDeLaPierre.setNom("Sens de la pierre");
//		sensDeLaPierre.setDomaineLie(technique);
//		sensDeLaPierre.setMetier(batisseur);
		sensDeLaPierre=specialisationRepository.save(sensDeLaPierre);
		sensDuBois.setDescription("Fabriquer du mobilier, du papier, de la corde, des bateaux, des charpentes. Connaître la menuiserie, la charpenterie, la papeterie, la découpe et le traitement du bois pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'un bateau, d'un meuble, d'un plancher.");
		sensDuBois.setNom("Sens du bois");
//		sensDuBois.setDomaineLie(technique);
//		sensDuBois.setMetier(charpentier);
		sensDuBois=specialisationRepository.save(sensDuBois);
		sensDuCuir.setDescription("Confectionner des sacs, des armures en cuir, des lanières, des chaussures, des sièges. Connaître la tannerie, la zoologie et le traitement de la peau d'un animal pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'un objet ou d'une pièce de cuir.");
		sensDuCuir.setNom("Sens du cuir");
//		sensDuCuir.setDomaineLie(technique);
//		sensDuCuir.setMetier(tanneur);
		sensDuCuir=specialisationRepository.save(sensDuCuir);
		sensDuMetal.setDescription("Fabriquer des engrenages, des armes, des armures et des pièces mécaniques. Connaître la métallurgie et l'armurerie. Situer les sites riches en métaux et savoir en extraire de la matière première. Apprécier la qualité, la valeur et la résistance d'un objet ou d'une pièce en métal.");
		sensDuMetal.setNom("Sens du metal");
//		sensDuMetal.setDomaineLie(technique);
//		sensDuMetal.setMetier(forgeron);
		sensDuMetal=specialisationRepository.save(sensDuMetal);
		sensDuTissu.setDescription("Tisser des vêtements, des voiles pour les bateaux, des coussins, des draps, des tapis. Connaître le tissage, le stylisme et le traitement du coton ou de la soie pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'une étoffe ou d'une voile.");
		sensDuTissu.setNom("Sens du tissu");
//		sensDuTissu.setDomaineLie(technique);
//		sensDuTissu.setMetier(couturier);
		sensDuTissu=specialisationRepository.save(sensDuTissu);
		sensDuVerre.setDescription("Façonner des bijoux, des outils, des fioles, mais aussi des armes, des artefacts, des loupes, des miroirs, des lunettes et des écrans. Connaître l’orfèvrerie. Apprécier la qualité, la valeur et la résistance d'un bijou, d'une fiole...");
		sensDuVerre.setNom("Sens du verre");
//		sensDuVerre.setDomaineLie(technique);
//		sensDuVerre.setMetier(joaillier);
		sensDuVerre=specialisationRepository.save(sensDuVerre);
		technologie.setDescription("Connaître les sources d'énergie et leurs applications pour faire fonctionner un appareil régi par la technologie humaine. Construire ou réparer une arme à feu, un moteur de véhicule, un appareil électronique, etc. Composer des programmes informatiques en \"Code Note\" qui tournent sur le rézo Arpège (logiciels, interfaces, virus, démons, espions, lutins, judas, cryptographie...)");
		technologie.setNom("Technologie");
//		technologie.setDomaineLie(technique);
//		technologie.setMetier(infotek);
		technologie=specialisationRepository.save(technologie);
		
	
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
