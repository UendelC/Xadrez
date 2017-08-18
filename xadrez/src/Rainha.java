/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

/**
 *
 * @author victor
 */
public class Rainha extends Peca{

    public Rainha(byte x, byte y, boolean cor) {
        super(x, y, cor);
    }
    
    @Override
     boolean caminhoValido(byte x, byte y) {
        boolean teste1, teste2;
        byte xDiff = (byte) Math.abs(x - this.posicao[0]);
	    byte yDiff = (byte) Math.abs(y - this.posicao[1]);
	    teste1 = xDiff == yDiff;
        
        teste2 = posicao[0] == x ^ posicao[1] == y;
        
        return teste1 || teste2;
    }

      @Override
    void putId() {
        if(this.isCor()){
            this.setId("\u2655"); 
        }else{
            this.setId("\u265B");
        }
    }
}
