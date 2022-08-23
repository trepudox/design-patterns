package com.trepudox.designpatterns.builder;

public class App {

    public static void main(String[] args) {
        Pessoa marco = new PessoaBuilder().nome("Marco").idade(20).build();

        Pessoa marco2 = new PessoaBuilder()
                .nome("Marco II")
                .cpf("22")
                .idade(22)
                .altura(2.2)
                .build();

        System.out.println(marco);
        System.out.println(marco2);
    }

}
