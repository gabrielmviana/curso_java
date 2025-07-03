package sintaxe_opcional;

import java.util.Scanner;

//É USADA QUANDO SE TEM VÁRIAS OPÇÕES DE FLUXO A SEREM TRATADAS COM BASE NO VALOR DE UMA VARIÁVEL,
//AO INVÉS DE VÁRIAS ESTRUTURAS IF-ELSE ENCADEADAS, ALGUNS PREFEREM UTILIZAR A ESTRUTURA SWITCH-CASE.

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		String dia;

		switch (x) { // AVALIE A EXPRESSÃO X
		case 1: // CASO O VALOR DE X SEJA 1.
			dia = "domingo"; // SERÁ ATRIBUIDO A VARIAVEL X O VALOR DOMINGO.
			break; // É OBRIGATORIO UTILIZAR O BREAK AO FINAL DE CADA CASO.
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default: // SERVE PARA ESTABELECER UM VALOR PADRÃO QUANDO TODOS OS CASES FALHAM.
			dia = "valor inválido";
			break;
		}

		System.out.println("Dia da semana: " + dia);

		sc.close();
	}

}
