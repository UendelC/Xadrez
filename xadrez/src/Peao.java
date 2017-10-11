package xadrez;

public class Peao extends Peca {

    boolean firstMov;

    public Peao(byte i, byte j, boolean cor) {
        super(i, j, cor);
        this.firstMov = true;
    }

    private boolean mover() {
        return true;
    }

    @Override
    boolean caminhoValido(byte i, byte j, Tabuleiro t) {
        if (Math.abs(i - this.posicao[0]) == 2) {
            if (this.firstMov) {
                this.firstMov = false;
                return true;
            } else {
                return false;
            }
        }

        if (Math.abs(this.posicao[0] - j) == 1) {
            if (t.ocupadoAdv(i, j, this)) {
                this.firstMov = false;
                return true;
            }
            return false;
        }

        if (Math.abs(i - this.posicao[0]) == 1) {
            this.firstMov = false;
            return true;
        }

        return false;
    }

    @Override
    void putId() {
        if (this.isCor()) {
            this.setId("\u2659");
        } else {
            this.setId("\u265F");
        }
    }

}
