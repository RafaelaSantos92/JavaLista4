package Familia51;

public class TesteCachorro {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro ("Cachorro",8,"Latido","correr");
		Preguica preguica = new Preguica ("Pregui�a",9,"som nasal","Subir em arvores");
		Cavalo cavalo = new Cavalo("Cavalo",6,"relinchado","correr");
		
		cachorro.imprimirCaracteristicas();
		preguica.imprimirCaracteristicas();
		cavalo.imprimirCaracteristicas();
		
		
	}

}
