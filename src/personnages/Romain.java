package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String phrase) {
		System.out.println("Le Romain "+nom+" dis : \""+phrase+"\".");
	}
	
	public void recevoirCoup(int force) {
		this.force=this.force-force/3;
		if (this.force<=0) {
			if (this.force<0) {
				this.force=0;
				System.out.println("J'abandonne...");
				}
			}
		else {
			System.out.println("Aie !");
		}
			
	}
	
}
