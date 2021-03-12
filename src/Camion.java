public class Camion {
	private int chapa;
	private String color;
	private int a�oCompra;
	
	public int getA�oCompra() {
		return a�oCompra;
	}

	public void setA�oCompra(int a�oCompra) {
		this.a�oCompra = a�oCompra;
	}

	public int getChapa() {
		return chapa;
	}

	public void setChapa(int chapa) {
		this.chapa = chapa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Camion() {
		this.chapa = 125;
		this.color = "Rojo";
		this.a�oCompra = 2014;
	}
	
	public Camion(int chapa, String color, int a�oCompra) {
		this.chapa = chapa;
		this.color = color;
		this.a�oCompra = a�oCompra;
	}
	
	public Camion (int chapa) {
		this.chapa = chapa;
		this.color = "verde";
		this.a�oCompra = 2014;
	}
	
	public String toString() {
		if(leTocaRevision(a�oCompra) == true) {
		return "El camion es " +this.color + " y su chapa patente es " +this.chapa + " y necesita una revision";
		} else {return "El camion es " +this.color + " y su chapa patente es " +this.chapa + " y no necesita una revision";}
	}
	
	public static boolean leTocaRevision(int a�oCompra) {
		if(a�oCompra < 2015) {
			return true;
		} else {return false ;}
	}
	
	public static String tieneElMismoColor (String color1, String color2,String color3) {
		if (color1.equals(color2) || color1.equals(color3) || color2.equals(color3)) {
			return "Iguales";
		} else {return "No Iguales";}
	}
}