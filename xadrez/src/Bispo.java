package xadrez;

public class Bispo extends Peca {

    public Bispo(byte x, byte y, boolean cor) {
        super(x, y, cor);
    }

    private void Mover() {

    }

    @Override
    public boolean caminhoValido(byte finalX, byte finalY) {
        byte xDiff = (byte) Math.abs(finalX - this.posicao[0]);
        byte yDiff = (byte) Math.abs(finalY - this.posicao[1]);
        return xDiff == yDiff;
    }

    @Override
    void putId() {
        if(this.isCor()){
            this.setId("\u2657"); 
        }else{
            this.setId("\u265D");
        }
    }

}
