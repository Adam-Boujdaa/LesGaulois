package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
	
	private int nbPotions;
	private int forcePotion;
	private Random random;
	
	public Druide (String nom,int force) {
		super(nom,force);
		try {
            this.random = SecureRandom.getInstanceStrong(); 
        } catch (Exception e) {
            this.random = new Random();
        }
	}
	
	
	public void fabriquerPotion(int nb) {
		nbPotions=nb;
		this.forcePotion=random.nextInt(5)+2; //entre 0 et 5 puis entre 2 et 7
		this.parler("J'ai concocté " + nbPotions + " doses de potion magique. Elle a une force de " + forcePotion);
		
	}
	
	public void booster(Gaulois g) {
		if (g.getNom().equals("Obélix")) {
            this.parler("Non, Obélix Non !... Et tu le sais très bien !");
        } else if (nbPotions > 0) {
            this.parler("Tiens " + g.getNom() + " un peu de potion magique.");
            g.boirePotion(forcePotion);
            nbPotions--;
        } else {
            this.parler("Désolé " + g.getNom() + " il n'y a plus une seule goutte de potion.");
        }
	}
	
	public int getForcePotion() {
		return forcePotion;
	}
}