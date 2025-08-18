package biblioteca;

public class Main {
	
public static void main(String[] args) {
		
		Biblioteca blc = new Biblioteca();
		
		System.out.println(">>Encomenda de livros<<");
		blc.setNomeLivro();
		blc.setNomeAutor();
		blc.setNumPaginas();

		System.out.printf("- Título: %s%n- Páginas: %d%n- Autor: %s%n",
				blc.getNomeLivro(),
				blc.getNumPaginas(),
				blc.getNomeAutor());
		blc.encomendarLivro();
		
}}
