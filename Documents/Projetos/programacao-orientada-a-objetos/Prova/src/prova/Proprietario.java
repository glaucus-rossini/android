package prova;

import java.time.LocalDate;

public class Proprietario {

    private String nome;
    private int CPF;
    private int RG;
    private Endereco endereco;
    private LocalDate dataDeNascimento;

    public Proprietario(String nome, int CPF, int RG, Endereco endereco) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getRG() {
        return RG;
    }

    public void setRG(int RG) {
        this.RG = RG;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "----PROPRIETÁRIO----" + "\n"
                + "Nome: " + nome + "\n"
                + "CPF: " + CPF + "\n"
                + "RG: " + RG + "\n"
                + endereco + "\n"
                + "Data de nascimento: " + dataDeNascimento;
    }

}
