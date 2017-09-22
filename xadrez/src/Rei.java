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
public class Rei extends Peca {

    private final boolean check;
    private final boolean firstMov;

    public Rei(byte x, byte y, boolean cor) {
        super(x, y, cor);
        this.check = false;
        this.firstMov = false;
    }

    @Override
    boolean caminhoValido(byte x, byte y) {
        byte xDiff = (byte) Math.abs(x - this.posicao[0]);
        byte yDiff = (byte) Math.abs(y - this.posicao[1]);

        return xDiff + yDiff < 2;
    }

    @Override
    void putId() {
        if (this.isCor()) {
            this.setId("\u2654");
        } else {
            this.setId("\u265A");
        }
    }

    @Override
    protected boolean Mover(byte x, byte y, Tabuleiro t) {
        if (this.isCor()) {
            t.rei[0][0] = x;
            t.rei[0][1] = y;
        }
        return super.Mover(x, y, t); //To change body of generated methods, choose Tools | Templates.
    }

}
