package com.trepudox.designpatterns.builder;

public class PessoaBuilder {

    private String nome;
    private int idade;
    private String cpf;
    private double altura;

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public PessoaBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public PessoaBuilder altura(double altura) {
        this.altura = altura;
        return this;
    }

    public Pessoa build() {
        return new Pessoa(nome, idade, cpf, altura);
    }

}
