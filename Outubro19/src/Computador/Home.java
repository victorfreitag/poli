package Computador;

public class Home implements Computador{

	@Override
	public void ligar() {
		System.out.println("Ligando PC Casa\n");
	}
	@Override
	public void reiniciar() {
		System.out.println("Reiniciando PC Casa\n");
	}
	@Override
	public void desligar() {
		System.out.println("Desligando PC Casa\n");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("Carregando sistem PC Casa\n");
	}
}
