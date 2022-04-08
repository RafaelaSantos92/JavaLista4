package Familia51;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro();
		Preguica preguica = new Preguica();
		Cavalo cavalo = new Cavalo();
		
		Animal especie = null;
		
		int x = 0;
		
		do
		{
			System.out.println("\nQual o tipo do seu animal? \n\n"
					+ "1 - CACHORRO\n2 - PREGUIÇA\n3 - CAVALO\n");
			x = leia.nextInt();
			
			if(x==1)
			{
				especie = cachorro;
				
				System.out.println("\nQuantos anos seu cachorro tem?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nQual o nome do seu cachorro? ");
				String nome = leia.nextLine();
				leia.nextLine();
				System.out.println("\nQue som o seu cachorro emite? ");
				String som = leia.next();
				
				
				System.out.println("\n***************************************************");
				cachorro.nome(nome);
				cachorro.idade(idade);
				cachorro.som(som);
				cachorro.caracteristica();
			}
			else if(x==2)
			{
                		especie = preguica;
				
				System.out.println("\nQuantos anos sua preguiça tem?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nQual o nome da sua preguiça? ");
				String nome = leia.nextLine();
				leia.nextLine();
				System.out.println("\nQue som a sua preguiça emite? ");
				String som = leia.next();
				
				System.out.println("\n***************************************************");
				preguica.nome(nome);
				preguica.idade(idade);
				preguica.som(som);
				preguica.caracteristica();
			}
			else if(x==3)
			{
				especie = cavalo;
					
				System.out.println("\nQuantos anos seu cavalo tem?");
				int idade = leia.nextInt();
				leia.nextLine();
				System.out.println("\nQual o nome do seu cavalo? ");
				String nome = leia.nextLine();
				leia.nextLine();
				System.out.println("\nQue som o seu cavalo emite? ");
				String som = leia.next();
					
				System.out.println("\n***************************************************");
				cavalo.nome(nome);
				cavalo.idade(idade);
				cavalo.som(som);
				cavalo.caracteristica();
					
			}
			else
			{
				System.out.println("\nOpção inválida!!!");
			}
		}
		while(x<=0 || x>=4);
		
		
	}

}
