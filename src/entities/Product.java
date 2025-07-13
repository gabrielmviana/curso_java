package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { // QUANDO ADICIONO O MÉTODO "toString" CONSIGO FORMATAR A SAIDA PARA UM MODELO PADRÃO.
		return name 
				+ ", $ " 
				+ String.format("%.2f" , price)  //NESTE CASO QUERO QUE O VALOR SAIA COM DUAS CASAS DECIMAIS, UTILIZEI "String.Format".
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f" , totalValueInStock());
	}
}
