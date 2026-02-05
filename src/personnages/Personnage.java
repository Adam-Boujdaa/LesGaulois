package personnages;

public abstract class Personnage {
	private String nom;
	protected int force; //plus private comme ça le gauloi speut changer la valeur qd il se fait booster
		
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
		System.out.println(this.donnerAuteur()+" dis : \""+phrase+"\".");
	}
	
	public void frapper(Personnage adversaire) {
		System.out.println(this.donnerAuteur()+" envoie un grand coup dans la machoire de "+adversaire.getNom()+".");
	}
	
	public void recevoirCoup(int force) {
		this.force=this.force-force	;
		if (this.force<=0) {
			if (this.force<0) {
				this.force=0;
				this.parler("J'abandonne...");
				}
			}
		else {
			System.out.println("Aie !");
		}
	}
	
	protected abstract String donnerAuteur();
	
	public boolean estATerre() {
		return force<=0;
	}
		
}


