package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Region;
//en los de uso la interface seria el que. y las clases que lo implementan es el como.

public interface RegionDao {
	//son todos publicos y abstractos. no tienen implemetacion
	
	boolean alta(Region region); //necesito una clase region lleno de datos
	//estos no tienen implementacion
	boolean update (Region region);//lo ultimo como se llama, que recibe y que devuelve. devuelve un boolean en este caos.
	boolean delete (int regionId);
	boolean delete (Region regionId); //esto se llama sobrecargar el metodo
	Region buscarUno(int RegionId);
	ArrayList<Region> buscarTodas (); //esto es para buscar todo, Esta bien pero cunado hay mucho que hacer no
	//ArrayList<Region> buscarPorNaneContains (String cadena); //buscar por nombre.
	
	ArrayList<Region> buscarNombreContains(String cadena);
	

}
