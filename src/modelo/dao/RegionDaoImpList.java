package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Region;

//esto es una clase que impelemnta la funcionalidad del dao de arriba 
//esto no se va a persistir. se persisten los datos no las funciones
//esto es una estructura cuyo destino final se va apersisitir en una base de dates
public class RegionDaoImpList implements RegionDao { //los metodos ya estan hecho y lo que hay que hacer es implementar esos metodos o heredar esos metodos
	//esta tiene dentro la lista
	
	private ArrayList<Region> lista; //esto se inicia a null y lo que hay que hacer es arrancar la lista que es lo de abajo.
	//metemos la lista de regisones aqui dentro
	
	public RegionDaoImpList() { //crea un constructor y arranca la lista
		//En este contructor arranca la lista y crea un array de objetos 
		lista = new ArrayList<>(); //inicialmente todas las variables estan a null. Se crea un array de regiones
		cargarDatos();
	}
	
	private void cargarDatos() { //esto crea un objeto de la clase region y el null de arriba apunta a este y hace que el objeto este lleno.
		lista.add(new Region (1, "Europa")); //esto es el array de regiones
		lista.add(new Region (2, "America"));
		lista.add(new Region (3, "Asia"));
		lista.add(new Region (4, "África"));
	}

	@Override
	public boolean alta(Region region) {
		// 1 entra y primero en salir. 2 admiten dublicados. 3 cuando yo le doy un objeto que hacen para comparar si ese objeto existe pues tiran de equals. 
		//dos regiones son iguales si el regionid es el mismo.
		
		//para dar de alta vamos a decir que 2 regiones no pueden tener el mismo id.
		
		if (lista.contains(region)) //el contain nos dice si existe o no y si no existe lo crea.
			return false;
		else 
			return lista.add(region); //esto devuelve un boolean
	}

	@Override
	public boolean update(Region region) {
		int pos = lista.indexOf(region); //esto es que te devuelve la posicion que tiene. y si no lo encuentra devuelve -1
		if (pos != -1) {
			lista.set(pos, region);
			return true;
		}else
			return false;
	}

	@Override
	public boolean delete(int regionId) {
		Region region = buscarUno(regionId); //busco el metodo que ya esta hecho. Meto la region que existe y apunto a su objeto y sino es nulo
		if (region != null) {
			return delete(regionId); //se reutiliza codigo del de abajo
		}else
			return false;
	}

	@Override
	public boolean delete(Region regionId) {
		return lista.remove(regionId);
	}

	@Override
	public Region buscarUno(int RegionId) {
	//este esta mas elaborado y le gusa a tomasin
		Region region = new Region(); //nos creamos una clase region vacio
		region.setRegionId(RegionId); //le meto el codigo de la region que me han pasado.
		int pos = lista.indexOf(region); //buscame este objeto y si es diferente a menos 1 toma. y si no na.
		//index of es mucho mas efectivo que hacerlo en orden.
		if(pos != -1)
			return lista.get(pos);
		else
			return null;
	}
		/*Este metodo esta bien pero para cosas pequeñas.
		for (Region reg: lista) {
			if (RegionId == reg.getRegionId()) //se pone dos iguales porque es un int y si fuera string se pondria equals.
				return reg; //devolver el objeto entero
		}
		return null; //no devuelvo nada porque no lo he encontrado.
	}
	*/
		
	@Override
	public ArrayList<Region> buscarTodas() {
		
		return lista;
	}

	@Override
	public ArrayList<Region> buscarNombreContains(String cadena) {
		ArrayList<Region> aux = new ArrayList<Region>();
		for (Region reg: lista) {
			if (reg.getRegionName().contains(cadena))
				aux.add(reg);
			}
		return aux;
		}
	

}
