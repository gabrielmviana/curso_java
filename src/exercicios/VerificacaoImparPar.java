package exercicios;

import java.util.Scanner;

public class VerificacaoImparPar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int entrada;

		System.out.println("Digite um numero inteiro:");
		entrada = sc.nextInt();

		if (entrada % 2 == 0) {
			System.out.println("PAR");

		} else {
			System.out.println("IMPAR");
		}

		sc.close();

	}

}
