package xadrez;

public class Bispo extends Peca {
    
    public Bispo(byte x, byte y) {
        this.posicao[0] = x;
        this.posicao[1] = y;
    } 
    
    public boolean caminhoValido(byte finalX, byte finalY){
	byte xDiff = (byte) Math.abs(finalX - this.posicao[0]);
	byte yDiff = (byte) Math.abs(finalY - this.posicao[1]);
	return xDiff == yDiff;
    }
	    
	    
	
	
}
