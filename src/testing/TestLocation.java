package testing;

import modelo.javabeans.Country;
import modelo.javabeans.Location;
import modelo.javabeans.Region;

public class TestLocation {

	public static void main(String[] args) {
		Region r1 = new Region(1, "Europa");
		Country p1 = new Country("SP", "España", r1);
		Country p2 = new Country("AR", "Argentina", new Region(2, "America"));
		
		Location l1 = new Location(10, "Arma 3, Madrid" , p2);
		Location l2 = new Location(102, "Ser 3, Sevilla" , new Country("AN", "Andalucia", r1));
		
		System.out.println(l1);
		System.out.println("El pais de esta localizacion: " + l1.getCountry().getCountryName()); //bajar niveles
		System.out.println("La region del pais de esta localizacion: " + l1.getCountry().getRegion().getRegionName());
		//esto es bajar niveles hasta que encuentras lo que tu quieres.
		
		//ANOTACION EXTRA LOS CHAR LLEVAN LA COMILLA SIMPLE Y NO LA DOBLE.
	}

}
