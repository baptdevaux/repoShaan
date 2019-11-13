package createurShaan.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table
public class Peuple {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column
	private String nomPeuple;
	@Column
	private Domaine domaine;
	@Column
	private Specialisation specialisation1;
	@Column
	private Specialisation specialisation2;

	public Peuple() {
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

	public String getNomPeuple() {
		return nomPeuple;
	}

	public void setNomPeuple(String nomPeuple) {
		this.nomPeuple = nomPeuple;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	public Specialisation getSpecialisation1() {
		return specialisation1;
	}

	public void setSpecialisation1(Specialisation specialisation1) {
		this.specialisation1 = specialisation1;
	}

	public Specialisation getSpecialisation2() {
		return specialisation2;
	}

	public void setSpecialisation2(Specialisation specialisation2) {
		this.specialisation2 = specialisation2;
	}

}
