package Familia51;

public class Funcionarios {
	
	//declara��o dos atributos da classe
	
	private String nomeFuncionario;
	private String funcao;
	private String turno; 
	private float salario; 
	
	//declara��o m�todo construtor
	
	public Funcionarios(String nomeFuncionario,String funcao,String turno,float salario)
	{
		
		this.nomeFuncionario = nomeFuncionario;
		this.funcao = funcao;
		this.turno = turno;
		this.salario = salario;
	}	
		
	//declara��o dos m�todos gerais
		
		
	

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
		System.out.println("\nNome: "+nomeFuncionario+ " fun��o: " +funcao+ " Turno:" +turno+" sal�rio: "+salario);
	}
	

}
