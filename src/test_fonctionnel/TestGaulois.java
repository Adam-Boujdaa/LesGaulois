package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois{
	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Astérix", 9);
		String name = asterix.getNom();
		
		asterix.parler("halo moto");
		
		Romain minus = new Romain("Minus", 8);
		asterix.parler("wazzup beijing");
		//for (int i=0;i<2;i++) {
		
			asterix.frapper(minus);
			minus.recevoirCoup(asterix.getForce());
			asterix.frapper(minus);
			minus.recevoirCoup(asterix.getForce());
			asterix.frapper(minus);
			minus.recevoirCoup(asterix.getForce());

		//}
		
	}
}
