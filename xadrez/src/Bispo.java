public class Bispo extends Peca {
    private void Mover(){
    
    }
    public boolean caminhoValido(byte finalX, byte finalY){
	byte xDiff = (byte) Math.abs(finalX - this.posicao[0]);
	byte yDiff = (byte) Math.abs(finalY - this.posicao[1]);
	return xDiff == yDiff;
    }
	    
	    
	
	
}
