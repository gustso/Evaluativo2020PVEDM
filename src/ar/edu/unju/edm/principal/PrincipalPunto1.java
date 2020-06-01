package ar.edu.unju.edm.principal;

import ar.edu.unju.edm.modelo.Cadena;

public class PrincipalPunto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------Prueba de ejecucion: Punto 1-----------");
		Cadena unaCadena = new Cadena();
		unaCadena.setOracion("MINás");
		System.out.println(unaCadena.cambiarMayusculaMinuscula());
		System.out.println("cantidad de vocales: "+unaCadena.contarCantidadVocal());
		System.out.println("cadena al reves: "+unaCadena.mostrarOracionAlReves());		
		
	}

}
