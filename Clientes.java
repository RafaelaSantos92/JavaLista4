package Familia51;

public class Clientes {
	
	//atributos da classe
	
	private String nomeCliente;
	private int idade;
	private String end;
	private String email;
	
	
	//método construtor
	
	public Clientes (String nomeCliente, int idade, String end, String email)
	{
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.end = end;
		this.email = email;
		
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public int getidade() {
		return idade;
	}


	public void setidade(int idade) {
		this.idade = idade;
	}


	public String getEnd() {
		return end;
	}


	public void setEnd(String end) {
		this.end = end;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do cliente:"+nomeCliente);
		System.out.println("\nIdade: "+idade);
		System.out.println("\nEndereço: "+end);
		System.out.println("\nE-mail: "+email);
	}
	

}
