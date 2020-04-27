package prova;

public class Endereco {

    private String rua;
    private int complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private int CEP;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getComplemento() {
        return complemento;
    }

    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return "----ENDEREÇO----" + "\n"
                + "Rua: " + rua + "\n"
                + "Complemento: " + complemento + "\n"
                + "Bairro: " + bairro + "\n"
                + "Cidade: " + cidade + "\n"
                + "Estado: " + estado + "\n"
                + "CEP: " + CEP;
    }

}
