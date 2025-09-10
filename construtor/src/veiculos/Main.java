package veiculos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int opcaoMenu;
	
	System.out.println(">> SISTEMA DE TRANSPORTE <<");
	Carro c = new Carro();
	Bicicleta b = new Bicicleta();
	Onibus o = new Onibus();
	
	
	System.out.println("-MENU-");
	do {
	System.out.println("Veículo que gostaria de calcular o tempo:");
	System.out.printf("%s [1]\n%s [2]\n%s [3]\nTodos [4]\nSair [0]",
			c.getNomeVeiculo(),
			b.getNomeVeiculo(),
			o.getNomeVeiculo());
	opcaoMenu = sc.nextInt();
	
	if (opcaoMenu == 0) {
        System.out.println("Encerrando programa...");
        break;
    }
	if(opcaoMenu >=1 && opcaoMenu <=4) {
		System.out.println("Iforme a distância [Km]");
		float distancia = sc.nextFloat();
		
		String tempo = "";
		int numeroParadas = 0;
	switch(opcaoMenu) {
	 case 0:
         System.out.println("Encerrando programa...");
         break;
	case 1:
		tempo = c.calcularTempo((int) distancia);
		System.out.println("O tempo calculado é de " + tempo);
		break;
	case 2:
		tempo = b.calcularTempo((int) distancia);
		System.out.println("O tempo calculado é de " + tempo);
		break;
	case 3:
		System.out.println("Digite a quantidade de paradas:");
		numeroParadas = sc.nextInt();
		tempo = o.calcularTempo((int) distancia);
		System.out.println("O tempo calculado é de " + tempo);
		break;
	case 4:
		System.out.println("Digite a quantidade de paradas do ônibus:");
		numeroParadas = sc.nextInt();
		tempo = o.calcularTempo((int) distancia);
		System.out.println("O tempo calculado do ônibus é de " + tempo);
		tempo = b.calcularTempo((int) distancia);
		System.out.println("O tempo calculado da bicicleta é de " + tempo);
		tempo = c.calcularTempo((int) distancia);
		System.out.println("O tempo calculado do carro é de " + tempo);
		break;
	
	default: System.out.println("Opção inválida!");
	break;
	
	} }else {
        System.out.println("Opção inválida! Tente novamente.");
    }
	    
} while (true);
}}	



