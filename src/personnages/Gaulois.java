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
	
	public void parler(String phrase) {
		System.out.println("Le Gaulois "+nom+" dis : \""+phrase+"\".");
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Astérix", 8);
		String name = asterix.getNom();
		
		System.out.println(name);		
	}
	
}
