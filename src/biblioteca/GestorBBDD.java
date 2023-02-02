package biblioteca;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorBBDD extends Conector{
	PreparedStatement pst;
	
	public void insertarSocio(Socio socio) throws SQLException {
		super.conectar();
		pst = con.prepareStatement("INSERT INTO VALUES(null,?,?;?,?,?)");
		
		pst.setString(1,socio.getNombre());
		pst.setString(2,socio.getDireccion());
		pst.setString(3,socio.getPoblacion());
		pst.setString(4,socio.getProvincia());
		pst.setString(5,socio.getDni());
		
		pst.execute();
		super.cerrar();	
	}
	
	public void eliminarSocio(int id) throws SQLException {
		super.conectar();
		pst= con.prepareStatement("DELETE from socios where id=?");
		pst.setInt(1, id);
		super.cerrar();
	}
	
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
		pst.execute();
		
		super.cerrar();

}
	public Libro getLibro(int id) throws SQLException {
		super.conectar();
		String sentenciaSelect= "SELECT * FROM libros WHERE id=?";
		pst= con.prepareStatement(sentenciaSelect);
		pst.setInt(1, id);
		Libro libro = new Libro();
		ResultSet resultado = pst.executeQuery(sentenciaSelect);
		libro.setId(resultado.getInt(id));
		libro.setTitulo(resultado.getString("titulo"));
		libro.setAutor(resultado.getString("autor"));
		libro.setNum_pag(resultado.getInt("num_pag"));
		super.cerrar();
		
		return libro;
		
	}
	
	public Socio getSocio(int id) throws SQLException {
		super.conectar();
		String sentenciaSelect = "SELECT * FROM socios WHERE id=?";
		pst= con.prepareStatement(sentenciaSelect);
		pst.setInt(1, id);
		Socio socio = new Socio();
		ResultSet resultado = pst.executeQuery(sentenciaSelect);
		socio.setId(resultado.getInt(id));
		socio.setNombre(resultado.getString("nombre"));
		socio.setDireccion(resultado.getString("direccion"));
		socio.setPoblacion(resultado.getString("poblacion"));
		socio.setProvincia(resultado.getString("provincia"));
		
		socio.setDni(resultado.getString("dni"));
		super.cerrar();
		
		return socio;
	}
	
	public void modificarLibro(Libro libro,int idLibro) throws SQLException {
		super.conectar();
		pst = con.prepareStatement("UPDATE libros set titulo = ?, autor = ?, num_pag =? where id=?");
		pst.setString(1, libro.getTitulo());
		pst.setString(2, libro.getAutor());
		pst.setInt(3, libro.getNum_pag());
		pst.setInt(4, idLibro);
		pst.executeUpdate();
		super.cerrar();
	}
	
	public void modificarSocio(Socio socio) throws SQLException {
		super.conectar();
		pst = con.prepareStatement("UPDATE socios set nombre=?,direccion=?,poblacion=?,provincia=?,dni=?");
		pst.setString(1, socio.getNombre());
		pst.setString(2, socio.getDireccion());
		pst.setString(3, socio.getPoblacion());
		pst.setString(4, socio.getProvincia());
		super.cerrar();
	}
	
	public ArrayList<Libro> getLibros() throws SQLException{
		ArrayList<Libro>libros=new ArrayList<Libro>();
		super.conectar();
		String sentenciaSelect= "Select * from libros";
		pst= con.prepareStatement(sentenciaSelect);
		ResultSet resultado = pst.executeQuery();
		
		while(resultado.next()) {
			Libro libro = new Libro();
			libro.setId(resultado.getInt("id"));
			libro.setTitulo(resultado.getString("titulo"));
			libro.setAutor(resultado.getString("autor"));
			libro.setNum_pag(resultado.getInt("num_pag"));
			libros.add(libro);
		}
		super.cerrar();
		return libros;
		
	}
	
	
}

