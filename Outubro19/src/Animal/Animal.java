package Animal;

public class Animal {
	
	private String nome, sexo,raca;

	public Animal(String nome, String sexo, String raca) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void dormir() {
		System.out.println("dormir");
	}
	public void caminhar() {
		System.out.println("caminhar");
	}
	public void coorer() {
		System.out.println("coorer");
	}
	public void emitirSom() {
	System.out.println("<<emitirSom>>\n");
}}
