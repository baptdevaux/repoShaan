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
import createurShaan.repository.jpa.MotivationRepositoryJpa;

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
		IMotivationRepository motivationRepository = Application.getInstance().getMotivationRepo();
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
		Pouvoir ameliorationDefensive = new Pouvoir();
		Pouvoir ameliorationOffensive = new Pouvoir();
		Pouvoir brisecode = new Pouvoir();
		Pouvoir personnalisationDeVehicule = new Pouvoir();
		
		Pouvoir clairvoyance = new Pouvoir();
		Pouvoir connaissancePartagee = new Pouvoir();
		Pouvoir apprentissageAccelere = new Pouvoir();
		Pouvoir controleDeLAdministration = new Pouvoir();
		
		Pouvoir allieProvidentiel = new Pouvoir();
		Pouvoir chanceAuJeu = new Pouvoir();
		Pouvoir achatDuSiecle = new Pouvoir();
		Pouvoir allianceForcee = new Pouvoir();
		
		Pouvoir chantArcanique = new Pouvoir();
		Pouvoir chantDeBataille = new Pouvoir();
		Pouvoir absurdite = new Pouvoir();
		Pouvoir chantDExaltation = new Pouvoir();
		
		Pouvoir brulureDAntiAme = new Pouvoir();
		Pouvoir coupDeChance = new Pouvoir();
		Pouvoir agressionPersonnelle = new Pouvoir();
		Pouvoir amitieForcee = new Pouvoir();
		
		Pouvoir armeMagique = new Pouvoir();
		Pouvoir attaqueTrihnique = new Pouvoir();
		Pouvoir champDeForce = new Pouvoir();
		Pouvoir croissance = new Pouvoir();
		
		Pouvoir alarmeElementaire = new Pouvoir();
		Pouvoir apaisementElementaire = new Pouvoir();
		Pouvoir blocageElementaire = new Pouvoir();
		Pouvoir bouclierElementaire = new Pouvoir();
		
		Pouvoir ameDuChasseur = new Pouvoir();
		Pouvoir appelDeLaMonture = new Pouvoir();
		Pouvoir accelererLeVoyage = new Pouvoir();
		Pouvoir appelDeLAnimal = new Pouvoir();
		
		Pouvoir auraGuerriere = new Pouvoir();
		Pouvoir criDeGuerre = new Pouvoir();
		Pouvoir attaqueTerifiante = new Pouvoir();
		Pouvoir chargeHeroique = new Pouvoir();
		
		Pouvoir affaiblissement = new Pouvoir();
		Pouvoir animerLesMorts = new Pouvoir();
		Pouvoir alterationDeSouvenirs = new Pouvoir();
		Pouvoir contagionNovice = new Pouvoir();
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
//		engrenages.setMetier(mecaniste);
		engrenages = specialisationRepository.save(engrenages);

		pilotage.setDescription(
				"Conduire tout type de véhicule motorisé, du tank à la moto à réaction, en passant par l'aérojet, ou l'hydroglisseur. Connaître des rudiments techniques nécessaires à l'entretien et au bon fonctionnement du véhicule.");
		pilotage.setNom("Pilotage");
		pilotage.setDomaineLie(technique);
//		pilotage.setMetier(pilote);
		pilotage = specialisationRepository.save(pilotage);

		recuperation.setDescription(
				"Conduire tout type de véhicule motorisé, du tank à la moto à réaction, en passant par l'aérojet, ou l'hydroglisseur. Connaître des rudiments techniques nécessaires à l'entretien et au bon fonctionnement du véhicule.");
		recuperation.setNom("Récupération");
		recuperation.setDomaineLie(technique);
//		recuperation.setMetier(recuperateur);
		recuperation = specialisationRepository.save(recuperation);

		sensDeLaPierre.setDescription(
				"Construire des murs, des ponts, des sols et des routes. Préparer de la trihnite pour en faire des portes de transfert. Connaître le modelage, la taille de pierre et l'architecture. Situer les sites riches en roche, en trihnite et savoir en extraire de la matière première. Apprécier la qualité, la valeur et la résistance d'un bâtiment ou d'une caverne.");
		sensDeLaPierre.setNom("Sens de la pierre");
		sensDeLaPierre.setDomaineLie(technique);
//		sensDeLaPierre.setMetier(batisseur);
		sensDeLaPierre = specialisationRepository.save(sensDeLaPierre);

		sensDuBois.setDescription(
				"Fabriquer du mobilier, du papier, de la corde, des bateaux, des charpentes. Connaître la menuiserie, la charpenterie, la papeterie, la découpe et le traitement du bois pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'un bateau, d'un meuble, d'un plancher.");
		sensDuBois.setNom("Sens du bois");
		sensDuBois.setDomaineLie(technique);
//		sensDuBois.setMetier(charpentier);
		sensDuBois = specialisationRepository.save(sensDuBois);

		sensDuCuir.setDescription(
				"Confectionner des sacs, des armures en cuir, des lanières, des chaussures, des sièges. Connaître la tannerie, la zoologie et le traitement de la peau d'un animal pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'un objet ou d'une pièce de cuir.");
		sensDuCuir.setNom("Sens du cuir");
		sensDuCuir.setDomaineLie(technique);
//		sensDuCuir.setMetier(tanneur);
		sensDuCuir = specialisationRepository.save(sensDuCuir);

		sensDuMetal.setDescription(
				"Fabriquer des engrenages, des armes, des armures et des pièces mécaniques. Connaître la métallurgie et l'armurerie. Situer les sites riches en métaux et savoir en extraire de la matière première. Apprécier la qualité, la valeur et la résistance d'un objet ou d'une pièce en métal.");
		sensDuMetal.setNom("Sens du metal");
		sensDuMetal.setDomaineLie(technique);
//		sensDuMetal.setMetier(forgeron);
		sensDuMetal = specialisationRepository.save(sensDuMetal);

		sensDuTissu.setDescription(
				"Tisser des vêtements, des voiles pour les bateaux, des coussins, des draps, des tapis. Connaître le tissage, le stylisme et le traitement du coton ou de la soie pour en faire une bonne matière première. Apprécier la qualité, la valeur et la résistance d'une étoffe ou d'une voile.");
		sensDuTissu.setNom("Sens du tissu");
		sensDuTissu.setDomaineLie(technique);
//		sensDuTissu.setMetier(couturier);
		sensDuTissu = specialisationRepository.save(sensDuTissu);

		sensDuVerre.setDescription(
				"Façonner des bijoux, des outils, des fioles, mais aussi des armes, des artefacts, des loupes, des miroirs, des lunettes et des écrans. Connaître l’orfèvrerie. Apprécier la qualité, la valeur et la résistance d'un bijou, d'une fiole...");
		sensDuVerre.setNom("Sens du verre");
		sensDuVerre.setDomaineLie(technique);
