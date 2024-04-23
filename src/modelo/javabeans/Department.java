package modelo.javabeans;

import java.util.Objects;

public class Department {

	private int departmentId;
	private String departmentName;
	private Location location;
	
   public Department() {
	// TODO Auto-generated constructor stub
}

   public Department(int departmentId, String departmentName, Location location) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.location = location;
}

public int getDepartmentId() {
	return departmentId;
}

public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

public Location getLocation() {
	return location;
}

public void setLocation(Location location) {
	this.location = location;
}

@Override
public int hashCode() {
	return Objects.hash(departmentId);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Department other = (Department) obj;
	return departmentId == other.departmentId;
}

@Override
public String toString() {
	return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", location=" + location
			+ "]";
}
   


}
