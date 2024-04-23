package modelo.javabeans;

import java.util.Objects;

public class Country {
	
	//la clave del region se migra al country porque es la foreing key
	
	private String countryId;
	private String countryName;
	private Region region;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Country(String countryId, String countryName, Region region) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.region = region;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public int hashCode() {
		return Objects.hash(countryId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(countryId, other.countryId);
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", region=" + region + "]";
	}
	
	
	

}