//		sensDuVerre.setMetier(joaillier);
		sensDuVerre = specialisationRepository.save(sensDuVerre);

		technologie.setDescription(
				"Connaître les sources d'énergie et leurs applications pour faire fonctionner un appareil régi par la technologie humaine. Construire ou réparer une arme à feu, un moteur de véhicule, un appareil électronique, etc. Composer des programmes informatiques en \"Code Note\" qui tournent sur le rézo Arpège (logiciels, interfaces, virus, démons, espions, lutins, judas, cryptographie...)");
		technologie.setNom("Technologie");
		technologie.setDomaineLie(technique);
//		technologie.setMetier(infotek);
		technologie = specialisationRepository.save(technologie);

		alchimie.setDescription(
				"Connaître les éléments de base qui constituent la matière et les forces qui agissent entre eux. Analyser la nature d'un matériau et en déduire ce qu'il faut pour le creuser, le percer, le briser, le faire fondre, le rendre friable, en un mot, changer son état...");
		alchimie.setNom("Alchimie");
		alchimie.setDomaineLie(savoir);
//		alchimie.setMetier(alchimiste);
		alchimie = specialisationRepository.save(alchimie);

		bibliotheque.setDescription(
				"Savoir tirer le meilleur d’une source conséquente de documents pour obtenir des informations sur un sujet précis.");
		bibliotheque.setNom("Bibliotheque");
		bibliotheque.setDomaineLie(savoir);
//		bibliotheque.setMetier(archiviste);
		bibliotheque = specialisationRepository.save(bibliotheque);

		botanique.setDescription(
				"Connaître le règne végétal terrestre et marin, ainsi que toutes les variétés de champignons. Reconnaître les végétaux empoisonnés des comestibles. Confectionner des cataplasmes et autres mixtures aux facultés curatives dont les effets dépendent des végétaux et de leurs propriétés.");
		botanique.setNom("Botanique");
		botanique.setDomaineLie(savoir);
//		botanique.setMetier(botaniste);
		botanique = specialisationRepository.save(botanique);

		cultureHumaine.setDescription(
				"Connaître la vie et les mœurs des Humains, mais aussi leur technologie. Avoir une idée de la puissance du Nouvel Ordre et du pouvoir qu’exercent les Grandes Familles. Savoir lire et écrire le Langdiv");
		cultureHumaine.setNom("Culture Humaine");
		cultureHumaine.setDomaineLie(savoir);
//		cultureHumaine.setMetier(percepteur);
		cultureHumaine = specialisationRepository.save(cultureHumaine);

		esoterisme.setDescription(
				"Consulter les astres à l'aide de tarots, d'osselets, de dés, de plateaux de divination, ou même dans le cercle des réalités pour percer les secrets du temps, des lieux et des individus. L'ésotérisme peut constituer un refuge contre les agressions mentales.");
		esoterisme.setNom("Esoterisme");
		esoterisme.setDomaineLie(savoir);
//		esoterisme.setMetier(esoteriste);
		esoterisme = specialisationRepository.save(esoterisme);

		geologie.setDescription(
				"Connaître l'histoire de la formation des gouffres et des montagnes, des volcans et des séismes. Évaluer la constitution d'un sol et l'énergie que l'on peut en tirer. Cette Spécialisation est également utilisée pour l'archéologie");
		geologie.setNom("Geologie");
		geologie.setDomaineLie(savoir);
//		geologie.setMetier(geologue);
		geologie = specialisationRepository.save(geologie);

		histoireDHeos.setDescription(
				"Connaître l'histoire générale d’Héos, mais aussi les contes, légendes et mythes existants, qui relatent les épopées d'êtres imaginaires, des dieux de l'ancien panthéon ou de héros ayant réellement vécu en Héossie. Connaître les flux migratoires, les grandes guerres et l'évolution des civilisations.");
		histoireDHeos.setNom("Histoire d'Héos");
		histoireDHeos.setDomaineLie(savoir);
//		histoireDHeos.setMetier(historien);
		histoireDHeos = specialisationRepository.save(histoireDHeos);

		medecine.setDescription(
				"Diagnostiquer une maladie. Procéder à des opérations chirurgicales. Connaître parfaitement l'anatomie anthéenne. Savoir quel antidote correspond à chaque poison, sa composition et son mode de fabrication. Soigner le Corps d'une personne atteinte de maladie, d'une intoxication ou qui a subi des blessures physiques.");
		medecine.setNom("Médecine");
		medecine.setDomaineLie(savoir);
//		medecine.setMetier(medecin);
		medecine = specialisationRepository.save(medecine);

		protocoles.setDescription(
				"Connaître les diverses formes de gouvernement, ainsi que les lois régissant administration et pouvoir. Mettre en place les procédures pour accéder à n’importe quel tribunal ou obtenir des laissez-passer. Être à l’aise avec la paperasse qui va avec. Fait également office de Diplomatie vis à vis de cultures inconnues.");
		protocoles.setNom("Protocoles");
		protocoles.setDomaineLie(savoir);
//		protocoles.setMetier(juriste);
		protocoles = specialisationRepository.save(protocoles);

		zoologie.setDescription(
				"Connaître le règne animal, de la cellule aux mammifères, en passant par les poissons, les insectes et les oiseaux. Connaître les divers écosystèmes qui régissent un lieu, les modes de vie des diverses espèces qui le peuplent, ainsi que les propriétés des organes des animaux.");
		zoologie.setNom("Zoologie");
		zoologie.setDomaineLie(savoir);
//		zoologie.setMetier(zoologue);
		zoologie=specialisationRepository.save(zoologie);
		
		arpege.setDescription("Naviguer sur le rézo Arpège en utilisant une console dotée d'une interface graphique. Connaître ce monde virtuel tentaculaire de l'information et de la communication. Maîtriser les logiciels de capture et de restitution d'images 2D ou 3D pour réaliser des trucages et effets spéciaux. Forcer certains barrages informatiques pour obtenir des données confidentielles. Utiliser des logiciels pour composer des programmes compilés en lignes de notes.");
		arpege.setNom("Arpege");
		arpege.setDomaineLie(social);
//		arpege.setMetier(cyberien);
		arpege=specialisationRepository.save(arpege);
		
		bluff.setDescription("Mentir ou baratiner quelqu'un. L’effet d’un bluff est en général temporaire, la victime mettra quelques minutes à se rendre compte qu'elle s’est fait berner.");
		bluff.setNom("Bluff");
		bluff.setDomaineLie(social);
//		bluff.setMetier(politicien);
		bluff=specialisationRepository.save(bluff);
		
		commerce.setDescription("Marchander. Estimer des objets de valeur. Acheter les services de quelqu’un. Connaître le niveau de rareté d'un Acquis à un endroit donné et donc les fluctuations des prix du marché en fonction de la localité.");
		commerce.setNom("Commerce");
		commerce.setDomaineLie(social);
//		commerce.setMetier(marchand);
		commerce=specialisationRepository.save(commerce);
		
		diplomatie.setDescription("Savoir faire passer ses idées en douceur. Réussir à détendre un climat tendu. Négocier des traités entre deux belligérants. Parler à un auditoire en faisant preuve d'éloquence. Chercher à convaincre un interlocuteur grâce à des arguments cohérents. Calmer des personnes hostiles. Avoir une idée des divers conflits qui peuvent tourmenter une région. Connaître le rang de quelqu'un dans n'importe quel milieu social, du plus élevé au plus primitif. Savoir comment se comporter pour ne pas commettre d'impairs, même si on ne parle pas la langue.");
		diplomatie.setNom("Diplomatie");
		diplomatie.setDomaineLie(social);
