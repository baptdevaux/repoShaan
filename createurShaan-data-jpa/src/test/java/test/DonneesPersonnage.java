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
		boreals.setNomRace("boreals");
		boreals.setDomaine(survie);
//		boreals.setSpecialisation1(vigilance);
//		boreals.setSpecialisation2(navigation);
		boreals.setTailleEstimation("1,6m à 1,9 m");
		boreals.setPoidsEstimation("60 à 120 kg");
		boreals.setLangues("Héossien, Boréal");
		boreals.setPouvoirDeRace("Vision Boréal");
		boreals.setPeupleOrigine(rivages);
//		boreals.setCastePredilection(voyageurs);
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
//		darkens.setCastePredilection(combattants);
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
//		nomois.setCastePredilection(magiciens);;
		nomois.setElementTotem("Moi");
		nomois.setCouleurSymbolique("Argent");
		nomois = raceRepository.save(nomois);

		woons.setNomRace("Woons");
		woons.setDomaine(rituels);
//		woons.setSpecialisation1(educationPhysique);
//		woons.setSpecialisation2(Intimidation);
		woons.setTailleEstimation("2,2 m à 2,7 m");
		woons.setPoidsEstimation("100 à 300 kg");
		woons.setLangues("Héossien, Woon");
		woons.setPouvoirDeRace("Résistance Woon");
		woons.setPeupleOrigine(foretsBlanches);
//		woons.setCastePredilection(elementalistes);;
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
//		humains.setCastePredilection(ombres);
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
//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET POUVOIR
//-------------------------------------------------------------------------------------------------------------------------	

//-------------------------------------------------------------------------------------------------------------------------
//		REMPLISSAGE OBJET ACQUIS
//-------------------------------------------------------------------------------------------------------------------------	

	}
}
