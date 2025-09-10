
package veiculos;

public enum NomeVeiculos {

	CARRO("Carro"),
	BICICLETA("Bicicleta"),
	ONIBUS("Onibus");
	
	private final String mostrarNome;
	
	NomeVeiculos(String mostrarNome){
		this.mostrarNome = mostrarNome;
	}

	public String getMostrarNome() {
		return mostrarNome;
	}
	
	
}
