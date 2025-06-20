package declaracao_variaveis;

import java.util.Locale;

public class Variaveis {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(y);
		System.out.println("Bom dia!");
		System.out.println(x);
		System.out.printf("%.2f%n",x); // %.2f indica a quantidade de casa decimais, %n indica quebra de linhas.
		System.out.printf("%.4f%n",x);
		Locale.setDefault(Locale.US); // o Locale é utilizado para configurar o uso do ponto em vez da virgula.
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x); // os marcadores (%f) definem onde a variavel será exibida.
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
		
	}

}
