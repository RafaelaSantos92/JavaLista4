package Familia51;

public class Cachorro extends Animal {
	
	public Cachorro()
	{
		super("especie: Cachorro");
		
	}
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nNome do cachorro: "+nomeAnimal);
	}
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nIdade do cachorro: "+idadeAnimal);
	}
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nSom emitido pelo cachorro: "+somAnimal);
	}
	public void caracteristica()
	{
		System.out.println("\nUma das caracteristicas do cachorro é correr!");
	}
	
}
