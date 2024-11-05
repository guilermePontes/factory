package org.example;

public class FabricaPessoa {

    static int id = 0;

    public Pessoa criarPessoa(String nome, int idade) {
        return new Pessoa(id++, nome, idade);
    }
}
