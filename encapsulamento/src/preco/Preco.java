package preco;

import java.util.Scanner;

public class Preco {
		 private double preco = 199.99;
		 private String nomeProduto = "Liquidificador";
		 private double desconto ;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 public double getPreco() {
			 return preco;
		 }
		 
		 public String getNome() {
			 return nomeProduto;
		 }

		 public double getDesconto() {
			 return desconto;
		 }
		 
		 public void setDesconto() {
			 double porcentagemOff;
			 boolean valido = false;
			 
			 while(!valido) {
			 System.out.println("Digite a porcentagem de desconto:");
			 
			if(sc.hasNextDouble()) {
			 porcentagemOff = sc.nextDouble();
			 
			 if(porcentagemOff < 0 || porcentagemOff > 100) {
				 System.out.println("Percentual de desconto inválido!");
			 }
			 else {
			 desconto = (porcentagemOff/100.0) * preco;
			 double valorFinal = (preco - desconto);
			 
			 System.out.printf(">>Desconto de R$%.2f\nO valor a pagar é de R$%.2f", desconto,valorFinal);
			 valido = true;}
			 }else {
				 System.out.println("Valor inválido! por favor digite novamente.");
				 sc.next();
			 	}
			 }
		  }
	}
