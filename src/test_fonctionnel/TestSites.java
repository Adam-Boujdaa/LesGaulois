package test_fonctionnel;

import personnages.Gaulois;
import personnages.Soldat;
import personnages.Soldat.Grade;
import sites.Camp;
import sites.Village;

public class TestSites {
    public static void main(String[] args) {
        Gaulois vercingetorix = new Gaulois("Vercingétorix", 5); 
        Village village = new Village(vercingetorix);

        Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT); 
        Camp camp = new Camp(minus); 

        Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION); 
        Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT); 
        Soldat tullius = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS); 
        Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO); 

        camp.ajouterSoldat(brutus); 
        camp.ajouterSoldat(milexcus); 
        camp.ajouterSoldat(tullius); 
        camp.ajouterSoldat(ballondebaudrus); 

        Gaulois agecanonix = new Gaulois("Agecanonix", 1); 
        Gaulois assurancetourix = new Gaulois("Assurancetourix", 2); 
        Gaulois asterix = new Gaulois("Astérix", 5); 
        Gaulois obelix = new Gaulois("Obelix", 15); 
        Gaulois prolix = new Gaulois("Prolix", 2);

        village.ajouterVillageois(agecanonix); 
        village.ajouterVillageois(assurancetourix); 
        village.ajouterVillageois(asterix); 
        village.ajouterVillageois(obelix); 
        village.ajouterVillageois(prolix);

        village.afficherVillageois(); 
        camp.afficherCamp(); 


        Gaulois abraracourcix = new Gaulois("Abraracourcix", 5); 
        village.changerChef(abraracourcix); 

        Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT); 
        camp.changerCommandant(briseradius); 

        Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION); 
        camp.changerCommandant(chorus); 
    }
}