//		diplomatie.setMetier(diplomate);
		diplomatie=specialisationRepository.save(diplomatie);
		
		enseignement.setDescription("Enseigner une Spécialisation à une autre personne. Faire preuve de pédagogie. Mettre en place un programme d’apprentissage. Apprendre plus vite d’un autre enseignant.");
		enseignement.setNom("Enseignement");
		enseignement.setDomaineLie(social);
//		enseignement.setMetier(enseignant);
		enseignement=specialisationRepository.save(enseignement);
		
		langagePrimal.setDescription("Communiquer de façon très basique, par des gestes, des attitudes et des expressions faciales avec des êtres primitifs ou dotés d'un langage complètement inconnu. Communiquer sommairement avec les animaux.");
		langagePrimal.setNom("Langage primal");
		langagePrimal.setDomaineLie(social);
//		langagePrimal.setMetier(prospecteur);
		langagePrimal=specialisationRepository.save(langagePrimal);
		
		languesExotiques.setDescription("Se baser sur diverses langues existantes pour aborder un dialecte inconnu et le maîtriser par la pratique. Un anthéen parle l'héossien (langue commune) et le langdiv (langue humaine), ainsi que sa langue raciale, mais cette Spécialisation devient fort utile pour comprendre et parler les autres langages raciaux et dialectes dérivés.");
		languesExotiques.setNom("Langues exotiques");
		languesExotiques.setDomaineLie(social);
//		languesExotiques.setMetier(traducteur);
		languesExotiques=specialisationRepository.save(languesExotiques);
		
		psychologie.setDescription("Soigner l'Esprit d'une personne qui a subi des blessures mentales en la rassurant, et en lui redonnant confiance en elle. Déterminer les pensées d'autrui par ses attitudes et son comportement. Anticiper les intentions. Comprendre la folie. Contrairement au Bluff, la Psychologie a des effets durables.");
		psychologie.setNom("Psychologie");
		psychologie.setDomaineLie(social);
//		psychologie.setMetier(tenancier);
		psychologie=specialisationRepository.save(psychologie);
		
		seduction.setDescription("S'attirer les faveurs et l'admiration du sexe opposé. La séduction peut se tenter sur un individu du même sexe, mais la réaction de l'individu en question dépendra largement des dispositions de la cible.");
		seduction.setNom("Seduction");
		seduction.setDomaineLie(social);
//		seduction.setMetier(courtisan);
		seduction=specialisationRepository.save(seduction);
		
		vieUrbaine.setDescription("Connaître les villes et les différentes structures sociales. Se repérer en agglomération. Semer quelqu'un. Se procurer des renseignements anodins ou secrets. Être à l'aise dans tout milieu urbain.");
		vieUrbaine.setNom("Vie Urbaine");
		vieUrbaine.setDomaineLie(social);
//		vieUrbaine.setMetier(informateur);
		vieUrbaine=specialisationRepository.save(vieUrbaine);
		
		artsAppliques.setDescription("Pratiquer le dessin, la peinture, la sculpture sur bois ou sur pierre. Connaître l'histoire de l'art.");
		artsAppliques.setNom("Arts appliqués");
		artsAppliques.setDomaineLie(arts);
//		artsAppliques.setMetier(evocateur);
		artsAppliques=specialisationRepository.save(artsAppliques);
		
		artsDuFeu.setDescription("Cracher du feu. Créer des feux d'artifices, et toutes sortes d'effets pyrotechniques ou de jeux de lumières.");
		artsDuFeu.setNom("Arts du feu");
		artsDuFeu.setDomaineLie(arts);
//		artsDuFeu.setMetier(bateleur);
		artsDuFeu=specialisationRepository.save(artsDuFeu);
		
		chant.setDescription("Chanter juste. Savoir poser sa voix. Lire une partition, accompagner en mesure un musicien. Savoir improviser. Connaître un vaste répertoire allant des chansons grivoises aux sérénades, en passant par les chants traditionnels. Séduire quelqu'un.");
		chant.setNom("Chant");
		chant.setDomaineLie(arts);
//		chant.setMetier(chanteur);
		chant=specialisationRepository.save(chant);
		
		comedie.setDescription("Faire du théâtre. Interpréter un rôle par cœur. Simuler les émotions. Imiter les voix. Créer des pièces et connaître sur le bout des doigts les répliques de tous les personnages des grands classiques héossiens. Se faire passer pour quelqu'un d'autre ou avoir l'air crédible en racontant des sornettes.");
		comedie.setNom("Comédie");
		comedie.setDomaineLie(arts);
//		comedie.setMetier(comedien);
		comedie=specialisationRepository.save(comedie);
		
		deguisement.setDescription("Modifier son apparence de manière tangible, avec trois fois rien. Fabriquer des masques, des costumes et autres parures afin d'être en mesure de métamorphoser un Mélodien en Ygwan et inversement (ce qui est déjà beaucoup plus difficile).");
		deguisement.setNom("Déguisement");
		deguisement.setDomaineLie(arts);
//		deguisement.setMetier(costumier);
		deguisement=specialisationRepository.save(deguisement);
		
		gastronomie.setDescription("Préparer des repas très élaborés, suivre des recettes et savoir en inventer. Reconnaître les bons produits et les préparer pour ensuite les cuisiner. Repérer si un plat est empoisonné. Un très bon repas a des vertus régénérantes.");
		gastronomie.setNom("Gastronomie");
		gastronomie.setDomaineLie(arts);
//		gastronomie.setMetier(cuisinier);
		gastronomie=specialisationRepository.save(gastronomie);
		
		lettres.setDescription("Préparer des repas très élaborés, suivre des recettes et savoir en inventer. Reconnaître les bons produits et les préparer pour ensuite les cuisiner. Repérer si un plat est empoisonné. Un très bon repas a des vertus régénérantes.");
		lettres.setNom("Lettres");
		lettres.setDomaineLie(arts);
//		lettres.setMetier(ecrivain);
		lettres=specialisationRepository.save(lettres);
		
		musique.setDescription("Jouer des divers instruments existants. Lire une partition musicale. Composer des mélodies ou des symphonies. Connaître l'histoire de la musique. Séduire quelqu'un. Dresser un animal.");
		musique.setNom("Musique");
		musique.setDomaineLie(arts);
//		musique.setMetier(musicien);
		musique=specialisationRepository.save(musique);
		
		trucages.setDescription("Effectuer des tours de passe-passe. Faire de la prestidigitation. Jongler avec tous types d'objets. Dissimuler des objets aux yeux les plus avertis.");
		trucages.setNom("Trucages");
		trucages.setDomaineLie(arts);
