package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois{
	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Astérix", 5);
		Gaulois obelix= new Gaulois("Obélix", 999);
		Gaulois assurancetourix= new Gaulois("Assurancetourix", 1);
		Gaulois ag = new Gaulois("Ag",1);
		Gaulois ab = new Gaulois("ab", 1);

		Druide panoramix = new Druide("Panoramix",5);
		Romain minus = new Romain("Minus", 6);
		
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU UN GAUGAU ...");
		
		panoramix.fabriquerPotion();		
		int fBoostAst= panoramix.boosterGaulois(asterix);
		int fBoostObel = panoramix.boosterGaulois(obelix);
		int fBoostAssur = panoramix.boosterGaulois(assurancetourix);
		int fBoostAg = panoramix.boosterGaulois(ag);
		int fBoostAb = panoramix.boosterGaulois(ab);

		
		
		
		
		while (fBoostAst<asterix.getForce())
			while(!minus.estATerre()) {
				asterix.frapper(minus);
				minus.recevoirCoup(asterix.getForce());
				asterix.reduireForce(0.5);
				}
	}
}
