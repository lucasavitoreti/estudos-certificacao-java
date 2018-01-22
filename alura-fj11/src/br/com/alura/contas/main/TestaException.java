package br.com.alura.contas.main;

import br.com.alura.contas.modelo.ContaCorrente;
import br.com.alura.contas.modelo.ValorInvalidoException;

public class TestaException {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		try {
			cc.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
