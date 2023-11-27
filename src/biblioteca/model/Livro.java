package biblioteca.model;

public abstract class Livro {
	private String titulo;
	private int id;
	private String escritore;
	private float preco;
	private int estoque;
	
	public Livro(String titulo, int id, String escritore, float preco) {
		this.titulo = titulo;
		this.id = id;
		this.escritore = escritore;
		this.preco = preco;
	}
	
	public void visualizar() {
		
		System.out.println("Dados do Livro: ");
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Escritore: " + this.getescritore());
		System.out.println("Preço: " + this.getPreco());
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getescritore() {
		return escritore;
	}

	public void setescritore(String escritore) {
		this.escritore = escritore;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
}
