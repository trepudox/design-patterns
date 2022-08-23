package com.trepudox.designpatterns.builder;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private double altura;

    public Pessoa() {}

    public Pessoa(String nome, int idade, String cpf, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s %.2f", this.nome, this.idade, this.cpf, this.altura);
    }
}
