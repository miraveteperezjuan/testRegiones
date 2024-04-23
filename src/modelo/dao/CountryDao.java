package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Country;
//en los de uso la interface seria el que. y las clases que lo implementan es el como.

public interface CountryDao {
	//son todos publicos y abstractos. no tienen implemetacion
	
	boolean alta(Country country); //necesito una clase region lleno de datos
	//estos no tienen implementacion
	boolean update (Country country);//lo ultimo como se llama, que recibe y que devuelve. devuelve un boolean en este caos.
	boolean delete (String countryId);
	boolean delete (Country country); //esto se llama sobrecargar el metodo
	Country buscarUno(String countryId);
	ArrayList<Country> buscarTodas (); //esto es para buscar todo, Esta bien pero cunado hay mucho que hacer no
	//ArrayList<Region> buscarPorNaneContains (String cadena); //buscar por nombre.
	
	ArrayList<Country> paisesPorRegion(int regionId);
	

}
