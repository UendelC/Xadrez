/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

public class Cavalo extends Peca {

    public Cavalo(byte x, byte y, boolean cor) {
        super(x, y, cor);
    }

    @Override
    boolean caminhoValido(byte x, byte y) {
        boolean a;
        a = false;
        if((posicao[1]==y+2 && posicao[0]==x+1)||(posicao[1]==y+2 && posicao[0]==x-1)||(posicao[1]==y+1 &&
        posicao[0]==x+2)||(posicao[1]==y+1 && posicao[0]==x-2)||(posicao[1]==y-1 && posicao[0]==x+2)||(posicao[1]==y-1 &&
            posicao[0]==x-2)||(posicao[1]==y-2 && posicao[0]==x+1)||(posicao[1]==y-2 && posicao[0]==x-1)){
        a = true;
        }   
        return a;
    }
    
     @Override
    void putId() {
        if(this.isCor()){
            this.setId("\u2658"); 
        }else{
            this.setId("\u265E");
        }
    }

}
