package Familia51;

public class Cachorro extends Animal {
	
	private String acao;
	
	
	public Cachorro(String nome,int idade, String som, String acao)
	{
		
		super(nome,idade,som);
		this.acao = acao;
		
	}


	public String getAcao() {
		return acao;
	}


	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	public void imprimirCaracteristicas()
	{
		System.out.println("\nAnimal: "+getNome()+"\nidade: "+getIdade()+"\nSom emitido: "+getSom()+"\nAção esperada: "+acao);
	}

}
