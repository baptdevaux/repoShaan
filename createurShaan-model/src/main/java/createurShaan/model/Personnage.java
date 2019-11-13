package createurShaan.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Transient;
import javax.persistence.Version;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Personnage {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column
	private String nom;
	@Column
	private float taille;
	@Column
	private Sexe sexe;
	@Column
	private Float poids;
	@Column
	private int age;
	@Column
	private int ame;
	@Column
	private int corps;
	@Column
	private int esprit;
	@Transient
	private List<AlterationEtat> alterationPersonnage = new ArrayList<AlterationEtat>();
	@Transient
	private Joueur joueur;
	@Transient
	private Race racePerso;
	@Transient
	private Peuple peuplePerso;
	@Transient
	private Metier metierPerso;
	@Transient
	private Caste castePerso;
	@Transient
	private List<BonusPersonnage> bonusPerso = new ArrayList<BonusPersonnage>();
	@Transient
	private List<DomainePersonnage> domainesPerso = new ArrayList<DomainePersonnage>();
	@Transient
	private List<PouvoirPersonnage> pouvoirsPerso = new ArrayList<PouvoirPersonnage>();
	@Transient
	private List<MotivationPersonnage> motivationsPerso = new ArrayList<MotivationPersonnage>();
	@Transient
	private TableDeJeu parties;

	public Personnage() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public Float getPoids() {
		return poids;
	}

	public void setPoids(Float poids) {
		this.poids = poids;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAme() {
		return ame;
	}

	public void setAme(int ame) {
		this.ame = ame;
	}

	public int getCorps() {
		return corps;
	}

	public void setCorps(int corps) {
		this.corps = corps;
	}

	public int getEsprit() {
		return esprit;
	}

	public void setEsprit(int esprit) {
		this.esprit = esprit;
	}

	public List<AlterationEtat> getAlterationPersonnage() {
		return alterationPersonnage;
	}

	public void setAlterationPersonnage(List<AlterationEtat> alterationPersonnage) {
		this.alterationPersonnage = alterationPersonnage;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public Race getRacePerso() {
		return racePerso;
	}

	public void setRacePerso(Race racePerso) {
		this.racePerso = racePerso;
	}

	public Peuple getPeuplePerso() {
		return peuplePerso;
	}

	public void setPeuplePerso(Peuple peuplePerso) {
		this.peuplePerso = peuplePerso;
	}

	public Metier getMetierPerso() {
		return metierPerso;
	}

	public void setMetierPerso(Metier metierPerso) {
		this.metierPerso = metierPerso;
	}

	public Caste getCastePerso() {
		return castePerso;
	}

	public void setCastePerso(Caste castePerso) {
		this.castePerso = castePerso;
	}

	public List<BonusPersonnage> getBonusPerso() {
		return bonusPerso;
	}

	public void setBonusPerso(List<BonusPersonnage> bonusPerso) {
		this.bonusPerso = bonusPerso;
	}

	public List<DomainePersonnage> getDomainesPerso() {
		return domainesPerso;
	}

	public void setDomainesPerso(List<DomainePersonnage> domainesPerso) {
		this.domainesPerso = domainesPerso;
	}

	public List<PouvoirPersonnage> getPouvoirsPerso() {
		return pouvoirsPerso;
	}

	public void setPouvoirsPerso(List<PouvoirPersonnage> pouvoirsPerso) {
		this.pouvoirsPerso = pouvoirsPerso;
	}

	public List<MotivationPersonnage> getMotivationsPerso() {
		return motivationsPerso;
	}

	public void setMotivationsPerso(List<MotivationPersonnage> motivationsPerso) {
		this.motivationsPerso = motivationsPerso;
	}

	public TableDeJeu getParties() {
		return parties;
	}

	public void setParties(TableDeJeu parties) {
		this.parties = parties;
	}

}
