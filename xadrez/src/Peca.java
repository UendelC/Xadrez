package xadrez;

public class Peca {
   
    protected  boolean cor; // false = preto    true = branco.
    protected final byte posicao[] = new byte[2];
    protected boolean status; // false = morto true = vivo.

    public void Peca(byte x,byte y){
        this.posicao[0] = x;
        this.posicao[1] = y;
    }

    public void setCor(boolean cor) {
        this.cor = cor;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    public boolean isStatus() {
        return this.status;
    }
    
//    public byte[] getPosicao(){
//        return this.posicao;
//    }
//    
}
