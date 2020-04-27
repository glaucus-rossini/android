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
    private int nrPortas;
    private Boolean tetoSolar;
    private int nrMarchas;
    private int marchaAtual;
    private Boolean cambioAutomatico;
    private int volumeCombustivel;
    private double Autonomia;

    public Carro(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNrPortas() {
        return nrPortas;
    }

    public void setNrPortas(int nrPortas) {
        this.nrPortas = nrPortas;
    }

    public Boolean getTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(Boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public int getNrMarchas() {
        return nrMarchas;
    }

    public void setNrMarchas(int nrMarchas) {
        this.nrMarchas = nrMarchas;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public Boolean getCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(Boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public int getVolumeCombustivel() {
        return volumeCombustivel;
    }

    public void setVolumeCombustivel(int volumeCombustivel) {
        this.volumeCombustivel = volumeCombustivel;
    }

    public double getAutonomia() {
        return Autonomia;
    }

    public void setAutonomia(double Autonomia) {
        this.Autonomia = Autonomia;
    }

    public void Acelerar(int acelerador) {

        this.setVelocidadeAtual(this.getVelocidadeAtual() + acelerador);

    }

    public void Frear(Boolean freio) {
        if (freio == Boolean.TRUE) {
            this.setVelocidadeAtual(this.getVelocidadeAtual() - this.getVelocidadeAtual());

        }
    }

    public void AumentarMarcha(int maisMarcha) {
        this.setMarchaAtual(this.getMarchaAtual() + maisMarcha);
    }

    public void DiminuirMarcha(int menosMarcha) {
        this.setMarchaAtual(this.getMarchaAtual() - menosMarcha);
    }

    public void EfetuarMarchaRe(Boolean re) {
        if (re == Boolean.TRUE) {
            this.setVelocidadeAtual((this.getVelocidadeAtual() - this.getVelocidadeAtual()) - 1);
        }
    }

    public void CalcularAutonomia(double desempenho) {
        this.setAutonomia(this.getVolumeCombustivel() * desempenho);

    }

    public void AbastecerCarro(int quantidadeCombustivel) {

        this.setVolumeCombustivel(this.getVolumeCombustivel() + quantidadeCombustivel);

    }

    public String toString() {
        return "----CARRO----" + "\n"
                + "Modelo: " + modelo + "\n"
                + "Cor: " + cor + "\n"
                + "Ano: " + ano + "\n"
                + marca + "\n"
                + "Chassi: " + chassi + "\n"
                + proprietario + "\n"
                + "Velocidade máxima: " + velocidadeMaxima + "\n"
                + "Velocidade atual: " + velocidadeAtual + "\n"
                + "Número de portas: " + nrPortas + "\n"
                + "Teto solar: " + tetoSolar + "\n"
                + "Número de marchas: " + nrMarchas + "\n"
                + "Marcha atual: " + marchaAtual + "\n"
                + "Cambio automático: " + cambioAutomatico + "\n"
                + "Volume Combustível: " + volumeCombustivel + "\n"
                + "Autonomia: " + Autonomia + "\n";
    }

}
