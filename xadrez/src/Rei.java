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

    protected  boolean check;
    private  boolean firstMov;

    public Rei(byte x, byte y, boolean cor) {
        super(x, y, cor);
        this.check = false;
        this.firstMov = false;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    boolean caminhoValido(byte x, byte y, Tabuleiro t) {
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
    
    public void setPosicao(byte[] posicao) {
        this.posicao = posicao;
    }

    @Override
    protected boolean Mover(byte x, byte y, Tabuleiro t) throws GameException {
        return super.Mover(x, y, t); //To change body of generated methods, choose Tools | Templates.
    }

}
