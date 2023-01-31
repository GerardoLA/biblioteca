package biblioteca;

import java.util.Scanner;

public class GestorLibros {
	Scanner scan = new Scanner (System.in);
	public static void run(Scanner scan) {
		int opcion;
		do {
			Menu.mostrarmenuLibros();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_LIBRO:
				break;
			case Menu.MODIFICAR_LIBRO:
				break;
			case Menu.VER_LIBRO:
				break;
			case Menu.ELIMINAR_LIBRO:
				break;
			case Menu.SALIR:
				break;
			}
			
			
		}while(opcion!=Menu.SALIR);
	}

}
