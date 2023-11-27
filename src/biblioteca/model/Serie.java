package biblioteca.model;

public class Serie extends Livro {
	
	// Atributos
	private String nomeSerie;
	private int volume;

	// Constructor
	public Serie(String titulo, int id, String escritore, float preco, String nomeSerie, int volume) {
		super(titulo, id, escritore, preco);
		this.nomeSerie = nomeSerie;
		this.volume = volume;
	}
	
	@Override
	public void visualizar() { // visualizar com série + volume
		
		System.out.println("Dados do Livro: ");
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Série: " + this.nomeSerie + ", volume: " + this.getVolume());		
		System.out.println("Escritore: " + this.getescritore());
		System.out.println("Preço: " + this.getPreco());
	}
	
	//Getters e Setters
	public String getNomeSerie() {
		return nomeSerie;
	}

	public void setNomeSerie(String nomeSerie) {
		this.nomeSerie = nomeSerie;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
