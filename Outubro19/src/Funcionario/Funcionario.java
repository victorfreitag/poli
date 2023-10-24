package Funcionario;

public class Funcionario {
	private int id,matricula;
	private String nome, telefone,endereco;
	public Funcionario(int id, int matricula, String nome, String telefone, String endereco) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	} 
	
	public double calculaSalario(double hr, double val,double imp) {
		return hr*val-imp;
	}
	

}
