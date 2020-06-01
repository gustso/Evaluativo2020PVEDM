package ar.edu.unju.edm.modelo;

/**
 * 
 * @author NTGustso
 *
 */
public class Producto {
	private int identificador;
	private String descripcion;
	private double precioSinIVA;
	private String formaPago;

	public Producto() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Producto(Identificador ident, String descripcion, double precioSinIVA, String formaPago) {
		super();
		this.identificador = (int) ident.calcularSiguienteIdentificador();
		this.descripcion = descripcion;
		this.precioSinIVA = precioSinIVA;
		this.formaPago = formaPago;
	}	


	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getPrecioSinIVA() {
		return precioSinIVA;
	}



	public void setPrecioSinIVA(double precioSinIVA) {
		this.precioSinIVA = precioSinIVA;
	}



	public String getFormaPago() {
		return formaPago;
	}



	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}



	private double calcularPrecioIVA() {
		double precioConIVA;
		precioConIVA = getPrecioSinIVA() * 1.21;
		return precioConIVA;
	}
	
	public double calcularPrecio() {
		double resultado;
		if (getFormaPago() == "contado") {
			//resultado = calcularPrecioIVA() - calcularPrecioIVA()*0.10;
			resultado = calcularPrecioIVA()*0.90;
		}
		else {
			resultado = calcularPrecioIVA()*1.10;
		}
		return resultado;
	}

	@Override
	public String toString() {
		return "Producto [identificador=" + identificador + ", descripcion=" + descripcion + ", precioSinIVA="
				+ precioSinIVA + ", formaPago=" + formaPago + "]";
	}
	
	
}
