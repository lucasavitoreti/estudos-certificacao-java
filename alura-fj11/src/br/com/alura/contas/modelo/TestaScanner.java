package br.com.alura.contas.modelo;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestaScanner {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner("leitura.txt");
		PrintStream ps = new PrintStream("saida.txt");
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			ps.println(linha);
		}
		ps.close();
		sc.close();
	}

}
