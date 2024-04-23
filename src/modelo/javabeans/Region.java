package modelo.javabeans;

import java.util.Objects;
//estos son clases pertenecientes a cosas que voy a persistir en la base de datos.
public class Region {
	private int regionId;
	private String regionName;
	
	public Region() {
		super();
	}

	public Region(int regionId, String regionName) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	//lo cogemos por el campo clave que es el ID
	@Override
	public int hashCode() {
		return Objects.hash(regionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return regionId == other.regionId;
	}

	@Override
	public String toString() {
		return "Region [regionId=" + regionId + ", regionName=" + regionName + "]";
	}

}
