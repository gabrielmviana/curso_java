package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ValorIntervalo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor;

		valor = sc.nextDouble();

		if (valor >= 0.0 && valor <= 25.0) {
			System.out.println("Intervalo (0,25]");

		} else if (valor > 25.00 && valor <= 50.00) {
			System.out.println("Intervalo (25,50]");

		} else if (valor > 50.00 && valor <= 75.00) {
			System.out.println("Intervalo (50,75]");

		} else if (valor > 75.00 && valor <= 100.00) {
			System.out.println("Intervalo (75,100]");

		} else {
			System.out.println("Fora de intervalo");
		}

		sc.close();
	}

}
