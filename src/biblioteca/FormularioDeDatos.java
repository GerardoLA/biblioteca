package biblioteca;

import java.util.Scanner;

public class FormularioDeDatos {
	
	public static Libro pediDatosLibro(Scanner scan) {
		Libro libro = new Libro();
		
		
		System.out.println("Introduce el titulo del libro: ");
		libro.setTitulo(scan.nextLine());
		
		System.out.println("Introduce el autor: ");
		libro.setAutor(scan.nextLine());
		
		System.out.println("Introduce el número de páginas: ");
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		
		return libro;
	}

	public static Libro modificarDatos(Libro libro,Scanner scan) {
		System.out.println("introduce el titulo nuevo");
		libro.setTitulo(scan.nextLine());
		
		System.out.println("Introduce el autor nuevo");
		libro.setAutor(scan.nextLine());
		
		System.out.println("Introduce el número de páginas" );
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		
		
		return libro;
	}
	
	public static int pedirIdLibro(Scanner scan) {
		System.out.println("Dime id del libro");
		int id = Integer.parseInt(scan.nextLine()); //variable donde guardamos
		
		return id;
	}
}
