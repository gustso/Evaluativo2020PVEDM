package ar.edu.unju.edm.principal;

import ar.edu.unju.edm.modelo.Usuario;

public class PrincipalPunto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario();
		usuario.setContrasena("jkjljkklk@5G");
		System.out.println(usuario.verificarContrasena());
	}

}
