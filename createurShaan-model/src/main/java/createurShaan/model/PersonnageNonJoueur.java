package createurShaan.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("PNJ")
public class PersonnageNonJoueur extends Personnage{
	@Transient
	private MaitreDuJeu createur;

	public PersonnageNonJoueur() {
		super();
	}

	public MaitreDuJeu getCreateur() {
		return createur;
	}

	public void setCreateur(MaitreDuJeu createur) {
		this.createur = createur;
	}
	
	

}
