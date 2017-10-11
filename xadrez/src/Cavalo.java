/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

public class Cavalo extends Peca {

    public Cavalo(byte i, byte j, boolean cor) {
        super(i, j, cor);
    }

    @Override
    boolean caminhoValido(byte i, byte j, Tabuleiro t) {
        boolean a;
        a = false;

        if (Math.abs(this.posicao[0] - i) == 2) {
            if (Math.abs(this.posicao[1] - j) == 1) {
                a = true;
            }
        }

        if (Math.abs(this.posicao[1] - j) == 2) {
            if (Math.abs(this.posicao[0] - i) == 1) {
                a = true;
            }
        }
        return a;
    }

    @Override
    void putId() {
        if (this.isCor()) {
            this.setId("\u2658");
        } else {
            this.setId("\u265E");
        }
    }

}
