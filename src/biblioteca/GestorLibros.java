package biblioteca;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorLibros {
	public static void run(Scanner scan) throws SQLException {
		
		int opcion;
		Libro libro;
		GestorBBDD gestor = new GestorBBDD();
		
		do {
			
			Menu.mostrarmenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
				case Menu.INSERTAR_LIBRO:
					libro= FormularioDeDatos.pediDatosLibro(scan);
					gestor.insertarLibro(libro);
					System.out.println("Libro insertado");
					break;
				
				case Menu.MODIFICAR_LIBRO:
					int idLibro = FormularioDeDatos.pedirIdLibro(scan);
					libro = gestor.getLibro(idLibro);
					Visor.mostrarLibro(libro);
					FormularioDeDatos.modificarDatos(libro, scan);
					gestor.modificarLibro(libro);
					System.out.println("Libro modificado");
					
					break;
				case Menu.VER_LIBROS:
					Visor.mostrarLibros(gestor.getLibros());
					
					break;
				case Menu.ELIMINAR_LIBRO:
					gestor.eliminarLibro(FormularioDeDatos.pedirIdLibro(scan));
					System.out.println("Libro eliminado");
					break;
				case Menu.SALIR:
					break;
			}
			
			
		}while(opcion!=Menu.SALIR);
	}

}
