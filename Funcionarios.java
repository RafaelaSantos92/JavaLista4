package Familia51;

public class Funcionarios {
	
	//declaração dos atributos da classe
	
	private String nomeFuncionario;
	private String funcao;
	private String turno; 
	private float salario; 
	
	//declaração método construtor
	
	public Funcionarios(String nomeFuncionario,String funcao,String turno,float salario)
	{
		
		this.nomeFuncionario = nomeFuncionario;
		this.funcao = funcao;
		this.turno = turno;
		this.salario = salario;
	}	
		
	//declaração dos métodos gerais
		
		
	

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+nomeFuncionario+ " função: " +funcao+ " Turno:" +turno+" salário: "+salario);
	}
	

}
