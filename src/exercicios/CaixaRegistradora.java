package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CaixaRegistradora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cachorroQuente = 1;
		int xSalada = 2;
		int xBacon = 3;
		int torradaSimples = 4;
		int refrigerante = 5;
		int codigo, quantidade;

		System.out.println("INFORME O CODIGO DO PRODUTO:");
		codigo = sc.nextInt();

		System.out.println("INFORME A QUANTIDADE:");
		quantidade = sc.nextInt();

		double total = 0;

		if (codigo == cachorroQuente) {
			total = quantidade * 4.00;
		} else if (codigo == xSalada) {
			total = quantidade * 4.50;
		} else if (codigo == xBacon) {
			total = quantidade * 5.00;
		} else if (codigo == torradaSimples) {
			total = quantidade * 2.00;
		} else if (codigo == refrigerante) {
			total = quantidade * 1.50;
		} else {
			System.out.println("PRODUTO NÃO CADASTRADO!");
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();

	}

}
