package xadrez;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author victor
 */
public class Usuario {

    private  boolean cor;
    private  String nome;
    private int score; //quantas peças o jogador comeu neste jogo
    private int vitorias;
    private int derrotas;
    private float  percentual;

    protected Usuario(boolean cor, String nome, float percentual) {
        this.cor = cor;
        this.nome = nome;
        this.percentual = percentual; //Devemos usar metodos setters aqui?
        this.score = 0;
    }

    protected boolean isCor() {
        return cor;
    }

    protected int getVitorias() {
        return vitorias;
    }

    protected void setVitorias() {
        this.vitorias++;
    }

    protected int getDerrotas() {
        return derrotas;
    }

    protected void setDerrotas() {
        this.derrotas++;
    }

    protected void setPercentual() {
        this.percentual = this.vitorias / (this.vitorias + this.derrotas);
    }

    protected String getNome() {
        return nome;
    }

    protected int getScore() {
        return this.score;
    }

    protected void setScore(int score) {
        this.score = score;
    }

    protected float getPercentual() {
        return percentual;
    }

}
