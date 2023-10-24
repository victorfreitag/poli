package LoboInterface;

public class Lobo implements Animal{
	
	@Override
	public void dormir() {
		System.out.println("Lobo dormir\n");
	}
	@Override
	public void caminhar() {
		System.out.println("Lobo caminhar\n");
	}
	@Override
	public void correr() {
		System.out.println("Lobo correr\n");
	}
	@Override
	public void emitirSom() {
		System.out.println("Lobo uiva\n");
	}
}
