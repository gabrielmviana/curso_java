package entities; //PACOTE DA CLASSE

public class Triangle { //NOME DA CLASSE

	public double a;
	public double b;  //ATRIBUTO DA CLASSE
	public double c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
// O PREFIXO PUBLIC INDICA QUE I ATRIBUTO OU MÉTODO PODE SER USADO EM OUTROS ARQUIVOS
// AREA = NOME DO MÉTODO