package xadrez;

public class Peao extends Peca{
  boolean firstMov;
  
  public Peao(byte x, byte y) {
        this.posicao[0] = x;
        this.posicao[1] = y;
        this.firstMov = false;
    } 
}
