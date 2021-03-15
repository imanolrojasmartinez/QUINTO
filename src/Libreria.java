import java.util.Scanner;
public class Libreria {
	public static void main(String[] args) {
		Libro libro1 = new Libro();		
		Libro libro2 = new Libro();

		Scanner input = new Scanner(System.in);
		System.out.println("Input the title of the book");
		libro2.setTitle(input.next());
		System.out.println("Input the author");
		libro2.setAutor(input.next());
		System.out.println("Input the ISBN");
		libro2.setIsbn(input.nextInt());
		System.out.println("Input the number of the pages");
		libro2.setNumeroDePaginas(input.nextInt());
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

	}
}