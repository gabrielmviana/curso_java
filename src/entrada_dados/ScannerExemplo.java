package entrada_dados;

import java.util.Locale;
import java.util.Scanner;

public class ScannerExemplo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		/*String x;            //LEITURA DE VARIAVEL COM STRING
		x = sc.next();
		System.out.println("Você digitou: " + x);*/
		
		
		
		/*int x;               //LEITURA DE VARIAVEL COM INTEIRO
		x = sc.nextInt();
		System.out.println("Você digitou: " + x);*/
				
		/*double x;            //LEITURA DE VARIAVEL COM FLUTUANTE
		x = sc.nextDouble();
		System.out.println("Você digitou: " + x);*/	
		
		
		/*char x;             //LEITURA DE VARIAVEL CHAR
		x = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);*/
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	
		
		sc.close();
	}

}
