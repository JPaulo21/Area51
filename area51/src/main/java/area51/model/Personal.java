package area51.model;

public class Personal {
	
	private int id;
	private String nome;
	private String cref;
	private char sexo;
	
	public Personal() {
		
	}
	
	public Personal(int id, String nome, String cref, char sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cref = cref;
		this.sexo = sexo;
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

	public String getCref() {
		return cref;
	}

	public void setCref(String cref) {
		this.cref = cref;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
