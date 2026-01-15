package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	public Gaulois(String nom, int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void parler(String phrase) {
		System.out.println("Le Gaulois "+nom+" dis : \""+phrase+"\".");
	}
	
	public void frapper(Romain cible) {
		System.out.println(nom+" envoie un grand coup dans la machoire de "+cible.getNom()+".");

	}
	
	
}
