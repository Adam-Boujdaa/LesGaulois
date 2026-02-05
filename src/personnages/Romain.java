package personnages;

public class Romain extends Personnage {
	
	private Equipement[] equipements = new Equipement[2]; //3objets max
	private int nbEquipement;
	
	public Romain(String nom, int force) {
		super(nom, force);
	}
	
	@Override 
	protected String donnerAuteur() {
		return("Le romain "+this.getNom()+" ");
	}
	
	public void sEquiper(Equipement equipement) {
	    if (nbEquipement == 3) {
	        System.out.println("Le soldat " + getNom() + " est déjà bien protégé !");
	    } else {
	        boolean dejaPossede = false;
	        for (int i = 0; i < nbEquipement; i++) {
	            if (equipements[i] == equipement) {
	            	dejaPossede = true;
	            }
	        }

	        if (dejaPossede) {
	            System.out.println("Le soldat " + getNom() + " possède déjà un " + equipement + " !");
	        } else {
	            equipements[nbEquipement] = equipement;
	            nbEquipement++;
	            System.out.println("Le soldat " + getNom() + " s'équipe avec un " + equipement + ".");
	        }
	    }
	}
	 
	@Override
	public void recevoirCoup(int forceCoup) {
	    int protectionTotale = 0;

	    for (int i = 0; i < nbEquipement; i++) {
	        switch (equipements[i]) {
	            case CASQUE:
	                System.out.println("Le casque absorbe 2 du coup");
	                protectionTotale += 2;
	                break;
	            case BOUCLIER:
	                System.out.println("Le bouclier absorbe 3 du coup");
	                protectionTotale += 3;
	                break;
	            case PLASTRON:
	                System.out.println("Le plastron absorbe 3 du coup");
	                protectionTotale += 3;
	                break;
	            default:
	                break;
	        }
	    }

	    int forceApresArmure = forceCoup - protectionTotale;

	    
	    super.recevoirCoup(forceApresArmure);
	}
	
}
