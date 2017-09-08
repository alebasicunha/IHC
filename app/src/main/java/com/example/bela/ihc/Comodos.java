package com.example.bela.ihc;

/**
 * Created by Bela on 30/11/2016.
 */

public class Comodos {
    private String nome;

    public Comodos(){}

    public Comodos(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return nome;
    }
}
