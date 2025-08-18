package preco;

public class Main {
	public static void main(String[] args) {
		
		Preco compra = new Preco();
		System.out.println(compra.getPreco());
		System.out.println(compra.getNome());
		compra.setDesconto();
		
	}
}
