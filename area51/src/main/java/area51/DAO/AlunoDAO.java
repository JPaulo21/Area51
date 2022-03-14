package area51.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import area51.Model.Aluno;

public class AlunoDAO {
	
	Connection c;
	
	public void cadastrar(Aluno aluno) {
		
		String sql = "INSERT INTO ALUNO (nome, cpf, sexo) values (?, ?, ?)";
		
		try {
			 c = Conexao.getConnection();
			PreparedStatement p = c.prepareStatement(sql);
			
			p.setString(0, sql);
			
			
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	} 
	
	public Aluno buscarAlunoPorCPF(String cpf) {
		
		String sql = "SELECT * FROM ALUNO WHERE = ?";
		Aluno aluno = new Aluno();
		
		c = Conexao.getConnection();
		try {
			PreparedStatement p = c.prepareStatement(sql);
			p.setString(1, cpf);
			
			ResultSet r = p.executeQuery();
			p.close();
			
			aluno.setId(r.getInt("id"));
			aluno.setNome(r.getString("nome"));
			aluno.setCpf(r.getString("cpf"));
			aluno.setSexo(r.getString("sexo"));
			aluno.setIdTreino(r.getInt("idTreino"));
			aluno.setEmail(r.getString("email"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aluno;
	}
	
	public boolean buscarCpfAluno(String cpf) {
		
		String sql = "SELECT CPF FROM ALUNO WHERE = ?";
		boolean b = false;
		
		c = Conexao.getConnection();
		try {
			PreparedStatement p = c.prepareStatement(sql);
			p.setString(1, cpf);
			
			ResultSet r = p.executeQuery();
			p.close();
			
			b = r.getString("cpf").isEmpty();	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}
	

}
