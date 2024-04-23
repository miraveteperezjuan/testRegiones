package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Country;

public class CountryDaoImpList implements CountryDao {

	private ArrayList<Country> lista;
	
	public CountryDaoImpList() {
		lista = new ArrayList<Country>(); //arranco la lista
		cargarDatos(); //datos para probar
	}
	private void cargarDatos() {
		RegionDaoImpList rdao = new RegionDaoImpList();
		lista.add(new Country("ES", "España", rdao.buscarUno(1)));
		lista.add(new Country("PO", "Portugal", rdao.buscarUno(1)));
		lista.add(new Country("FR", "Francia", rdao.buscarUno(1)));
		lista.add(new Country("PE", "Peru", rdao.buscarUno(2)));
		lista.add(new Country("AR", "Argentina", rdao.buscarUno(2)));
		lista.add(new Country("CH", "Chile", rdao.buscarUno(2)));
	}
	
	@Override
	public boolean alta(Country country) {
		if (lista.contains(country)) 
			return false;
		else 
			return lista.add(country);
	}
	
	@Override
	public boolean update(Country country) {
		int pos = lista.indexOf(country);
		if (pos != -1) {
			lista.set(pos, country);
			return true;
		} else
			return false;
	}
	
	@Override
	public boolean delete(String countryId) {
		Country country = buscarUno(countryId); 
		if (country != null) {
			return delete(countryId); 
		}else
			return false;
	}
	
	@Override
	public boolean delete(Country country) {
		return lista.remove(country);
	}
	
	@Override
	public Country buscarUno(String countryId) {
		Country country = new Country();
		country.setCountryId(countryId);
		int pos = lista.indexOf(country);
		if(pos != -1) {
			return lista.get(pos);
		}else
			return null;
	}
	
	@Override
	public ArrayList<Country> buscarTodas() {
		return lista;
	}
	
	@Override
	public ArrayList<Country> paisesPorRegion(int regionId) {
		ArrayList<Country> aux = new ArrayList<Country>();
		for (Country cou: lista) {
			if (cou.getRegion().getRegionId() == regionId) //si region id es igual a region id entrando por el otro lado
				aux.add(cou);
			}
		return aux;
	}
	
}
