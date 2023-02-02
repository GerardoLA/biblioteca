package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class GestorSocios {
	public static void run(Scanner scan) throws SQLException {
		int opcion;
		Socio socio = new Socio();
		GestorBBDD gestor = new GestorBBDD();
		
		
		do {
			Menu.mostrarMenusocio();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_SOCIO:
				
				socio = FormularioDeDatos.pedirDatos(scan);
				gestor.insertarSocio(socio);
				System.out.println("Socio nuevo añadido");
				
				break;
				
			case Menu.MODIFICAR_SOCIO:
				
				
				break;
			case Menu.VER_SOCIO:
				break;
			case Menu.ELIMINAR_SOCIO:
				
				gestor.eliminarSocio(FormularioDeDatos.pedirIdSocio(scan));
				System.out.println("Socio eliminado");
				
				break;
			case Menu.SALIR:
				break;
			}
			
			
		}while(opcion!=Menu.SALIR);
		
	}

}
	