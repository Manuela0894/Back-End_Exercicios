package veiculos;

public class Onibus extends Veiculo {
	
	private static final float velocidade = 60;
	private float numeroParadas;

	public float getNumeroParadas() {
		return numeroParadas;
	}
	public void setNumeroParadas(float numeroParadas) {
		this.numeroParadas = numeroParadas;
	}
	public Onibus() {
		super(NomeVeiculos.ONIBUS);
	}
	 @Override
	public String calcularTempo(float distancia) {
		float paradas = (float) ((int) numeroParadas * 0.25);
		float tempoDecimal = distancia / velocidade;
		int horas = (int) ((int) tempoDecimal + paradas);
		tempoDecimal -= horas;
		tempoDecimal *= 60;
		int minutos = Math.round(tempoDecimal);
		
		return horas + "h " + String.format("%02d", minutos) + "min";
		
		
	}

}
