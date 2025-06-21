package funcoes;

import java.util.Scanner; // IMPORTAR A LEITURA DE DADOS

public class FormulaBascara {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //DEFINI A VARIAVEL "SCANNER PARA LEITURA"

		System.out.print("Digite o valor de a: ");//SOLICITEI AO USUARIO O VALOR DE "a".
		double a = scanner.nextDouble();//DEFINI A VARIAVEL "a" COMO DOUBLE, QUE É DETERMINADA PELA ENTRADA DO USUARIO

		System.out.print("Digite o valor de b: ");
		double b = scanner.nextDouble();

		System.out.print("Digite o valor de c: ");
		double c = scanner.nextDouble();

		double delta = Math.pow(b, 2.0) - 4 * a * c;//APLICAÇÃO DA FORMULA DE BASCARA.

		if (delta >= 0) {		//UTILIZAÇÃO DO IF PARA CALCULO DE X1 E X2
			double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

			System.out.println("As raizes da equação são: ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else {
			System.out.println("A equação não possui raizes reais!");
		}

		scanner.close();

	}

}
