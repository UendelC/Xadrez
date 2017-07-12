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

    private final boolean cor;
    private final String nome;
    private int score; //quantas peças o jogador comeu neste jogo
    private final float percentual;

    public Usuario(boolean cor, String nome, float percentual, int score) {
        this.cor = cor;
        this.nome = nome;
        this.percentual = percentual;
        this.score = 0;
    }

    public boolean isCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public float getPercentual() {
        return percentual;
    }

    public boolean Mover(Peca p, byte x, byte y, Tabuleiro tab) {
       
        if (p.isCor() != this.cor) {
            return false;
        } else if (!p.caminhoValido(x, y)) {
            return false;
        } else {
            

        }

        return true;
    }

}
