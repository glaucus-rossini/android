package prova;

public class Carro {

    private String modelo;
    private String cor;
    private int ano;
    private Marca marca;
    private String chassi;
    private Proprietario proprietario;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int nrDePortas;
    private Boolean temTetoSolar;
    private int nrMarchas;
    private Boolean temCambioAutomatico;
    private int volumeDeCombustível;

    public Carro(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
    
}