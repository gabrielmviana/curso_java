package exercicios;

import java.util.Scanner;

public class SomaInteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		int a = sc.nextInt();
		
		System.out.print("Digite o valor de b: ");
		int b = sc.nextInt();
		
		int soma = a + b;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
