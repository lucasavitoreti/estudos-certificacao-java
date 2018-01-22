package br.com.alura.contas.main;

import br.com.alura.contas.modelo.Palindromo;

public class TestaPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindromo p = new Palindromo("Socorram-me, subi no ônibus em Marrocos");
		System.out.println(p.getPalindromo(p));
	}

}
