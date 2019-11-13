package createurShaan.model;

import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table
public class AlterationPersonnage {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Transient
	private Personnage persoLie;
	@Transient
	private AlterationEtat alterationEtat;

	public AlterationPersonnage() {
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

	public Personnage getPersoLie() {
		return persoLie;
	}

	public void setPersoLie(Personnage persoLie) {
		this.persoLie = persoLie;
	}

	public AlterationEtat getAlterationEtat() {
		return alterationEtat;
	}

	public void setAlterationEtat(AlterationEtat alterationEtat) {
		this.alterationEtat = alterationEtat;
	}

}
