package som;

import Animal.Animal;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, String sexo,String raca) {
		super(nome,sexo,raca);
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("Cachorro Late\n");
	}
}
