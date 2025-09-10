package veiculos;

public abstract class Veiculo {
    protected String nomeVeiculo;
    private float distancia;
    
    public Veiculo(NomeVeiculos nomes) {
        this.nomeVeiculo = nomes.getMostrarNome();
       
    }
    
    public String getNomeVeiculo() {
        return nomeVeiculo;
    }
    
    
	public abstract String calcularTempo(float distancia);
		 //método obrigatório para as classes "Bicicleta, Carro, Onibus"
	
	
}
