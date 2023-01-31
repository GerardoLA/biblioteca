package biblioteca;



public class Menu {
	
	
	public static final int GESTIONAR_LIBROS = 1;
	public static final int GESTIONAR_SOCIOS = 2;
	public static final int GESTIONAR_PRESTAMOS = 3;
	
	public static final int SALIR = 0;
	
	public static final int INSERTAR_LIBRO = 1;
	public static final int ELIMINAR_LIBRO = 2;
	public static final int MODIFICAR_LIBRO = 3;
	public static final int VER_LIBRO = 4 ;
	
	public static final int INSERTAR_SOCIO = 1;
	public static final int ELIMINAR_SOCIO = 2;
	public static final int MODIFICAR_SOCIO = 3;
	public static final int VER_SOCIO = 4 ;
	
	
	
	public static void mostrarmenuPrincipal() {
		System.out.println("Menu Principal");
		System.out.println("1.- Gestionar Libros");
		System.out.println("2.- Gestionar Socios");
		System.out.println("3.- Gestionar Prestamos");
	}
	
	public static void mostrarmenuLibros() {
		System.out.println("Menu libros");
		System.out.println("1.- Insertar Libros");
		System.out.println("2.- Eliminar Socios");
		System.out.println("3.- Ver libro");
	}
		
	public static void mostrarMenusocio(){
	System.out.println("Ver socios");	
	System.out.println("1.- Insertar socios");
	System.out.println("2.- Eliminar Socios");
	System.out.println("3.- Ver socios");
}
	

	
	public static void  mostrarMenuPrestamo() {
		System.out.println("Menu préstamos");
			System.out.println(" 1.- Realizar préstamo");
			;
		}
}
		
	
	

