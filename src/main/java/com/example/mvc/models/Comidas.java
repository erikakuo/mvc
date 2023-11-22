package com.example.mvc.models;

 //https://github.com/ClaudioNunes/DemoMVC/blob/master/src/main/java/br/edu/fatec/mvcDemo/models/Aluno.java

public class Comidas {

    private String nome;
    private String pais;

    //private double p1;

    //private double p2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
/*
    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }
*/
    public Comidas(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }
}
