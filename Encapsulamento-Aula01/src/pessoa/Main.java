package pessoa;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoa ps = new Pessoa();
		
		System.out.println("Digite seu nome:");
		ps.setName(sc.nextLine());
		
		System.out.println("Digite sua idade:");
		ps.setAge(sc.nextInt());
		
		ps.exibirMenssagem();
		
		sc.close();

	}
}
