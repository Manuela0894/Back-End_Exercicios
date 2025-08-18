package personagemRpg;

import java.util.Scanner;

public class PersonagemRpg {
	private String nome;
	private String[] classe = { "Guerreiro", "Elfo", "Bruxa" };
	private int poder;
	private int vida;
	private int personagemEscolhido;
	public boolean validacao = false;

	Scanner sc = new Scanner(System.in);

	public String getNome() {
		return nome;
	}

	public void setNome() {
		System.out.println("Escolha um nome para seu personagem:");
		this.nome = sc.nextLine();
	}

	public void escolhaClasse() {
		int opcoes = 0;
		System.out.println("Escolha a classe do seu personagem");
		System.out.println("[ 1 ]- " + classe[0] + "  " + "[ 2 ]- " + classe[1] + "  " + "[ 3 ]- " + classe[2]);

		do {
			opcoes = sc.nextInt();
			if (opcoes < 1 || opcoes > 3) {
				System.out.println("Por favor digite um número entre 1 - 3");
			} else {
				personagemEscolhido = opcoes - 1;
				System.out.println("Classe escolhida>> " + (classe[personagemEscolhido]));
			}
		} while (opcoes < 1 || opcoes > 3);
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder() {
		int poderEscolhido;
		do {
			System.out.println("Quantidade de poder para o(a) " + (classe[personagemEscolhido]) + " " + nome + ": ");
			poderEscolhido = sc.nextInt();
			if (poderEscolhido < 1 || poderEscolhido > 100) {
				System.out.println("O poder precisa estar entre 1 e 100");
			} else {
				this.poder = poderEscolhido;
			}
		} while (poderEscolhido < 1 || poderEscolhido > 100);
	}

	public int getVida() {
		return vida;
	}

	public void setVida() {
		int qntVida = 0;
		do {
			System.out.println("Quantidade de vida:");
			qntVida = sc.nextInt();

			if (qntVida <= 0 || qntVida > 100) {
				System.out.println("O poder precisa estar entre 1 e 100 para começar");
			}
		} while (qntVida < 1 || qntVida > 100);
		this.vida = qntVida;
	}

	public void atualizacaoVida() {
		int qntVida = 0;

		while (!validacao) {
			System.out.println("Quantidade de vida:");
			qntVida = sc.nextInt();

			if (qntVida >= 1) {
				qntVida = this.vida;
			} else if (qntVida > 100) {
				System.out.println("100 de vida é o máximo. seu personagem está curado!");
				this.vida = 100;
			} else if (qntVida == 0) {
				System.out.println(">>" + (classe[personagemEscolhido]) + " chegou ao fim da vida 💀");
				vida = qntVida;
				validacao = true;
			}
		}
	}

	public void personagemFinal() {
		System.out.printf(
				">> Personagem Criado!\nNome: %s%nClasse: " + classe[personagemEscolhido] + " \nPoder:%d%nVida:%d%n",
				nome, poder, vida);
	}

	public void personagemFinalvida() {
		if (vida == 0) {
			System.out.println("Seu personagem morreu! Fim de jogo!");}
	}

	public void atualizarPersonagem() {

		while (!validacao) {
			System.out.println("Atualizar personagem? S/N");
			String resposta1 = sc.next();
			sc.nextLine();

			switch (resposta1.toLowerCase()) {
			case "s":
				System.out.println("Gostaria de atualizar\n[ vida ]- 1\n[ poder ]- 2");
				int resposta2 = sc.nextInt();
				sc.nextLine();

				if (resposta2 == 1) {
					atualizacaoVida();
					personagemFinalvida();
				} else if (resposta2 == 2) {
					setPoder();
					personagemFinal();
				}
				break;
			case "n":
				System.out.println("Fim de jogo!\n>>" + (classe[personagemEscolhido]) + " vive feliz");
				validacao = true;
				break;
			default:
				System.out.println("Digite 'S' para sim e 'N' para não.");
				break;
			}
		}
	}
}
