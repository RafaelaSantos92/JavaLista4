package Familia51;

public class Preguica extends Animal {
	
	public Preguica()
	{
		super("especie: Preguiça");
		
	}
	@Override
	public void nome(String nomeAnimal)
	{
		System.out.println("\nNome da preguiça: "+nomeAnimal);
	}
	@Override
	public void idade(int idadeAnimal)
	{
		System.out.println("\nIdade da preguiça: "+idadeAnimal);
	}
	@Override
	public void som(String somAnimal)
	{
		System.out.println("\nSom emitido pela preguiça: "+somAnimal);
	}
	public void caracteristica()
	{
		System.out.println("\nUma das caracteristicas da preguiça é subir em arvores!");
	}
	
}
