package Familia51;

public class Cavalo extends Animal {
	
	public Cavalo()
	{
		super("especie: Cavalo");
		
	}
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nNome do cavalo: "+nomeAnimal);
	}
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nIdade do cavalo: "+idadeAnimal);
	}
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nSom emitido pelo cavalo: "+somAnimal);
	}
	public void caracteristica()
	{
		System.out.println("\nUma das caracteristicas do cavalo é correr!");
	}
	
}
