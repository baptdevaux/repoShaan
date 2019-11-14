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
		Domaine savoir = new Domaine();
		Domaine social = new Domaine();
		Domaine arts = new Domaine();
		Domaine shaan = new Domaine();
		Domaine magie = new Domaine();
		Domaine rituels = new Domaine();
		Domaine survie = new Domaine();
		Domaine combat = new Domaine();
		Domaine necrose = new Domaine();

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
		Race boreals = new Race();
		Race darkens = new Race();
		Race delhions = new Race();
		Race felings = new Race();
		Race kelwins = new Race();
		Race melodiens = new Race();
		Race nomois = new Race();
		Race woons = new Race();
		Race ygwans = new Race();
		Race humains = new Race();
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

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET METIER
//-------------------------------------------------------------------------------------------------------------------------	

		Metier batisseur = new Metier();

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
		technique.setNom("Technique");
		technique.setElementLie("Objet");
		technique.setDescription(
				"traduit le savoir-faire, l'intelligence de la main et la maitrise de la matière. Monter, démonter pour réinventer et à nouveau construire.");
//		technique.getTypeMotivation().add(e);
//		technique.getListeSpe().add(e);
//		technique.getDomainePerso().add(e);
//		technique.getListePouvoir().add(e);
		technique = domaineRepository.save(technique);

		savoir.setNom("Savoir");
		savoir.setElementLie("Végétal");
		savoir.setDescription("Evoque la soif de connaissance, la mémoire, l'intelect et l'analyse");
//		savoir.getTypeMotivation().add(e);
//		savoir.getListeSpe().add(e);
//		savoir.getDomainePerso().add(e);
//		savoir.getListePouvoir().add(e);
		savoir = domaineRepository.save(savoir);

		social.setNom("Social");
		social.setElementLie("Air");
		social.setDescription(
				"Reflète le relationnel avec les autres Anthéens, l'éloquence, l'art d'articuler un discours, la séduction");
//		social.getTypeMotivation().add(e);
//		social.getListeSpe().add(e);
//		social.getDomainePerso().add(e);
//		social.getListePouvoir().add(e);
		social = domaineRepository.save(social);

		arts.setNom("Arts");
		arts.setElementLie("Autre");
		arts.setDescription("Exprime la firme artistique, la sensualité et la créativité");
//		arts.getTypeMotivation().add(e);
//		arts.getListeSpe().add(e);
//		arts.getDomainePerso().add(e);
//		arts.getListePouvoir().add(e);
		arts = domaineRepository.save(arts);

		shaan.setNom("Savoir");
		shaan.setElementLie("Moi");
		shaan.setDescription(
				"Symbolise l'harmonie avec l'environnement, la magnétisme, la chance brute et la lutte contre les LImbes pour le règne de la paix et de l'équilibre");
//		shaan.getTypeMotivation().add(e);
//		shaan.getListeSpe().add(e);
//		shaan.getDomainePerso().add(e);
//		shaan.getListePouvoir().add(e);
		shaan = domaineRepository.save(shaan);

		magie.setNom("Magie");
		magie.setElementLie("Végétal");
		magie.setDescription(
				"Incarne les facultés magiques qui permettent de déceler et contrôler les flux d'énergies Trihnique.");
//		magie.getTypeMotivation().add(e);
//		magie.getListeSpe().add(e);
//		magie.getDomainePerso().add(e);
//		magie.getListePouvoir().add(e);
		magie = domaineRepository.save(magie);

		rituels.setNom("Rituels");
		rituels.setElementLie("Animal");
		rituels.setDescription(
				"Représente la foi dans les Eléments et la capacité à manipuler leur énergie primale pour s'approprier leurs facultés.");
//		rituels.getTypeMotivation().add(e);
//		rituels.getListeSpe().add(e);
//		rituels.getDomainePerso().add(e);
//		rituels.getListePouvoir().add(e);
		rituels = domaineRepository.save(rituels);

		survie.setNom("Survie");
		survie.setElementLie("Eau");
		survie.setDescription(
				"Réunit les capacités de déplacement, de perception et d'adaptation à un environnement naturel.");
//		technique.getTypeMotivation().add(e);
//		technique.getListeSpe().add(e);
//		technique.getDomainePerso().add(e);
//		technique.getListePouvoir().add(e);
		survie = domaineRepository.save(survie);

		combat.setNom("Combat");
		combat.setElementLie("Feu");
		combat.setDescription(
				"Utilisé dans toute confrontation physique, tant qu'il s'agit de manier une arme non-humaine.");
