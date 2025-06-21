package exercicios;
//A IDEIA DESTE EXERCICO É A UTILIZAÇÃO DA SAIDA FORMATADA DE VARIAVEIS DISTINTAS.


import java.util.Locale;

public class FormatacaoDeSaida {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		//%s - FORMATA A SAIDA DA VARIAVEL product1 QUE É UM STRING.
		//%.2f - FORMATA A SAIDA DA VARIAVEL "price" QUE É UM TIPO DOUBLE.
		//%n - FAZ A QUEBRA DE LINHA, POIS ESTAMOS UTILIZANDO O PRINTF.
		System.out.printf("%s, which price is $ %.1f%n" , product1 , price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		//%d - FORMATA A SAIDA DA VARIAVEL "age" QUE É DO TIPO INTEIRO.
		//%c - FORMATA A SAIDA DA VARIAVEL "gender" QUE É DO TIPO CHAR
		System.out.printf("Record: %d years old, code %d and gender: %c%n" , age, code , gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %.8f%n" , measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);	
	

	}

}
