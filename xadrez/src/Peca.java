package xadrez;

public abstract class Peca {

    protected boolean cor; // false = preto    true = branco.
    protected byte posicao[] = new byte[2];
    protected boolean status; // false = morto true = vivo
    private String id;

    public Peca(byte x, byte y, boolean cor) {
        this.posicao[0] = x;
        this.posicao[1] = y;
        this.cor = cor;
        this.status = true;
        this.putId();
    }

    abstract boolean caminhoValido(byte x, byte y);

    abstract void putId();

    public boolean isStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    protected void setCor(boolean cor) {
        this.cor = cor;
    }

    private byte[] getPosicao() {
        return this.posicao;
    }

    protected void setPosicao(byte x, byte y) {
        this.posicao[0] = x;
        this.posicao[1] = y;
    }

    protected boolean isCor() {
        return cor;
    }

    protected boolean excluir() {
        this.status = false;

        return true;
    }

    protected boolean Mover(byte x, byte y, Tabuleiro t) {
        
        // if (!this.caminhoValido(x, y)) {
        //      return false;
        //  }
        
        if (t.ocupado(this, x, y)) {
            System.out.println("Existe uma peca sua neste local");
            return false;
        }

        t.setPeca(this, x, y);

        return true;
    }
}
