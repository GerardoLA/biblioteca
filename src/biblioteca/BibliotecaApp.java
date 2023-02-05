package biblioteca;

import java.sql.SQLException;
import java.util.Scanner;

public class BibliotecaApp {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner (System.in);
		GestorBiblioteca.run(scan);
		
	}

}

