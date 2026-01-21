package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
		
	public Personnage(String nom, int force) {
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
		System.out.println("Le Romain "+nom+" dis : \""+phrase+"\".");
	}
	
	public void frapper(Personnage adversaire) {
		System.out.println(this.donnerAuteur()+" envoie un grand coup dans la machoire de "+adversaire.getNom()+".");
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
	
	protected abstract String donnerAuteur();
		
}


