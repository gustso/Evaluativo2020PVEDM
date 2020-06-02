package ar.edu.unju.edm.modelo;

public class Usuario {
	private String contrasena;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public boolean verificarContrasena() {
		boolean valida = false;
		/*
		 * Esto seria el checkeo completo de la contrasena
		if (getContrasena().length()>7) {
			if (contieneEspaciosBlancos()) {
				if (contieneMayusculas()) {
					if (contieneMinusculas()) {
						if (contieneNumeros()) {
							if (contieneCaracteresEspeciales()) {
								valida = true;
							}
							
						}
						
					}
				}
			}	
		}
		*/		
		//aunque esta linea resuelve casi la totalidad del problema
		//fijarse como se ejecuta la condicion
		//lo unico que no esta controlando es el espacio en blanco
        String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        valida = getContrasena().matches(pattern);
		return valida;
	}

}
