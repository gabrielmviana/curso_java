package exercicios;

import java.util.Scanner;

public class HoraDeJogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inicio, fim, duracao;

		System.out.println("Informe o horario de inicio do jogo:");
		inicio = sc.nextInt();

		System.out.println("Informe o horario de témino do jogo:");
		fim = sc.nextInt();

		if (inicio < fim) {
			duracao = fim - inicio;
		} else {
			duracao = 24 - inicio + fim;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORAS");

		sc.close();
	}

}
