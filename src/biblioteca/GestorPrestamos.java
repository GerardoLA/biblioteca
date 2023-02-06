package biblioteca;

import java.util.Scanner;

public class GestorPrestamos {
	public static void run(Scanner scan) {
	
	int opcion=0;
	Prestamo prestamo = new Prestamo();
	GestorBBDD gestor =  new GestorBBDD();
	
	do {
		
		Menu.mostrarMenuPrestamo();
		opcion=Integer.parseInt(scan.nextLine());
		switch(opcion) {
		case (Menu.REALIZAR_PRESTAMO):
			
		}
		
	}while(opcion !=Menu.SALIR);

	
	}
}

