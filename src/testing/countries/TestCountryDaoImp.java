package testing.countries;

import modelo.dao.CountryDaoImpList;
import modelo.dao.RegionDaoImpList;
import modelo.javabeans.Country;

public class TestCountryDaoImp {
	
	private static CountryDaoImpList cdao; 
	private static RegionDaoImpList rdao;
	
	static { //lo que hacemos con esto es crear el constructor.
		cdao = new CountryDaoImpList();
		rdao = new RegionDaoImpList();
	}
	
	public static void main (String[] args) {
			//buscarTodos();
				//buscarUna();
				//delete();
				//delete2();
				//update();
				//alta();
				//contiene();
	}
	
	public static void alta() {
		Country country = new Country("AL", "Alemania", rdao.buscarUno(1));
			System.out.println(cdao.alta(country));
			todos();
	}
	
	public static void eliminar() {
		System.out.println(cdao.delete("FR")); //POR CODIGO
		System.out.println(cdao.delete("ZZ"));
		System.out.println(cdao.delete(cdao.buscarUno("AR"))); //por objeto
		System.out.println(cdao.delete(cdao.buscarUno("JJ")));
	}
	
	public static void modificar() {
		Country country = cdao.buscarUno("FR");
		if (country != null) {
			country.setCountryName("Gabacholandia");
			System.out.println(cdao.update(country)); //le paso el pais con la modificacion
			todos();
		}else
			System.out.println("No existe");

				
	}
	
	public static void todos() {
		for (Country pais : cdao.buscarTodas())
			System.out.println(pais);
	}
	
	public static void uno() {
		System.out.println(cdao.buscarUno("AR"));
		System.out.println(cdao.buscarUno("ZZ"));
		
	}
	
	public static void porRegion() {
		for (Country pais: cdao.paisesPorRegion(2)) 
			System.out.println(pais); //pintame al pais al que estas apuntando.
	}
}
