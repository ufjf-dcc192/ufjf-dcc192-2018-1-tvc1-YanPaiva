/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC192.ufjf.br.dados;

/**
 *
 * @author YanNotebook
 */
public class Pessoas {
       private int id;
       private String nome;
       private String dataDisponivelInicio;
       private String dataDisponivelTermino;
       private boolean ehComunidade;
       private String senha;
    public Pessoas() {
    }

    public Pessoas(String nome,String senha, boolean ehComunidade) {
        this.nome = nome;
        this.senha = senha;
        this.dataDisponivelInicio = "--";
        this.dataDisponivelTermino = "--";
        this.ehComunidade = ehComunidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDisponivelInicio() {
        return dataDisponivelInicio;
    }

    public void setDataDisponivelInicio(String dataDisponivelInicio) {
        this.dataDisponivelInicio = dataDisponivelInicio;
    }

    public String getDataDisponivelTermino() {
        return dataDisponivelTermino;
    }

    public void setDataDisponivelTermino(String dataDisponivelTermino) {
        this.dataDisponivelTermino = dataDisponivelTermino;
    }

    public boolean isEhComunidade() {
        return ehComunidade;
    }

    public void setEhComunidade(boolean ehComunidade) {
        this.ehComunidade = ehComunidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

}
