package funcoes_string;

public class TesteFuncoes {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();//TRANSFORMA TODOS OS STRINGS EM MINUSCULO
		String s02 = original.toUpperCase();//TRANSFORMA TODOS OS STRINGS EM MAIUSCULO
		String s03 = original.trim();//RETIRA O ESPAÇO DO FINAL DO STRING
		String s04 = original.substring(2);//PEGA O CARACTER DA POSIÇÃO X EM DIANTE PARA MONTAR UM NOVO CARACTER
		String s05 = original.substring(2, 9);//RECORTA A PARTIR DO CARACTER 2 ATÉ ABAIXO DO 9.
		String s06 = original.replace('a', 'x');//SUBSTITUI UM DETERMINADO CARACTER POR OUTRO.
		String s07 = original.replace("abc", "xy");//SUBSTITUI
		int i = original.indexOf("bc");//USADA PARA IDENTIFICAR A PRIMEIRA OCORRENCIA DE DETERMINADO CARACTER
		int j = original.lastIndexOf("bc");//USADA PARA IDENTIFICAR A ULTIMA OCORRENCIA DE DETERMINADO CARACTER
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("Substring(2): -" + s04 + "-");
		System.out.println("Substring(2, 9): -" + s05 + "-");
		System.out.println("Replace('a', 'x'): -" + s06 + "-");
		System.out.println("Replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc' : " + i);
		System.out.println("Last index of 'bc' : " + j);
	}

}
