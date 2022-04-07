package Familia51;

public class TesteClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando objeto da classe Clientes
		
		Clientes cliente1 = new Clientes(" Rafaela Pereira dos Santos ",29,"Rua Alemanha, 61, Imbiribeira "," santos.rafaela2991@gmail.com");
		cliente1.imprimirInfo();
		
		
		
		System.out.println("\n*  Alteração de endereço  *");
		
		
		
		cliente1.setEnd("Rua Jamaica, 30, Imbiribeira");
		cliente1.imprimirInfo();
		
		
		
		
	}

}
