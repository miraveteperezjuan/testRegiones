package modelo.javabeans;

import java.util.Objects;

public class Location {

	private int locationId;
	private String street;
	private Country country; //si el pais trae mas cosas trae esas cosas y bien y entran dentro de esta clase
	
	public Location() {
		// TODO Auto-generated constructor stub
	}

	public Location(int locationId, String street, Country country) {
		super();
		this.locationId = locationId;
		this.street = street;
		this.country = country;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		return Objects.hash(locationId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Location other = (Location) obj;
		return locationId == other.locationId;
	}

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", street=" + street + ", country=" + country + "]";
	}
	
	
	
}
