package biblioteca;
import java.util.Scanner;
import biblioteca.model.Serie;
import biblioteca.model.Unico;

public class Menu {

	public static void main(String[] args) {
		
		// Teste série
		/* Serie s1 = new Serie ("Percy Jackson", 01, "Rick Riordan", 48.0f, "Percy Jackson e os Olimpianos", 1);
		s1.visualizar();*/
		
		// Teste Li vroUnico
		/*Unico u1 = new Unico ("A bolsa amarela", 02, "Lygia Bojunga", 34.65f);
		u1.visualizar();*/
		
		int op;
		
		Scanner leia = new Scanner (System.in);

		while (true) {
			
			System.out.println("📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕");
			System.out.println("                                                    ");
			System.out.println("              LIVRARIA DA BIA                       ");
			System.out.println("                                                    ");
			System.out.println("📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕📚📕");
			System.out.println("                                                    ");

			System.out.println("      1 - Adicionar Livro                            ");
			System.out.println("      2 - Procurar Livro                             ");
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
 				break;
 				
 			case 2:
 				System.out.println("Procurar Livro: \n\n");
 				break;
 			
 			case 3:
 				System.out.println("Atualizar Livro: \n\n");
 				break;
 				
 			case 4:
 				System.out.println("Remover Livro: \n\n");
 				break;				

 			}
		}
	}

}
