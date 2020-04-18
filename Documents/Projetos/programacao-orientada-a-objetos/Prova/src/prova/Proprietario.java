package prova;

import java.time.LocalDate;

import java.time.Month;

public class Proprietario {

    public Proprietario(String nome, int CPF, int RG) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
    }

    private String nome;
    private int CPF;
    private int RG;
    private LocalDate dataNasc;

}