package Familia51;

public class TesteFuncionarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//instanciando um objeto da classe Funcionarios
		
		Funcionarios Funcionario1 = new Funcionarios("Claudia","Supervisora","Manh�/Tarde",4800);
		Funcionarios Funcionario2 = new Funcionarios("Angelica","Atendente","Tarde/Noite",2300);
		Funcionarios Funcionario3 = new Funcionarios("Jhonn", "Atendente","Tarde/Noite",2300);
		
		Funcionario1.imprimirInfo();
		Funcionario2.imprimirInfo();
		Funcionario3.imprimirInfo();
		
		
		System.out.println("\n* Funcion�rio 3 - Altera��o de fun��o e sal�rio * ");
		
		Funcionario3.setFuncao("Supervisor");
		Funcionario3.setSalario(4800);
		
		Funcionario3.imprimirInfo();
		
		
	}

}
