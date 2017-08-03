package xadrez;

public class Peao extends Peca implements IMovimenta {

    boolean firstMov;

    public Peao(byte x, byte y) {
        super(x, y);
        this.firstMov = false;
    }

    private boolean mover() {
        return true;
    }

    @Override
    boolean caminhoValido(byte x, byte y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