//		technique.getTypeMotivation().add(e);
//		technique.getListeSpe().add(e);
//		technique.getDomainePerso().add(e);
//		technique.getListePouvoir().add(e);
		combat = domaineRepository.save(combat);

		necrose.setNom("Necrose");
		necrose.setElementLie("Limbes");
		necrose.setDescription(
				"Personnifie le côté sombre, le chamin parcouru par le personnage sur la voie des Limbes. Il sert à faire beaucoup d'actions peu recommandable et à mesurer son degré de décomposition et l'accumulations de pulsions incontrôlables.");
//		technique.getTypeMotivation().add(e);
//		technique.getListeSpe().add(e);
//		technique.getDomainePerso().add(e);
//		technique.getListePouvoir().add(e);
		necrose = domaineRepository.save(necrose);
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET SPECIALISATION
//-------------------------------------------------------------------------------------------------------------------------	
		engrenages.setDescription(
				"Manipuler des petits mécanismes tels que serrures ou horloges. Poser et désarmocer des pièges complexes. Comprendre les systèmes à engrenages et poulies, mais également les machines à vapeur.");
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
		alchimie.setDescription("Connaître les éléments de base qui constituent la matière et les forces qui agissent entre eux. Analyser la nature d'un matériau et en déduire ce qu'il faut pour le creuser, le percer, le briser, le faire fondre, le rendre friable, en un mot, changer son état...");
		alchimie.setNom("Alchimie");
//		alchimie.setDomaineLie(savoir);
//		alchimie.setMetier(alchimiste);
		alchimie=specialisationRepository.save(alchimie);
		bibliotheque.setDescription("Savoir tirer le meilleur d’une source conséquente de documents pour obtenir des informations sur un sujet précis.");
		bibliotheque.setNom("Bibliotheque");
//		bibliotheque.setDomaineLie(savoir);
//		bibliotheque.setMetier(archiviste);
		bibliotheque=specialisationRepository.save(bibliotheque);
		botanique.setDescription("Connaître le règne végétal terrestre et marin, ainsi que toutes les variétés de champignons. Reconnaître les végétaux empoisonnés des comestibles. Confectionner des cataplasmes et autres mixtures aux facultés curatives dont les effets dépendent des végétaux et de leurs propriétés.");
		botanique.setNom("Botanique");
//		botanique.setDomaineLie(savoir);
//		botanique.setMetier(botaniste);
		botanique=specialisationRepository.save(botanique);
		cultureHumaine.setDescription("Connaître la vie et les mœurs des Humains, mais aussi leur technologie. Avoir une idée de la puissance du Nouvel Ordre et du pouvoir qu’exercent les Grandes Familles. Savoir lire et écrire le Langdiv");
		cultureHumaine.setNom("Culture Humaine");
//		cultureHumaine.setDomaineLie(savoir);
//		cultureHumaine.setMetier(percepteur);
		cultureHumaine=specialisationRepository.save(cultureHumaine);
		esoterisme.setDescription("Consulter les astres à l'aide de tarots, d'osselets, de dés, de plateaux de divination, ou même dans le cercle des réalités pour percer les secrets du temps, des lieux et des individus. L'ésotérisme peut constituer un refuge contre les agressions mentales.");
		esoterisme.setNom("Esoterisme");
//		esoterisme.setDomaineLie(savoir);
//		esoterisme.setMetier(esoteriste);
		esoterisme=specialisationRepository.save(esoterisme);
		geologie.setDescription("Connaître l'histoire de la formation des gouffres et des montagnes, des volcans et des séismes. Évaluer la constitution d'un sol et l'énergie que l'on peut en tirer. Cette Spécialisation est également utilisée pour l'archéologie");
		geologie.setNom("Geologie");
//		geologie.setDomaineLie(savoir);
//		geologie.setMetier(geologue);
		geologie=specialisationRepository.save(geologie);
		histoireDHeos.setDescription("Connaître l'histoire générale d’Héos, mais aussi les contes, légendes et mythes existants, qui relatent les épopées d'êtres imaginaires, des dieux de l'ancien panthéon ou de héros ayant réellement vécu en Héossie. Connaître les flux migratoires, les grandes guerres et l'évolution des civilisations.");
		histoireDHeos.setNom("Histoire d'Héos");
//		histoireDHeos.setDomaineLie(savoir);
//		histoireDHeos.setMetier(historien);
		histoireDHeos=specialisationRepository.save(histoireDHeos);
		medecine.setDescription("Diagnostiquer une maladie. Procéder à des opérations chirurgicales. Connaître parfaitement l'anatomie anthéenne. Savoir quel antidote correspond à chaque poison, sa composition et son mode de fabrication. Soigner le Corps d'une personne atteinte de maladie, d'une intoxication ou qui a subi des blessures physiques.");
		medecine.setNom("Médecine");
