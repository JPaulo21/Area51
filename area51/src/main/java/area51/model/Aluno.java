package area51.model;

public class Aluno {
	
	private int id;
	private String nome;
	private String cpf;
	private String sexo;
	private Treino treino;
	
	public Aluno() {}

	public Aluno(int id, String nome, String cpf, String sexo, Treino treino) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.sexo=sexo;
		this.treino=treino;
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

	public Treino getTreino() {
		return treino;
	}

	public void setTreino(Treino treino) {
		this.treino = treino;
	}
	
	
}
