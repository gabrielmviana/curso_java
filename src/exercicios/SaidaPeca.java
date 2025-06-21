package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SaidaPeca {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidade1, quantidade2;
		double precoUnitario1, precoUnitario2, valorTotal, codigo1, codigo2;
		
		codigo1 = sc.nextInt();
		quantidade1 = sc.nextInt();
		precoUnitario1 = sc.nextDouble();

		codigo2 = sc.nextInt();
		quantidade2 = sc.nextInt();
		precoUnitario2 = sc.nextDouble();

		codigo1 = precoUnitario1 * quantidade1;
		codigo2 = precoUnitario2 * quantidade2;
		valorTotal = codigo1 + codigo2;

		System.out.printf(" VALOR A PAGAR: R$%.2f%n ", valorTotal);

		sc.close();
	}

}
