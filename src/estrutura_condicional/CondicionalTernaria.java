package estrutura_condicional;

import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {

		// ESTRUTURA OPCIONAL AO IF-ELSE QUANDO SE DESEJA DECIDIR UM VALOR
		// COM BASE EM UMA CONDIÇÃO

		// SINTAXE: (CONDIÇÃO) ? VALOR_SE_VERDADEIRO : VALOR_SE_FALSO

		// EXEMPLO
		
		Scanner sc = new Scanner(System.in);

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		
		sc.close();

	}
}