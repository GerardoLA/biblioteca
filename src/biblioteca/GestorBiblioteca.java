package biblioteca;

import java.util.Scanner;

public class GestorBiblioteca {
	Scanner scan= new Scanner (System.in);
	public  void run() {
		int opcion_menu;

		do {

			switch (opcion_menu) {
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(scan);
				break;
			case Menu.GESTIONAR_SOCIOS:
				GestorSocio
				System.out.println("segunda opcion seleccionada\n");
				break;
			case OPCION_TRES:
				System.out.println("tercera opcion seleccionada\n");
				break;
			case SALIR:
				System.out.println("ADIOS");
				break;
			default:
				System.out.println("Opcion incorrecta!");
			}

		} while (opcion_menu != SALIR);
		scan.close();
		
		
	}

}
