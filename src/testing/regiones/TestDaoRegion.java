package testing.regiones;

import modelo.dao.RegionDaoImpList;
import modelo.javabeans.Region;

public class TestDaoRegion {

	private static RegionDaoImpList rdao; //esto es un dato privado de esta clase y me pongo en contacto con todo del rdao
	
	static { //esto es un constructor para lo estatico. sirve para arrancar lo estatico
		rdao = new RegionDaoImpList(); //esto es un constructor de todo lo estatico
	}
	
	public static void main(String[] args) {
		//buscarTodos();
		//buscarUna();
		//delete();
		//delete2();
		//update();
		//alta();
		//contiene();
	}
	
	public static void contiene() {
		for (Region reg: rdao.buscarNombreContains("ri")) {
			System.out.println(reg);
		}
		System.out.println("Fin del metodo");
	}
	
	public static void alta() {
		System.out.println("Alta");
		Region reg1 = new Region(5, "Antartida");
		Region reg2 = new Region(1, "Europa");
		System.out.println(rdao.alta(reg1));
		System.out.println(rdao.alta(reg2));
		buscarTodos();
	}
	
	public static void update() {
		System.out.println("Modificar");
		Region region = rdao.buscarUno(1);
		if (region != null) {
		region.setRegionName("Europe");
		System.out.println(rdao.update(region));
		buscarTodos();
		}else
			System.out.println("Esta region no existe");
	}
	
	public static void delete2() {
		Region region = rdao.buscarUno(2);
		System.out.println(rdao.delete(region));
		buscarTodos();
		
	}
	
	public static void delete() {
		System.out.println(rdao.delete(3));
		buscarTodos();
	}
	
	public static void buscarUna() {
		Region region = rdao.buscarUno(1);
		if (region != null)
			System.out.println(region);
		else
			System.out.println("Region no existe");
	}

	public static void buscarTodos() {
		for (Region region: rdao.buscarTodas())
			System.out.println(region);
	}
	
}
