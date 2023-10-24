package Funcionario;

public class PessoaJuridica extends Funcionario{

	public PessoaJuridica(int id, int matricula, String nome, String telefone, String endereco) {
		super(id, matricula, nome, telefone, endereco);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculaSalario(double hr, double val,double imp){
		return hr*val-imp;
	}
	

}
