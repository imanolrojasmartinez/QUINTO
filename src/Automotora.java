import java.util.Scanner;
import java.util.spi.TimeZoneNameProvider;
public class Automotora {
		public static void main(String[] args) {	
			Camion c1 = new Camion();
			Camion c2 = new Camion(25, "rosa" , 2016);
			System.out.println(c1);
			System.out.println(c2);	
			System.out.println(c1.getChapa());
			
			Scanner input = new Scanner(System.in);
			System.out.println("Ingrese la chapa del camion");
			int chapa3 = input.nextInt();
			System.out.println("Ingrese el color del camion");
			String color3 = input.next();
			System.out.println("Ingrese el anio de la ultima revision del camion");
			int revision3 = input.nextInt();
			Camion c3 = new Camion (chapa3, color3 , revision3);	
			System.out.println(c3);
			
			System.out.println(c1.getColor() + " " +  c2.getColor() + " " +  color3); 
			System.out.println(Camion.tieneElMismoColor(c1.getColor(), c2.getColor(), color3));
			System.out.println(c3.toString());
	}
}