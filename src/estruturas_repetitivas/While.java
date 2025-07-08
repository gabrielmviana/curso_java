package estruturas_repetitivas;

import java.util.Scanner;

//"WHILE" É UMA ESTRUTURA DE CONTROLE QUE REPETE UM BLOCO DE COMANDOS
//ENQUANTO UMA CONDIÇÃO FOR VERDADEIRA.

//É UTILIZADA QUANDO NÃO SE SABE PREVIAMENTE A QUANTIDADE DE REPETIÇÕES
//QUE SERÁ REALIZADA.

public class While {

	public static void main(String[] args) {

//FAZER UM PROGRAMA QUE LÊ NUMEROS INTEIROS ATÉ QUE UM ZERO SEJA LIDO.
//AO FINAL MOSTRA A SOMA DOS NUMEROS LIDOS.
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x; // TODA VEZ QUE O USUARIO INFORMA A VARIAVEL, ELA É ACUMULADA NO VALOR DE X.
			x = sc.nextInt(); //UMA BOA PRÁTICA É UTILIZAR O OPERADOR DE SOMA ACUMULATIVA NESTE CASO "SOMA += X;"
		}
		System.out.println(soma);
		sc.close();
	}

}