//		trucages.setMetier(prestidigitateur);
		trucages=specialisationRepository.save(trucages);
		
		
		
		
		
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
//		delhions.setSpecialisation1(musique);
//		delhions.setSpecialisation2(enseignement);
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
//		melodiens.setSpecialisation1(chant);
//		melodiens.setSpecialisation2(seduction);
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
		;
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
//		ygwans.setSpecialisation1(histoireDHeos);
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
//		humains.setSpecialisation1(cultureHumaine);
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
//		hautesHerbes.setSpecialisation1(musique);
//		hautesHerbes.setSpecialisation2(commerce);
		hautesHerbes.setDescription(
				"De vastes plaines d'herbe grasse s'étendent à l'infini. Parsemées d'arbres et de petits bosquets, ces régions sont principalement exploitées pour l'agriculture et l'élevage.");
		hautesHerbes = peupleRepository.save(hautesHerbes);

		marais.setNomPeuple("Hautes Herbes");
		marais.setDomaine(savoir);
//		marais.setSpecialisation1(zoologie);
		marais.setSpecialisation2(botanique);
		marais.setDescription(
				"De hauts arbres plongent leurs puissantes racines dans les vastes étendues d'eau peu profondes des marais verts, jaunes et rouges. On ne trouve quasiment que des Ygwans dans les Marais, car eux seuls semblent apprécier la constante humidité et la chaleur de l'endroit.");
		marais = peupleRepository.save(marais);

		montagnes.setNomPeuple("Montagnes");
		montagnes.setDomaine(social);
