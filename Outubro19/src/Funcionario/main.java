package Funcionario;

public class main {
public static void main(String[] args) {
Jornada jor = new Jornada(1, 15, "Victor Freitag","15999996123", "Rua Francisco Mendes");
Horista hor = new Horista(2, 16, "Lemuel Zunin", "15991345687", "Rua Paulo Andrade");
PessoaJuridica pes= new PessoaJuridica(3, 16, "Luis Fernando", "15996317887", "Pito Acesso");

System.out.println(jor.getId());
System.out.println(jor.getMatricula());
System.out.println(jor.getNome());
System.out.println(jor.getTelefone());
System.out.println(jor.getEndereco());
System.out.println("Seu salario é de:"+jor.calculaSalario(150, 10, 0)+"\n");

System.out.println(hor.getId());
System.out.println(hor.getMatricula());
System.out.println(hor.getNome());
System.out.println(hor.getTelefone());
System.out.println(hor.getEndereco());
System.out.println("Seu salario é de:"+hor.calculaSalario(5,10,0)+"\n");

System.out.println(pes.getId());
System.out.println(pes.getMatricula());
System.out.println(pes.getNome());
System.out.println(pes.getTelefone());
System.out.println(pes.getEndereco());
System.out.println("Seu salario é de:"+pes.calculaSalario(10, 5, 100)+"\n");
	
	
	
	
	
	
	

}
}