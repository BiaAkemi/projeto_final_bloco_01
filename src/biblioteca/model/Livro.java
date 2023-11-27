package biblioteca.model;

public abstract class Livro {
	private String titulo;
	private int id;
	private String escritore;
	private float preco;
	
	public Livro(int id, String titulo, String escritore, float preco) {
		this.id = id;
		this.titulo = titulo;
		this.escritore = escritore;
		this.preco = preco;
	}
	
	public void visualizar() {
		
		System.out.println("\tID Livro " + this.id);
		System.out.println("\tTítulo: " + this.titulo);
		System.out.println("\tEscritor por: " + this.getEscritore());
		System.out.println("\tPreço: " + this.preco);
		
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

	public String getEscritore() {
		return escritore;
	}

	public void setEscritore(String escritore) {
		this.escritore = escritore;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
}
