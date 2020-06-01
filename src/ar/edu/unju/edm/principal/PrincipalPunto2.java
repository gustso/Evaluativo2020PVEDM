package ar.edu.unju.edm.principal;

import ar.edu.unju.edm.modelo.Identificador;
import ar.edu.unju.edm.modelo.Producto;

public class PrincipalPunto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Identificador ident = new Identificador(); 
				
		Producto producto01 = new Producto(ident ,"harina" , 45.1,"financiado");
		Producto producto02 = new Producto(ident ,"azucar" , 25.1,"contado");
		Producto producto03 = new Producto(ident ,"yerba" , 35.1,"contado");
		
		System.out.println(" Descripcion: "+ producto01.getDescripcion() + "Precio sin IVA: "+ producto01.getPrecioSinIVA() + " Precio a Pagar: "+ producto01.calcularPrecio());
		System.out.println(producto01 + " Precio a Pagar: "+ producto01.calcularPrecio());
		System.out.println(producto02 + " Precio a Pagar: "+ producto02.calcularPrecio());
		System.out.println(producto03 + " Precio a Pagar: "+ producto03.calcularPrecio());

	}

}
