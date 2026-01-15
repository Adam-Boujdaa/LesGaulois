package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois{
	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Astérix", 8);
		String name = asterix.getNom();
		
		System.out.println(name);
		
		asterix.parler("halo moto");
	}
}
