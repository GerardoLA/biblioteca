package biblioteca;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorBBDD extends Conector{
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
	public Libro getLibro(int id) throws SQLException {
		super.conectar();
		String sentenciaSelect= "SELECT * FROM libros WHERE id=?";
		pst.setInt(1, id);
		Libro libro = new Libro();
		ResultSet resultado = pst.executeQuery(sentenciaSelect);
		libro.setId(resultado.getInt(id));
		libro.setTitulo(resultado.getString("titulo"));
		libro.setAutor(resultado.getString("autor"));
		libro.setNum_pag(resultado.getInt("num_pag"));
		
		return libro;
	
	}
	
	public void modificarLibro(Libro libro) throws SQLException {
		super.conectar();
		pst = con.prepareStatement("UPDATE libros set titulo = ?, autor = ?, num_pag =?");
		pst.setString(1, libro.getTitulo());
		pst.setString(2, libro.getAutor());
		pst.setInt(3, libro.getNum_pag());
		
		pst.executeUpdate();
		super.cerrar();
	}
	
	public ArrayList<Libro> getLibros() throws SQLException{
		ArrayList<Libro>libros=new ArrayList<Libro>();
		String senteciaSelect= "Select * from libros";
		
		ResultSet resultado = pst.executeQuery();
		
		while(resultado.next()) {
			Libro libro = new Libro();
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getString("titulo"));
			libro.setAutor(resultado.getString("autor"));
			libro.setNum_pag(resultado.getInt("num_pag"));
			libros.add(libro);
		}
		
		return libros;
		
	}
	
	
}

