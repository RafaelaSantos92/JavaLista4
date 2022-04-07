package Familia51;

public class Preguica extends Animal {
	
	public String acao;
	
	public Preguica(String nome,int idade,String som,String acao)
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
