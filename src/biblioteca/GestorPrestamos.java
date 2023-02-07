package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorPrestamos {
	public static void run(Scanner scan) throws SQLException {
	
	int opcion;
	Prestamo prestamo = new Prestamo();
	GestorBBDD gestor =  new GestorBBDD();
	
	do {
		
		Menu.mostrarMenuPrestamo();
		opcion=Integer.parseInt(scan.nextLine());
		switch(opcion) {
		case Menu.REALIZAR_PRESTAMO:
			prestamo = FormularioDeDatos.getDatosDePrestamo(scan);
			gestor.realizarPrestamo(prestamo);
			break;
			
		case Menu.DEVOLVER_PRESTAMO:
			
			gestor.devolverPrestamo(FormularioDeDatos.pedirIdLibro(scan));
			break;
		}
		
	}while(opcion !=Menu.SALIR);

	
	}
}

