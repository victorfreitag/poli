package Funcionario;

public class Horista extends Funcionario{
	
	public Horista(int id, int matricula, String nome, String telefone, String endereco) {
		super(id, matricula, nome, telefone, endereco);
	}
	
	@Override
	public double calculaSalario(double hr, double val,double imp){
		return hr*val;
	}

}
