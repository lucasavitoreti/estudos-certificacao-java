package br.com.alura.contas.main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.contas.modelo.Conta;
import br.com.alura.contas.modelo.ContaCorrente;
import br.com.alura.contas.modelo.ContaPoupanca;

public class TestaColecoes {

	public static void main(String[] args) {
		List<Conta> contas = new LinkedList<Conta>();

		ContaCorrente cc1 = new ContaCorrente();
		cc1.setTitular("Lucas");
		cc1.setNumero(12345);
		cc1.deposita(1000.0);

		ContaPoupanca cc2 = new ContaPoupanca();
		cc2.setTitular("Thaise");
		cc2.setNumero(123451);
		cc2.deposita(5000.0);

		contas.add(cc2);
		contas.add(cc1);

		// System.out.println(contas.get(0));
		// System.out.println(contas.contains(cc1));

		Collections.sort(contas);

		for (Conta c : contas) {
			System.out.println(c);
		}

	}

}
