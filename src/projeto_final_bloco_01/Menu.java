package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int op;
		
		Scanner leia = new Scanner (System.in);

		while (true) {
			
			System.out.println("📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕");
			System.out.println("                                                    ");
			System.out.println("              LIVRARIA DA BIA                       ");
			System.out.println("                                                    ");
			System.out.println("📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕");
			
			System.out.println("\n      1 - Adicionar Livro                            ");
			System.out.println("      2 - Procurar Livro (ID)                        ");
			System.out.println("      3 - Atualizar Livro                            ");
			System.out.println("      4 - Remover Livro                              ");
			System.out.println("      5 - Sair do Menu                               ");
			
			op = leia.nextInt();
			
			if(op == 9) {
				System.out.println(" Você saiu da livraria! ");
				leia.close();
				System.exit(0);
			}
			
 			switch (op) {
 				
 			case 1:
 				System.out.println("Adicionar Livro: \n\n");
 			}
		}
	}

}
