package som;

import Animal.Animal;

public class Leao extends Animal{
	
	public Leao(String nome, String sexo,String raca) {
		super(nome,sexo,raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Leao rugindo\n");
	}
}
