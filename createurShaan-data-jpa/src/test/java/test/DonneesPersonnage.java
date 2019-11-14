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
		Caste erudits = new Caste();
		Caste negociants = new Caste();
		Caste artistes = new Caste();
		Caste shaanistes = new Caste();
		Caste magiciens = new Caste();
		Caste elementalistes = new Caste();
		Caste voyageurs = new Caste();
		Caste combattants = new Caste();
		
//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET METIER
//-------------------------------------------------------------------------------------------------------------------------	

		Metier batisseur =new Metier();
		
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
		engrenages.setDescription("Manipuler des petits mécanismes tels que serrures ou horloges. Poser et désarmocer des pièges complexes. Comprendre les systèmes à engrenages et poulies, mais également les machines à vapeur.");
		engrenages.setNom("Engrenages");
//		engrenages.setDomaineLie(technique);
//		engrenages.setMetier(mecaniste);
//		engrenages.getBonusAcquis().add(speAcquis);
		engrenages=specialisationRepository.save(engrenages);
		pilotage.setDescription("Conduire tout type de véhicule motorisé, du tank à la moto à réaction, en passant par l'aérojet, ou l'hydroglisseur. Connaître des rudiments techniques nécessaires à l'entretien et au bon fonctionnement du véhicule.");
//		pilotage.setNom("Pilotage");
//		pilotage.setDomaineLie(technique);
	
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
		novateurs = casteRepository.save(novateurs);
		
		erudits.setNomCaste("Les Érudits");
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
		erudits = casteRepository.save(erudits);
		
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

		shaanistes.setNomCaste("Les Shaanistes");
		shaanistes.setDescription("Les Shaanistes sont des porteurs de lumière. Transmettant le Shaan à qui l'accepte, ils ont pour charge d'apaiser les Âmes, d'harmoniser les Esprits et de réguler toute sorte de fanatisme. Le Nouvel Ordre a systématiquement persécuté les Shaanistes. Les génocides qui se sont produits ont, pendant un moment, rendu la pratique du Shaan dangereuse, mais aucun de ses adeptes ne s'est détourné de sa voie.");
//		shaanistes.setDomaine(shaan);
//		shaanistes.getMetiers().add(ameVive);
//		shaanistes.getMetiers().add(chasseurDeSteles);
//		shaanistes.getMetiers().add(cultivateur);
//		shaanistes.getMetiers().add(eleveur);
//		shaanistes.getMetiers().add(gardeFou);
//		shaanistes.getMetiers().add(marcheurDeReves);
//		shaanistes.getMetiers().add(mentaliste);
//		shaanistes.getMetiers().add(prescient);
//		shaanistes.getMetiers().add(radiant);
//		shaanistes.getMetiers().add(telluriste);
		shaanistes = casteRepository.save(shaanistes);
		
		magiciens.setNomCaste("Les Magiciens");
		magiciens.setDescription("Les Magiciens utilisent les Trihns qui voyagent sur Héos et s'en servent comme combustible pour leurs Pouvoirs. Souvent en contact avec les autres Castes, ils les aident par leur savoir et leur pratique.");
//		magiciens.setDomaine(magie);
//		magiciens.getMetiers().add(arcanien);
//		magiciens.getMetiers().add(conjurateur);
//		magiciens.getMetiers().add(illusionniste);
//		magiciens.getMetiers().add(enchanteur);
//		magiciens.getMetiers().add(mageItinerant);
//		magiciens.getMetiers().add(regenerateur);
//		magiciens.getMetiers().add(revocateur);
//		magiciens.getMetiers().add(shaman);
//		magiciens.getMetiers().add(sorcier);
//		magiciens.getMetiers().add(voleurDeTrihn);
		magiciens = casteRepository.save(magiciens);
		
		elementalistes.setNomCaste("Les Élémentalistes");
		elementalistes.setDescription("Les Élémentalistes échappent au système de classement des autres Castes. Ils vouent un culte aux Éléments tels qu'ils sont représentés au sein du Cercle des Réalités. Chacun de ces Éléments constitue une voie qu'un Élémentaliste peut choisir de suivre. Si un Élémentaliste transgresse volontairement un de ses tabous, il attire la colère de l'Élément offensé. Pendant trois Jours, tous ses Tests de RITUELS impliquant cet Élément lui feront perdre un point de Corps supplémentaire à cause de cette agressivité élémentaire. Il sera en pénitence et devra passer ce temps à prier son Élément.");
