public class Camion {
	private int chapa;
	private String color;
	private int aņoCompra;
	
	public int getAņoCompra() {
		return aņoCompra;
	}

	public void setAņoCompra(int aņoCompra) {
		this.aņoCompra = aņoCompra;
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
		this.aņoCompra = 2014;
	}
	
	public Camion(int chapa, String color, int aņoCompra) {
		this.chapa = chapa;
		this.color = color;
		this.aņoCompra = aņoCompra;
	}
	
	public Camion (int chapa) {
		this.chapa = chapa;
		this.color = "verde";
		this.aņoCompra = 2014;
	}
	
	public String toString() {
		if(leTocaRevision(aņoCompra) == true) {
		return "El camion es " +this.color + " y su chapa patente es " +this.chapa + " y necesita una revision";
		} else {return "El camion es " +this.color + " y su chapa patente es " +this.chapa + " y no necesita una revision";}
	}
	
	public static boolean leTocaRevision(int aņoCompra) {
		if(aņoCompra < 2015) {
			return true;
		} else {return false ;}
	}
	
	public static String tieneElMismoColor (String color1, String color2,String color3) {
		if (color1.equals(color2) || color1.equals(color3) || color2.equals(color3)) {
			return "Iguales";
		} else {return "No Iguales";}
	}
}