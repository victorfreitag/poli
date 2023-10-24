package som;

import Animal.Animal;

public class Lobo extends Animal {
	
	public Lobo(String nome, String sexo,String raca) {
		super(nome,sexo,raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Lobo uiva\n");
	}
}
