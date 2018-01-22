package br.com.alura.contas.modelo;

public class Palindromo {
	private String texto;
	// private StringBuilder textoInvertido;

	public Palindromo(String texto) {
		this.texto = texto;
	}

	public StringBuilder getPalindromo(Palindromo p) {
		StringBuilder invertido = new StringBuilder(this.texto).reverse();
		return invertido;

		/*
		 * Jeito fulero...
		 * 
		 * textoInvertido = p.toString(); for (int i = textoInvertido.length() - 1; i >=
		 * 0; i--) { System.out.println(textoInvertido.charAt(i)); }
		 * 
		 */
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return this.texto;
	}

}
