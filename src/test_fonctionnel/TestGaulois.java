package test_fonctionnel;

import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5);
		Gaulois asterix = new Gaulois("asterix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Romain minus = new Romain("Minus", 18);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);

		panoramix.fabriquerPotion(3);

		panoramix.booster(asterix);
		panoramix.booster(obelix);
		panoramix.booster(assurancetourix);
		panoramix.booster(abraracourcix);
		panoramix.booster(agecanonix);

		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU...");

		while (!asterix.estATerre() && !minus.estATerre()) {
			asterix.frapper(minus);
			if (!minus.estATerre()) {
				minus.frapper(asterix);
			}
		}
	}
}