//		medecine.setDomaineLie(savoir);
//		medecine.setMetier(medecin);
		medecine=specialisationRepository.save(medecine);
		protocoles.setDescription("Connaître les diverses formes de gouvernement, ainsi que les lois régissant administration et pouvoir. Mettre en place les procédures pour accéder à n’importe quel tribunal ou obtenir des laissez-passer. Être à l’aise avec la paperasse qui va avec. Fait également office de Diplomatie vis à vis de cultures inconnues.");
		protocoles.setNom("Protocoles");
//		protocoles.setDomaineLie(savoir);
//		protocoles.setMetier(juriste);
		protocoles=specialisationRepository.save(protocoles);
	
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
		novateurs.setDescription(
				"Cette Caste rassemble tous ceux qui travaillent le cuir, le métal, la pierre, le bois, le verre, le tissu, ainsi que les machinistes et ceux qui peuvent être amenés à utiliser de la technologie humaine. Cette Caste très influente dispose de nombreuses ramifications au sein des sociétés humaines et héossiennes grâce aux nombreux Ateliers de production qu'elle gère et qui constituent autant de points névralgiques de l'économie héossienne.");
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

		erudits.setNomCaste("Les Erudits");
		erudits.setDescription(
				"C'est l'élite intellectuelle de la population héossienne. Tous les scientifiques, philosophes, littéraires, ingénieurs et juristes y sont représentés. Le Nouvel Ordre et les Grandes Familles se méfient toujours des Érudits, qui ont été les premiers à comprendre la culture technologique humaine.");
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
		negociants.setDescription(
				"La Caste des Négociants accueille tous ceux qui tissent des liens sociaux, que ce soit à but lucratif ou par intérêt politique. Cette Caste constitue la pierre angulaire de l'économie héossienne, mais est surtout un trait d' union avec les civilisations humaines et nécrosiennes. Le Négociant sait toujours tirer profit d'une situation, quelle qu'elle soit. Peu importe son interlocuteur, il sait que chacun dispose d'une faille qu'il suffit d'exploiter pour prendre l'avantage.");
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
		artistes.setDescription(
				"La Caste des Artistes rassemble tous ceux dont le but est de divertir la population, que ce soit par la musique, la danse, la comédie, la peinture, la gastronomie, la jonglerie ou les acrobaties. Le Nouvel Ordre n'aimait pas les Artistes, réprimant immédiatement toute manifestation publique. Avec la Révolution et la chute du régime humain, les choses ont changé et les Artistes sont aujourd'hui encouragés à créer, à exposer et à s'exprimer pour revaloriser la culture héossienne. Certains courants artistiques engendrent d'ailleurs de véritables effets de modes qui, grâce à Arpège, se diffusent à l'ensemble du continent, offrant aux Artistes une renommée, une notoriété et une popularité parfois plus importante que celle de toutes les autres Castes.");
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
		shaanistes.setDescription(
				"Les Shaanistes sont des porteurs de lumière. Transmettant le Shaan à qui l'accepte, ils ont pour charge d'apaiser les Âmes, d'harmoniser les Esprits et de réguler toute sorte de fanatisme. Le Nouvel Ordre a systématiquement persécuté les Shaanistes. Les génocides qui se sont produits ont, pendant un moment, rendu la pratique du Shaan dangereuse, mais aucun de ses adeptes ne s'est détourné de sa voie.");
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
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET METIER
//-------------------------------------------------------------------------------------------------------------------------	

		batisseur.setNomMetier("Batisseur");
//		batisseur.setVoie(voie);
//		batisseur.setSpecialisation(specialisation);
		batisseur.setDescription(
				"Les Bâtisseurs savent construire des ponts, des maisons, des routes, tailler la pierre et préparer la Trihnite afin qu'elle soit enchantée. Irascibles aux mains cagneuses, ils passent leur temps à râler car rien ne se passe jamais comme ils avaient prévu. Il faut dire que l'exigence des Bâtisseurs est légendaire, car ils restent conscients que la plus petite erreur de calcul, ou le moindre défaut de construction peut être à l'origine de terribles accidents et causer la mort... Ce sens des responsabilités leur met une pression permanente qu'ils entretiennent, même s'ils n'ont pas de chantier à gérer. Mais c'est ainsi, les Bâtisseurs se sentent responsables des autres...");

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
