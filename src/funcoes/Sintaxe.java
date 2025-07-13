package funcoes;

import java.util.Scanner;

// FUNÇÕES REPRESENTAM UM PROCESSAMENTO QUE POSSUI UM SIGNIFICADO
// Math.sqrt(double) - CALCULA A RAIZ QUADRADA DE UM DETERMINADO VALOR
// FUNÇÕES PODEM RECEBER DADOS DE ENTRADA (PARAMETROS OU ARGUMENTOS)
// FUNÇÕES PODEM OU NÃO RETORNAR UMA SAIDA
// EM ORIENTAÇÃO A OBJETOS, FUNÇÕES EM CLASSES RECEBEM O NOME DE "MÉTODOS"

public class Sintaxe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);
		
		showResult(higher);

		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
