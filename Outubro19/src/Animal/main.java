package Animal;

import som.Cachorro;
import som.Gato;
import som.Leao;
import som.Lobo;
import som.Tigre;

public class main {
public static void main(String[]args) {
	
	Animal animal = new Animal("Amora","Femea","Labrador");
	animal.emitirSom();
	
	Gato gato = new Gato("Docinho","Femea","Gato do Mato");
	gato.emitirSom();
	
	Cachorro ca = new Cachorro("Docinho","Femea","Labrador");
	ca.emitirSom();
	
	Tigre ti = new Tigre("Marcelo","Macho","Tigre de bengala");
	ti.emitirSom();
	
	Leao le = new Leao("Matador","Femea","Gato do Mato");
	le.emitirSom();
	
	Lobo lo = new Lobo("Pedro","Macho","Lobo da montanha");
	lo.emitirSom();
}
}