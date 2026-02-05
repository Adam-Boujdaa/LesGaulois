package personnages;

public class Gaulois extends Personnage {
	private double puissancePotion=1;
	
	
	public Gaulois(String nom, int force) {
		super(nom, force);
	}
	
	@Override 
	protected String donnerAuteur() {
		return("Le gaulois "+this.getNom()+" ");
	}
	
	@Override
	public void frapper(Personnage adversaire) {
		int forceCoup = (int) (force * puissancePotion) ;
		        
		        System.out.println(this.donnerAuteur() + " donne un grand coup de force " + forceCoup + " au " + adversaire.getNom() + ".");
		        
		        adversaire.recevoirCoup(forceCoup);
		
		        // Décroissance de la potion
		        if (puissancePotion > 1.0) {
		        	puissancePotion -= 0.5;
		        }
	}
	
	public void boirePotion(int p) {
			puissancePotion=p;
		}
	
}