//		montagnes.setSpecialisation1(educationPhysique);
//		montagnes.setSpecialisation2(languesExotiques);
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
//		sables.setSpecialisation2(histoireDHeos);
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
//		cites.setSpecialisation1(cultureHumaine);
//		cites.setSpecialisation2(vieUrbaine);
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
//		batisseur.setVoie(voie);
//		batisseur.setSpecialisation(specialisation);
		batisseur.setDescription(
				"Les Bâtisseurs savent construire des ponts, des maisons, des routes, tailler la pierre et préparer la Trihnite afin qu'elle soit enchantée. Irascibles aux mains cagneuses, ils passent leur temps à râler car rien ne se passe jamais comme ils avaient prévu. Il faut dire que l'exigence des Bâtisseurs est légendaire, car ils restent conscients que la plus petite erreur de calcul, ou le moindre défaut de construction peut être à l'origine de terribles accidents et causer la mort... Ce sens des responsabilités leur met une pression permanente qu'ils entretiennent, même s'ils n'ont pas de chantier à gérer. Mais c'est ainsi, les Bâtisseurs se sentent responsables des autres...");

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
		aider.setDescription("Pour vous l'Autre est une partie du Moi. En aidant l'Autre, vous vous aidez vous-même. Le coeur sur la main, vous offrez vos service à tous ceux que vous croiser et qui en ont besoin. Avec le temps, vous avez su repérer ceux qui veulent profiter de vous et ceux qui ont véritablement besoin de vous.");
		aider.setDomaineLie(shaan);
		aider = motivationRepository.save(aider);

		charmer.setNomMotivation("");
		charmer.setDescription(".");
		charmer.setDomaineLie(arts);
		charmer = motivationRepository.save(charmer);
		charmer.setNomMotivation("");
		charmer.setDescription(".");
		charmer.setDomaineLie(arts);
		charmer = motivationRepository.save(charmer);

		charmer.setNomMotivation("");
		charmer.setDescription(".");
		charmer.setDomaineLie(arts);
		charmer = motivationRepository.save(charmer);

		charmer.setNomMotivation("");
		charmer.setDescription(".");
		charmer.setDomaineLie(arts);
		charmer = motivationRepository.save(charmer);
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET POUVOIR
//-------------------------------------------------------------------------------------------------------------------------	
		ameliorationDefensive.setType("Amélioration");
		ameliorationDefensive.setTest("TECHNIQUE");
		ameliorationDefensive.setFrequence("1 fois par Jour");
		ameliorationDefensive.setActivation("1 Action par Cible");
		ameliorationDefensive.setPortee("Contact");
		ameliorationDefensive.setNbCible("(Test de techniques) cibles"); 
		ameliorationDefensive.setDuree("1 Heure");
		ameliorationDefensive.setDescription("Le Novateur peut augmenter de +1 la Protection de Corps de (Test de TECHNIQUE) armures ou boucliers pendant 1 Heure. Chaque armure doit être manipulée par le Novateur pendant 1 Action pour être améliorée.");
		ameliorationDefensive = pouvoirRepository.save(ameliorationDefensive);
		
		ameliorationOffensive.setType("Amélioration");
		ameliorationOffensive.setTest("TECHNIQUE");
		ameliorationOffensive.setFrequence("1 fois par Jour");
		ameliorationOffensive.setActivation("1 Action par Cible");
		ameliorationOffensive.setPortee("Contact");
		ameliorationOffensive.setNbCible("(Test de techniques) cibles"); 
		ameliorationOffensive.setDuree("1 Heure");
		ameliorationOffensive.setDescription("Le Novateur peut augmenter de +1 le Bonus que procurent (Test de TECHNIQUE) armes pendant 1 Heure. Chaque arme doit être manipulée par le Novateur pendant 1 Action pour être améliorée. Cette Astuce fonctionne sur les Armes de mêlée, à projectiles, lancées, de corps, et humaines");
		ameliorationOffensive = pouvoirRepository.save(ameliorationOffensive);
		
		brisecode.setType("Perception");
		brisecode.setTest("Aucun");
		brisecode.setFrequence("1 fois par Jour");
		brisecode.setActivation("1 Action");
		brisecode.setPortee("Contact");
		brisecode.setNbCible("une"); 
		brisecode.setDescription("Le Novateur peut décrypter automatiquement des codes d'accès sans avoir recours à une machine. Cette astuce ne fonctionne que sur les systèmes électroniques issus de la technologie humaine (coffre sécurisé, bombe à désamorcer, programme Arpège, communication cryptée,...).");
		brisecode = pouvoirRepository.save(brisecode);
		
		personnalisationDeVehicule.setType("Amélioration");
		personnalisationDeVehicule.setTest("TECHNIQUE");
		personnalisationDeVehicule.setFrequence("1 fois par Jour");
		personnalisationDeVehicule.setActivation("1 Heure");
		personnalisationDeVehicule.setPortee("Contact");
		personnalisationDeVehicule.setNbCible("Unique (1 fois par cible)"); 
		personnalisationDeVehicule.setDuree("Permanente");
		personnalisationDeVehicule.setDescription("Le Novateur peut augmenter la capacité d'accueil d'un véhicule de (Test de TECHNIQUE)/3 places. Ce pouvoir n'est utilisable qu'une seule fois par véhicule.");
		personnalisationDeVehicule = pouvoirRepository.save(personnalisationDeVehicule);

		clairvoyance.setType("Perception");
		clairvoyance.setTest("Aucun");
		clairvoyance.setFrequence("Permanente");
		clairvoyance.setActivation("1 Geste");
		clairvoyance.setPortee("Personnel");
		clairvoyance.setDescription("L'Érudit peut utiliser son niveau de SAVOIR à la place du niveau de SHAAN pour déterminer son initiative lors d'une Confrontation.");
		clairvoyance = pouvoirRepository.save(clairvoyance);
		
		connaissancePartagee.setType("Amélioration");
		connaissancePartagee.setTest("SAVOIR");
		connaissancePartagee.setFrequence("1 fois par Jour");
		connaissancePartagee.setActivation("2 Actions");
		connaissancePartagee.setPortee("Interaction");
		connaissancePartagee.setNbCible("SAVOIR cibles"); 
		connaissancePartagee.setDescription("L'Érudit accorde un Bonus de +(Test de SAVOIR) pour une Épreuve de SAVOIR en Coopération impliquant jusqu'à SAVOIR alliés.");
		connaissancePartagee = pouvoirRepository.save(connaissancePartagee);
		
		apprentissageAccelere.setType("Amélioration");
		apprentissageAccelere.setTest("Aucun");
		apprentissageAccelere.setFrequence("1 fois par Transition");
		apprentissageAccelere.setActivation("1 Geste");
		apprentissageAccelere.setPortee("Personnel");
		apprentissageAccelere.setDescription("L’Érudit peut diviser les durées d'enseignement par 2, qu’il apprenne d’un maître ou qu’il enseigne à un apprenti.");
		apprentissageAccelere = pouvoirRepository.save(apprentissageAccelere);
		
		controleDeLAdministration.setType("Altération");
		controleDeLAdministration.setTest("Aucun");
		controleDeLAdministration.setFrequence("1 fois par Transition");
		controleDeLAdministration.setActivation("1 Heure");
		controleDeLAdministration.setPortee("Interaction");
		controleDeLAdministration.setDescription("L’Érudit a des facilités pour naviguer dans les administrations les plus inertes. Il peut en accélérer les délais, en décoincer les rouages, en divisant les durées normales d’attente par 2. Au contraire, il peut bloquer un processus administratif (procès, inspection,...) en multipliant sa durée par 2. S'il est nécessaire de quantifier le temps plus précisément, on considère que ce Secret peut être activé 1 fois par Semaine.");
		controleDeLAdministration = pouvoirRepository.save(controleDeLAdministration);
		
		allieProvidentiel.setType("Invocation");
		allieProvidentiel.setTest("Aucun");
		allieProvidentiel.setFrequence("1 fois par Jour");
		allieProvidentiel.setActivation("1 Action");
		allieProvidentiel.setPortee("Interaction");
		allieProvidentiel.setDuree("1 Situation");
		allieProvidentiel.setDescription("Lorsque le Négociant est dans une ville et qu'il est menacé, un allié providentiel vient automatiquement s'interposer. Pour déterminer les caractéristiques de l'allié, le joueur tire 3D10. Chaque dé correspond à la valeur actuelle du Trihn correspondant. Cet allié ne peut faire que des attaques physiques.");
		allieProvidentiel = pouvoirRepository.save(allieProvidentiel);
		
		chanceAuJeu.setType("Récupération");
		chanceAuJeu.setTest("SOCIAL");
		chanceAuJeu.setFrequence("1 fois par Jour");
		chanceAuJeu.setActivation("1 Heure");
		chanceAuJeu.setPortee("Personnel");
		chanceAuJeu.setDescription("Le Négociant gagne (Test de SOCIAL) x 10 Crédos quand il va jouer dans une salle de jeu pendant au moins 1 Heure.");
		chanceAuJeu = pouvoirRepository.save(chanceAuJeu);
		
		achatDuSiecle.setType("Contrôle");
		achatDuSiecle.setTest("SOCIAL");
		achatDuSiecle.setFrequence("1 fois par Jour");
		achatDuSiecle.setActivation("1 Test toutes les 15 Minutes");
		achatDuSiecle.setPortee("Interaction");
		achatDuSiecle.setCible("Esprit");
		achatDuSiecle.setNbCible("unique (1 fois par cible)");
		achatDuSiecle.setDescription("Le Négociant peut acheter quelque chose à un prix défiant toute concurrence contre la volonté de la cible. Il lance un (Test de SOCIAL) par 15 minutes de négociation pour dépasser la Défense d'Esprit de la cible. Le prix de base du produit est réduit de Réussite x 10%. Ce Privilège ne fonctionne qu’une seule fois par cible.");
		achatDuSiecle = pouvoirRepository.save(achatDuSiecle);
		
		allianceForcee.setType("Contrôle");
		allianceForcee.setTest("SOCIAL");
		allianceForcee.setFrequence("1 fois par Jour");
		allianceForcee.setActivation("1 Jour");
		allianceForcee.setPortee("Interaction");
		allianceForcee.setCible("Esprit");
		allianceForcee.setNbCible("deux");
		allianceForcee.setDuree("1 Transition");
		allianceForcee.setDescription("Le Négociant peut réconcilier deux ennemis. Il doit réussir une Épreuve de SOCIAL en effectuant un Test de SOCIAL par Jour dont la Difficulté est égale à la somme des deux Esprits de ses cibles.");
		allianceForcee = pouvoirRepository.save(allianceForcee);
		
		chantArcanique.setType("Amélioration");
		chantArcanique.setTest("Aucun");
		chantArcanique.setFrequence("1 fois par Tour");
		chantArcanique.setActivation("1 Geste");
		chantArcanique.setPortee("Interaction");
		chantArcanique.setCible("ARTS cibles");
		chantArcanique.setDuree("1 Tour");
		chantArcanique.setDescription("L’Artiste peut donner un Bonus de +1 à ARTS alliés (dont lui-même), utilisable pour les Actions de MAGIE réalisées pendant que l'Artiste chante.");
		chantArcanique = pouvoirRepository.save(chantArcanique);
		
		chantDeBataille.setType("Amélioration");
		chantDeBataille.setTest("Aucun");
		chantDeBataille.setFrequence("1 fois par Tour");
		chantDeBataille.setActivation("1 Geste");
		chantDeBataille.setPortee("Interaction");
		chantDeBataille.setCible("ARTS cibles");
		chantDeBataille.setDuree("1 Tour");
		chantDeBataille.setDescription("L’Artiste peut donner un Bonus de +1 à ARTS alliés (dont lui-même), utilisable pour les Actions de COMBAT réalisées pendant que l'Artiste chante.");
		chantDeBataille = pouvoirRepository.save(chantDeBataille);
		
		absurdite.setType("Altération");
		absurdite.setTest("ARTS");
		absurdite.setFrequence("1 fois par Situation");
		absurdite.setActivation("1 Test par Action");
		absurdite.setPortee("Interaction");
		absurdite.setCible("Esprit");
		absurdite.setNbCible("une");
		absurdite.setDuree("Réussite Tours");
		absurdite.setDescription("L'Artiste emploie un humour par l'absurde, qui plonge une cible dans un état d'incompréhension. Il lance un Test d'ARTS par Action pour dépasser la Défense d'Esprit de sa cible. Celle-ci subit alors un Malus de Réussite à sa Défense d'Esprit pendant Réussite Tours.");
		absurdite = pouvoirRepository.save(absurdite);
		
		chantDExaltation.setType("Défense");
		chantDExaltation.setTest("Aucun");
		chantDExaltation.setFrequence("1 fois par Tour");
		chantDExaltation.setActivation("1 Geste");
		chantDExaltation.setPortee("Interaction");
		chantDExaltation.setNbCible("une");
		chantDExaltation.setDuree("1 Tour");
		chantDExaltation.setDescription("L'Artiste exalte une cible pour qu'elle s'affranchisse de ses limites physiques. Tant qu'elle est exaltée par ce chant, et même si elle est blessée physiquement, la cible prend toujours la valeur maximum de son Trihn de Corps (au lieu de la valeur actuelle) pour calculer sa Défense de Corps.");
		chantDExaltation = pouvoirRepository.save(chantDExaltation);
		
		brulureDAntiAme.setType("Attaque");
		brulureDAntiAme.setTest("SHAAN");
		brulureDAntiAme.setFrequence("1 fois par Tour");
		brulureDAntiAme.setActivation("1 Test par Action");
		brulureDAntiAme.setPortee("Interaction");
		brulureDAntiAme.setCible("Corps");;
		brulureDAntiAme.setNbCible("une");
		brulureDAntiAme.setDegats("corps");
		brulureDAntiAme.setDescription("Le Shaaniste lance une attaque en interaction sur un Nécrosien (individu à Âme négative) en effectuant un (Test de SHAAN) par Action pour passer la Défense d’Anti-Âme du Nécrosien. Sa Réussite détermine la gravité de la blessure qu’il inflige à l’Anti-Âme du Nécrosien. Si ce dernier possède un Corps, la Brûlure inflige aussi une blessure de même gravité au Corps du Nécrosien.");
		brulureDAntiAme = pouvoirRepository.save(brulureDAntiAme);
		
		coupDeChance.setType("Altération");
		coupDeChance.setTest("Aucun");
		coupDeChance.setFrequence("1 fois par Jour");
		coupDeChance.setActivation("1 Geste");
		coupDeChance.setPortee("Personnel");
		coupDeChance.setDescription("Le joueur du Shaaniste peut relancer ses 3 dés lors de n’importe quel Test, si leur résultat ne lui convient pas.");
		coupDeChance = pouvoirRepository.save(coupDeChance);
		
		agressionPersonnelle.setType("Défense");
		agressionPersonnelle.setTest("Aucun");
		agressionPersonnelle.setFrequence("1 fois par Situation");
		agressionPersonnelle.setActivation("1 Geste");
		agressionPersonnelle.setPortee("Contact");
		agressionPersonnelle.setNbCible("une");
		agressionPersonnelle.setDuree("(Test de SHAAN) Tours");
		agressionPersonnelle.setDescription("L’adversaire qui devait blesser le Shaaniste se porte finalement l’attaque à lui-même. La cible est étourdie pendant SHAAN Tours de jeu (Malus de -1 à toutes ses Actions et Défenses). Le Shaaniste peut activer cette Symbiose en réaction à l’Action de sa cible s’il n’a pas déjà utilisé son Geste du Tour.");
		agressionPersonnelle = pouvoirRepository.save(agressionPersonnelle);
		
		amitieForcee.setType("Contrôle");
		amitieForcee.setTest("SHAAN");
		amitieForcee.setFrequence("1 fois par Situation");
		amitieForcee.setActivation("1 Test par Action");
		amitieForcee.setPortee("Interaction");
		amitieForcee.setCible("Esprit");
		amitieForcee.setNbCible("une");
		amitieForcee.setDuree("Réussite Tours");
		amitieForcee.setDescription("Le Shaaniste choisi une cible ennemie, en interaction avec un adversaire qui attaque le Shaaniste et ses alliés. Il lance un (Test de SHAAN) par Action pour dépasser la Défense d'Esprit de la Cible. Celle-ci se met alors à défendre le Shaaniste et ses alliés pendant Réussite Tours de jeu. Si la cible est attaquée par un allié du Shaaniste, l'Amitié Forcée est désactivée.");
		amitieForcee = pouvoirRepository.save(amitieForcee);
		
		armeMagique.setType("Invocation");
		armeMagique.setTest("MAGIE + Trihn");
		armeMagique.setFrequence("1 fois par Situation");
		armeMagique.setActivation("1 Action");
		armeMagique.setPortee("Personnel");
		armeMagique.setCout("1 Trihn de Corps");
		armeMagique.setDuree("1 Situation");
		armeMagique.setDescription("Le Magicien matérialise une arme de Mêlée de l’apparence de son choix qui apporte un Bonus de (Test de MAGIE)/3 aux Tests de COMBAT + Armes de Mêlée. Il est le seul à pouvoir l'utiliser, et elle disparait à la fin de la Situation.");
		armeMagique = pouvoirRepository.save(armeMagique);
		
		attaqueTrihnique.setType("Attaque");
		attaqueTrihnique.setTest("MAGIE + Trihn");
		attaqueTrihnique.setFrequence("1 fois par Tour");
		attaqueTrihnique.setActivation("1 Action");
		attaqueTrihnique.setPortee("Interaction");
		attaqueTrihnique.setCible("Trihn ciblé");
		attaqueTrihnique.setNbCible("une");
		attaqueTrihnique.setDegats("trihn");
		attaqueTrihnique.setCout("1 Trihn au choix selon le trihn ciblé");
		attaqueTrihnique.setDescription("Le Magicien peut utiliser l’énergie trihnique pour porter une attaque sur une cible en Interaction. Le type de Trihn consumé pour lancer l’attaque détermine le Trihn ciblé et la Défense à dépasser avec un (Test de MAGIE).");
		attaqueTrihnique = pouvoirRepository.save(attaqueTrihnique);
		
		champDeForce.setType("Altération");
		champDeForce.setTest("MAGIE + Trihn");
		champDeForce.setFrequence("1 fois par Jour");
		champDeForce.setActivation("1 Action");
		champDeForce.setPortee("Interaction");
		champDeForce.setCible("Trihn ciblé");
		champDeForce.setNbCible("MAGIE cibles");
		champDeForce.setCout("1 Trihn au choix selon le type de malus");
		champDeForce.setDuree("Réussite Tours");
		champDeForce.setDescription("Le Magicien crée un champ de force qui gène MAGIE cibles dont la Défense de Trihn est inférieure à son (Test de MAGIE). Elles subissent un Malus de Réussite aux Test de Domaines liés au Trihn consumé par le Magicien pendant Réussite Tours.");
		champDeForce = pouvoirRepository.save(champDeForce);
		
		croissance.setType("Amélioration");
		croissance.setTest("MAGIE + Trihn");
		croissance.setFrequence("1 fois par Situation");
		croissance.setActivation("1 Action");
		croissance.setPortee("Personnel");
		croissance.setCout("1 Trihn de Corps");
		croissance.setDuree("Réussite Tours");
		croissance.setDescription("Le Magicien développe sa masse physique et grandit considérablement : sa taille est augmentée de (Test de MAGIE) x 10%. Sa valeur de Corps est augmentée de (Test de MAGIE)/3 et son niveau de COMBAT augmente de 2.");
		croissance = pouvoirRepository.save(croissance);

		alarmeElementaire.setType("Perception");
		alarmeElementaire.setTest("RITUELS + Rite");
		alarmeElementaire.setFrequence("1 fois par Jour");
		alarmeElementaire.setActivation("2 Actions ou 1 Action + 1 point de Corps");
		alarmeElementaire.setPortee("Distance");
		alarmeElementaire.setDuree("(Test de RITUELS) Heures");
		alarmeElementaire.setDescription("L'Élémentaliste se met en état de sentir le danger. Durant le pouvoir, le personnage sera averti par son élément de tout danger se présentant à lui dans un rayon de (Test de RITUELS) x 100 mètres. La nature de ce danger restera vague mais le personnage saura quelle est sa nature élémentaire (s'il s'agit d'un animal, d'un minéral, d'un végétal, d'un humain, d'un nécrosien, d'un anthéen...). La nature du danger est indépendante de l'élément prié : une Transe à l'Objet pourra très bien anticiper une agression animale. Pendant la durée de l'alerte, l'Élémentaliste peut également utiliser son niveau de RITUELS à la place du niveau de SHAAN pour déterminer son initiative lors d'une Confrontation. Il bénéficie également d'un Bonus de (Test de RITUELS)/3 pour détecter une embuscade.");
		alarmeElementaire = pouvoirRepository.save(alarmeElementaire);
		
		apaisementElementaire.setType("Contrôle");
		apaisementElementaire.setTest("RITUELS + Rite");
		apaisementElementaire.setFrequence("1 fois par Situation");
		apaisementElementaire.setActivation("1 Test toutes les 2 Actions ou 1 Test et -1 point de Corps par Action");
		apaisementElementaire.setPortee("Interaction");
		apaisementElementaire.setCible("Trihn ciblé");
		apaisementElementaire.setNbCible("une");
		apaisementElementaire.setDuree("Réussite Tours");
		apaisementElementaire.setDescription("L'Élémentaliste peut calmer un élément : un animal fougueux (Animal), une plante agressive ou vénéneuse (Végétal), une tempête (Air), une peur ou phobie personnelle (Moi), une personne hystérique ou en colère (Lui), un tremblement de terre (Terre), une machine qui s'emballe (Objet), un feu qui se propage (Feu), une noyade (Eau), ou un nécrosé (Limbes). L'Élémentaliste effectue un (Test de RITUELS) toutes les 2 Actions pour dépasser la meilleure Défense de la cible. Celle-ci ne pourra alors plus attaquer pendant Réussite Tours. La cible peut être attaquée pendant la durée de cette Transe, cela ne la désactivera pas comme c'est le cas pour les Symbioses des Shaanistes par exemple...");
		apaisementElementaire = pouvoirRepository.save(apaisementElementaire);

		blocageElementaire.setType("Contrôle");
		blocageElementaire.setTest("RITUELS + Rite");
		blocageElementaire.setFrequence("1 fois par Situation");
		blocageElementaire.setActivation("1 Test toutes les 2 Actions ou 1 Test et -1 point de Corps par Action");
		blocageElementaire.setPortee("Interaction");
		blocageElementaire.setCible("Esprit");
		blocageElementaire.setNbCible("une");
		blocageElementaire.setDuree("2 Tours");
		blocageElementaire.setDescription("L'Élémentaliste lance un (Test de RITUELS) toutes les 2 Actions pour dépasser la Défense d'Esprit de sa cible. Il peut alors lui interdire l'utilisation du Domaine correspondant à l'élément prié pendant 2 Tours.");
		blocageElementaire = pouvoirRepository.save(blocageElementaire);
		
		bouclierElementaire.setType("Défense");
		bouclierElementaire.setTest("RITUELS + Rite");
		bouclierElementaire.setFrequence("1 fois par Situation");
		bouclierElementaire.setActivation("2 Actions ou 1 Action + 1 point de Corps");
		bouclierElementaire.setPortee("Interaction");
		bouclierElementaire.setNbCible("(Test de RITUELS) cibles");
		bouclierElementaire.setDuree("1 Situation");
		bouclierElementaire.setDescription("L'Élémentaliste élève un bouclier fait de poils, d'os, de griffes et de hurlements, de feu, d'eau, de mécanismes, d'individus… Ce bouclier fournit une Protection éphémère qui permet d'annuler la perte de (Test de RITUELS) points de Corps pour lui et ses alliés.");
		bouclierElementaire = pouvoirRepository.save(bouclierElementaire);
		
		ameDuChasseur.setType("Amélioration");
		ameDuChasseur.setTest("Aucun");
		ameDuChasseur.setFrequence("1 fois par Situation");
		ameDuChasseur.setActivation("1 Geste");
		ameDuChasseur.setPortee("Personnel");
		ameDuChasseur.setDescription("Le Voyageur ne fait plus qu'un avec son Arme lancée ou à projectiles. Il peut utiliser un dé non-Actif sans dépenser de point de Trihn pour effectuer un Test de COMBAT + Armes lancées ou Armes à projectiles.");
		ameDuChasseur = pouvoirRepository.save(ameDuChasseur);
		
		appelDeLaMonture.setType("Invocation");
		appelDeLaMonture.setTest("SURVIE");
		appelDeLaMonture.setFrequence("1 fois par Jour");
		appelDeLaMonture.setActivation("1 Action");
		appelDeLaMonture.setPortee("Horizon");
		appelDeLaMonture.setNbCible("une");
		appelDeLaMonture.setDuree("(Test de SURVIE) Heures");
		appelDeLaMonture.setDescription("Le Voyageur peut siffler pour appeler une monture dressée ou à l'état sauvage. Si un animal pouvant servir de monture se trouve à moins de (Test de SURVIE) km, il rejoindra le Voyageur dans les plus brefs délais si cela est possible pour lui, et pourra être monté par le Voyageur pendant (Test de SURVIE) Heures. En fonction de l'animal appelé, le meneur de jeu pourra imposer une Difficulté aux Tests de SURVIE + Monture.");
		appelDeLaMonture = pouvoirRepository.save(appelDeLaMonture);
		
		accelererLeVoyage.setType("Déplacement");
		accelererLeVoyage.setTest("Aucun");
		accelererLeVoyage.setFrequence("Permanente");
		accelererLeVoyage.setActivation("1 Geste");
		accelererLeVoyage.setPortee("Interaction");
		accelererLeVoyage.setNbCible("SURVIE cibles");
		accelererLeVoyage.setDescription("Le Voyageur, lorsqu'il guide un convoi, peut doubler la vitesse de déplacement de ce convoi.");
		accelererLeVoyage = pouvoirRepository.save(accelererLeVoyage);
		
		appelDeLAnimal.setType("Invocation");
		appelDeLAnimal.setTest("SURVIE");
		appelDeLAnimal.setFrequence("1 fois par Jour");
		appelDeLAnimal.setActivation("1 Action");
		appelDeLAnimal.setPortee("Horizon");
		appelDeLAnimal.setNbCible("une");
		appelDeLAnimal.setDuree("1 Jour");
		appelDeLAnimal.setDescription("Le Voyageur imite le cri d’un gros animal local pour l’appeler. Un animal se trouvant à moins de (Test de SURVIE) km rejoint le Voyageur. Ce dernier pourra utiliser les capacités de l’animal qui réagira comme s’il était apprivoisé. L’animal pourra ainsi défendre le Voyageur, lui servir de monture, le guider vers un abri, porter un message… Une fois le temps de contrôle écoulé, l’animal redevient sauvage, et pourra même attaquer le Voyageur ou ses alliés.");
		appelDeLAnimal = pouvoirRepository.save(appelDeLAnimal);

		auraGuerriere.setType("Amélioration");
		auraGuerriere.setTest("Aucun");
		auraGuerriere.setFrequence("1 fois par Situation");
		auraGuerriere.setActivation("1 Geste");
		auraGuerriere.setPortee("Personnel");
		auraGuerriere.setDescription("Le Combattant peut utiliser un dé non-Actif sans dépenser de point de Trihn sur un Test de COMBAT + Intimidation pour impressionner ses cibles.");
		auraGuerriere = pouvoirRepository.save(auraGuerriere);
		
		criDeGuerre.setType("Amélioration");
		criDeGuerre.setTest("COMBAT");
		criDeGuerre.setFrequence("1 fois par Tour");
		criDeGuerre.setActivation("1 Action");
		criDeGuerre.setPortee("Interaction");
		criDeGuerre.setNbCible("(Test de COMBAT) cibles");
		criDeGuerre.setDuree("1 Tour");
		criDeGuerre.setDescription("Le Combattant peut répartir (Test de COMBAT) Bonus entre lui-même et ses alliés. Ces Bonus pourront être utilisés pour améliorer leur prochain Test de COMBAT.");
		criDeGuerre = pouvoirRepository.save(criDeGuerre);
		
		attaqueTerifiante.setType("Attaque");
		attaqueTerifiante.setTest("Aucun");
		attaqueTerifiante.setFrequence("1 fois par Jour");
		attaqueTerifiante.setActivation("1 Geste");
		attaqueTerifiante.setPortee("Personnel");
		attaqueTerifiante.setDegats("esprit");
		attaqueTerifiante.setDescription("Si le Combattant inflige une blessure physique lors d’un Test de COMBAT, le coup du Combattant inflige une blessure de même gravité à l’Esprit de sa cible.");
		attaqueTerifiante = pouvoirRepository.save(attaqueTerifiante);
		
		chargeHeroique.setType("Déplacement");
		chargeHeroique.setTest("Aucun");
		chargeHeroique.setFrequence("1 fois par Situation");
		chargeHeroique.setActivation("1 Geste");
		chargeHeroique.setPortee("Personnel");
		chargeHeroique.setDescription("Le Combattant peut effectuer un déplacement de Corps mètres en plus d'une Action de COMBAT. Le Combattant bénéficie en plus, pour cette attaque, d’un Bonus égal à son niveau de COMBAT/2, grâce à l’effet de surprise.");
		chargeHeroique = pouvoirRepository.save(chargeHeroique);
		
		
