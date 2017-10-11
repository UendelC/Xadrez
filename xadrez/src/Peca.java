package xadrez;

public abstract class Peca {

    protected boolean cor; // false = preto    true = branco.
    protected byte posicao[] = new byte[2];
    protected boolean status; // false = morto true = vivo
    private String id;

    public Peca(byte i, byte j, boolean cor) {
        this.posicao[0] = i;
        this.posicao[1] = j;
        this.cor = cor;
        this.status = true;
        this.putId();
    }

    abstract boolean caminhoValido(byte x, byte y, Tabuleiro t);

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

    protected byte getPosicao(byte x) {
        return this.posicao[x];
    }

    protected void setPosicao(byte i, byte j) {

        this.posicao[0] = i;
        this.posicao[1] = j;
    }

    protected boolean isCor() {
        return cor;
    }

    protected boolean excluir() {
        this.status = false;

        return true;
    }

    protected boolean Mover(byte i, byte j, Tabuleiro t) throws GameException {
        t.tab[this.getPosicao((byte) 0)][this.getPosicao((byte) 1)] = null;
        t.tab[i][j] = this;
        this.setPosicao(i, j);
        return true;
    }
}
