package biblioteca.model;

public class Serie extends Livro {
	
	// Atributos
	private String nomeSerie;
	private int volume;

	// Constructor
	public Serie(int id, String titulo, String escritore, float preco, String nomeSerie, int volume) {
		super(id, titulo, escritore, preco);
		this.nomeSerie = nomeSerie;
		this.volume = volume;
	}
	
	// Métodos
	public void visualizar() {
		super.visualizar();
		System.out.println(("\tSérie: " + this.getNomeSerie()) + ", volume: " + this.getVolume());
		
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
