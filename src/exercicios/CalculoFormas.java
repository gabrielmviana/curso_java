package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculoFormas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, area1, area2, area3, area4, area5, pi;
		
		pi = 3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		
		area1 = (A * C) / 2;
		area2 = pi * Math.pow(C, 2.0);
		area3 = (A + B) * C/2;
		area4 = Math.pow(B, 2.0);
		area5 = A * B;
				
		System.out.printf("TRIANGULO: %.3f%n", area1);
		System.out.printf("CIRCULO: %.3f%n", area2);
		System.out.printf("TRAPEZIO: %.3f%n", area3);
		System.out.printf("QUADRADO: %.3f%n", area4);
		System.out.printf("RETANGULO: %.3f%n", area5);
		
		sc.close();
	}

}
