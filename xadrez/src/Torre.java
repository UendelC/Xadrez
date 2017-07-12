package xadrez;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class Torre extends Peca {

    public Torre(byte x, byte y) {
        this.posicao[0] = x;
        this.posicao[1] = y;
    }  
    
    @Override
    public boolean caminhoValido(byte x, byte y) {
        return x== this.posicao[0] ^ y == this.posicao[1];
    }
        
    
}