//		Pouvoir affaiblissement = new Pouvoir();
//		Pouvoir animerLesMorts = new Pouvoir();
//		Pouvoir alterationDeSouvenirs = new Pouvoir();
//		Pouvoir contagionNovice = new Pouvoir();
		
		affaiblissement.setType("Attaque");
		affaiblissement.setTest("NÉCROSE + Anti-Âme");
		affaiblissement.setFrequence("1 fois par Tour");
		affaiblissement.setActivation("1 Action");
		affaiblissement.setPortee("Interaction");
		affaiblissement.setCible("Corps");
		affaiblissement.setNbCible("NÉCROSE cibles");
		affaiblissement.setDegats("corps");
		affaiblissement.setCout("Une Anti-Âme");
		affaiblissement.setDescription("L'Ombre fait perdre 2 points de Corps à NÉCROSE cibles dont la Défense de Corps est inférieure à son (Test de NÉCROSE).");
		affaiblissement = pouvoirRepository.save(affaiblissement);
		
		animerLesMorts.setType("Invocation");
		animerLesMorts.setTest("NÉCROSE + Anti-Âme");
		animerLesMorts.setFrequence("1 fois par Jour");
		animerLesMorts.setActivation("2 Actions");
		animerLesMorts.setPortee("Interaction");
		animerLesMorts.setCout("Une Anti-Âme");
		animerLesMorts.setDuree("1 Jour");
		animerLesMorts.setDescription("L'Ombre peut relever un mort et s'en faire un allié pour qu'il attaque une cible. Le cadavre a les caractéristiques suivantes : Corps (Test de NÉCROSE) Esprit 0 Âme 0. Il reste debout jusqu'à ce que l'Ombre s'endorme. Il est insensible aux attaques d'Esprit et d'Âme et ne peut faire que des attaques de Corps.");
		animerLesMorts = pouvoirRepository.save(animerLesMorts);
		
		alterationDeSouvenirs.setType("Contrôle");
		alterationDeSouvenirs.setTest("NÉCROSE + Anti-Âme");
		alterationDeSouvenirs.setFrequence("1 fois par Jour");
		alterationDeSouvenirs.setActivation("1 Action");
		alterationDeSouvenirs.setPortee("Contact");
		alterationDeSouvenirs.setCible("Esprit");
		alterationDeSouvenirs.setNbCible("une");
		alterationDeSouvenirs.setCout("Une Anti-Âme");
		alterationDeSouvenirs.setDuree("1 Jour");
		alterationDeSouvenirs.setDescription("L'Ombre peut altérer les souvenirs d'une victime pour en modifier la teneur : elle lance un (Test de NÉCROSE) pour dépasser la Défense d'Esprit de la cible. Elle pourra alors changer Réussite mots clefs en relation avec un souvenir particulier de la cible.");
		alterationDeSouvenirs = pouvoirRepository.save(alterationDeSouvenirs);
		
		contagionNovice.setType("Attaque");
		contagionNovice.setTest("NÉCROSE");
		contagionNovice.setFrequence("1 fois par Jour");
		contagionNovice.setActivation("1 Action");
		contagionNovice.setPortee("Interaction");
		contagionNovice.setCible("Corps");
		contagionNovice.setNbCible("NÉCROSE cibles");
		contagionNovice.setDegats("corps");
		contagionNovice.setDuree("Réussite Tours");
		contagionNovice.setDescription("L'Ombre peut créer autour de lui une zone hautement contaminée de (Test de NÉCROSE) mètres de rayon. NÉCROSE cibles présentes dans cette zone perdent 1 point de Corps par Tour pendant Réussite Tours, si leur Défense de Corps est inférieure à son (Test de NÉCROSE). Le nuage corrosif se dissipe au bout de (Test de NÉCROSE) Tours. Les nécrosiens ne subissent pas ce Tourment.");
		contagionNovice = pouvoirRepository.save(contagionNovice);
		
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET ACQUIS
//-------------------------------------------------------------------------------------------------------------------------	

	}
}
