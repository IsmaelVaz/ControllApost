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
public class Aluno {
    private String nomeAluno, status, modAtual, proxMod;
    private int oid_aluno, aulasRealizadas, aulasPrevistas;

    public int getAulasPrevistas() {
        return aulasPrevistas;
    }

    public void setAulasPrevistas(int aulasPrevistas) {
        this.aulasPrevistas = aulasPrevistas;
    }

    public int getAulasRealizadas() {
        return aulasRealizadas;
    }

    public void setAulasRealizadas(int aulasRealizadas) {
        this.aulasRealizadas = aulasRealizadas;
    }
    
    

    public String getModAtual() {
        return modAtual;
    }

    public void setModAtual(String modAtual) {
        this.modAtual = modAtual;
    }

    public String getProxMod() {
        return proxMod;
    }

    public void setProxMod(String proxMod) {
        this.proxMod = proxMod;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOid_aluno() {
        return oid_aluno;
    }

    public void setOid_aluno(int oid_aluno) {
        this.oid_aluno = oid_aluno;
    }

    
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    
}
