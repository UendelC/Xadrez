package xadrez;

public abstract class Peca {

    protected  boolean cor; // false = preto    true = branco.
    protected byte posicao[] = new byte[2];
    protected boolean status; // false = morto true = vivo.

    public Peca(byte x, byte y) {
        this.posicao[0] = x;
        this.posicao[1] = y;
    }

    abstract boolean caminhoValido(byte x, byte y);

    protected  void setCor(boolean cor) {
        this.cor = cor;
    }

    private byte[] getPosicao() {
        return this.posicao;
    }
    
    protected void setPosicao(byte x, byte y) {
        this.posicao[0] = x;
        this.posicao[1] = y;
    }

    private boolean isCor() {
        return cor;
    }
    
    protected boolean excluir(){
        this.status = false;
        
        return true;
    }

    private boolean Mover(Usuario u, byte x, byte y, Tabuleiro t) {

        if (this.isCor() != u.isCor() || !this.caminhoValido(x, y)) {
            return false;
        }
        
        //t.settab(this, x, y);

        return true;
    }
}
