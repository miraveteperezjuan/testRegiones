package testing;

import modelo.javabeans.Country;
import modelo.javabeans.Department;
import modelo.javabeans.Employee;
import modelo.javabeans.Job;
import modelo.javabeans.Location;
import modelo.javabeans.Region;

public class TestEmpleado {

	public static void main(String[] args) {
		
		Country p2 = new Country("AR", "Argentina", new Region(2, "America"));
		Location l1 = new Location(10, "Arma 3, Madrid" , p2);
		Department dep30 = new Department(30, "TI", l1);
		Job job1 = new Job("IT_PROG", "Anaylics", 14000, 35000);
		Employee emp114 = new Employee(114, "Juan", "Smith", 25000, dep30, job1);
		
		System.out.println("El apellido del employee: " + emp114.getLastName());
		System.out.println("El trabajo del emp114: " + emp114.getJob().getJobTitle());
		System.out.println("Nombre del department del emp114: " + emp114.getDepartment().getDepartmentName());
		System.out.println("La calle de la localitation del departmet del emp114: " + emp114.getDepartment().getLocation().getStreet());
		System.out.println("El nombre del país de la localización del employee 114: " + emp114.getDepartment().getLocation().getCountry().getCountryName());
		System.out.println("El nombre de la region de la localización del employee 114: " + emp114.getDepartment().getLocation().getCountry().getRegion().getRegionName());
		System.out.println("Empleado 115: " + emp114);
		
		//si no tengo un dato se tendria que meter un if y else para que no crash. si tuvieramos algo null. probar en un ejemplo que haga por mi medio
		//INTERFACE ES UNA CLASE ESPECIAL QUE MARCA LOS METODOS PARA ACTUALIZAR LOS DATOS Y CONSULTARLOS.
		//CLASE ESPECIALIZADA PARA ACCEDER A UN REPOSITORIO DE DATOS. COMO NO TENEMOS CLASE DE DATOS ACCEDEREMOS CON LISTA DE MEMORIA, IMPLEMENTAMOS LOS METODOS
		//Yo recojo esos datos, los armo en un employee lo pongo en contacto en la capa y me da alta como empleado. me va a dar una respuesta y me va a decir si lo ha dado de alta.
	}

}
