package createurShaan.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("Joueur")
public class Joueur extends Utilisateur{
	@Transient
	private List<Personnage> personnages = new ArrayList<Personnage>();

	public Joueur() {
		super();
	}

	public List<Personnage> getPersonnages() {
		return personnages;
	}

	public void setPersonnages(List<Personnage> personnages) {
		this.personnages = personnages;
	}
	
	

}
