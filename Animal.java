package Familia51;

public abstract class Animal {
	
	private String especie;
		
	public Animal(String especie) 
	{
		this.setEspecie(especie);
	}
	abstract public void nome(String nomeAnimal);
	abstract public void idade(int idadeAnimal);
	abstract public void som(String somAnimal);
	
	
	public String getEspecie()
	{
			
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	

}
