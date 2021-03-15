public class Libro {
	private int isbn;
	private String title;
	private String autor;
	private int numeroDePaginas;
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	@Override
	public String toString() {
		return "El libro con ISBN " + isbn + ", y titulo " + title + ", creado por el autor " + autor + ", tiene " + numeroDePaginas
				+ "numeroDePaginas";
	}
	public Libro(int isbn, String title, String autor, int numeroDePaginas) {
		this.isbn = isbn;
		this.title = title;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}
	public Libro() {
		this.title = "Sin título";
	}
}