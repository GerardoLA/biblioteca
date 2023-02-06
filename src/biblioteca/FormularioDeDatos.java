package biblioteca;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FormularioDeDatos {
	
	public static Prestamo pedirDatosPrestamo(Scanner scan) {
		Prestamo prestamo=new Prestamo();
		SimpleDateFormat fecha = new SimpleDateFormat ("dd/MM/yyyy");
				
		System.out.println("Introduce la id del libro: ");
		prestamo.setId_libro(pedirIdLibro(scan));
		
		
		prestamo.setId_libro(pedirIdLibro(scan));
		
		System.out.println("Introduce la fecha:(formato dd/mm/yyyy) ");
		prestamo.setFecha(new Date());
		prestamo.setDevuelto(false);//cuando se crea un prestamo nuevo,false hasta que se devuelva el libro.
		
		return prestamo;
		
	}
	
	public static int pedirIdSocio(Scanner scan) {
		System.out.println("Introduce Id de socio: ");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
	}
	
	public static Socio pedirDatosSocio(Scanner scan) {
		Socio socio = new Socio();
		
		System.out.println("Introduce el nombre del socio: ");
		socio.setNombre(scan.nextLine());
		
		System.out.println("Introduce el apellido: ");
		socio.setApellido(scan.nextLine());
		
		System.out.println("Introduce la dirección: ");
		socio.setDireccion(scan.nextLine());
		
		System.out.println("introduce la población");
		socio.setPoblacion(scan.nextLine());
		
		System.out.println("Introduce la provincia: ");
		socio.setProvincia(scan.nextLine());
		
		System.out.println("Introduce el dni: ");
		socio.setDni(scan.nextLine());
		
		return socio;
			}
	
	public static Socio modificarDatosSocio(Socio socio,Scanner scan) {
		System.out.println("Introduce el nombre nuevo");
		socio.setNombre(scan.nextLine());
		
		System.out.println("Introduce el apellido nuevo");
		socio.setApellido(scan.nextLine());
		
		System.out.println("Introduce la dirección nueva: ");
		socio.setDireccion(scan.nextLine());
		
		System.out.println("Introduce la población nueva: ");
		socio.setPoblacion(scan.nextLine());
		
		System.out.println("Introduce la provincia: ");
		socio.setProvincia(scan.nextLine());
		
		System.out.println("Introduce el dni: ");
		socio.setDni(scan.nextLine());
		
		
		
		return socio;
	}
	
	public static int pedirIdLibro(Scanner scan) {
		System.out.println("Dime id del libro");
		int id = Integer.parseInt(scan.nextLine()); //variable donde guardamos
		
		return id;
	}
	
	
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

	public static Libro modificarDatosLibro(Libro libro,Scanner scan) {
		System.out.println("introduce el titulo nuevo");
		libro.setTitulo(scan.nextLine());
		
		System.out.println("Introduce el autor nuevo");
		libro.setAutor(scan.nextLine());
		
		System.out.println("Introduce el número de páginas" );
		libro.setNum_pag(Integer.parseInt(scan.nextLine()));
		
		
		return libro;
	}
	


	

}
