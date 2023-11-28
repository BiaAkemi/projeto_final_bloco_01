package biblioteca;
import java.util.InputMismatchException;
import java.util.Scanner;

import biblioteca.controller.LivrosController;
import biblioteca.model.Serie;
import biblioteca.model.Unico;

public class Menu {

	public static void main(String[] args) {
		
		String titulo, escritore, serie;
		int op, id, tipo, volume;
		float preco;
		
		Scanner leia = new Scanner (System.in);
		LivrosController livros = new LivrosController();


		while (true) {
			
			System.out.println("📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕");
			System.out.println("                                                    ");
			System.out.println("              LIVRARIA DA BIA                       ");
			System.out.println("                                                    ");
			System.out.println("📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕");
			System.out.println("                                                    ");

			System.out.println("      1 - Adicionar Livro                            ");
			System.out.println("      2 - Procurar Livro                             ");
			System.out.println("      3 - Listar Livros                              ");
			System.out.println("      4 - Atualizar Livro                            ");
			System.out.println("      5 - Remover Livro                              ");
			System.out.println("      6 - Sair do Menu                               ");
						
			try {
				op = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				op=0;
			}

			
			if(op == 6) {
				System.out.println(" Você saiu da livraria! ");
				leia.close();
				System.exit(0);
			}
			
 			switch (op) {
 				
 			case 1:
 				System.out.println("Adicionar Livro \n\n");
 				leia.nextLine(); 
 				System.out.println("Digite o Nome do Livro: ");
 				titulo = leia.nextLine();
 				
 				System.out.println("Quem escreveu? ");
 				escritore = leia.nextLine();
 				
 				System.out.println("Qual o valor?");
 				preco = leia.nextInt();
 				
 				id = livros.gerarNumero();
 				
 				
 				do {
 					System.out.println("É livro 1 - único ou 2 - Série?");
 					tipo = leia.nextInt();
 					
 				} while (tipo < 1 && tipo > 2);
 				
 				switch(tipo) {
 				
 				case 1:
 					livros.cadastrar(new Unico(id, titulo, escritore, preco));
 					System.out.println("Livro único adicionado com sucesso!");
 					
 					break;
 					
 				case 2:
 					leia.nextLine();
 					
 					System.out.println("De qual série é o livro? ");
 					serie = leia.nextLine();
 		
 					System.out.println("Qual é o volume do Livro na Série? (1, 2, 3...)");
 					volume = leia.nextInt();
 					
 					livros.cadastrar(new Serie(id, titulo, escritore, preco, serie, volume));
 					System.out.println("Livro de série adicionado com sucesso!");
 					break;
 				} 
 				break;
 				
 			case 2:
 				System.out.println("Procurar Livro: \n\n");
 				System.out.println("Digite o número do ID do livro: ");
				id = leia.nextInt();
				
				livros.procurarId(id);
 				break;
 				
 			case 3:
 				System.out.println("\t\tLista de todos os Livros:");
 				livros.listarTodos();
 				
 				break;
 			
 			case 4:
 				System.out.println("Atualizar Livro: \n\n");
 				
 				System.out.println("Digite o ID do Livro:");
 				id = leia.nextInt();
 				
 				if (livros.buscarNaCollection(id) != null) {
					
					System.out.println("Digite o Nome do Livro: ");
					titulo = leia.nextLine();
					
					leia.next();
					
					System.out.println("Quem escreveu? ");
					leia.skip("\\R?");
					escritore = leia.nextLine();
						
					System.out.println("Qual o valor?");
					preco = leia.nextFloat();
					
					System.out.println("É livro 1 - único ou 2 - Série?");
					tipo = leia.nextInt();
					
					switch(tipo) {
						case 1 -> {
							livros.atualizar(new Unico(livros.gerarNumero(), titulo, escritore, preco));
		 					System.out.println("Livro único alterado com sucesso!");
						}
						case 2 -> {
							leia.next();

		 					System.out.println("De qual série é o livro? ");
		 					serie = leia.nextLine();
		 					
		 					System.out.println("Qual é o volume do livro? ");
		 					volume = leia.nextInt();

		 					livros.atualizar(new Serie(livros.gerarNumero(), titulo, escritore, preco, serie, volume));
		 					System.out.println("Livro de série adicionado com sucesso!");
		 					break;
						}
						default ->{
							System.out.println("Tipo de conta inválido!");
						}
					}
					
				}else
					System.out.println("\nID de livro não encontrado!");
 				
 				break;
 				
 			case 5:
 				System.out.println("Remover Livro: \n\n");
 				break;				

 			}
		}
	}

}
