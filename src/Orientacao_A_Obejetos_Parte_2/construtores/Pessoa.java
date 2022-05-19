package Orientacao_A_Obejetos_Parte_2.construtores;

public class Pessoa {

    String nome;
    int idade;
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }

}
