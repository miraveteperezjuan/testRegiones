package testing;

import modelo.javabeans.Country;
import modelo.javabeans.Region;

public class TestCountry {

	public static void main(String[] args) {
		Region r1 = new Region(1, "Europa");
		Country p1 = new Country("SP", "España", r1);
		Country p2 = new Country("AR", "Argentina", new Region(2, "America"));
		
		System.out.println(p2);
		System.out.println(p1);
	
		System.out.println("Nombre de la region del pais2");
		System.out.println(p2.getRegion().getRegionName()); //estoy sacando el nombre de la region del pais2
		//en una clase tengo un objeto dentro de otra clase y sigue asi constantemente.

	}

}
