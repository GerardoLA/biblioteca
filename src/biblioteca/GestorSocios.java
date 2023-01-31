package biblioteca;

import java.util.Scanner;

public class GestorSocios {
	public static void run(Scanner scan) {
		int opcion;
		do {
			Menu.mostrarMenusocio();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_SOCIO:
				break;
			case Menu.MODIFICAR_SOCIO:
				break;
			case Menu.VER_SOCIO:
				break;
			case Menu.ELIMINAR_SOCIO:
				break;
			case Menu.SALIR:
				break;
			}
			
			
		}while(opcion!=Menu.SALIR);
		
	}

}
