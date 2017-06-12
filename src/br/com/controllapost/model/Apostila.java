/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controllapost.model;

/**
 *
 * @author Aluno
 */
public class Apostila {
    private int oid_apostila, qtdMin, qtdAtual;
    private String nome;

    public int getOid_apostila() {
        return oid_apostila;
    }

    public void setOid_apostila(int oid_apostila) {
        this.oid_apostila = oid_apostila;
    }

    public int getQtdMin() {
        return qtdMin;
    }

    public void setQtdMin(int qtdMin) {
        this.qtdMin = qtdMin;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
