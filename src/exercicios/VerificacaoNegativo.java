package exercicios;

import java.util.Scanner;

public class VerificacaoNegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int entrada;

		System.out.println("Digite um numero inteiro:");
		entrada = sc.nextInt();

		if (entrada < 0) {
			System.out.println("NEGATIVO");

		} else {
			System.out.println("NÃO NEGATIVO");
		}

		sc.close();
	}

}
