package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		double valorHora;
		double salario;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horasTrabalhadas;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$%.2f%n ", salario);
		
		sc.close();
	}

}
