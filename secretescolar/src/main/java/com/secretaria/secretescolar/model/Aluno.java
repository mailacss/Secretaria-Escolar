package com.secretaria.secretescolar.model;

public class Aluno {
    private String nome;
    private int idade;
    private int id;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters corretos

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Método para exibir informações do aluno
    public void exibirInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }





}
