package pessoa;

public class Pessoa {
	private String name;
	private int age;
	private int anoNascimento;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
			if(age <= 0) {
				System.out.println("Idade inválida!");
			}else {
			this.age = age;
			this.anoNascimento = 2025 - age;}
		}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	
	public  String getMensagemHistorica() {
		int ano = getAnoNascimento();
		if(ano >= 1970 && ano <= 1979) return "A revolução do microprocessador começa!";
		if(ano >= 1980 && ano <= 1989) return "O IBM pc foi lançado!";
		if(ano >= 1990 && ano <= 1999) return "A exploxão da bolha das empresas '.com'!";
		if(ano >= 2000 && ano <= 2010) return "Ascenção dos SmartPhones e apps!";	
		if(ano >= 2010 && ano <= 2020) return "A inteligência artificial entra no dia a dia!";	
		if(ano >= 2021 && ano <= 2025) return "A revolução da IA multimodal!";
			return "Seu nascimento!";
			}
	public void exibirMenssagem() {
		System.out.println("Olá," + getName() +"! Na década de " +  getAnoNascimento() + " um grande acontecimento foi:");
		System.out.println(">> " + getMensagemHistorica());
	}
}
