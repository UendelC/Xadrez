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
public class Xadrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tabuleiro t = new Tabuleiro();
       Fachada f = new Fachada();
        
      f.imprimirTabuleiro(t);
        //Jogo jg = new Jogo();
       
        
        // TODO code application logic here
    }
    
}
