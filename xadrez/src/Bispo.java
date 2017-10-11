package xadrez;

public class Bispo extends Peca {

    public Bispo(byte x, byte y, boolean cor) {
        super(x, y, cor);
    }

    private void Mover() {

    }

    @Override
    public boolean caminhoValido(byte i, byte j, Tabuleiro t) {
        byte xDiff = (byte) Math.abs(j - this.posicao[1]);
        byte yDiff = (byte) Math.abs(i - this.posicao[0]);
        return xDiff == yDiff;
    }

    @Override
    void putId() {
        if (this.isCor()) {
            this.setId("\u2657");
        } else {
            this.setId("\u265D");
        }
    }

}
