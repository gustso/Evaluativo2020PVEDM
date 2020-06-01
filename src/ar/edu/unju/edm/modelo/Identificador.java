package ar.edu.unju.edm.modelo;

public class Identificador {
	private int IdDeProducto;
	
	public Identificador() {
		this.IdDeProducto = 0;
		// TODO Auto-generated constructor stub
	}

	public int getIdDeProducto() {
		return IdDeProducto;
	}

	public void setIdDeProducto(int idDeProducto) {
		IdDeProducto = idDeProducto;
	}
	
	public int calcularSiguienteIdentificador() {
		setIdDeProducto(getIdDeProducto() + 1);
		return getIdDeProducto();
	}
	
}
