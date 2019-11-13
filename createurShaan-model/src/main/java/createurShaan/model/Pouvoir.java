package createurShaan.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.Version;

public class Pouvoir {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private Integer version;
	@Column
	private String nomPouvoir;
	@Column
	private String rang;
	@Column
	private String type;
	@Column
	private String test;
	@Column
	private String frequence;
	@Column
	private String activation;
	@Column
	private String portee;
	@Column
	private String cible;
	@Column
	private Integer nbCible;
	@Column
	private String typeDegat;
	@Column
	private String duree;
	@Column
	private String cout;
	@Column
	private String description;
	
	@Transient
	private Domaine domaineLie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getNomPouvoir() {
		return nomPouvoir;
	}

	public void setNomPouvoir(String nomPouvoir) {
		this.nomPouvoir = nomPouvoir;
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getFrequence() {
		return frequence;
	}

	public void setFrequence(String frequence) {
		this.frequence = frequence;
	}

	public String getActivation() {
		return activation;
	}

	public void setActivation(String activation) {
		this.activation = activation;
	}

	public String getPortee() {
		return portee;
	}

	public void setPortee(String portee) {
		this.portee = portee;
	}

	public String getCible() {
		return cible;
	}

	public void setCible(String cible) {
		this.cible = cible;
	}

	public Integer getNbCible() {
		return nbCible;
	}

	public void setNbCible(Integer nbCible) {
		this.nbCible = nbCible;
	}

	public String getTypeDegat() {
		return typeDegat;
	}

	public void setTypeDegat(String typeDegat) {
		this.typeDegat = typeDegat;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getCout() {
		return cout;
	}

	public void setCout(String cout) {
		this.cout = cout;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Domaine getDomaineLie() {
		return domaineLie;
	}

	public void setDomaineLie(Domaine domaineLie) {
		this.domaineLie = domaineLie;
	}

	public Pouvoir() {
		super();
	}
	
	

}
