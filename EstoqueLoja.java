package Familia51;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		String produto,produtos,verificar,atualizar;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\nESTOQUE");
			System.out.println("\n1 - ADICIONAR PRODUTO \n2 - REMOVER PRODUTO \n3 - ATUALIZAR ESTOQUE \n4 - VERIFICAR ESTOQUE DISPONIVEL");
			System.out.println("\nESCOLHA UMA OPÇÃO: ");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o  produto que deseja adicionar: ");
				produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja remover: ");
				produtos = leia.nextLine();
				if(produtos.contains(produtos))
				{
					estoque.remove(produtos);
				}
				else
				{
					System.out.println("\nProduto indisponível!!!");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja atualizar: ");
				verificar = leia.next();
				System.out.println("\nDigite o produto que substituirá: "+verificar+ " : ");
				atualizar = leia.next();
				if(estoque.contains(verificar))
				{
					estoque.remove(verificar);
					estoque.add(atualizar);
				}
				else
				{
					System.out.println("\nItem indisponível!!!");
				}
				break;
			case 4:
				leia.nextLine();
				System.out.println("\nESTOQUE ATUALIZADO: ");
				System.out.println(estoque);
				break;
			default:
				if(op<0 || op>4)
				{
					System.out.println("\nOpção inválida. Digite uma opção: ");
				}
			}
			
			
			
		}
		while(op!=0);

	}

}
