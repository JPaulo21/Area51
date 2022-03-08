package area51.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import area51.model.Exercicio;

public class ExercicioDAO {
	
	public List<Exercicio> obterClassificacao(String tipo){
		
		Connection c = Conexao.getConnection();
		
		String sql = "SELECT * FROM exercicios WHERE tipo=?";
		List<Exercicio> exercicios = new ArrayList<Exercicio>();
	
		try {
			PreparedStatement p = c.prepareStatement(sql);
			
			p.setString(1, tipo);
			
			ResultSet r = p.executeQuery();	
			
			while(r.next()) {
				
				Exercicio e = new Exercicio();
				e.setId(r.getInt("Id"));
				e.setNome(r.getString("Nome"));
				e.setTipo(r.getString("Tipo"));
				
				exercicios.add(e);
			}
			
			p.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return exercicios;
	} 

}
