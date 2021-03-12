public class Producto {
	private String nombre;
	private int codigo;
	private boolean importado;
	private String nroLote;
	private int nroProducto;
	private static int constante = 0; 
	
	public Producto(String nombre, int codigo, boolean importado, String nroLote, int nroProducto) {
		constante++;
		this.nombre = nombre;
		this.codigo = codigo;
		this.importado = importado;
		this.nroLote = nroLote;
		this.nroProducto = constante;
	}

	public Producto() {
		constante++;
		this.nombre = "Desconocido";
		this.codigo = 0;
		this.importado = false;
		this.nroLote = "Desconocido";
		this.nroProducto = constante;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isImportado() {
		return importado;
	}

	public void setImportado(boolean importado) {
		this.importado = importado;
	}

	public String getNroLote() {
		return nroLote;
	}

	public void setNroLote(String nroLote) {
		this.nroLote = nroLote;
	}

	public int getNroProducto() {
		return nroProducto;
	}

	public void setNroProducto(int nroProducto) {
		this.nroProducto = nroProducto;
	}

	@Override
	public String toString() {
		if(importado == true) {
		return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", importado=" + "Este producto es importado" + ", nroLote=" + nroLote
				+ ", nroProducto=" + nroProducto + "]";
		}
		else {
			return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", importado=" + "Este producto es nacional" + ", nroLote=" + nroLote
					+ ", nroProducto=" + nroProducto + "]";			
		}
	}
	
}