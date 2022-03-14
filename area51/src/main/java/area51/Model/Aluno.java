package area51.Model;

public class Aluno {
	
	private int id;
	private String nome;
	private String cpf;
	private String sexo;
	private int idTreino;
	private String email;
	private Treino treino;
	
	public Aluno() {}
	
	public Aluno(int id, String nome, String cpf, String sexo, int idTreino, Treino treino) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idTreino = idTreino;
		this.treino = treino;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdTreino() {
		return idTreino;
	}

	public void setIdTreino(int idTreino) {
		this.idTreino = idTreino;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Treino getTreino() {
		return treino;
	}

	public void setTreino(Treino treino) {
		this.treino = treino;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", sexo=" + sexo + ", idTreino=" + idTreino
				+ ", email=" + email + ", treino=" + treino + "]";
	}


	
	
}
