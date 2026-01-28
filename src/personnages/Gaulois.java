package personnages;

public class Gaulois extends Personnage {
	
	public Gaulois(String nom, int force) {
		super(nom, force);
	}
	
	@Override 
	protected String donnerAuteur() {
		return("Le gaulois "+this.getNom()+" ");
	}
	
	public int boirePotion(Druide d) {
		if (this.getNom().equals("Obélix")) {
			this.parler("Non Oblélix!");
			return force;
		}
		else {
			int forcePotion = d.getForcePotion();
			int forceBoostee = this.force*forcePotion;
			this.parler("Merci Druide ! Ma force est maintenant de " + forceBoostee);	
			return forceBoostee;
		}
	}
}
