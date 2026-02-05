package personnages;

public enum Equipement {
    CASQUE("casque",2), 
    BOUCLIER("bouclier",3), 
    PLASTRON("plastron",3);

    private String nom;
    private int protection;

    private Equipement(String nom, int p) {
        this.nom = nom;
        protection = p;
    }

    @Override
    public String toString() {
        return nom;
    }
    
    public int getProtection() {
    	return protection;
    }
}