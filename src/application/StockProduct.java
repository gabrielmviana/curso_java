package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class StockProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product(); //NESTA ETAPA ESTOU UTILIZANDO A CLASSE PRODUTOS PARA DEFINIR UM NOVO "product" QUE SERÁ INCLUIDO NA BASE.
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine(); //NESTA LINHA ESTOU ATRIBUINDO A ENTRADA DO USUARIO AO ATRIBUTO "NAME" QUE PERTENCE A CLASSE "PRODUCTS".
		System.out.print("Price: ");
		product.price = sc.nextDouble(); //NESTA LINHA ESTOU ATRIBUINDO A ENTRADA DO USUARIO AO ATRIBUTO "PRICE" QUE PERTENCE A CLASSE "PRODUCTS".
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();//NESTA LINHA ESTOU ATRIBUINDO A ENTRADA DO USUARIO AO ATRIBUTO "QUANTITY" QUE PERTENCE A CLASSE "PRODUCTS".
		
		
		System.out.println(product);
		
		
		sc.close();
	}

}
