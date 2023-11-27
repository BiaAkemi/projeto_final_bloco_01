package biblioteca.repository;
import biblioteca.model.Livro;

public interface LivrosRepository {
	
	public void procurarId(int numero);
	public void listarTodos();
	public void cadastrar(Livro livro);
	public void atualizar(Livro livro);
	public void deletar (int numero);
	
	
}
