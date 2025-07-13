package estruturas_repetitivas;

import java.util.Scanner;

// É UMA ESTRUTURA DE CONTROLE QUE REPETE UM BLOCO DE COMANDOS PARA
// UM CERTO INTERVALO DE VALORES

//QUANDO USAR: QUANDO SE SABE PREVIAMENTE A QUANTIDADE DE REPETIÇÕES
//OU O INTERVALO DE VALORES.

//			for ( INICIO ; CONDIÇÃO ; INCREMENTO) {
//			   COMANDO 1
//			   COMANDO 2
//			}

public class For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
				
		sc.close();
	}

}
