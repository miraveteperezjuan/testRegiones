package aplicaciones;

import java.util.Scanner;

import modelo.dao.RegionDaoImpList;
import modelo.javabeans.Region;

public class AppRegiones {

	private static Scanner leer;
	private static RegionDaoImpList rdao;
	
	static {
		leer = new Scanner(System.in);
		rdao = new RegionDaoImpList(); //esto es para entrar al repositorio de datos y que tiene acceso a todo.
	}
	
	public static void main(String[] args) {
		
		int opcion = 0;
		do {
		opcion = pintarMenu();
		if (opcion == 5)
			break;
		switch(opcion){
		case 1:
			procAlta();
			break;
		case 2:
			procTodos();
			break;
		case 3:
			procUno();
			break;
		case 4:
			procEliminar();
			break;
		}
		
		}while(opcion >=1 && opcion <= 5);
		System.out.println("Fin de programa");
	}
	
	public static void procAlta() {
		System.out.println("Procesar alta");
		int id = leer.nextInt();
		System.out.println("Teclea el nombre de la region");
		String regionName = leer.next(); //next recupera solo una y el nextline todo
		Region region = new Region(id, regionName);
		if (rdao.alta(region)) {
			System.out.println("Alta de región");
		}else
			System.out.println("Alta no válida");
	}
	
	public static void procTodos() {
		System.out.println("Procesar todos");
		for (Region reg: rdao.buscarTodas()) { //estos metodos interactuan con el usuario real.
			System.out.println(reg);
		}
	}
	
	public static void procUno() {
		System.out.println("Procesar uno");
		int id = leer.nextInt();
		Region reg1 = rdao.buscarUno(id);
		if (reg1 != null) 
			System.out.println(reg1);
		else
			System.out.println("No existe");
	}
	
	public static void procEliminar() {
		System.out.println("Eliminar");
		int regionId = leer.nextInt();
		if (rdao.delete(regionId)) {
			System.out.println("Eliminado");
		}else
			System.out.println("No eliminado");
	}

	public static int pintarMenu() {
		int opcion = 0;
		System.out.println("1. Alta Región");
		System.out.println("2. Buscar todas");
		System.out.println("3. Buscar una");
		System.out.println("3. Eliminar región");
		System.out.println("5. Salir");
		System.out.println("Ponga la 5 para salir");
		opcion = leer.nextInt();
		
		while(opcion < 1 || opcion > 5) { //para que entre en bucle por si no lo hace bien
			System.out.println("Opcion no válida");
			opcion = leer.nextInt();
		}
		
		return opcion;
	}
}
