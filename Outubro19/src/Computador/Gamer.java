package Computador;

public class Gamer implements Computador{
	
	@Override
	public void ligar() {
		System.out.println("Ligando PC Gamer\n");
	}
	@Override
	public void reiniciar() {
		System.out.println("Reiniciando PC Gamer\n");
	}
	@Override
	public void desligar() {
		System.out.println("Desligando PC Gamer\n");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("Carregando sistem PC Gamer\n");
	}

}
