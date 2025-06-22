package exercicios;

import java.util.Scanner;

public class VerificaçãoDeMultiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B;

		System.out.println("Informe o primeiro valor:");
		A = sc.nextInt();

		System.out.println("Informe o segundo valor:");
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("SÃO MULTIPLOS!");

		} else {
			System.out.println("NÃO SÃO MULTIPLOS!");
		}

		sc.close();
	}

}
