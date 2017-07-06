
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class Tabuleiro {

    private final Peca tab[][] = new Peca[8][8];

    // implementar parte grafica.
    public Tabuleiro(Peca[][] tab) {

        for (Peca[] x : tab) {
            for (Peca y : x) {
                y = new Peca();
            }
        }
            
        //define torres
        for(byte x =0 ; x < 8; x+=7){
            tab[x][0] = new Torre(x,(byte) 0);
            tab[x][7] = new Torre(x,7);
           
        }
        tab[0][0] = new Torre();
        tab[0][7] = new Torre();
        
        
    }

}
