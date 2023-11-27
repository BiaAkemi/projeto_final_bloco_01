package biblioteca.controller;
import java.util.ArrayList;

import biblioteca.model.Livro;
import biblioteca.repository.LivrosRepository;

public class LivrosController implements LivrosRepository {

	private ArrayList <Livro> listaLivros = new ArrayList <Livro>();
	int numero = 0;
	
	// Cadastrar livro novo
		@Override
		public void cadastrar(Livro livro) {
			listaLivros.add(livro);		
		}
		
	// Procurar ID de livro
	@Override
	public void procurarId(int numero) {
		 var livro  = buscarNaCollection(numero);
			
			if (livro != null)
				livro.visualizar();
			else
				System.out.println("\nO Livro número: " + numero + " não foi encontrado!");
	    }

	// Listar todos os livros
	@Override
	public void listarTodos() {
		for (var livro: listaLivros) {
			livro.visualizar();
			System.out.println("       ");
		}
	}


	// Atualizar livro pelo ID
	@Override
	public void atualizar(Livro livro) {
		var buscaLivro = buscarNaCollection(livro.getId());
		
		if (buscaLivro != null) {
			listaLivros.set(listaLivros.indexOf(buscaLivro), livro);
			System.out.println("\nO livro de ID numero: " + livro.getId() + " foi atualizado com sucesso!");
		}else
			System.out.println("\nO livro de ID numero: " + livro.getId() + " não foi encontrada!");
    }

	
	// Remover Livro pelo ID
	@Override
	public void deletar(int numero) {
		var livro = buscarNaCollection(numero);
		
		if (livro != null) {
			if(listaLivros.remove(livro) == true)
				System.out.println("\nO livro com ID numero: " + numero + " foi deletado com sucesso!");
		}else
			System.out.println("\nO Livro numero: " + numero + " não foi encontrado!");
	}
	
	
	// Gerar ID
	public int gerarNumero() {
		return ++ numero;
	}
	
	
	// Buscar livro na Collections listaLivros
	public Livro buscarNaCollection(int id) {
		for (var livro : listaLivros) {
			if (livro.getId() == id) {
				return livro;
			}
		}
		
		return null;
	}


}
