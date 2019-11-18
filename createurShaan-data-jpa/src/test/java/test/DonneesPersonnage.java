package test;

import java.text.ParseException;

import javax.persistence.EntityManagerFactory;

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

public class DonneesPersonnage {
	public static void main(String[] args) throws ParseException {

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
		Specialisation arpege = new Specialisation();
		Specialisation bluff = new Specialisation();
		Specialisation commerce = new Specialisation();
		Specialisation diplomatie = new Specialisation();
		Specialisation enseignement = new Specialisation();
		Specialisation langagePrimal = new Specialisation();
		Specialisation languesExotiques = new Specialisation();
		Specialisation psychologie = new Specialisation();
		Specialisation seduction = new Specialisation();
		Specialisation vieUrbaine = new Specialisation();
		Specialisation artsAppliques = new Specialisation();
		Specialisation artsDuFeu = new Specialisation();
		Specialisation chant = new Specialisation();
		Specialisation comedie = new Specialisation();
		Specialisation deguisement = new Specialisation();
		Specialisation gastronomie = new Specialisation();
		Specialisation langageDuCorps = new Specialisation();
		Specialisation lettres = new Specialisation();
		Specialisation musique = new Specialisation();
		Specialisation trucages = new Specialisation();
		Specialisation embiose = new Specialisation();
		Specialisation empathieAnimale = new Specialisation();
		Specialisation empathieAntheenne = new Specialisation();
		Specialisation empathieMinerale = new Specialisation();
		Specialisation empathieVegetale = new Specialisation();
		Specialisation intuition = new Specialisation();
		Specialisation reve = new Specialisation();
		Specialisation soinsDeLAme = new Specialisation();
		Specialisation soinsDeLEsprit = new Specialisation();
		Specialisation soinsDuCorps = new Specialisation();
		Specialisation arcanes = new Specialisation();
		Specialisation conjuration = new Specialisation();
		Specialisation defenseMagique = new Specialisation();
		Specialisation enchantement = new Specialisation();
		Specialisation incandescence = new Specialisation();
		Specialisation invocation = new Specialisation();
		Specialisation maitriseDesSchemes = new Specialisation();
		Specialisation regeneration = new Specialisation();
		Specialisation transfert = new Specialisation();
		Specialisation voile = new Specialisation();
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
		Peuple glaces = new Peuple();
		Peuple grandsArbres = new Peuple();
		Peuple hautesHerbes = new Peuple();
		Peuple marais = new Peuple();
		Peuple montagnes = new Peuple();
		Peuple rivages = new Peuple();
		Peuple sables = new Peuple();
		Peuple terresBrulees = new Peuple();
		Peuple cites = new Peuple();
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
		Caste ombres = new Caste();

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET METIER
//-------------------------------------------------------------------------------------------------------------------------	
		Metier batisseur = new Metier();
		Metier charpentier = new Metier();
		Metier couturier = new Metier();
		Metier forgeron = new Metier();
		Metier infotek = new Metier();
		Metier joaillier = new Metier();
		Metier mecaniste = new Metier();
		Metier pilote = new Metier();
		Metier recuperateur = new Metier();
		Metier tanneur = new Metier();
		Metier alchimiste = new Metier();
		Metier archiviste = new Metier();
		Metier botaniste = new Metier();
		Metier esoteriste = new Metier();
		Metier geologue = new Metier();
		Metier historien = new Metier();
		Metier juriste = new Metier();
		Metier medecin = new Metier();
		Metier percepteur = new Metier();
		Metier zoologue = new Metier();
		Metier courtisan = new Metier();
		Metier cyberien = new Metier();
		Metier diplomate = new Metier();
		Metier enseignant = new Metier();
		Metier informateur = new Metier();
		Metier marchand = new Metier();
		Metier politicien = new Metier();
		Metier prospecteur = new Metier();
		Metier tenancier = new Metier();
		Metier traducteur = new Metier();
		Metier bateleur = new Metier();
		Metier chanteur = new Metier();
		Metier comedien = new Metier();
		Metier costumier = new Metier();
		Metier cuisinier = new Metier();
		Metier danseur = new Metier();
		Metier ecrivain = new Metier();
		Metier evocateur = new Metier();
		Metier musicien = new Metier();
		Metier prestidigitateur = new Metier();
		Metier ameVive = new Metier();
		Metier chasseurDeSteles = new Metier();
		Metier cultivateur = new Metier();
		Metier eleveur = new Metier();
		Metier gardeFou = new Metier();
		Metier marcheursDeReves = new Metier();
		Metier mentaliste = new Metier();
		Metier prescient = new Metier();
		Metier radiant = new Metier();
		Metier telluriste = new Metier();

//-------------------------------------------------------------------------------------------------------------------------
//		CREATION OBJET MOTIVATION
//-------------------------------------------------------------------------------------------------------------------------		
		Motivation forteresse = new Motivation();
		Motivation palais = new Motivation();
		Motivation machineSousMarine = new Motivation();
		Motivation ouvrage = new Motivation();
		Motivation universite = new Motivation();
		Motivation transmettreSavoir = new Motivation();
		Motivation riche = new Motivation();
		Motivation notable = new Motivation();
		Motivation seduire = new Motivation();
		Motivation charmer = new Motivation();
		Motivation celebre = new Motivation();
		Motivation mode = new Motivation();
		Motivation genereux = new Motivation();
		Motivation trouverAmeSoeur = new Motivation();
		Motivation aider = new Motivation();
		Motivation combattreFailles = new Motivation();
		Motivation enseignerMagie = new Motivation();
		Motivation percerMysteres = new Motivation();
		Motivation communier = new Motivation();
		Motivation progresserDogme = new Motivation();
		Motivation confronterElement = new Motivation();
		Motivation explorer = new Motivation();
		Motivation construireVoyage = new Motivation();
		Motivation nourrir = new Motivation();
		Motivation defierMort = new Motivation();
		Motivation protegerFaibles = new Motivation();
		Motivation venger = new Motivation();
		Motivation peurGens = new Motivation();
		Motivation jouerLoi = new Motivation();
		Motivation venererCapital = new Motivation();
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
		technique = domaineRepository.save(technique);

		savoir.setNom("Savoir");
		savoir.setElementLie("Végétal");
		savoir.setDescription("Evoque la soif de connaissance, la mémoire, l'intelect et l'analyse");
		savoir = domaineRepository.save(savoir);

		social.setNom("Social");
		social.setElementLie("Air");
		social.setDescription(
				"Reflète le relationnel avec les autres Anthéens, l'éloquence, l'art d'articuler un discours, la séduction");
		social = domaineRepository.save(social);

		arts.setNom("Arts");
		arts.setElementLie("Autre");
		arts.setDescription("Exprime la firme artistique, la sensualité et la créativité");
		arts = domaineRepository.save(arts);

		shaan.setNom("Savoir");
		shaan.setElementLie("Moi");
		shaan.setDescription(
				"Symbolise l'harmonie avec l'environnement, la magnétisme, la chance brute et la lutte contre les LImbes pour le règne de la paix et de l'équilibre");
		shaan = domaineRepository.save(shaan);

		magie.setNom("Magie");
		magie.setElementLie("Végétal");
		magie.setDescription(
				"Incarne les facultés magiques qui permettent de déceler et contrôler les flux d'énergies Trihnique.");
		magie = domaineRepository.save(magie);

		rituels.setNom("Rituels");
		rituels.setElementLie("Animal");
		rituels.setDescription(
				"Représente la foi dans les Eléments et la capacité à manipuler leur énergie primale pour s'approprier leurs facultés.");
		rituels = domaineRepository.save(rituels);

		survie.setNom("Survie");
		survie.setElementLie("Eau");
		survie.setDescription(
				"Réunit les capacités de déplacement, de perception et d'adaptation à un environnement naturel.");
		survie = domaineRepository.save(survie);

		combat.setNom("Combat");
		combat.setElementLie("Feu");
		combat.setDescription(
				"Utilisé dans toute confrontation physique, tant qu'il s'agit de manier une arme non-humaine.");
		combat = domaineRepository.save(combat);

		necrose.setNom("Necrose");
		necrose.setElementLie("Limbes");
		necrose.setDescription(
				"Personnifie le côté sombre, le chamin parcouru par le personnage sur la voie des Limbes. Il sert à faire beaucoup d'actions peu recommandable et à mesurer son degré de décomposition et l'accumulations de pulsions incontrôlables.");
		necrose = domaineRepository.save(necrose);
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET SPECIALISATION
//-------------------------------------------------------------------------------------------------------------------------	
		engrenages.setDescription(
				"Manipuler des petits mécanismes tels que serrures ou horloges. Poser et désarmocer des pièges complexes. Comprendre les systèmes à engrenages et poulies, mais également les machines à vapeur.");
		engrenages.setNom("Engrenages");
		engrenages.setDomaineLie(technique);
		engrenages.setMetier(mecaniste);
		engrenages = specialisationRepository.save(engrenages);

		pilotage.setDescription(
				"Conduire tout type de véhicule motorisé, du tank à la moto à réaction, en passant par l'aérojet, ou l'hydroglisseur. Connaître des rudiments techniques nécessaires à l'entretien et au bon fonctionnement du véhicule.");
		pilotage.setNom("Pilotage");
		pilotage.setDomaineLie(technique);
		pilotage.setMetier(pilote);
		pilotage = specialisationRepository.save(pilotage);

		recuperation.setDescription(
				"Conduire tout type de véhicule motorisé, du tank à la moto à réaction, en passant par l'aérojet, ou l'hydroglisseur. Connaître des rudiments techniques nécessaires à l'entretien et au bon fonctionnement du véhicule.");
		recuperation.setNom("Récupération");
		recuperation.setDomaineLie(technique);
		recuperation.setMetier(recuperateur);
		recuperation = specialisationRepository.save(recuperation);

		sensDeLaPierre.setDescription(
				"Construire des murs, des ponts, des sols et des routes. Préparer de la trihnite pour en faire des portes de transfert. Connaître le modelage, la taille de pierre et l'architecture. Situer les sites riches en roche, en trihnite et savoir en extraire de la matière première. Apprécier la qualité, la valeur et la résistance d'un bâtiment ou d'une caverne.");
		sensDeLaPierre.setNom("Sens de la pierre");
		sensDeLaPierre.setDomaineLie(technique);
		sensDeLaPierre.setMetier(batisseur);
		sensDeLaPierre = specialisationRepository.save(sensDeLaPierre);

		sensDuBois.setDescription(
				"Fabriquer du mobilier, du papier, de la corde, des bateaux, des charpentes. Connaître la menuiserie, la charpenterie, la papeterie, la découpe et le traitement du bois pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'un bateau, d'un meuble, d'un plancher.");
		sensDuBois.setNom("Sens du bois");
		sensDuBois.setDomaineLie(technique);
		sensDuBois.setMetier(charpentier);
		sensDuBois = specialisationRepository.save(sensDuBois);

		sensDuCuir.setDescription(
				"Confectionner des sacs, des armures en cuir, des lanières, des chaussures, des sièges. Connaître la tannerie, la zoologie et le traitement de la peau d'un animal pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'un objet ou d'une pièce de cuir.");
		sensDuCuir.setNom("Sens du cuir");
		sensDuCuir.setDomaineLie(technique);
		sensDuCuir.setMetier(tanneur);
		sensDuCuir = specialisationRepository.save(sensDuCuir);

		sensDuMetal.setDescription(
				"Fabriquer des engrenages, des armes, des armures et des pièces mécaniques. Connaître la métallurgie et l'armurerie. Situer les sites riches en métaux et savoir en extraire de la matière première. Apprécier la qualité, la valeur et la résistance d'un objet ou d'une pièce en métal.");
		sensDuMetal.setNom("Sens du metal");
		sensDuMetal.setDomaineLie(technique);
		sensDuMetal.setMetier(forgeron);
		sensDuMetal = specialisationRepository.save(sensDuMetal);

		sensDuTissu.setDescription(
				"Tisser des vêtements, des voiles pour les bateaux, des coussins, des draps, des tapis. Connaître le tissage, le stylisme et le traitement du coton ou de la soie pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'une étoffe ou d'une voile.");
		sensDuTissu.setNom("Sens du tissu");
		sensDuTissu.setDomaineLie(technique);
		sensDuTissu.setMetier(couturier);
		sensDuTissu = specialisationRepository.save(sensDuTissu);

		sensDuVerre.setDescription(
				"Façonner des bijoux, des outils, des fioles, mais aussi des armes, des artefacts, des loupes, des miroirs, des lunettes et des écrans. Connaître l’orfèvrerie. Apprécier la qualité, la valeur et la résistance d'un bijou, d'une fiole...");
		sensDuVerre.setNom("Sens du verre");
		sensDuVerre.setDomaineLie(technique);
		sensDuVerre.setMetier(joaillier);
		sensDuVerre = specialisationRepository.save(sensDuVerre);

		technologie.setDescription(
				"Connaître les sources d'énergie et leurs applications pour faire fonctionner un appareil régi par la technologie humaine. Construire ou réparer une arme à feu, un moteur de véhicule, un appareil électronique, etc. Composer des programmes informatiques en \"Code Note\" qui tournent sur le rézo Arpège (logiciels, interfaces, virus, démons, espions, lutins, judas, cryptographie...)");
		technologie.setNom("Technologie");
		technologie.setDomaineLie(technique);
		technologie.setMetier(infotek);
		technologie = specialisationRepository.save(technologie);

		alchimie.setDescription(
				"Connaître les éléments de base qui constituent la matière et les forces qui agissent entre eux. Analyser la nature d'un matériau et en déduire ce qu'il faut pour le creuser, le percer, le briser, le faire fondre, le rendre friable, en un mot, changer son état...");
		alchimie.setNom("Alchimie");
		alchimie.setDomaineLie(savoir);
		alchimie.setMetier(alchimiste);
		alchimie = specialisationRepository.save(alchimie);

		bibliotheque.setDescription(
				"Savoir tirer le meilleur d’une source conséquente de documents pour obtenir des informations sur un sujet précis.");
		bibliotheque.setNom("Bibliotheque");
		bibliotheque.setDomaineLie(savoir);
		bibliotheque.setMetier(archiviste);
		bibliotheque = specialisationRepository.save(bibliotheque);

		botanique.setDescription(
				"Connaître le règne végétal terrestre et marin, ainsi que toutes les variétés de champignons. Reconnaître les végétaux empoisonnés des comestibles. Confectionner des cataplasmes et autres mixtures aux facultés curatives dont les effets dépendent des végétaux et de leurs propriétés.");
		botanique.setNom("Botanique");
		botanique.setDomaineLie(savoir);
		botanique.setMetier(botaniste);
		botanique = specialisationRepository.save(botanique);

		cultureHumaine.setDescription(
				"Connaître la vie et les mœurs des Humains, mais aussi leur technologie. Avoir une idée de la puissance du Nouvel Ordre et du pouvoir qu’exercent les Grandes Familles. Savoir lire et écrire le Langdiv");
		cultureHumaine.setNom("Culture Humaine");
		cultureHumaine.setDomaineLie(savoir);
		cultureHumaine.setMetier(percepteur);
		cultureHumaine = specialisationRepository.save(cultureHumaine);

		esoterisme.setDescription(
				"Consulter les astres à l'aide de tarots, d'osselets, de dés, de plateaux de divination, ou même dans le cercle des réalités pour percer les secrets du temps, des lieux et des individus. L'ésotérisme peut constituer un refuge contre les agressions mentales.");
		esoterisme.setNom("Esoterisme");
		esoterisme.setDomaineLie(savoir);
		esoterisme.setMetier(esoteriste);
		esoterisme = specialisationRepository.save(esoterisme);

		geologie.setDescription(
				"Connaître l'histoire de la formation des gouffres et des montagnes, des volcans et des séismes. Évaluer la constitution d'un sol et l'énergie que l'on peut en tirer. Cette Spécialisation est également utilisée pour l'archéologie");
		geologie.setNom("Geologie");
		geologie.setDomaineLie(savoir);
		geologie.setMetier(geologue);
		geologie = specialisationRepository.save(geologie);

		histoireDHeos.setDescription(
				"Connaître l'histoire générale d’Héos, mais aussi les contes, légendes et mythes existants, qui relatent les épopées d'êtres imaginaires, des dieux de l'ancien panthéon ou de héros ayant réellement vécu en Héossie. Connaître les flux migratoires, les grandes guerres et l'évolution des civilisations.");
		histoireDHeos.setNom("Histoire d'Héos");
		histoireDHeos.setDomaineLie(savoir);
		histoireDHeos.setMetier(historien);
		histoireDHeos = specialisationRepository.save(histoireDHeos);

		medecine.setDescription(
				"Diagnostiquer une maladie. Procéder à des opérations chirurgicales. Connaître parfaitement l'anatomie anthéenne. Savoir quel antidote correspond à chaque poison, sa composition et son mode de fabrication. Soigner le Corps d'une personne atteinte de maladie, d'une intoxication ou qui a subi des blessures physiques.");
		medecine.setNom("Médecine");
		medecine.setDomaineLie(savoir);
		medecine.setMetier(medecin);
		medecine = specialisationRepository.save(medecine);

		protocoles.setDescription(
				"Connaître les diverses formes de gouvernement, ainsi que les lois régissant administration et pouvoir. Mettre en place les procédures pour accéder à n’importe quel tribunal ou obtenir des laissez-passer. Être à l’aise avec la paperasse qui va avec. Fait également office de Diplomatie vis à vis de cultures inconnues.");
		protocoles.setNom("Protocoles");
		protocoles.setDomaineLie(savoir);
		protocoles.setMetier(juriste);
		protocoles = specialisationRepository.save(protocoles);

		zoologie.setDescription(
				"Connaître le règne animal, de la cellule aux mammifères, en passant par les poissons, les insectes et les oiseaux. Connaître les divers écosystèmes qui régissent un lieu, les modes de vie des diverses espèces qui le peuplent, ainsi que les propriétés des organes des animaux.");
		zoologie.setNom("Zoologie");
		zoologie.setDomaineLie(savoir);
		zoologie.setMetier(zoologue);
		zoologie = specialisationRepository.save(zoologie);

		arpege.setDescription(
				"Naviguer sur le rézo Arpège en utilisant une console dotée d'une interface graphique. Connaître ce monde virtuel tentaculaire de l'information et de la communication. Maîtriser les logiciels de capture et de restitution d'images 2D ou 3D pour réaliser des trucages et effets spéciaux. Forcer certains barrages informatiques pour obtenir des données confidentielles. Utiliser des logiciels pour composer des programmes compilés en lignes de notes.");
		arpege.setNom("Arpege");
		arpege.setDomaineLie(social);
		arpege.setMetier(cyberien);
		arpege = specialisationRepository.save(arpege);

		bluff.setDescription(
				"Mentir ou baratiner quelqu'un. L’effet d’un bluff est en général temporaire, la victime mettra quelques minutes à se rendre compte qu'elle s’est fait berner.");
		bluff.setNom("Bluff");
		bluff.setDomaineLie(social);
		bluff.setMetier(politicien);
		bluff = specialisationRepository.save(bluff);

		commerce.setDescription(
				"Marchander. Estimer des objets de valeur. Acheter les services de quelqu’un. Connaître le niveau de rareté d'un Acquis à un endroit donné et donc les fluctuations des prix du marché en fonction de la localité.");
		commerce.setNom("Commerce");
		commerce.setDomaineLie(social);
		commerce.setMetier(marchand);
		commerce = specialisationRepository.save(commerce);

		diplomatie.setDescription(
				"Savoir faire passer ses idées en douceur. Réussir à détendre un climat tendu. Négocier des traités entre deux belligérants. Parler à un auditoire en faisant preuve d'éloquence. Chercher à convaincre un interlocuteur grâce à des arguments cohérents. Calmer des personnes hostiles. Avoir une idée des divers conflits qui peuvent tourmenter une région. Connaître le rang de quelqu'un dans n'importe quel milieu social, du plus élevé au plus primitif. Savoir comment se comporter pour ne pas commettre d'impairs, même si on ne parle pas la langue.");
		diplomatie.setNom("Diplomatie");
		diplomatie.setDomaineLie(social);
		diplomatie.setMetier(diplomate);
		diplomatie = specialisationRepository.save(diplomatie);

		enseignement.setDescription(
				"Enseigner une Spécialisation à une autre personne. Faire preuve de pédagogie. Mettre en place un programme d’apprentissage. Apprendre plus vite d’un autre enseignant.");
		enseignement.setNom("Enseignement");
		enseignement.setDomaineLie(social);
		enseignement.setMetier(enseignant);
		enseignement = specialisationRepository.save(enseignement);

		langagePrimal.setDescription(
				"Communiquer de façon très basique, par des gestes, des attitudes et des expressions faciales avec des êtres primitifs ou dotés d'un langage complètement inconnu. Communiquer sommairement avec les animaux.");
		langagePrimal.setNom("Langage primal");
		langagePrimal.setDomaineLie(social);
		langagePrimal.setMetier(prospecteur);
		langagePrimal = specialisationRepository.save(langagePrimal);

		languesExotiques.setDescription(
				"Se baser sur diverses langues existantes pour aborder un dialecte inconnu et le maîtriser par la pratique. Un anthéen parle l'héossien (langue commune) et le langdiv (langue humaine), ainsi que sa langue raciale, mais cette Spécialisation devient fort utile pour comprendre et parler les autres langages raciaux et dialectes dérivés.");
		languesExotiques.setNom("Langues exotiques");
		languesExotiques.setDomaineLie(social);
		languesExotiques.setMetier(traducteur);
		languesExotiques = specialisationRepository.save(languesExotiques);

		psychologie.setDescription(
				"Soigner l'Esprit d'une personne qui a subi des blessures mentales en la rassurant, et en lui redonnant confiance en elle. Déterminer les pensées d'autrui par ses attitudes et son comportement. Anticiper les intentions. Comprendre la folie. Contrairement au Bluff, la Psychologie a des effets durables.");
		psychologie.setNom("Psychologie");
		psychologie.setDomaineLie(social);
		psychologie.setMetier(tenancier);
		psychologie = specialisationRepository.save(psychologie);

		seduction.setDescription(
				"S'attirer les faveurs et l'admiration du sexe opposé. La séduction peut se tenter sur un individu du même sexe, mais la réaction de l'individu en question dépendra largement des dispositions de la cible.");
		seduction.setNom("Seduction");
		seduction.setDomaineLie(social);
//		seduction.setMetier(courtisan);
		seduction = specialisationRepository.save(seduction);

		vieUrbaine.setDescription(
				"Connaître les villes et les différentes structures sociales. Se repérer en agglomération. Semer quelqu'un. Se procurer des renseignements anodins ou secrets. Être à l'aise dans tout milieu urbain.");
		vieUrbaine.setNom("Vie Urbaine");
		vieUrbaine.setDomaineLie(social);
//		vieUrbaine.setMetier(informateur);
		vieUrbaine = specialisationRepository.save(vieUrbaine);

		artsAppliques.setDescription(
				"Pratiquer le dessin, la peinture, la sculpture sur bois ou sur pierre. Connaître l'histoire de l'art.");
		artsAppliques.setNom("Arts appliqués");
		artsAppliques.setDomaineLie(arts);
//		artsAppliques.setMetier(evocateur);
		artsAppliques = specialisationRepository.save(artsAppliques);

		artsDuFeu.setDescription(
				"Cracher du feu. Créer des feux d'artifices, et toutes sortes d'effets pyrotechniques ou de jeux de lumières.");
		artsDuFeu.setNom("Arts du feu");
		artsDuFeu.setDomaineLie(arts);
//		artsDuFeu.setMetier(bateleur);
		artsDuFeu = specialisationRepository.save(artsDuFeu);

		chant.setDescription(
				"Chanter juste. Savoir poser sa voix. Lire une partition, accompagner en mesure un musicien. Savoir improviser. Connaître un vaste répertoire allant des chansons grivoises aux sérénades, en passant par les chants traditionnels. Séduire quelqu'un.");
		chant.setNom("Chant");
		chant.setDomaineLie(arts);
//		chant.setMetier(chanteur);
		chant = specialisationRepository.save(chant);

		comedie.setDescription(
				"Faire du théâtre. Interpréter un rôle par cœur. Simuler les émotions. Imiter les voix. Créer des pièces et connaître sur le bout des doigts les répliques de tous les personnages des grands classiques héossiens. Se faire passer pour quelqu'un d'autre ou avoir l'air crédible en racontant des sornettes.");
		comedie.setNom("Comédie");
		comedie.setDomaineLie(arts);
//		comedie.setMetier(comedien);
		comedie = specialisationRepository.save(comedie);

		deguisement.setDescription(
				"Modifier son apparence de manière tangible, avec trois fois rien. Fabriquer des masques, des costumes et autres parures afin d'être en mesure de métamorphoser un Mélodien en Ygwan et inversement (ce qui est déjà beaucoup plus difficile).");
		deguisement.setNom("Déguisement");
		deguisement.setDomaineLie(arts);
//		deguisement.setMetier(costumier);
		deguisement = specialisationRepository.save(deguisement);

		gastronomie.setDescription(
				"Préparer des repas très élaborés, suivre des recettes et savoir en inventer. Reconnaître les bons produits et les préparer pour ensuite les cuisiner. Repérer si un plat est empoisonné. Un très bon repas a des vertus régénérantes.");
		gastronomie.setNom("Gastronomie");
		gastronomie.setDomaineLie(arts);
//		gastronomie.setMetier(cuisinier);
		gastronomie = specialisationRepository.save(gastronomie);

		lettres.setDescription(
				"Transmettre les émotions par des mots. Écrire des poèmes, faire de la philosophie, mais également posséder une culture littéraire importante. Savoir lire et écrire une langue héossienne que l’on parle. Séduire quelqu'un.");
		lettres.setNom("Lettres");
		lettres.setDomaineLie(arts);
//		lettres.setMetier(ecrivain);
		lettres = specialisationRepository.save(lettres);

		musique.setDescription(
				"Jouer des divers instruments existants. Lire une partition musicale. Composer des mélodies ou des symphonies. Connaître l'histoire de la musique. Séduire quelqu'un. Dresser un animal.");
		musique.setNom("Musique");
		musique.setDomaineLie(arts);
//		musique.setMetier(musicien);
		musique = specialisationRepository.save(musique);

		trucages.setDescription(
				"Effectuer des tours de passe-passe. Faire de la prestidigitation. Jongler avec tous types d'objets. Dissimuler des objets aux yeux les plus avertis.");
		trucages.setNom("Trucages");
		trucages.setDomaineLie(arts);
//		trucages.setMetier(prestidigitateur);
		trucages=specialisationRepository.save(trucages);
		
		langageDuCorps.setDescription("Danser en mesure, pouvoir évoluer avec un ou une partenaire. Être capable de suivre une chorégraphie imposée ou d'en inventer une. Connaître les danses traditionnelles et celles en vogue. Pratiquer les massages du corps. Séduire quelqu'un. Un très bon massage a des vertus régénérantes.");
		langageDuCorps.setNom("Langage du corps");
		langageDuCorps.setDomaineLie(arts);
//		langageDuCorps.setMetier(danseur);
		langageDuCorps=specialisationRepository.save(langageDuCorps);
		
		embiose.setDescription("Résister à la confrontation avec un Trihn lors d'un rituel d'Embiose. Maximiser le gain d'expérience lié au rituel. Connaissance des lieux qui cachent une stèle d'Embiose.");
		embiose.setNom("Embiose");
		embiose.setDomaineLie(shaan);
//		embiose.setMetier(chasseurDeSteles);
		embiose=specialisationRepository.save(embiose);
		
		empathieAnimale.setDescription("Être en synergie avec le règne animal. Développer un lien empathique avec les animaux pour connaître leurs besoins vitaux, ainsi que la façon de les traiter. Établir une symbiose avec les armimales pacifistes ou utilitaires (mais pas les armimales d'attaque) et utiliser leurs capacités. Avoir accès intuitivement à des connaissances assez pointues sur les animaux.");
		empathieAnimale.setNom("Empathie animale");
		empathieAnimale.setDomaineLie(shaan);
//		empathieAnimale.setMetier(eleveur);
		empathieAnimale=specialisationRepository.save(empathieAnimale);
		
		empathieAntheenne.setDescription("Être en synergie avec les 10 races du Cercle des Réalités. Développer un lien empathique avec l'Âme des anthéens pour les calmer quand ils sont pris de folie, ou éviter de se faire bluffer. Avoir accès intuitivement à des connaissances assez pointues sur les comportements anthéens");
		empathieAntheenne.setNom("Empathie antheenne");
		empathieAntheenne.setDomaineLie(shaan);
//		empathieAntheenne.setMetier(eleveur);
		empathieAntheenne=specialisationRepository.save(empathieAntheenne);
		
		empathieMinerale.setDescription("Être en synergie avec le règne minéral. Développer un lien empathique avec les minéraux pour reconstituer des évènements très anciens à partir de l’empreinte magnétique qu’ils laisseraient dans le décor. Avoir accès intuitivement à des connaissances assez pointues sur les minéraux.");
		empathieMinerale.setNom("Empathie minérale");
		empathieMinerale.setDomaineLie(shaan);
//		empathieMinerale.setMetier(telluriste);
		empathieMinerale=specialisationRepository.save(empathieMinerale);
		
		empathieVegetale.setDescription("Être en synergie avec le règne végétal. Développer un lien empathique avec les végétaux afin de savoir faire pousser n'importe quoi sur n'importe quel terrain (fleurs, arbres, fruits et légumes, algues, champignons). Avoir accès intuitivement à des connaissances assez pointues sur les plantes.");
		empathieVegetale.setNom("Empathie végétale");
		empathieVegetale.setDomaineLie(shaan);
//		empathieVegetale.setMetier(cultivateur);
		empathieVegetale=specialisationRepository.save(empathieVegetale);
		
		intuition.setDescription("Rester en éveil, ne pas se laisser surprendre, déceler un détail inhabituel dans une pièce. Percevoir passivement les événements. Être sensible aux particularités de son environnement. Voir l'Invisible, les manœuvres de Discrétion, les Trucages et les Larcins.");
		intuition.setNom("Intuition");
		intuition.setDomaineLie(shaan);
//		intuition.setMetier(prescient);
		intuition=specialisationRepository.save(intuition);
		
		reve.setDescription("Naviguer dans le monde des rêves. Résister aux cauchemars. Communiquer avec des personnes endormies via leurs rêves, sans contrainte de distance.");
		reve.setNom("Rêve");
		reve.setDomaineLie(shaan);
//		reve.setMetier(marcheurDeReves);
		reve=specialisationRepository.save(reve);
		
		soinsDeLAme.setDescription("Soigner l'Âme d'une personne qui a subi des blessures nécrotiques par la pratique de méthodes de magnétisme et de transfert d'énergie.");
		soinsDeLAme.setNom("Soins de l'âme");
		soinsDeLAme.setDomaineLie(shaan);
//		soinsDeLAme.setMetier(ameVive);
		soinsDeLAme=specialisationRepository.save(soinsDeLAme);
		
		soinsDeLEsprit.setDescription("Soigner l'Esprit d'une personne qui a subi des blessures mentales par la pratique de la rhétorique");
		soinsDeLEsprit.setNom("Soins de l'esprit");
		soinsDeLEsprit.setDomaineLie(shaan);
//		soinsDeLEsprit.setMetier(gardeFou);
		soinsDeLEsprit=specialisationRepository.save(soinsDeLEsprit);
		
		soinsDuCorps.setDescription("Soigner le Corps d'une personne qui a subi des blessures physiques par la pratique de massages, d'acuponcture...");
		soinsDuCorps.setNom("Soins du corps");
		soinsDuCorps.setDomaineLie(shaan);
//		soinsDuCorps.setMetier(radiant);
		soinsDuCorps=specialisationRepository.save(soinsDuCorps);
		
		arcanes.setDescription("Connaître la théorie qui régit la Magie des schèmes. Reconnaître les traces laissées par un Sort de Magie. Identifier les pouvoirs enchantés dans un artéfact. Connaître les différentes loges et écoles, leurs responsables, leurs organisations et leurs implications.");
		arcanes.setNom("Arcanes");
		arcanes.setDomaineLie(magie);
//		arcanes.setMetier(arcanien);
		arcanes=specialisationRepository.save(arcanes);
		
		conjuration.setDescription("Renvoyer un Trihn ou une Anti-Âme dans son plan d'origine. Priver ses adversaires magiciens de leurs ressources trihniques et les empêcher de lancer des Sorts ou des Tourments.");
		conjuration.setNom("Conjuration");
		conjuration.setDomaineLie(magie);
//		conjuration.setMetier(conjurateur);
		conjuration=specialisationRepository.save(conjuration);
		
		defenseMagique.setDescription("Manipuler les flux trihniques pour former un bouclier magique qui protège des attaques nécrotiques, des Sorts et des Tourments.");
		defenseMagique.setNom("Defense magique");
		defenseMagique.setDomaineLie(magie);
//		defenseMagique.setMetier(revocateur);
		defenseMagique=specialisationRepository.save(defenseMagique);
		
		
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET RACE
//-------------------------------------------------------------------------------------------------------------------------	
		boreals.setNomRace("boreals");
		boreals.setDomaine(survie);
//		boreals.setSpecialisation1(vigilance);
//		boreals.setSpecialisation2(navigation);
		boreals.setTailleEstimation("1,6m à 1,9 m");
		boreals.setPoidsEstimation("60 à 120 kg");
		boreals.setLangues("Héossien, Boréal");
		boreals.setPouvoirDeRace("Vision Boréal");
		boreals.setPeupleOrigine(rivages);
		boreals.setCastePredilection(voyageurs);
		boreals.setElementTotem("Eau");
		boreals.setCouleurSymbolique("Bleu marine");
		boreals = raceRepository.save(boreals);

		darkens.setNomRace("Darkens");
		darkens.setDomaine(combat);
//		darkens.setSpecialisation1(armeDeMelee);
//		darkens.setSpecialisation2(monture);
		darkens.setTailleEstimation("1,9m à 2,3 m");
		darkens.setPoidsEstimation("80 à 200 kg");
		darkens.setLangues("Héossien, Darken");
		darkens.setPouvoirDeRace("Rage Darken");
		darkens.setPeupleOrigine(sables);
		darkens.setCastePredilection(combattants);
		darkens.setElementTotem("Feu");
		darkens.setCouleurSymbolique("Rouge");
		darkens = raceRepository.save(darkens);

		delhions.setNomRace("Delhions");
		delhions.setDomaine(social);
		delhions.setSpecialisation1(musique);
		delhions.setSpecialisation2(enseignement);
		delhions.setTailleEstimation("1,7m à 1,9 m");
		delhions.setPoidsEstimation("70 à 100 kg");
		delhions.setLangues("Héossien, Delhion");
		delhions.setPouvoirDeRace("Vol Delhion");
		delhions.setPeupleOrigine(montagnes);
		delhions.setCastePredilection(negociants);
		delhions.setElementTotem("Air");
		delhions.setCouleurSymbolique("Bleu ciel");
		delhions = raceRepository.save(delhions);

		felings.setNomRace("Felings");
		felings.setDomaine(shaan);
//		felings.setSpecialisation1(intuition);
//		felings.setSpecialisation2(discretion);
		felings.setTailleEstimation("1,5m à 1,9 m");
		felings.setPoidsEstimation("50 à 100 kg");
		felings.setLangues("Héossien, Feling");
		felings.setPouvoirDeRace("Soutien Feling");
		felings.setPeupleOrigine(grandsArbres);
		felings.setCastePredilection(shaanistes);
		felings.setElementTotem("Terre");
		felings.setCouleurSymbolique("Blanc");
		felings = raceRepository.save(felings);

		kelwins.setNomRace("Kelwins");
		kelwins.setDomaine(technique);
		kelwins.setSpecialisation1(engrenages);
		kelwins.setSpecialisation2(recuperation);
		kelwins.setTailleEstimation("0,9 m à 1,3 m");
		kelwins.setPoidsEstimation("30 à 100 kg");
		kelwins.setLangues("Héossien, Kelwinian");
		kelwins.setPouvoirDeRace("Logique Kelwin");
		kelwins.setPeupleOrigine(terresBrulees);
		kelwins.setCastePredilection(novateurs);
		kelwins.setElementTotem("Objet");
		kelwins.setCouleurSymbolique("Orange");
		kelwins = raceRepository.save(kelwins);

		melodiens.setNomRace("Melodiens");
		melodiens.setDomaine(arts);
		melodiens.setSpecialisation1(chant);
		melodiens.setSpecialisation2(seduction);
		melodiens.setTailleEstimation("1,5 m à 1,9 m");
		melodiens.setPoidsEstimation("30 à 80 kg");
		melodiens.setLangues("Héossien, Mélodian");
		melodiens.setPouvoirDeRace("Aura Mélodienne");
		melodiens.setPeupleOrigine(hautesHerbes);
		melodiens.setCastePredilection(artistes);
		melodiens.setElementTotem("Autre");
		melodiens.setCouleurSymbolique("Violet");
		melodiens = raceRepository.save(melodiens);

		nomois.setNomRace("Nomoïs");
		nomois.setDomaine(magie);
		nomois.setSpecialisation1(geologie);
//		nomois.setSpecialisation2(maitriseDesSchemes);
		nomois.setTailleEstimation("1,5 m à 1,9 m");
		nomois.setPoidsEstimation("40 à 80 kg");
		nomois.setLangues("Héossien, Nomoï");
		nomois.setPouvoirDeRace("Sagesse Nomoï");
		nomois.setPeupleOrigine(glaces);
		nomois.setCastePredilection(magiciens);
		nomois.setElementTotem("Moi");
		nomois.setCouleurSymbolique("Argent");
		nomois = raceRepository.save(nomois);

		woons.setNomRace("Woons");
		woons.setDomaine(rituels);
//		woons.setSpecialisation1(educationPhysique);
//		woons.setSpecialisation2(intimidation);
		woons.setTailleEstimation("2,2 m à 2,7 m");
		woons.setPoidsEstimation("100 à 300 kg");
		woons.setLangues("Héossien, Woon");
		woons.setPouvoirDeRace("Résistance Woon");
		woons.setPeupleOrigine(foretsBlanches);
		woons.setCastePredilection(elementalistes);
		;
		woons.setElementTotem("Animal");
		woons.setCouleurSymbolique("Or");
		woons = raceRepository.save(woons);

		ygwans.setNomRace("Ygwans");
		ygwans.setDomaine(savoir);
		ygwans.setSpecialisation1(histoireDHeos);
//		ygwans.setSpecialisation2(vieSauvage);
		ygwans.setTailleEstimation("1,5 m à 1,9 m");
		ygwans.setPoidsEstimation("60 à 150 kg");
		ygwans.setLangues("Héossien, Ygwan");
		ygwans.setPouvoirDeRace("Regénération Ygwan");
		ygwans.setPeupleOrigine(marais);
		ygwans.setCastePredilection(erudits);
		ygwans.setElementTotem("Végétal");
		ygwans.setCouleurSymbolique("Vert");
		ygwans = raceRepository.save(ygwans);

		humains.setNomRace("Humains");
		humains.setDomaine(necrose);
		humains.setSpecialisation1(cultureHumaine);
		humains.setSpecialisation2(technologie);
		humains.setTailleEstimation("1,6 m à 1,9 m");
		humains.setPoidsEstimation("60 à 120 kg");
		humains.setLangues("Héossien, Langdiv");
		humains.setPouvoirDeRace("Névrose Humain");
		humains.setPeupleOrigine(cites);
		humains.setCastePredilection(ombres);
		humains.setElementTotem("Limbes");
		humains.setCouleurSymbolique("Noir");
		humains = raceRepository.save(humains);
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET PEUPLE
//-------------------------------------------------------------------------------------------------------------------------

		foretsBlanches.setNomPeuple("Forêts Blanches");
		foretsBlanches.setDomaine(rituels);
//		foretsBlanches.setSpecialisation1(langageDuCorps);
//		foretsBlanches.setSpecialisation2(educationPhysique);
		foretsBlanches.setDescription(
				"De vastes forêts de conifères se recouvrent de neige l'hiver venu. La taïga, ou forêt boréale, étonne par sa densité et sa persistance à des altitudes défiant l'imagination. Les arbres sont moins grands que dans les régions chaudes mais les variétés de plantes sont tout aussi foisonnantes. De nombreux Temples rythment les haltes des Voyageurs.");
		foretsBlanches = peupleRepository.save(foretsBlanches);

		glaces.setNomPeuple("Glaces");
		glaces.setDomaine(magie);
//		glaces.setSpecialisation1(arcanes);
//		glaces.setSpecialisation2(langagePrimal);
		glaces.setDescription(
				"Les côtes sont bordées par une zone de glace aux contours instables. De nombreux plateaux recouverts de glaciers s'élèvent à plus de deux mille mètres. La vie au milieu des terres est impossible. Seul le littoral offre une réserve de gibier susceptible de nourrir les populations locales.");
		glaces = peupleRepository.save(glaces);

		grandsArbres.setNomPeuple("Grands Arbres");
		grandsArbres.setDomaine(shaan);
//		grandsArbres.setSpecialisation1(empathieVegetale);
//		grandsArbres.setSpecialisation2(empathieAnimale);
		grandsArbres.setDescription(
				"Cette épaisse forêt de gigantesques arbres verts peut atteindre une centaine de mètres de hauteur et son feuillage est persistant.");
		grandsArbres = peupleRepository.save(grandsArbres);

		hautesHerbes.setNomPeuple("Hautes Herbes");
		hautesHerbes.setDomaine(arts);
		hautesHerbes.setSpecialisation1(musique);
		hautesHerbes.setSpecialisation2(commerce);
		hautesHerbes.setDescription(
				"De vastes plaines d'herbe grasse s'étendent à l'infini. Parsemées d'arbres et de petits bosquets, ces régions sont principalement exploitées pour l'agriculture et l'élevage.");
		hautesHerbes = peupleRepository.save(hautesHerbes);

		marais.setNomPeuple("Hautes Herbes");
		marais.setDomaine(savoir);
		marais.setSpecialisation1(zoologie);
		marais.setSpecialisation2(botanique);
		marais.setDescription(
				"De hauts arbres plongent leurs puissantes racines dans les vastes étendues d'eau peu profondes des marais verts, jaunes et rouges. On ne trouve quasiment que des Ygwans dans les Marais, car eux seuls semblent apprécier la constante humidité et la chaleur de l'endroit.");
		marais = peupleRepository.save(marais);

		montagnes.setNomPeuple("Montagnes");
		montagnes.setDomaine(social);
//		montagnes.setSpecialisation1(educationPhysique);
		montagnes.setSpecialisation2(languesExotiques);
		montagnes.setDescription(
				"De roches et de pics, cette région froide a été prise d'assaut par les Delhions. Des conifères parsèment le pied des Montagnes, pour rapidement laisser place à la roche puis à la neige. Les conditions de vie y sont rigoureuses, car l'oxygène se raréfie en haute altitude. La montagne est un environnement très dangereux pour celui qui ne la connait pas. L'.entre-aide reste donc une priorité pour ceux qui doivent survivre dans ce milieu. Habitués à cotoyer des natifs de tous horizons, les montagnards ont développé une facilité à communiquer dans d'autres langages que les leurs.");
		montagnes = peupleRepository.save(montagnes);

		rivages.setNomPeuple("Rivages");
		rivages.setDomaine(survie);
//		rivages.setSpecialisation1(navigation);
//		rivages.setSpecialisation2(educationPhysique);
		rivages.setDescription(
				"Le milieu varie selon le climat de la région, allant de la plage de sable fin bordée d'arbres enchanteurs dans les régions chaudes aux gigantesques falaises abruptes des contrées plus froides. Sur Héos, les marées ont une amplitude colossale. Cela oblige les Peuples de la mer à consolider constamment les digues et barrages nécessaires à leur survie. Les Ygwans et les Kelwi ns de ces milieux maîtrisent la construction de ces édifices protecteurs et un maçon a droit au même respect qu'un grand navigateur. Le littoral et les fonds marins offrent une profusion de plantes et d' animaux divers. Les cités lacustres peuvent s'étendre sur des kilomètres le long des côtes et se prolongent dans la mer grâce aux ports.");
		rivages = peupleRepository.save(rivages);

		sables.setNomPeuple("Sables");
		sables.setDomaine(combat);
//		sables.setSpecialisation1(monture);
		sables.setSpecialisation2(histoireDHeos);
		sables.setDescription(
				"Les Sables sont de vastes étendues arides de sable tassé ou en formation dunaire et de rochers plus ou moins saillants. Perpétuellement balayé par de terribles vents, le désert est une transition entre les Terres Brûlées et les Hautes Herbes chaudes. Selon la présence ou l'absence des pluies, il oscillera entre ces deux régions.");
		sables = peupleRepository.save(sables);

		terresBrulees.setNomPeuple("Terres Brûlées");
		terresBrulees.setDomaine(technique);
//		terresBrulees.setSpecialisation1(navigation);
		terresBrulees.setSpecialisation2(recuperation);
		terresBrulees.setDescription(
				"De gigantesques canyons, des plateaux qui s'élèvent à l'infini, des gouffres et des ravins qui transforment la lumière en ténèbres, tel est le décor des Terres Brûlées. Les Peuples des Terres Brûlées sont obligés de compenser la dureté de leur environnement par de rastuce et des trouvailles techniques. Si personne ne veut habiter les Terres Brûlées, nombreux sont ceux qui rêvent d'en récupérer toutes les richesses ...");
		terresBrulees = peupleRepository.save(terresBrulees);

		cites.setNomPeuple("Cités");
		cites.setDomaine(necrose);
		cites.setSpecialisation1(cultureHumaine);
		cites.setSpecialisation2(vieUrbaine);
		cites.setDescription(
				"Cités tentaculaires de bâtiments aux formes improbables, dressant leurs tours de pierre et de verre en offrande au ciel, ou au contraire plongeant leurs souterrains (égouts et habitations troglodytes) dans les entrailles de la terre, les mégalopoles héossiennes regorgent de vie . . . et de mort. Car si la vie y est agréable et animée dans les beaux quartiers et dans les secteurs résidentiels, les bas-fonds restent de vrais coupe-gorges et constituent des enclaves où l'Ombre impose ses lois.");
		cites = peupleRepository.save(cites);

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET CASTE
//-------------------------------------------------------------------------------------------------------------------------
		novateurs.setNomCaste("Les Novateurs");
		novateurs.setDescription(
				"Cette Caste rassemble tous ceux qui travaillent le cuir, le métal, la pierre, le bois, le verre, le tissu, ainsi que les machinistes et ceux qui peuvent être amenés à utiliser de la technologie humaine. Cette Caste très influente dispose de nombreuses ramifications au sein des sociétés humaines et héossiennes grâce aux nombreux Ateliers de production qu'elle gère et qui constituent autant de points névralgiques de l'économie héossienne.");
		novateurs.setDomaine(technique);
		novateurs = casteRepository.save(novateurs);

		erudits.setNomCaste("Les Erudits");
		erudits.setDescription(
				"C'est l'élite intellectuelle de la population héossienne. Tous les scientifiques, philosophes, littéraires, ingénieurs et juristes y sont représentés. Le Nouvel Ordre et les Grandes Familles se méfient toujours des Érudits, qui ont été les premiers à comprendre la culture technologique humaine.");
		erudits.setDomaine(savoir);
		erudits = casteRepository.save(erudits);

		negociants.setNomCaste("Les Négociants");
		negociants.setDescription(
				"La Caste des Négociants accueille tous ceux qui tissent des liens sociaux, que ce soit à but lucratif ou par intérêt politique. Cette Caste constitue la pierre angulaire de l'économie héossienne, mais est surtout un trait d' union avec les civilisations humaines et nécrosiennes. Le Négociant sait toujours tirer profit d'une situation, quelle qu'elle soit. Peu importe son interlocuteur, il sait que chacun dispose d'une faille qu'il suffit d'exploiter pour prendre l'avantage.");
		negociants.setDomaine(social);
		negociants = casteRepository.save(negociants);

		artistes.setNomCaste("Les Artistes");
		artistes.setDescription(
				"La Caste des Artistes rassemble tous ceux dont le but est de divertir la population, que ce soit par la musique, la danse, la comédie, la peinture, la gastronomie, la jonglerie ou les acrobaties. Le Nouvel Ordre n'aimait pas les Artistes, réprimant immédiatement toute manifestation publique. Avec la Révolution et la chute du régime humain, les choses ont changé et les Artistes sont aujourd'hui encouragés à créer, à exposer et à s'exprimer pour revaloriser la culture héossienne. Certains courants artistiques engendrent d'ailleurs de véritables effets de modes qui, grâce à Arpège, se diffusent à l'ensemble du continent, offrant aux Artistes une renommée, une notoriété et une popularité parfois plus importante que celle de toutes les autres Castes.");
		artistes.setDomaine(arts);
		artistes = casteRepository.save(artistes);

		shaanistes.setNomCaste("Les Shaanistes");
		shaanistes.setDescription(
				"Les Shaanistes sont des porteurs de lumière. Transmettant le Shaan à qui l'accepte, ils ont pour charge d'apaiser les Âmes, d'harmoniser les Esprits et de réguler toute sorte de fanatisme. Le Nouvel Ordre a systématiquement persécuté les Shaanistes. Les génocides qui se sont produits ont, pendant un moment, rendu la pratique du Shaan dangereuse, mais aucun de ses adeptes ne s'est détourné de sa voie.");
		shaanistes.setDomaine(shaan);
		shaanistes = casteRepository.save(shaanistes);

		magiciens.setNomCaste("Les Magiciens");
		magiciens.setDescription(
				"Les Magiciens utilisent les Trihns qui voyagent sur Héos et s'en servent comme combustible pour leurs Pouvoirs. Souvent en contact avec les autres Castes, ils les aident par leur savoir et leur pratique.");
		magiciens.setDomaine(magie);
		magiciens = casteRepository.save(magiciens);

		elementalistes.setNomCaste("Les Élémentalistes");
		elementalistes.setDescription(
				"Les Élémentalistes échappent au système de classement des autres Castes. Ils vouent un culte aux Éléments tels qu'ils sont représentés au sein du Cercle des Réalités. Chacun de ces Éléments constitue une voie qu'un Élémentaliste peut choisir de suivre. Si un Élémentaliste transgresse volontairement un de ses tabous, il attire la colère de l'Élément offensé. Pendant trois Jours, tous ses Tests de RITUELS impliquant cet Élément lui feront perdre un point de Corps supplémentaire à cause de cette agressivité élémentaire. Il sera en pénitence et devra passer ce temps à prier son Élément.");
		elementalistes.setDomaine(rituels);
		elementalistes = casteRepository.save(elementalistes);

		voyageurs.setNomCaste("Les Voyageurs");
		voyageurs.setDescription(
				"Cette Caste rassemble les anthéens chargés de transporter quelque chose ou quelqu'un d'un point à un autre. Les Sportifs qui vont de ville en ville font également partie de cette Caste. Les Voyageurs ont pu conserver une importance malgré la démocratisation des Portes de Transfert, car bien que plus lents, ils restent tout de même bien meilleur marché");
		voyageurs.setDomaine(survie);
		voyageurs = casteRepository.save(voyageurs);

		combattants.setNomCaste("Les Combattants");
		combattants.setDescription(
				"Cette Caste rassemble tous ceux qui ne vivent que par la guerre et le respect de l'ordre. Soldats, miliciens, gladiateurs, hommes de main en sont les dignes représentants. Entre les Castes, les Guildes, les Notables et les Grandes Familles, nombreux sont ceux qui les utilisent à tour de bras pour régler des conflits, protéger un lieu ou récupérer quelque chose.");
		combattants.setDomaine(combat);
		combattants = casteRepository.save(combattants);

		ombres.setNomCaste("Les Ombres");
		ombres.setDescription(
				"Cette Caste siège à l'Assemblée Héossienne et dans les Conseils des Castes. Organisée de façon assez anarchique, elle suit malgré tout une hiérarchie pyramidale, chapeauté par plusieurs Parrains dont l'identité n'est jamais clairement établie, mais qui imposent leur autorité par la peur.");
		ombres.setDomaine(necrose);
		ombres = casteRepository.save(ombres);

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET METIER
//-------------------------------------------------------------------------------------------------------------------------	

		batisseur.setNomMetier("Batisseur");
		batisseur.setVoie("Voie de la Terre");
		batisseur.setSpecialisation(sensDeLaPierre);
		batisseur.setCasteLie(novateurs);
		batisseur.setDescription(
				"Les Bâtisseurs savent construire des ponts, des maisons, des routes, tailler la pierre et préparer la Trihnite afin qu'elle soit enchantée. Irascibles aux mains cagneuses, ils passent leur temps à râler car rien ne se passe jamais comme ils avaient prévu. Il faut dire que l'exigence des Bâtisseurs est légendaire, car ils restent conscients que la plus petite erreur de calcul, ou le moindre défaut de construction peut être à l'origine de terribles accidents et causer la mort... Ce sens des responsabilités leur met une pression permanente qu'ils entretiennent, même s'ils n'ont pas de chantier à gérer. Mais c'est ainsi, les Bâtisseurs se sentent responsables des autres...");
		batisseur = metierRepository.save(batisseur);

		charpentier.setNomMetier("Charpentier");
		charpentier.setVoie("Voie du Végétal");
		charpentier.setSpecialisation(sensDuBois);
		charpentier.setCasteLie(novateurs);
		charpentier.setDescription(
				"Le bois est l'une des matières premières les plus travaillées au sein de la société héossienne, que ce soit pour faire des meubles, des bateaux, du papier, des cordages, ou des habitations, on en voit partout. Le savoir-faire du Charpentier est immense et lui permet de sculpter finement une pièce d'échec ou bien de découper et de tailler des arbres géants qui feront des mâts de bateau-monde. Peu loquace, le Charpentier aime travailler en silence. Et lorsqu'on le questionne sur son mutisme il explique qu'il écoute le bois lui parler, et qu'il ne veut pas lui couper la parole...");
		charpentier = metierRepository.save(charpentier);

		couturier.setNomMetier("Couturier");
		couturier.setVoie("Voie de l'Eau");
		couturier.setSpecialisation(sensDuTissu);
		couturier.setCasteLie(novateurs);
		couturier.setDescription(
				"Le Couturier est amené à travailler avec de nombreux corps de métiers, qui vont lui fournir la matière première dont il aura besoin pour fabriquer des bottes, des capes, des chemises, des chapeaux, des pantalons, mais aussi des voiles de bateau, des drap ou des tapis. Certains Notables s'entichent de créateurs de haute couture et leur financent des défilés prestigieux chorégraphiés comme de grands spectacles avec son et lumière. Les vêtements ainsi mis en scène valent de véritables fortunes. Tous les Notables de la région se rendent à ces défilés qu'il convient de fréquenter pour bien se faire voir des autres Notables. Ces derniers se livrent une véritable compétition par défilé interposé, car celui qui saura proposer la meilleure prestation se verra glorifié pendant un mois. Dans ce jeu de pouvoir, les Couturiers peuvent amasser des fortunes mais également subir le courroux de Notables mécontents et tomber en disgrâce.");
		couturier = metierRepository.save(couturier);

		forgeron.setNomMetier("Forgeron");
		forgeron.setVoie("Voie du Feu");
		forgeron.setSpecialisation(sensDuMetal);
		forgeron.setCasteLie(novateurs);
		forgeron.setDescription(
				"Le Forgeron reste l'artisan le plus sollicité en Héossie, car ses capacités à fondre le métal pour en faire des armes, des armures, des outils, des renforts, et toutes sortes de pièces mécaniques sont fort utiles aux membres de toutes les castes. Bien bâti et musculeux, le Forgeron ne se ménage jamais, car pour plier le métal à sa volonté, il faut faire preuve de force et de patience. Constamment confronté à des températures très élevées, le Forgeron se révèle très frileux lorsqu'il s'agit de sortir de son atelier. Il déteste le froid et d'un tempérament casanier, il n'aime pas partir à l'aventure, préférant marteler le métal à longueur de journée. Certains Forgerons arrivent à ciseler de longues épées affûtées comme un rasoir et légères comme une plume... Ces épées, très prisées des maîtres d'armes émérites, peuvent se vendre à prix d'or.");
		forgeron = metierRepository.save(forgeron);

		infotek.setNomMetier("Infotek");
		infotek.setVoie("Voie des Limbes");
		infotek.setSpecialisation(technologie);
		infotek.setCasteLie(novateurs);
		infotek.setDescription(
				"L'Infotek est l'archétype de l'ingénieur technique, plus à l'aise avec les machines et les codes de programmation qu'avec les êtres vivants. Totalement investi dans son métier, l'Infotek passe beaucoup de temps sur Arpège pour son travail ou ses loisirs, ce qui fait que la plupart se font greffer des modules de neurocodage avec des prothèses rétiniennes afin d'être connectés en permanence sur le réseau et de pouvoir s'y déplacer en clignant les yeux. Peu loquace, l'Infotek est renfermé sur lui-même et n'est à l'aise qu'en compagnie d'autres Infoteks. Maîtrisant la technologie humaine sur le bout des doigts, ils savent démonter et remonter une arme à feu, un moteur de véhicule, ont des notions de biomorphie et peuvent créer des programmes en code Note qui pourront être exploités sur le rézo Arpège.");
		infotek = metierRepository.save(infotek);

		joaillier.setNomMetier("Joaillier");
		joaillier.setVoie("Voie de l'Autre");
		joaillier.setSpecialisation(sensDuVerre);
		joaillier.setCasteLie(novateurs);
		joaillier.setDescription(
				"Le Joaillier est un sculpteur de lumière. Qu'importe le matériau, verre, diamant, perle, cristal, il sait le tailler pour en faire un bijou unique, une pièce de collection que les Notables s'arracheront à prix d'or. Le Joailler travaille souvent avec le Couturier pour la confection de tous les accessoires d'un vêtement de collection. Mais le Joaillier intervient également pour la fabrication d'objets moins prestigieux où ses compétences de souffleur de verre lui permettent de réaliser loupes, fenêtres, lunettes mais aussi verres et carafes. D'ailleurs, il règne un certain mépris au sein des Joailliers. Ceux liés à la mode considèrent les artisans du verre comme des tâcherons et les artisans du verre considèrent les orfèvres comme des imposteurs... Rares sont ceux qui peuvent se permettre de travailler dans ces deux spécialisations en même temps...");
		joaillier = metierRepository.save(joaillier);

		mecaniste.setNomMetier("Mécaniste");
		mecaniste.setVoie("Voie de l'Objet");
		mecaniste.setSpecialisation(engrenages);
		mecaniste.setCasteLie(novateurs);
		mecaniste.setDescription(
				"Le Mécaniste dispose d'une horloge interne extrêmement bien développée, qui lui permet d'analyser le fonctionnement des machines et d'en appréhender intuitivement le fonctionnement. Réparateur hors-pair, il trouve toujours la panne au bon endroit et dispose à chaque fois des outils adéquats pour travailler dans de bonnes conditions. Très méticuleux, le Mécaniste a tendance à être un maniaque de l'ordre et du rangement. Pour lui, chaque chose a une place et ne saurait en changer.");
		mecaniste = metierRepository.save(mecaniste);

		pilote.setNomMetier("Pilote");
		pilote.setVoie("Voie de l'Air");
		pilote.setSpecialisation(pilotage);
		pilote.setCasteLie(novateurs);
		pilote.setDescription(
				"Les Pilotes ont su domestiquer la technologie humaine liée aux véhicules, terrestres, aériens ou aquatiques. Ils peuvent passer d'un autojet à un croiseur lourd à chenilles, d'une simple moto, à un hydroscape en un claquement de doigt. Le Pilote ne fait qu'un avec son engin qui devient avec l'expérience une extension de son propre corps. C'est cette sorte d'osmose technique qui permet aux Pilotes chevronnés de manœuvrer avec talent dans des situations critiques.");
		pilote = metierRepository.save(pilote);

		recuperateur.setNomMetier("Récupérateur");
		recuperateur.setVoie("Voie du Moi");
		recuperateur.setSpecialisation(recuperation);
		recuperateur.setCasteLie(novateurs);
		recuperateur.setDescription(
				"Le Récupérateur ne jette jamais rien. Pour lui tout peut toujours servir à un moment ou à un autre. Son habitation prend alors des allures de décharge publique, au grand désespoir de ceux qui vivent à ses côtés. Même lorsqu'il est en voyage, le Récupérateur ne peut s'empêcher de ramasser tout ce qu'il trouve. Et même si parfois, un Récupérateur trop encombré peut ralentir un groupe, celui-ci sait que le moment venu, le Récupérateur aura ce qu’il lui faut pour fabriquer l'outil, l'arme ou l'objet qui permettra à tous de sortir d'une situation périlleuse...");
		recuperateur = metierRepository.save(recuperateur);

		tanneur.setNomMetier("Tanneur");
		tanneur.setVoie("Voie de l'Animal");
		tanneur.setSpecialisation(sensDuCuir);
		tanneur.setCasteLie(novateurs);
		tanneur.setDescription(
				"Pour le Tanneur, l'animal est le bien le plus précieux qui soit. Et il sait qu'un animal en bonne santé donnera toujours un cuir de meilleure qualité. C'est pour cela que le Tanneur est naturellement bienveillant envers les animaux, même ceux dont il ne travaille pas la peau, la laine ou la fourrure. Il respecte le règne animal et avant de tuer une bête, il s'arrange toujours pour lui rendre hommage en lui adressant quelques prières bienveillantes. Le Tanneur connaît toutes les techniques pour dépecer un animal en optimisant les découpes pour obtenir les pièces de cuir les plus grandes possibles.");
		tanneur = metierRepository.save(tanneur);

		alchimiste.setNomMetier("Alchimiste");
		alchimiste.setVoie("Voie du feu");
		alchimiste.setSpecialisation(alchimie);
		alchimiste.setCasteLie(erudits);
		alchimiste.setDescription(
				"L'Alchimiste aime défier la nature. Il passe son temps à transformer la matière, à la modeler pour qu’elle s'adapte à sa volonté. Il est convaincu de la supériorité de son esprit sur les éléments. Créateur de formules alchimiques qui permettent, telles des recettes de cuisine, de confectionner un plat original à partir d'ingrédients divers, l'Alchimiste a la faculté d'accéder à l'irrationnel et au surnaturel par la voie de la science. Les Alchimistes peuvent ainsi créer des potions, des onguents, des poudres qui permettent d'accroître ses capacités ou même de disposer de pouvoirs spéciaux.");
		alchimiste = metierRepository.save(alchimiste);

		archiviste.setNomMetier("Archiviste");
		archiviste.setVoie("Voie de l'Objet");
		archiviste.setSpecialisation(bibliotheque);
		archiviste.setCasteLie(erudits);
		archiviste.setDescription(
				"L'Archiviste est un vrai rat de bibliothèque et dispose d'une mémoire phénoménale. Il connait tous les ouvrages qui sont répertoriés dans ses rayonnages, même s'il y en a plusieurs milliers. Mais surtout, il sait où chacun de ces livres se trouve. L'Archiviste reste la personne indispensable pour tous les chercheurs et les enseignants, car non seulement il peut fournir ce qu'on lui demande, mais en plus il n'est jamais avare de conseils et propose toujours des livres en plus, en rapport avec une problématique mais qui apportent un éclairage complémentaire.");
		archiviste = metierRepository.save(archiviste);

		botaniste.setNomMetier("Botaniste");
		botaniste.setVoie("Voie du Végétal");
		botaniste.setSpecialisation(botanique);
		botaniste.setCasteLie(erudits);
		botaniste.setDescription(
				"Le Botaniste partage son temps entre ses expéditions en pleine nature à la recherche de nouveaux spécimens afin d'enrichir sa collection personnelle et ses herbiers, et son atelier où il répertorie, analyse, compare et étudie toutes les nouvelles espèces qu'il a pu collecter. Connaissant parfaitement le règne végétal, il peut communiquer avec des êtres-plante doués d'intelligence lorsqu'il est amené à en croiser dans ses nombreux voyages... Le Botaniste en sait tout autant sur les plantes médicinales, les poisons ou les fruits et légumes. Les champignons et leurs nombreuses familles font également partie du domaine d'expertise du botaniste.");
		botaniste = metierRepository.save(botaniste);

		esoteriste.setNomMetier("Esotériste");
		esoteriste.setVoie("Voie de l'Air");
		esoteriste.setSpecialisation(esoterisme);
		esoteriste.setCasteLie(erudits);
		esoteriste.setDescription(
				"L'Ésotériste est passionné par tout ce qui est occulte et en relation avec les forces surnaturelles d'Héos. Il maîtrise parfaitement la divination à l'aide du tarot héossien, et est capable de prévoir les chemins de vie des êtres et des choses dans le Cercle des Réalités. L'ésotérisme héossien puise ses racines bien avant l'antiquité, où les peuplades primitives entraient déjà en communion avec les Trihns, les éléments et les dieux... La force mentale de l'Ésotériste lui permet de résister aux attaques mentales qui lui sont destinées.");
		esoteriste = metierRepository.save(esoteriste);

		geologue.setNomMetier("Géologue");
		geologue.setVoie("Voie de la Terre");
		geologue.setSpecialisation(geologie);
		geologue.setCasteLie(erudits);
		geologue.setDescription(
				"Le Géologue sait lire dans la pierre et dans les sols l'histoire de la formation des continents et des âges. Les croyants se plaisent à étudier le martèlement des géants, à l'origine de la formation des reliefs et des montagnes, les pragmatiques ne prennent en compte que les phénomènes d'érosion naturelle et de la tectonique des plaques. Les Géologues sont aussi experts en ce qui concerne les sources d'énergie naturelle et la manière dont on peut l'extraire et la transformer. Ils disposent également de grandes connaissances sur la Trihnite, sa composition et les origines de sa formation...");
		geologue = metierRepository.save(geologue);

		historien.setNomMetier("Historien");
		historien.setVoie("Voie du Moi");
		historien.setSpecialisation(histoireDHeos);
		historien.setCasteLie(erudits);
		historien.setDescription(
				"L'Historien est un phare dans la reconstruction de la civilisation héossienne. Membre actif de la Résistance il fut un temps, il sait relier les éléments du présent au passé afin de se projeter dans l'avenir. Car l'Historien n’a de cesse d'expliquer à qui veut l'entendre que l'Histoire se répète toujours... L'Historien maîtrise l'Histoire héossienne, mais également tous les mythes fondateurs et les légendes qui lui sont associées. Il est souvent bavard et intarissable dès qu'on le lance sur un fait historique ou un personnage célèbre, car comme tout est lié, il peut remonter à l'antiquité pour expliquer pourquoi tel empereur darken contemporain a été banni, ou encore comment le conflit nécrosien qui se prépare est un écho de ce qui a pu se produire au niveau local quelques centaines d'années auparavant.");
		historien = metierRepository.save(historien);

		juriste.setNomMetier("Juriste");
		juriste.setVoie("Voie de l'Eau");
		juriste.setSpecialisation(protocoles);
		juriste.setCasteLie(erudits);
		juriste.setDescription(
				"« Que vous soyez puissant ou misérable, vous serez jugés innocent ou coupable » relatait un conteur de l'antéhistoire humaine mettant en scène des animaux. Le Juriste fera toujours tout son possible pour contredire cet adage, même si dans bon nombre d'affaires impliquant des Notables, ces derniers bénéficient toujours de circonstances favorables ou minimisant leurs actes, là où le commun des mortels irait tout droit en prison. Car faire appel à un Juriste pour se défendre alors que l'on subit une attaque judiciaire coûte cher. Et plus l'affaire est complexe, plus le Juriste approprié sera onéreux.");
		juriste = metierRepository.save(juriste);

		medecin.setNomMetier("Médecin");
		medecin.setVoie("Voie de l'Autre");
		medecin.setSpecialisation(medecine);
		medecin.setCasteLie(erudits);
		medecin.setDescription(
				"Le Médecin sait diagnostiquer et soigner les maladies et les blessures du Corps. À la fois chirurgien et pharmacien, il sait quel médicament prescrire pour lutter contre une maladie ou quel antidote est nécessaire pour contrer la virulence d'un poison. D'un sang-froid à toute épreuve, le Médecin sait faire face à n'importe quelle situation, même périlleuse. En plein combat, il sait garder son flegme et peut effectuer une opération chirurgicale de grande ampleur, en conservant des gestes précis. Certains humoristes caricaturent souvent les Médecins en les mettant dans des situations improbables, très dangereuses et en leur faisant réaliser toutes sortes d'actions très compliquées, comme si de rien n'était.");
		medecin = metierRepository.save(medecin);

		percepteur.setNomMetier("Percepteur");
		percepteur.setVoie("Voie des Limbes");
		percepteur.setSpecialisation(cultureHumaine);
		percepteur.setCasteLie(erudits);
		percepteur.setDescription(
				"Le Percepteur est chargé de collecter les impôts auprès des Héossiens pour le compte des Humains, des Grandes Familles et de certains Notables. Entre deux mondes, le Percepteur sait se fondre au sein des Humains et connaît tout de leur mode de vie, de leurs codes, de leur langue et de leur folie... Peu apprécié des Héossiens, le Percepteur a eu son heure de gloire du temps où la théocratie du Nouvel Ordre était plus draconienne. Avec l'assouplissement des lois, il se fait parfois rejeter voire même agresser en signe de représailles, pour les services qu'il a rendus par le passé.");
		percepteur = metierRepository.save(percepteur);

		zoologue.setNomMetier("Zoologue");
		zoologue.setVoie("Voie de l'Animal");
		zoologue.setSpecialisation(zoologie);
		zoologue.setCasteLie(erudits);
		zoologue.setDescription(
				"Le Zoologue est un collectionneur, il passe son temps à collecter et mettre à jour toutes les informations liées à une espèce animale ou à un écosystème. Bon nombre de Zoologues disposent de petits talents artistiques qui leur permettent de dessiner ce qu'ils sont amenés à observer sur le terrain. Certains Zoologues se spécialisent dans la connaissance de certains types d'animaux, les prédateurs, les herbivores, les nomades, les poissons, les oiseaux, les amphibiens, les reptiles... Un Zoologue est aussi un peu vétérinaire et connait les premiers soins à apporter à un animal blessé, et les gestes à effectuer pour sauver des vies. Assez impulsif dans son comportement, le Zoologue accorde beaucoup d'importance à son odorat : il peut ainsi récupérer des informations que les autres sens ne lui permettent pas de saisir. C'est pour cette raison que les meilleurs Zoologues sont Woons.");
		zoologue = metierRepository.save(zoologue);

		courtisan.setNomMetier("Courtisant");
		courtisan.setVoie("Voie du feu");
		courtisan.setSpecialisation(seduction);
		courtisan.setCasteLie(negociants);
		courtisan.setDescription(
				"Les Courtisans savent obtenir tout ce qu'ils désirent en jouant avec les instincts primaires des individus. Se créer un personnage qui fera rêver son ou sa partenaire est pour le courtisan une habitude qu'il n'est pas toujours facile à tenir, surtout lorsque les conquêtes sont nombreuses. Les Courtisans œuvrent principalement auprès des Notables et des personnes de pouvoir, afin d'obtenir des informations ou de l'argent, selon qu'ils agissent pour des commanditaires ou pour leur propre compte. Certain Courtisans aiment juste séduire pour le plaisir, car ils se sentent ainsi désirés et donc exister. Les Courtisans savent enivrer les Corps, bousculer les Esprits et cueillir les Âmes. Le vrai talent du Courtisan est de ne jamais rompre, de s'arranger pour que les personnes qu'il a séduites reste toujours dans l'attente d'une éventuelle poursuite de la relation. C'est ce qui prend le plus de temps aux Courtisans : entretenir la flamme de ceux qu'ils ont envoûtés afin que l'amour ne se transforme jamais en haine... Mais rares sont ceux qui y arrivent et pour la plupart des Courtisans et Courtisanes, il y a des villes au sein desquelles ils ne peuvent plus mettre les pieds, sous peine d'être arrêtés sur-le-champ par un potentat local qui se sera senti trahi...");
		courtisan = metierRepository.save(courtisan);

		cyberien.setNomMetier("Cybérien");
		cyberien.setVoie("Voie de l'Objet");
		cyberien.setSpecialisation(arpege);
		cyberien.setCasteLie(negociants);
		cyberien.setDescription(
				"Le domaine de prédilection du Cybérien, c'est le réseau Arpège. Cette fameuse toile où circulent des milliards d'informations à chaque seconde et qui sert de liant à toute la société humaine. Média, logiciels, informations, livres, apprentissage, juridiction, livres sacrés, tout est sur Arpège. Le Cybérien est un expert pour rechercher des données, tromper la vigilance des systèmes de surveillance ou négocier toutes sortes de produits sur des sites marchands. Car les interfaces informatiques ont tellement évolué, qu'elles ont en fait disparu au profit du simple langage vocal. Donc n'importe qui sachant parler peut en théorie faire ce qu'il veut sur Arpège, encore faut-il savoir comment dire les choses et où aller... Le Cybérien maîtrise toute la dialectique du rézo et peut, dès l'instant où il dispose d'une borne d'accès, se jouer de toutes les entraves humaines.");
		cyberien = metierRepository.save(cyberien);

		diplomate.setNomMetier("Diplomate");
		diplomate.setVoie("Voie de l'Eau");
		diplomate.setSpecialisation(diplomatie);
		diplomate.setCasteLie(negociants);
		diplomate.setDescription(
				"Entre \"le marteau et l'enclume\", le Diplomate est là pour gérer les conflits entre les royaumes. Une déclaration de guerre est pour le Diplomate un constat d'échec. Il doit connaître les généalogies de chaque dynastie, connaître les us et coutumes de chaque culture afin qu'au moment crucial de la négociation politique, il ne fasse aucun impair. Combien de déclarations de guerre ont été faites à cause d'une odeur mal interprétée par un roi woon, ou encore par un mauvais agencement de couleur de tenue pour un prince mélodien un peu caractériel. Le Diplomate peut agir pour le compte des Conseils des castes, mais également pour celui d'Humains affiliés au Nouvel Ordre ou aux Grandes Familles. Les Diplomates les plus chevronnés sont envoyés en territoire nécrosé afin de traiter avec les princes et autres spectres pour tenter de minimiser leurs désirs d'expansion...");
		diplomate = metierRepository.save(diplomate);

		enseignant.setNomMetier("Enseignant");
		enseignant.setVoie("Voie du Végétal");
		enseignant.setSpecialisation(enseignement);
		enseignant.setCasteLie(negociants);
		enseignant.setDescription(
				"L'Enseignant est là pour donner les bases d'une culture générale dans tous les domaines aux enfants de 6 à 15 ans. Au-delà, les disciplines plus spécialisées sont enseignées par des membres éminents de chaque caste. L'Enseignant doit avoir une culture transversale et ne pas se contenter d'une vision parcellaire du monde, tout ce qu'il enseigne est lié et touche à de nombreuses matières en même temps. Disponible et à l'écoute des autres, l'Enseignant a toujours à cœur de transmettre quelque chose à son prochain, mais cela peut parfois être perçu comme de la prétention par son entourage, alors qu'il n'en est rien...");
		enseignant = metierRepository.save(enseignant);

		informateur.setNomMetier("Informateur");
		informateur.setVoie("Voie des Limbes");
		informateur.setSpecialisation(vieUrbaine);
		informateur.setCasteLie(negociants);
		informateur.setDescription(
				"L'Informateur est un élément indispensable, dès qu'il s'agit de faire une enquête ou d'obtenir des informations au sein d'un milieu urbain. Il entend tout, voit tout et sait tout, grâce à ses nombreux réseaux de renseignement qui lui rendent compte en temps réel de la situation sociale, politique, économique d'un quartier et même de toute une ville pour les plus influents. Curieux et à l'affût des moindres faits et gestes des puissants et des Notables, les Informateurs connaissent et maîtrisent tous les us et coutumes citadins afin de se fondre dans la masse.");
		informateur = metierRepository.save(informateur);

		marchand.setNomMetier("marchand");
		marchand.setVoie("Voie de l'Air");
		marchand.setSpecialisation(commerce);
		marchand.setDescription(
				"Le commerce a toujours été moteur au sein de la civilisation héossienne, comme partout ailleurs. Les Marchands jouissent de reconnaissance et de prestige auprès des Notables car ils constituent l'un des rouages fondamentaux de l'économie. Du simple vendeur au négociateur de contrats avec de grandes puissances, les Marchands sillonnent l'Héossie à la recherche de la bonne affaire qui fera d'eux des hommes riches. Car devenir Notable est pour un Marchand le but absolu. Pour un Marchand tout se vend ou s'achète, même l'amitié... Cela peut parfois créer des tensions au sein du groupe dont il peut faire partie, car malheureusement la plupart des marchands mettra toujours le profit avant l'éthique...");
		marchand = metierRepository.save(marchand);

		politicien.setNomMetier("Politicien");
		politicien.setVoie("Voie du Moi");
		politicien.setSpecialisation(bluff);
		politicien.setCasteLie(negociants);
		politicien.setDescription(
				"La géopolitique héossienne est devenue extrêmement complexe et délicate, entre les alliances que tissent Grandes Familles, Nouvel Ordre, Notables Héossiens, Conseils des castes et royaumes nécrosiens, difficile de savoir pour quel camp on œuvre réellement. Le politicien sait nager en eaux troubles et toujours retomber sur ses pattes, quel que soit son interlocuteur. Ami, ennemi, allié, partisan, contradicteur, le politicien a toujours quelque chose à dire et à répondre. Sa capacité à rebondir sur les arguments de ses détracteurs lui permet de faire croire ce qu'il veut à n'importe qui.");
		politicien = metierRepository.save(politicien);

		prospecteur.setNomMetier("Prospecteur");
		prospecteur.setVoie("Voie de l'Animal");
		prospecteur.setSpecialisation(langagePrimal);
		prospecteur.setCasteLie(negociants);
		prospecteur.setDescription(
				"Le Prospecteur est un aventurier, envoyé dans les coins les plus reculés et isolés du monde afin de défricher de nouveaux marchés potentiels. Il est habitué à se débrouiller seul et sait s'adapter à n'importe quelle situation. Son expérience lui a permis de décrypter les signaux émis par les peuples primitifs qui ne parlent pas sa langue et il sait aussi se faire comprendre d'eux grâce à un mélange de sons, de langage des signes et de dessins. Certains Prospecteurs réussissent même à se faire comprendre des animaux, évitant ainsi de se faire attaquer par un prédateur mal intentionné.");
		prospecteur = metierRepository.save(prospecteur);

		tenancier.setNomMetier("Tenancier");
		tenancier.setVoie("Voie de la Terre");
		tenancier.setSpecialisation(psychologie);
		tenancier.setCasteLie(negociants);
		tenancier.setDescription(
				"Le Tenancier est un pragmatique. Habitué à tenir une auberge, une échoppe, une boutique, un restaurant, il doit toujours savoir à qui il a affaire pour ne prendre aucun risque et surtout se donner les meilleures chances de vendre les services qu'il a à proposer. Connaissant parfaitement tous les archétypes psychologiques et les ficelles qu'il faut tirer pour obtenir ce que l'on veut, il sait jauger quelqu'un d'un regard, et le moindre détail saura lui révéler un fragment de personnalité. Le Tenancier sait désamorcer les conflits et trouver les mots pour éviter que les situations ne s'enveniment.");
		tenancier = metierRepository.save(tenancier);

		traducteur.setNomMetier("Traducteur");
		traducteur.setVoie("Voie de l'Autre");
		traducteur.setSpecialisation(languesExotiques);
		traducteur.setCasteLie(negociants);
		traducteur.setDescription(
				"Le Traducteur connaît les diverses langues raciales héossiennes et peut comprendre la plupart des dialectes locaux en en comprenant les origines linguistiques. Indispensable pour toute transaction personnalisée, le Traducteur dispose d'un grand pouvoir car il peut selon ses intérêts favoriser l'une ou l'autre partie. C'est pour cela que chaque partie dispose de son Traducteur afin d'être sûr de ce qui est traduit. Mais il n'est pas rare que les Traducteurs de parties adverses se mettent d'accord au départ de l'issue d'une transaction et se répartissent ensuite les bénéfices de leurs petites arnaques. Pour éviter cela, le Traducteur doit prêter serment devant le Cercle des Réalités afin de pouvoir exercer son métier sans susciter la méfiance de ses interlocuteurs.");
		traducteur = metierRepository.save(traducteur);

		bateleur.setNomMetier("Bateleur");
		bateleur.setVoie("Voie du Feu");
		bateleur.setSpecialisation(artsDuFeu);
		bateleur.setCasteLie(artistes);
		bateleur.setDescription(
				"Le Bateleur est un fougueux. Artiste des rues, il livre un combat permanent contre lui-même afin de prouver à la face du monde qu'il existe. Le Feu est son élément et il le maîtrise à la perfection, que ce soit pour le cracher, l'utiliser pour des éclairages subtils ou pour concevoir des feux d'artifice grandiloquents et mémorables. Le Bateleur a de la gouaille et il harangue les passants afin qu'ils assistent au spectacle de sa troupe, quitte à hausser le ton...");
		bateleur = metierRepository.save(bateleur);

		chanteur.setNomMetier("Chanteur");
		chanteur.setVoie("Voie de l'Air");
		chanteur.setSpecialisation(chant);
		chanteur.setCasteLie(artistes);
		chanteur.setDescription(
				"Le Chanteur est son propre instrument. Ses vocalises entretiennent sa voix, chose qu'il a de plus précieux au monde.... Avoir une extinction de voix constitue pour un Chanteur le supplice le plus traumatisant. Certains ne s'en sont même jamais remis et sont devenus fous. Mais lorsque le Chanteur est en pleine possession de ses moyens, il sait qu'il dispose d'une force mystique, qui s'affranchit du langage pour communier directement avec l'Âme. Il peut alors ne faire qu'un avec son public et l'emmener vers des destinations gorgées de béatitude et d'émotions.... Les Chanteurs sont les artistes les plus appréciés et nombreux sont ceux qui disposent d'un statut de Notable et d'une cour de sympathisants.");
		chanteur = metierRepository.save(chanteur);

		comedien.setNomMetier("Comédien");
		comedien.setVoie("Voie de l'Autre");
		comedien.setSpecialisation(comedie);
		comedien.setCasteLie(artistes);
		comedien.setDescription(
				"Les Comédiens ont toujours été appréciés du public, mais il ne disposent pas de l'aura mystique des Chanteurs. Le Comédien oscille entre tragédie, comédie et a parfois du mal à dissocier le réel de son imaginaire. Le Comédien est habitué à vivre en troupe et à sillonner les routes pour ses diverses représentations. Mais la vie de Comédien est souvent faite de solitude, car une fois la tournée terminée, la troupe se défait et les Comédiens peuvent ne jamais se revoir. C'est pour cela que les Comédiens sont toujours extrêmement chaleureux car ils savent qu'ils ont peu de temps pour être efficaces et bien s'entendre, afin d’assurer la réussite du spectacle. La présence d'un Comédien au sein d'un Shaani est toujours le gage d'une bonne humeur communicative.");
		comedien = metierRepository.save(comedien);

		costumier.setNomMetier("Costumier");
		costumier.setVoie("Voie des Limbes");
		costumier.setSpecialisation(deguisement);
		costumier.setCasteLie(artistes);
		costumier.setDescription(
				"Le Costumier mène une double vie, à la fois styliste de mode, il maîtrise toutes les techniques de confection du tissu, maîtrise la science des étoffes et l'histoire du costume. Ses talents sont indispensables à toute création théâtrale ou autre spectacle vivant. Mais en secret, le Costumier se fait aussi créateur de déguisements en vue de tromper la sagacité des individus. Il sait confectionner des masques plus vrais que nature et pourrait faire passer un Kelwin pour un Woon.... Tous les services secrets, de la Résistance aux agents du Nouvel Ordre, paient à prix d'or les services des Costumiers qui leur permettent de donner n'importe quelle apparence à n'importe qui...");
		costumier = metierRepository.save(costumier);

		cuisinier.setNomMetier("Cuisinier");
		cuisinier.setVoie("Voie de la Terre");
		cuisinier.setSpecialisation(gastronomie);
		cuisinier.setCasteLie(artistes);
		cuisinier.setDescription(
				"La gastronomie héossienne constitue un art des plus illustres. Chaque année, nombreux sont les tournois qui mettent en concurrence les plus grands chefs gastronomiques afin que soit élu le meilleur Maître des saveurs. La compétition se déroule sur plusieurs semaines et des milliers de cuisiniers affluent de toute l’Héossie pour y participer. S’enchainent alors des plats mêlant toutes sortes de saveurs, des plus douces aux plus amères, compensées par des notes relevées et sucrées. Le travail sur les textures, les matières, les couleurs, la composition est également essentiel, et certains Cuisiniers ont recours aux services d’Évocateurs afin de sublimer leurs plats. Bon vivant par excellence, le Cuisinier est un compagnon de route très recherché car avec peu d’ingrédients, il est capable de faire de grands festins. La prise d’embonpoint est quasiment inévitable et ce dans la mesure où le Cuisinier, avant de servir ce qu’il a préparé, se fait un devoir de tout goûter (pour être certain des saveurs qu’il va proposer à ses convives). L’art de la cuisine héossienne suit la symbolique des Trihns, le salé correspond au Corps, le sucré à l’Âme et l’amer à l’Esprit. L’acidité, quant à elle, est plus liée à la Nécrose.");
		cuisinier = metierRepository.save(cuisinier);

		danseur.setNomMetier("Danseur");
		danseur.setVoie("Voie de l'Animal");
		danseur.setSpecialisation(langageDuCorps);
		danseur.setCasteLie(artistes);
		danseur.setDescription(
				"La danse est ce qui relie l'Âme au Corps. Bouger son Corps, c'est élever son Âme... Le Danseur, en communion avec les forces telluriques ancestrales, communique ses émotions à son public. Son langage est universel et perceptible, depuis le fin fond des régions les plus primitives de l'Héossie, aux diverses cours des Grandes Familles et autres Notables. Plutôt de nature solitaire, le Danseur travaille aussi en troupe et pratique la vie en communauté, tout comme les Comédiens. Il a le rythme dans la peau, dans le sang et est souvent à la recherche du Musicien avec qui il pourra créer le spectacle ultime où musique et danse ne font plus qu'un.");
		danseur = metierRepository.save(danseur);

		ecrivain.setNomMetier("Ecrivain");
		ecrivain.setVoie("Voie du Végétal");
		ecrivain.setSpecialisation(lettres);
		ecrivain.setCasteLie(artistes);
		ecrivain.setDescription(
				"L'Écrivain est un jongleur de mots. Passé maître dans l'art de les agencer, il sait créer l'émotion, faire passer du rire aux larmes, raconter des histoires extraordinaires ou faire des descriptions minutieuses... Son imaginaire fertile et sa sensibilité à fleur de peau lui permettent de capter ce que les gens habituellement ne voient pas. Se faire éditer et toucher le plus grand nombre constitue pour l'Écrivain une sorte de quête ultime car rares sont ceux à y être parvenus et à vivre correctement de leur art. L'Écrivain est un solitaire qui suit deux cycles de vie bien distincts. Le premier est un cycle d'imprégnation, où l'Écrivain va rechercher à vivre un maximum d'aventures et à accumuler de nombreuses expériences. Le second cycle est fait de recueillement et de production intensive où l'écrivain va coucher sur papier tout ce que son Âme lui dicte. Durant cette période, l'Écrivain est souvent de mauvaise humeur et asocial car il obtient rarement du premier coup le résultat qu'il espère. Certains Écrivains peuvent passer d'un cycle à l'autre dans une même journée...");
		ecrivain = metierRepository.save(ecrivain);

		evocateur.setNomMetier("Evocateur");
		evocateur.setVoie("Voie de l'Eau");
		evocateur.setSpecialisation(artsAppliques);
		evocateur.setCasteLie(artistes);
		evocateur.setDescription(
				"Souvent ermite et retranché dans son atelier, l'Évocateur oscille entre deux mondes : celui de sa pensée et celui de son inconscient. Peu importe le support, peinture, dessin, sculpture, il effectue un voyage intérieur pour tenter d'y trouver ce qui lui permettra de créer une œuvre universelle. Souvent dépressif, l'Évocateur ne cesse de dire que l'on ne peut créer en étant heureux.... Hyper sensible, il est sans cesse meurtri par la violence du quotidien. Il absorbe cette violence, la canalise et la transcende en une évocation picturale ou en volume chargé de trouver son public. Mais malheureusement, les Évocateurs restent souvent des artistes incompris.");
		evocateur = metierRepository.save(evocateur);

		musicien.setNomMetier("Muscien");
		musicien.setVoie("Voie du Moi");
		musicien.setSpecialisation(musique);
		musicien.setCasteLie(artistes);
		musicien.setDescription(
				"On dit que la musique adoucit les mœurs, c'est une réalité. Le Musicien est une sorte de médecin de l'Âme. Dès qu'il se met à jouer, les tensions se figent, les inimitiés cessent. Le temps d'un morceau, les pires ennemis peuvent faire une trêve pour l'écouter ensemble.... Il existe une hiérarchie au sein des Musiciens, du simple interprète au compositeur, en passant par le virtuose ou le chef d'orchestre, chacun a sa place, mais doit la tenir... Il n'est pas bien vu de changer d'étiquette. La plus grande injustice pour les Musiciens est liée au temps. Certains voient leurs compositions traverser les âges là où d'autres ne seront l'auteur que d'une musique de mode, oubliée et chassée par la suivante...");
		musicien = metierRepository.save(musicien);

		prestidigitateur.setNomMetier("Prestidigitateur");
		prestidigitateur.setVoie("Voie de l'Objet");
		prestidigitateur.setSpecialisation(trucages);
		prestidigitateur.setCasteLie(artistes);
		prestidigitateur.setDescription(
				"Les Prestidigitateurs sont experts pour tromper l'attention de leur public et leur faire croire que ce qui n'est qu'un simple tour de passe-passe est le fruit d'une magie prodigieuse. Les Prestidigitateurs peuvent faire croire à la disparition ou à l'apparition d'objets divers de taille plus ou moins importante. Le Prestidigitateur n'est pas toujours honnête et se sert souvent de ses talents pour tricher aux jeux d'argent et ruiner ses adversaires. Beaucoup de Prestidigitateurs sont ainsi rapidement devenus des Notables. Mais ces Notables, lorsqu'ils tombent sur plus forts qu'eux, perdent très vite leur statut et peuvent finir dans la misère, brisés...");
		prestidigitateur = metierRepository.save(prestidigitateur);

		ameVive.setNomMetier("Ame-vive");
		ameVive.setVoie("Voie du Moi");
//		ameVive.setSpecialisation(soinsDeLAme);
		ameVive.setCasteLie(shaanistes);
		ameVive.setDescription(
				"Les Âmes-vives sont les compagnons préférés de tous ceux qui doivent approcher la Nécrose de près ou de loin, ou qui peuvent être amenés à subir des effets nécrotiques... Cela fait beaucoup de monde en fait, si bien que les Âmes-vives sont très souvent sollicités, trop estiment-ils... Car les Âmes-vives ne sont pas des individus très sociables et il faut souvent déployer des trésors d'argumentation afin de les convaincre de bien vouloir exercer leurs compétences sur quelqu'un. Une Âme-vive, individualiste comme elle est, cherchera toujours un prétexte ou tentera de minimiser la situation pour ne pas avoir à rendre service... Mais la plupart des gens passent outre ce côté un peu antipathique car pour les Héossiens, l'Âme reste le Trihn le plus précieux pour éviter de passer du côté des Limbes...");
		ameVive = metierRepository.save(ameVive);

		chasseurDeSteles.setNomMetier("Chasseur de stèles");
		chasseurDeSteles.setVoie("Voie de l'Objet");
//		chasseurDeSteles.setSpecialisation(embiose);
		chasseurDeSteles.setCasteLie(shaanistes);
		chasseurDeSteles.setDescription(
				"Les Chasseurs de stèles parcourent le monde à la recherche de stèles d'Embiose, afin de pratiquer le fameux rituel qui leur permet d'augmenter rapidement leurs capacités. Ils sont souvent de cheville avec les Traqueurs de stèles qui connaissent de très nombreux emplacements de stèles et les réseaux auxquels elles sont liées. Mais certains Chasseurs de stèles se nécrosent rapidement et pour endiguer le phénomène, voyagent avec des Âmes-vives afin de limiter la casse... Les Chasseurs de stèles ont du mal à se satisfaire de ce qu'ils ont : toujours portés vers l'avenir, ils ont souvent du mal à concilier le Shaan avec leurs aspirations.");
		chasseurDeSteles = metierRepository.save(chasseurDeSteles);

		cultivateur.setNomMetier("Cultivateur");
		cultivateur.setVoie("Voie du Végétal");
//		cultivateur.setSpecialisation(empathieVegetale);
		cultivateur.setCasteLie(shaanistes);
		cultivateur.setDescription(
				"Propriétaire terrien ou simple vacataire, le Cultivateur passe sa vie dans les champs à semer et récolter des céréales, des fruits, des légumes ou des plantes aux vertus extraordinaires. Le Cultivateur peut parler au règne végétal et ainsi obtenir de précieuses informations sur un convoi qui aurait traversé une forêt ou bien sur les causes d'une projection de pollen empoisonné... Moins instruit qu'un Botaniste, le Cultivateur agit par instinct et suit le cycle des saisons de façon innée.");
		cultivateur = metierRepository.save(cultivateur);

		eleveur.setNomMetier("Eleveur");
		eleveur.setVoie("Voie de l'Animal");
//		eleveur.setSpecialisation(empathieAnimale);
		eleveur.setCasteLie(shaanistes);
		eleveur.setDescription(
				"La plupart des Éleveurs choisissent une seule espèce animale à élever, que ce soit pour leur viande, leur laine, leur cuir, leur lait, leurs cornes, leur graisse, leur sang ou toute autre matière utile... Ce peuvent être des animaux d'agrément, des bêtes de somme, des armimales, des montures ou des animaux pour le spectacle... Les Éleveurs prennent un grand soin à choisir les mâles et les femelles afin de pouvoir garantir un bon pedigree à leurs acheteurs. Les Éleveurs sont souvent en relation avec des Novateurs spécialisés qui s'occupent de récupérer les matières premières de l'animal. Normalement, les Éleveurs ne s'attachent pas à leurs animaux, afin de ne pas souffrir lorsque ces derniers les quittent d’une façon ou d’une autre. Mais certains tissent des liens empathiques très forts avec un animal : ce dernier perd alors son statut de bête pour gagner celui de compagnon et suivra l'Éleveur durant toute sa vie.");
		eleveur = metierRepository.save(eleveur);

		gardeFou.setNomMetier("Garde-fou");
		gardeFou.setVoie("Voie de l'Air");
//		gardeFou.setSpecialisation(soinsDeLEsprit);
		gardeFou.setCasteLie(shaanistes);
		gardeFou.setDescription(
				"Les Garde-fous aiment explorer les limites de ce qu'un cerveau peut accepter sans tomber dans la folie, tout en cherchant à repousser ces limites toujours plus loin... Pour cela, ils recherchent les situations les plus extrêmes et les environnements les plus déstabilisants... Adeptes des expéditions au sein de ruines oubliées, de forteresses hantées, et autres territoires terrifiants, les Garde-fous ont appris à dompter leur peur et celle de leurs proches. Peu appréciés des Négociants, les Garde-fous sont respectés par toutes les autres castes car ils permettent par leur simple présence de rassurer tous les membres d'un convoi qui doit se rendre dans des contrées hostiles.");
		gardeFou = metierRepository.save(gardeFou);

		marcheursDeReves.setNomMetier("Marcheurs de rêves");
		marcheursDeReves.setVoie("Voie des Limbes");
//		marcheursDeReves.setSpecialisation(reve);
		marcheursDeReves.setCasteLie(shaanistes);
		marcheursDeReves.setDescription(
				"Les Marcheurs de rêves sont des traqueurs de songes nécrotiques. Leur capacité leur permet de résister aux assauts des cauchemars et de leur porter des attaques décisives. Les Marcheurs de rêves peuvent aussi envoyer des messages à ceux qui dorment, quel que soit l'endroit où ils se trouvent... Ils constituent ainsi un véritable rempart contre les empires nécrosiens qui terrorisent les populations dans leur sommeil. Les Marcheurs de rêves sont souvent accueillis en héros où qu'ils aillent, car la peur du nécrosien reste vivace dans chaque Esprit...");
		marcheursDeReves = metierRepository.save(marcheursDeReves);

		mentaliste.setNomMetier("Mentaliste");
		mentaliste.setVoie("Voie de l'Autre");
//		mentaliste.setSpecialisation(empathieAntheenne);
		mentaliste.setCasteLie(shaanistes);
		mentaliste.setDescription(
				"Les Mentalistes font partie des Shaanistes les plus appréciés au sein de la population héossienne. Toujours de bon conseil, ils connaissent parfaitement la psychologie anthéenne avec laquelle ils jouent pour tirer le meilleur parti de chaque individu, afin de créer de bonnes synergies entre les Peuples. Le Mentaliste ne perd jamais son sang-froid et aime beaucoup parler par enigmes ou métaphores : quelle que soit la situation, qu’il se trouve dans une Guilde sévère avec ses employés, ou dans une taverne sordide,. Il sait user de la rhétorique pour calmer les Esprits échauffés ou au contraire galvaniser ceux qui doutent d’eux. Le Mentaliste sait déchiffrer le moindre regard, le moindre geste et reste à l’affut de tous les signes que l’on émet inconsciemment...");
		mentaliste = metierRepository.save(mentaliste);

		prescient.setNomMetier("Prescient");
		prescient.setVoie("Voie de l'Eau");
//		prescient.setSpecialisation(intuition);
		prescient.setCasteLie(shaanistes);
		prescient.setDescription(
				"Le Prescient vit dans un autre monde, fait de symboles et d'inspiration. Il a du flair et sait s'en servir. Il peut ainsi éviter de se faire surprendre et sentir lorsque l'on cherche à l'embobiner. L'intuition du Prescient est très utile dans toutes sortes de domaines, de la navigation, à la diplomatie en passant par la stratégie militaire ou encore la gastronomie... Le Prescient sait toujours ce qu'il doit faire et où il doit aller, cette aptitude en fait souvent un leader respecté.");
		prescient = metierRepository.save(prescient);

		radiant.setNomMetier("Radiant");
		radiant.setVoie("Voie de du Feu");
//		radiant.setSpecialisation(soinsDuCorps);
		radiant.setCasteLie(shaanistes);
		radiant.setDescription(
				"Il est coutume de dire que les Radiants ont du feu qui coulent dans les veines... Ils ont toujours chaud, où qu'ils se trouvent, cette chaleur surnaturelle leur permet lorsqu'ils apposent les mains sur quelqu'un de soigner le Corps. Contrairement aux Âmes-vives qui ont tendance à se faire prier pour faire usage de leurs compétences, les Radiants, à l'inverse, passent leur temps à demander autour d'eux si quelqu'un a besoin d'un soin, même si cela n'est pas indispensable. Ainsi, souvent, devant l'insistance des Radiants, on accepte leur aide pour ensuite avoir la paix. C'est en combat que les Radiants sont les plus épanouis, car là, ils peuvent exercer leur talent de nombreuses fois sans avoir à insister. Souvent, même, on le leur demande, et cela les emplit de joie, même si la situation s'avère critique...");
		radiant = metierRepository.save(radiant);

		telluriste.setNomMetier("Telluriste");
		telluriste.setVoie("Voie de la Terre");
//		telluriste.setSpecialisation(empathieMinerale);
		telluriste.setCasteLie(shaanistes);
		telluriste.setDescription(
				"Le Telluriste affectionne particulièrement les souterrains, les grottes et autres habitats troglodytes. En communion avec la pierre, la roche et la terre, il peut ressentir les micro-secousses sismiques qui agitent le continent en permanence mais auxquelles personne ne prête aucune attention. Pourtant, c'est grâce à ces secousses que le Telluriste peut s'orienter, connaître la nature d'un terrain ou d'un gaz. Mais ce qui rend le Telluriste particulièrement intéressant, c'est le lien privilégié qu'il entretient avec la Trihnite, grâce auquel il peut communiquer avec une porte de transfert pour obtenir des informations sur les personnes qui l'ont traversée...");
		telluriste = metierRepository.save(telluriste);

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET MOTIVATION
//-------------------------------------------------------------------------------------------------------------------------		

		forteresse.setNomMotivation("Bâtir une forteresse imprenable");
		forteresse.setDescription(
				"Vous êtes atteint d'un sentiment d'insécurité chronique. Vous passez votre temps à imaginer des systèmes de protection les plus improbables pourfortifier une ville et la rendre inattaquable. Vous vez besoin de protéger des vies pour vous sentir bien.");
		forteresse.setDomaineLie(technique);
		forteresse = motivationRepository.save(forteresse);

		palais.setNomMotivation("Bâtir un palais");
		palais.setDescription(
				"Vous aimez vous mettre au service d'un Notable afin de lui confectionner une demeure sur mesure. L'idée est de saisir la personnalité de celui que vous servez afin de traduireles principaux traits de caractères en éléments architecturaux.");
		palais.setDomaineLie(technique);
		palais = motivationRepository.save(palais);

		machineSousMarine.setNomMotivation("Construire une machine sous-marine");
		machineSousMarine.setDescription(
				"Vous préférez explorer les profondeurs abyssales des océans à bords de sumersibles extravagants mais la plupart du temps fiable. Défier les profondeur impose une grande rigueur technique mais cela ne vous arrêtera pas et vous ferez tout pour arriver à explorer ce monde encore inconnu de tous.");
		machineSousMarine.setDomaineLie(technique);
		machineSousMarine = motivationRepository.save(machineSousMarine);

		ouvrage.setNomMotivation("Ecrire un ouvrage");
		ouvrage.setDescription(
				"Pour vous, l'encyclopédie de la connaissance absolue est une quête de longue haleine, car il existe déjà quantité d'ouvrages pertinents sur tout un tas de sujets. Vous devrez donc trouver un axe créatif original qui vous permettrea de présenter votre savoir senlon des thématiques novatrices.");
		ouvrage.setDomaineLie(savoir);
		ouvrage = motivationRepository.save(ouvrage);

		universite.setNomMotivation("Fonder une Université");
		universite.setDescription(
				"Vous voulez fonder une Université et en être le dirigeant afin de vous élever au statut de Notable. Même si les premières années attirent rarement de bon élèves, le temps aide à obtenir de meilleur résultat et mettre en avant le fondateur.");
		universite.setDomaineLie(savoir);
		universite = motivationRepository.save(universite);

		transmettreSavoir.setNomMotivation("Transmettre son Savoir");
		transmettreSavoir.setDescription(
				"Vous vous situez dans une filiation et reproduisez le schéma qu'on vous a enseigné. Le Savoir est le bien le plus précieux et doit être partagé par tous pour rendre chacun meilleur et plus armé pour survivre dans un environnement en constante évolution.");
		transmettreSavoir.setDomaineLie(savoir);
		transmettreSavoir = motivationRepository.save(transmettreSavoir);

		riche.setNomMotivation("Devenir riche");
		riche.setDescription(
				"le Gain d'argent reste la Motivation partagée par la majoritée des individus. L'argent donne du pouvoir et le pouvoir procure un peu de liberté. Et la liberté est quelque chose dont tout le monde à besoin actuellement.");
		riche.setDomaineLie(social);
		riche = motivationRepository.save(riche);

		notable.setNomMotivation("Devenir un Notable");
		notable.setDescription(
				"Le sentiment de réussite personnelle peut passer par une certaine forme de reconnaissance. Devenir un/une Notable constitue pour n'importe quel marchand une Motivation très importante.");
		notable.setDomaineLie(social);
		notable = motivationRepository.save(notable);

		seduire.setNomMotivation("Seduire les autres");
		seduire.setDescription(
				"Vous connaissez le pouvoir que vous exercez sur autrui et vous aimez en abuser. Cela constitue pour vous une Motivation qui occupe chaque instant de votre vie. Dès que vous rencontrez une nouvelle personne, vous éprouvez le besoin d'user de votre charisme pour le mettre dans votre poche.");
		seduire.setDomaineLie(social);
		seduire = motivationRepository.save(seduire);

		charmer.setNomMotivation("Charmer les puissants");
		charmer.setDescription(
				"l'Art est universel car il traverse les frontières et s'affranchit des modes et des clivages. Connaissant votre influence sur les autres vous aimez jouer avec votre public, le sentir vaciller au contact de votre art. Et lorsqu'il sagit de puissants Notables, ivre de pouvoir, vous pouvez vous transcender pour vous attirer des faveurs.");
		charmer.setDomaineLie(arts);
		charmer = motivationRepository.save(charmer);

		celebre.setNomMotivation("Devenir célèbre");
		celebre.setDescription(
				"Vous chercher la célébrité à tout prix. Vous voulez être connu et reconnu par vos pairs, pour vos oeuvres autant que pour votre personnalité et votre style.");
		celebre.setDomaineLie(arts);
		celebre = motivationRepository.save(celebre);

		mode.setNomMotivation("Créer un courant de mode");
		mode.setDescription(
				"Les modes font et défont les Artistes donc autant créer ses propres courants. A la recherche des tendances en vogues en peinture, musique, littératures, spectacles et autres divertissements, vous cherchez l'opportunité qui vous permettra de placer au bon moment, le bon concept pour les bonnes personnes.");
		mode.setDomaineLie(arts);
		mode = motivationRepository.save(mode);

		genereux.setNomMotivation("Etre généreux");
		genereux.setDescription(
				"Vous vous positionnez comme un bon samaritain et partagerez toujours vos richesses avec plus pauvres que vous afin d'éradiquer la misère. Votre générositése traduit aussi par la façon que vous avez d'offrir des cadeaux à votre entourageet d'êtres pleins de bonnes intentions.");
		genereux.setDomaineLie(shaan);
		genereux = motivationRepository.save(genereux);

		trouverAmeSoeur.setNomMotivation("Trouver son Âme soeur");
		trouverAmeSoeur.setDescription(
				"Vous êtes en quête d'amour. Vous cherchez votre Âme soeur, pour faire le reste du chemin avec elle. Romantique et fleur bleue, vous savez déployer des trésors de séduction si la personne que vous avez repérée reste sourdeou aveugle à votre amour. Vous préservant pour une seule personne, vous attendez la bonne en vivant comme un ascète en évitant soigneusement les pièges de la tentation.");
		trouverAmeSoeur.setDomaineLie(shaan);
		trouverAmeSoeur = motivationRepository.save(trouverAmeSoeur);

		aider.setNomMotivation("Aider les autres");
		aider.setDescription(
				"Pour vous l'Autre est une partie du Moi. En aidant l'Autre, vous vous aidez vous-même. Le coeur sur la main, vous offrez vos service à tous ceux que vous croiser et qui en ont besoin. Avec le temps, vous avez su repérer ceux qui veulent profiter de vous et ceux qui ont véritablement besoin de vous.");
		aider.setDomaineLie(shaan);
		aider = motivationRepository.save(aider);

		combattreFailles.setNomMotivation("Combattres ses failles");
		combattreFailles.setDescription(
				"L'ennemi le plus redoutable reste soi-même. Vous appropriant cet adage, vous faites tout pour travailler sur vous-même afin de devenir meilleur. Vous avez besoin que les Autres vous fassent des compliments sur vos progrès afin de vous épanouir et vous rendre meilleur.");
		combattreFailles.setDomaineLie(magie);
		combattreFailles = motivationRepository.save(combattreFailles);

		enseignerMagie.setNomMotivation("Enseigner la Magie");
		enseignerMagie.setDescription(
				"Vous vous inscrivez dans la transmision et vous connaissez l'importance que revêt le partage du savoir. Vous savez que vous ne seriez rien sans les autres Magiciens qui vous ont permis de devenir ce que vous êtes aujourd'hui.");
		enseignerMagie.setDomaineLie(magie);
		enseignerMagie = motivationRepository.save(enseignerMagie);

		percerMysteres.setNomMotivation("Percer les mystères des arcane");
		percerMysteres.setDescription(
				"La Magie ets lié au cerecles des Trihns, mais si la théorie est perceptible de tous, la pratique relève de nombreuses zones d'ombres, des phénomènes inexpliqués, des situations paradoxales. Vous voulez rester maîtres de votre art et voulez tout comprendre pour pouvoir bien contrôler ce que vous faites au moment où vous le faites.");
		percerMysteres.setDomaineLie(magie);
		percerMysteres = motivationRepository.save(percerMysteres);

		communier.setNomMotivation("Communier avec d'autres élémentaliste");
		communier.setDescription(
				"Vous parcourez le monde à la recherche de Maîtres ou de Disciples partageant la même foi en votre Élément afin d’entrer en communion avec eux. C’est grâce à cette dernière que vous pouvez vous ressourcer, devenir meilleur. Les Élémentalistes motivés par la communion sont plus tolérants que les autres et partagent de nombreux points de vue avec les Shaanistes..");
		communier.setDomaineLie(rituels);
		communier = motivationRepository.save(communier);

		progresserDogme.setNomMotivation("Progresser au sein de son dogme");
		progresserDogme.setDescription(
				"Vous expérimentez les voies internes de votre dogme et aspirez à progresser dans la symbiose avec votre Élément. Vous êtes enclin à faire de multiples expériences, braver de nombreux dangers afin de tester votre foi. Au moindre signe de faiblesse, vous redoublez d’efforts pour chercher à vous transcender. Vous avez parfois tendance à provoquer des situations qui pourraient vous mettre en mauvaise posture, rien que pour voir si vous êtes dignes de votre Élément..");
		progresserDogme.setDomaineLie(rituels);
		progresserDogme = motivationRepository.save(progresserDogme);

		confronterElement.setNomMotivation("Se confronter à son Elément");
		confronterElement.setDescription(
				"Vous cherchez à tout prix à défier votre Élément pour faire Corps avec lui. Selon la nature de celui-ci, vous vous imprégnez de tout ce qui caractérise votre Élément (couleur symbolique, attitude, lieu, manifestation naturelle,...) afin de mieux entrer en contact avec lui. Investi de votre Élément, vous voyagez afin de vous confronter aux manifestations naturelles de celui-ci. Par exemple, un Élémentaliste du Feu parcourra le monde à la recherche de brasiers ou d’incendies auxquels il pourrait se confronter, un Élémentaliste de l’Objet se plaira à arpenter les Cités technologiques afin d’en maîtriser tous les rouages, un Élémentaliste de l’Eau sillonnera les mers en espérant être pris dans des tempêtes et ainsi éprouver son pouvoir sur les eaux,....");
		confronterElement.setDomaineLie(arts);
		confronterElement = motivationRepository.save(confronterElement);

		explorer.setNomMotivation("Explorer un territoire");
		explorer.setDescription(
				"Connaître le territoire qui nous entoure et savoir en exploiter les moindres parcelles constitue l’une des Motivations les plus ancestrales, du temps où les peuplades primitives vivaient en Héossie, afin de pouvoir mieux se protéger en cas d’agression, de repérer des ressources potentielles, ou de s’adapter à des conditions climatiques inhabituelles..");
		explorer.setDomaineLie(survie);
		explorer = motivationRepository.save(explorer);

		construireVoyage.setNomMotivation("Se construire par le voyage");
		construireVoyage.setDescription(
				"Peu importe la destination, ce qui compte, c’est le voyage. C’est en ce dernier que réside toute l’expérience qu’il est possible d’acquérir lors de situations extrêmes. Amener vos compagnons ou des clients à bon port vous procure une grande fierté et un sentiment d’harmonie avec l’environnement. Les voyages créent des souvenirs, les souvenirs engendrent l’expérience, l’expérience forge la compétence, la compétence crée le statut, qui peut donner lieu à du Prestige. Une fois connu, vous pourrez raconter votre histoire et donner envie à vos auditeurs de voyager à leur tour..");
		construireVoyage.setDomaineLie(survie);
		construireVoyage = motivationRepository.save(construireVoyage);

		nourrir.setNomMotivation("Se nourrir");
		nourrir.setDescription(
				"C’est la Motivation la plus essentielle. La plupart du temps, la faim est comblée car vous savez vous organiser. Vous êtes censés prévoir des rations lorsque vous voyagez et pouvez vous rendre dans des auberges ou des restaurants pour vous nourrir. Lorsque vous vous retrouvez en pleine nature et que vous n’avez rien à vous mettre sous la dent, vous vous en remettez à vos connaissances en Survie. Mais si vous n’arrivez pas à trouver de la nourriture, cela peut vous plonger dans un état assez irrationnel où se nourrir devient une priorité absolue. Cet état peut vous rendre très violent. Il n’est pas rare qu’un inoffensif marchand se change en bête féroce et attaque à mains nues un Voyageur qui disposerait de quoi le sustenter. En théorie, vous pouvez jeûner pendant (Corps) jours, mais au-delà, si vous n’avez toujours rien avalé, votre Corps s’affaiblit et le moindre effort devient insurmontable. Vous êtes alors obligé de rester allongé, votre Corps n’ayant plus assez d’énergie pour se déplacer. Difficile alors de chasser dans ces conditions....");
		nourrir.setDomaineLie(arts);
		nourrir = motivationRepository.save(nourrir);

		defierMort.setNomMotivation("Defier la mort");
		defierMort.setDescription(
				"Vous êtes un risque-tout. Vous n’exprimez pleinement votre talent que lorsque votre vie est en danger. La proximité de la mort devient alors pour vous un exutoire que vous recherchez dans le but de vous améliorer sans cesse. Le danger et l’adrénaline qu’il vous procure agissent comme une drogue sur votre organisme. Pendant les longues périodes où votre vie n’est pas menacée, vous vous ennuyez profondément, rongé par l’appel de l’aventure et l’excitation de l’inconnu.");
		defierMort.setDomaineLie(combat);
		defierMort = motivationRepository.save(defierMort);

		protegerFaibles.setNomMotivation("Protéger les faibles");
		protegerFaibles.setDescription(
				"Vous avez découvert, souvent à vos dépens, que c’est la loi du plus fort qui gagne bien souvent. Et cela vous insupporte. Par obligation, vous êtes devenu fort à votre tour pour pouvoir défendre toutes les victimes de cette loi impitoyable. Cette voie est très longue car plus vous êtes fort, plus la tâche de protéger ceux qui vous entourent est lourde de responsabilités et chargée en émotions.");
		protegerFaibles.setDomaineLie(combat);
		protegerFaibles = motivationRepository.save(protegerFaibles);

		venger.setNomMotivation("Se venger");
		venger.setDescription(
				"Vous avez une blessure d’enfance : la mort violente d’un proche, l’extermination de votre Peuple, les humiliations d’un Notable, le vol d’un bien précieux, la honte sur votre nom, la ruine de votre famille, ou toute autre raison. Vous n’aspirez plus désormais qu’à une seule chose : la vengeance. On dit que c’est un plat qui se mange froid, mais il se prépare dans la fournaise d’une haine féroce qui s’est entretenue jour après jour. La seule issue possible pour vous, c’est de laver votre blessure dans le sang..");
		venger.setDomaineLie(arts);
		venger = motivationRepository.save(venger);

		peurGens.setNomMotivation("Faire peur aux gens");
		peurGens.setDescription(
				"Enfant déjà, vous adoriez vous cacher et surgir pour prendre les gens au dépourvu et leur flanquer la peur de leur vie. Avec le temps, ces enfantillages s’estompent, mais pas pour vous. Ce plaisir de faire peur s’est mué en culte de la terreur. Faire peur à l’autre c’est une façon de prendre un peu de son être et de remplir le vide qui vous habite..");
		peurGens.setDomaineLie(arts);
		peurGens = motivationRepository.save(peurGens);

		jouerLoi.setNomMotivation("Jouer avec la loi");
		jouerLoi.setDescription(
				"Les règles vous ont toujours mis mal à l’aise, comme si elles n’étaient faites que pour briser vos rêves et votre liberté. Vous avez donc appris à les contourner et espérez bien continuer à le faire le plus longtemps possible. Les représentants de l’ordre deviennent des partenaires de jeu avec lesquels vous disputez des matchs dont vous décidez des règles et du terrain. Jusqu’à présent, vous avez toujours réussi à vous en sortir... Jusqu’à présent...");
		jouerLoi.setDomaineLie(arts);
		jouerLoi = motivationRepository.save(jouerLoi);

		venererCapital.setNomMotivation("Vénérer le Grand Capital");
		venererCapital.setDescription(
				"Vous êtes un leader, un entrepreneur. Pour vous, les Négociants n’ont rien compris à l’économie. Peu importe ce que l’on vend ou ce que l’on achète, ni à qui l'on s’adresse, seul compte le Grand Capital qu’il faut nourrir coûte que coûte en lui dégageant des bénéfices. Les personnes que vous employez sont en fait des offrandes conditionnées pour sacrifier leurs Âme sur l’autel du dieu numéraire. Vous allez faire fortune car vous avez la foi.");
		venererCapital.setDomaineLie(arts);
		venererCapital = motivationRepository.save(venererCapital);
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET POUVOIR
//-------------------------------------------------------------------------------------------------------------------------	

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET ACQUIS
//-------------------------------------------------------------------------------------------------------------------------	

	}
}
