package biblioteca;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class GestorBBDD extends Conector{
	Scanner scan=new Scanner(System.in);
	PreparedStatement pst;
	
	public void insertarLibro(Libro libro) throws SQLException{
		super.conectar();
		pst = con.prepareStatement("INSERT INTO libros values(null,?,?,?)");
		
		pst.setString(1,libro.getTitulo());
		pst.setString(2, libro.getTitulo());
		pst.setInt(3, libro.getNum_pag());
		
		pst.execute();
		super.cerrar();
		}
	
	public void eliminarLibro(int id) throws SQLException {
		super.conectar();
		pst= con.prepareStatement("DELETE from libros where id=?");
		
		pst.setInt(1, id);
		super.cerrar();

}
	public void getLibro(int id) throws SQLException {
		super.conectar();
		String senteciaSelect= "SELECT* from libros where id=?";
		pst.setInt(1, id);
		Libro libro = new Libro();
		ResultSet resultado = pst.executeQuery(sentenciaSelect);
		
	}
}