//		elementalistes.setDomaine(rituels);
//		elementalistes.getMetiers().add(feu);
//		elementalistes.getMetiers().add(air);
//		elementalistes.getMetiers().add(limbes);
//		elementalistes.getMetiers().add(terre);
//		elementalistes.getMetiers().add(autre);
//		elementalistes.getMetiers().add(moi);
//		elementalistes.getMetiers().add(animal);
//		elementalistes.getMetiers().add(eau);
//		elementalistes.getMetiers().add(objet);
//		elementalistes.getMetiers().add(vegetal);
		elementalistes = casteRepository.save(elementalistes);
		
		voyageurs.setNomCaste("Les Voyageurs");
		voyageurs.setDescription("Cette Caste rassemble les anthéens chargés de transporter quelque chose ou quelqu'un d'un point à un autre. Les Sportifs qui vont de ville en ville font également partie de cette Caste. Les Voyageurs ont pu conserver une importance malgré la démocratisation des Portes de Transfert, car bien que plus lents, ils restent tout de même bien meilleur marché");
//		voyageurs.setDomaine(survie);
//		voyageurs.getMetiers().add(athlete);
//		voyageurs.getMetiers().add(caravanier);
//		voyageurs.getMetiers().add(chasseur);
//		voyageurs.getMetiers().add(eclaireur);
//		voyageurs.getMetiers().add(espion);
//		voyageurs.getMetiers().add(guide);
//		voyageurs.getMetiers().add(messager);
//		voyageurs.getMetiers().add(navigateur);
//		voyageurs.getMetiers().add(traqueurDeStele);
//		voyageurs.getMetiers().add(voltigeur);
		voyageurs = casteRepository.save(voyageurs);
		
		combattants.setNomCaste("Les Combattants");
		combattants.setDescription("Cette Caste rassemble tous ceux qui ne vivent que par la guerre et le respect de l'ordre. Soldats, miliciens, gladiateurs, hommes de main en sont les dignes représentants. Entre les Castes, les Guildes, les Notables et les Grandes Familles, nombreux sont ceux qui les utilisent à tour de bras pour régler des conflits, protéger un lieu ou récupérer quelque chose.");
//		combattants.setDomaine(combat);
//		combattants.getMetiers().add(archer);
//		combattants.getMetiers().add(animalier);
//		combattants.getMetiers().add(artilleur);
//		combattants.getMetiers().add(fantassin);
//		combattants.getMetiers().add(francTireur);
//		combattants.getMetiers().add(gardeMine);
//		combattants.getMetiers().add(gardinDesForets);
//		combattants.getMetiers().add(gladiateur);
//		combattants.getMetiers().add(protecteur);
//		combattants.getMetiers().add(soldat);
		combattants = casteRepository.save(combattants);
		
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET METIER
//-------------------------------------------------------------------------------------------------------------------------	

		batisseur.setNomMetier("Batisseur");
//		batisseur.setVoie(voie);
//		batisseur.setSpecialisation(specialisation);
		batisseur.setDescription("Les Bâtisseurs savent construire des ponts, des maisons, des routes, tailler la pierre et préparer la Trihnite afin qu'elle soit enchantée. Irascibles aux mains cagneuses, ils passent leur temps à râler car rien ne se passe jamais comme ils avaient prévu. Il faut dire que l'exigence des Bâtisseurs est légendaire, car ils restent conscients que la plus petite erreur de calcul, ou le moindre défaut de construction peut être à l'origine de terribles accidents et causer la mort... Ce sens des responsabilités leur met une pression permanente qu'ils entretiennent, même s'ils n'ont pas de chantier à gérer. Mais c'est ainsi, les Bâtisseurs se sentent responsables des autres...");
		
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
