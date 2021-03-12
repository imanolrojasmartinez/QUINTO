import java.util.Scanner;

public class GestionarProductos {
	public static void main(String[] args) {
		Producto prod1 = new Producto();
		System.out.println(prod1.toString());
		Scanner input = new Scanner(System.in);
		for(int i=0; i<2; i++ ) {
		Producto prod2 = new Producto();
		System.out.println("Input the name of the product");
		prod2.setNombre(input.next()); 
		System.out.println("Input the code of the product");
		prod2.setCodigo(input.nextInt()); 
		System.out.println("Input the boolean for imported");
		prod2.setImportado(input.nextBoolean()); 		
		System.out.println("Input the number of box");
		prod2.setNroLote(input.next()); 
		System.out.println(prod2.toString());
		}
	}
}