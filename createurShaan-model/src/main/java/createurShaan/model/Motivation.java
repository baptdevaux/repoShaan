package createurShaan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class Motivation {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private Integer version;
	@Column (length = 5000)
	private String nomMotivation;
	@Column (length = 5000)
	private String description;
	
	@ManyToOne
	@JoinColumn (name = "motivationId")
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

	public String getNomMotivation() {
		return nomMotivation;
	}

	public void setNomMotivation(String nomMotivation) {
		this.nomMotivation = nomMotivation;
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

	public Motivation() {
		super();
	}

	
}
