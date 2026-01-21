package sites;

import personnages.Soldat;
import personnages.Soldat.Grade;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats = new Soldat[3]; 
	private int nbSoldats = 0;
	
	
	public Camp(Soldat commandant) {
		this.commandant=commandant;
		this.commandant.parler("Je suis en charge de créer un nouveau camp romain");

	}
	
	public Soldat getCommandant() {
		return this.commandant;
	}
	
	public void ajouterSoldat(Soldat soldat) {
		if (nbSoldats < soldats.length) {
			soldats[nbSoldats] = soldat;
			nbSoldats++;
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par " + commandant.getNom());
		} else {
			commandant.parler("Désolé " + soldat.getNom() + " notre camp est complet !"); 
		}	
	}
	
	public void afficherCamp() {
	    System.out.println("Le camp de " + commandant.getNom() + " contient les soldats :");
	    for (int i = 0; i < nbSoldats; i++) {
	        System.out.println("- "+soldats[i].getNom()); 
	    }
	}
	
	public void changerCommandant(Soldat soldat) {
		if (soldat.getGrade()==Grade.CENTURION) {
			commandant = soldat;
			soldat.parler("Moi "+soldat.getNom()+" je prends la direction du camp romain.");

		}
		else {
			soldat.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain");
		}
	}
}
