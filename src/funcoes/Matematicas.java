package funcoes;

public class Matematicas {

	public static void main(String[] args) {
		
		//DEFINIÇÃO DE VARIAVEIS COMO DOUBLE.
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		//APLICAÇÃO DE FUNÇÃO DE RAIZ QUADRADA AS VARIAVEIS.
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("================= RAIZ ================");
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		System.out.println();
		
		//APLICAÇÃO DE POTENCIAÇÃO AS VARIAVEIS.
		System.out.println("=============== POTENCIA ==============");
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado a " + y + " = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		System.out.println();
		
		//VERIFICAÇÃO DO VALOR ABSOLUTO COM FUNÇÃO MATH.ABS
		System.out.println("============ VALOR ABSOLUTO ===========");
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}

}
