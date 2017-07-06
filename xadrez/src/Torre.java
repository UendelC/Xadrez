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

    Torre(byte x, byte b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     private boolean Mover(byte x, byte y){
         return x== this.posicao[0] ^ y == this.posicao[1];
    }
}
