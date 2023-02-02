package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorBiblioteca {

	public static void run(Scanner scan) throws SQLException {
		int opcion_menu;

		do {
			Menu.mostrarmenuPrincipal();
			opcion_menu = Integer.parseInt(scan.nextLine());
			switch (opcion_menu) {
			
			
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(scan);
				break;
				
			case Menu.GESTIONAR_SOCIOS:
				GestorSocios.run(scan);
				break;
				
			case Menu.GESTIONAR_PRESTAMOS:
				
				break;
			case Menu.SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != 0);
		scan.close();
		
		
	}

}
