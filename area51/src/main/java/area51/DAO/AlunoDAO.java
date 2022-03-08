package area51.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import area51.model.Aluno;

public class AlunoDAO {
	
	public void cadastrar(Aluno aluno) {
		
		String sql = "";
		
		try {
			Connection c = Conexao.getConnection();
			PreparedStatement p = c.prepareStatement(sql);
			
			p.setString(0, sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
