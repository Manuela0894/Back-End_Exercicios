package veiculos;

public class Carro extends Veiculo {
	
	private static final float velocidade = 80;
	//variável de valor imutável que pode ser chamada pela classe e não pela instância de um objt
	
	public Carro() {
		super(NomeVeiculos.CARRO);
	}

	@Override
	public String calcularTempo(float distancia) {
		float tempoDecimal = distancia / velocidade;
		int horas = (int) tempoDecimal;
		tempoDecimal -= horas;
		tempoDecimal *= 60;
		int minutos = (int) tempoDecimal;
		
		return horas + "h " + String.format("%02d", minutos) + "min";
		
		
	}

	public static float getVelocidade() {
		return velocidade;
	}

	
	
		
}
