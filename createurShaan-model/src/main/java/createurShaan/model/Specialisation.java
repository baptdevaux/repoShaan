package createurShaan.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table
public class Specialisation {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private Integer version;
	@Column
	private String nom;
	@Column
	private String description;
	@Column
	private String metier;
	
	@Transient
	private Domaine domaineLie;
	@Transient
	private List <Acquis>bonusAcquis = new ArrayList <Acquis>();
	
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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMetier() {
		return metier;
	}
	public void setMetier(String metier) {
		this.metier = metier;
	}
	public Domaine getDomaineLie() {
		return domaineLie;
	}
	public void setDomaineLie(Domaine domaineLie) {
		this.domaineLie = domaineLie;
	}
	public List<Acquis> getBonusAcquis() {
		return bonusAcquis;
	}
	public void setBonusAcquis(List<Acquis> bonusAcquis) {
		this.bonusAcquis = bonusAcquis;
	}
	public Specialisation() {
		super();
	}
	
	
}
