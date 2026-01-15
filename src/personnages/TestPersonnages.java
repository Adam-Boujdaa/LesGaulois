package personnages;

public class TestPersonnages {
	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Astérix", 8);
		String name = asterix.getNom();
		
		
		System.out.println(asterix);
		System.out.println(name);
		asterix.parler("halo moto");
	}

}
