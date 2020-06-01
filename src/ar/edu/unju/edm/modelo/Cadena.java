package ar.edu.unju.edm.modelo;

/**
 * 
 * @author NTGustso
 *
 */
public class Cadena {
	private String oracion;

	public Cadena() {
		// TODO Auto-generated constructor stub
	}

	public Cadena(String oracion) {
		super();
		this.oracion = oracion;
	}

	public String getOracion() {
		return oracion;
	}

	public void setOracion(String oracion) {
		this.oracion = oracion;
	}

	public String cambiarMayusculaMinuscula() {
		String resultado = "";
		String auxiliar = "";		
		char c = ' ';
		for (int i = 0; i < getOracion().length(); i++) {
			c = getOracion().charAt(i);
			if (Character.isUpperCase(c)) {
				auxiliar = auxiliar + c;
				auxiliar = auxiliar.toLowerCase();				
				resultado = resultado + auxiliar;
				auxiliar = "";
			} else {
				if (Character.isLowerCase(c)) {
					auxiliar = auxiliar + c;
					auxiliar = auxiliar.toUpperCase();					
					resultado = resultado + auxiliar;
					auxiliar = "";
				}
			}		
		}
		return resultado;
	}
	
	
	public int contarCantidadVocal() {
		int c = 0;		
		char[] vocales = new char[5];
		vocales[0] = 'a';
		vocales[1] = 'e';
		vocales[2] = 'i';
		vocales[3] = 'o';
		vocales[4] = 'u';
		for (int j=0; j<5;j++) {
			char[] arregloVocal = verificarVocal(vocales[j]);
			for (int i = 0; i < getOracion().length(); i++) {
				for (int k = 0; k < 4; k++) {
					if (getOracion().charAt(i) == arregloVocal[k])
						c++;
				}
			}
		}
		return c;
	}

	private char[] verificarVocal(char caracter) {
		char[] arreglo = new char[4];

		char[] caracterCompararA = new char[4];
		caracterCompararA[0] = 'a';
		caracterCompararA[1] = 'á';
		caracterCompararA[2] = 'A';
		caracterCompararA[3] = 'Á';

		char[] caracterCompararE = new char[4];
		caracterCompararE[0] = 'e';
		caracterCompararE[1] = 'é';
		caracterCompararE[2] = 'E';
		caracterCompararE[3] = 'É';

		char[] caracterCompararI = new char[4];
		caracterCompararI[0] = 'i';
		caracterCompararI[1] = 'í';
		caracterCompararI[2] = 'I';
		caracterCompararI[3] = 'Í';

		char[] caracterCompararO = new char[4];
		caracterCompararO[0] = 'o';
		caracterCompararO[1] = 'ó';
		caracterCompararO[2] = 'O';
		caracterCompararO[3] = 'Ó';

		char[] caracterCompararU = new char[4];
		caracterCompararU[0] = 'u';
		caracterCompararU[1] = 'ú';
		caracterCompararU[2] = 'U';
		caracterCompararU[3] = 'Ú';
		
		for (int k = 0; k < 3; k++) {
			// comparacion para saber si es la a
			if (caracter == caracterCompararA[k]) {
				arreglo = caracterCompararA;
			}

			if (caracter == caracterCompararE[k]) {
				arreglo = caracterCompararE;
			}

			if (caracter == caracterCompararI[k]) {
				arreglo = caracterCompararI;
			}

			if (caracter == caracterCompararO[k]) {
				arreglo = caracterCompararO;
			}

			if (caracter == caracterCompararU[k]) {
				arreglo = caracterCompararU;
			}

		}
		return arreglo;
	}
	
	public String mostrarOracionAlReves() {
		String resultado="";
		for (int i = getOracion().length(); i > 0 ; i--) {
			resultado = resultado + getOracion().charAt(i-1);
		}
		return resultado;
	}


}
