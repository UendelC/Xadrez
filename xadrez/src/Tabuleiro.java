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
public class Tabuleiro {

    private final Peca tab[][] = new Peca[8][8];

    // implementar parte grafica.
    public Tabuleiro() {

        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                this.tab[x][y] = new Peca();
            }
        }

       //define peoes
        for (byte x = 0; x < 8; x ++) {
                tab[1][x] = new Peao(x, (byte) 0);
                tab[7][x] = new Peao(x, (byte) 7);
                tab[1][x].setCor(true);
                tab[7][x].setCor(false);
          }
         
        //define torres
        for (byte x = 0; x < 8; x += 7) {
            tab[0][x] = new Torre((byte) 0, x);
            tab[7][x] = new Torre((byte) 7, x);
            tab[0][x].setCor(true);
            tab[7][x].setCor(false);
        }
        
        //define Cavalo     
         for (byte x = 0; x < 8; x += 7) {
            tab[1][x] = new Cavalo(x, (byte) 1);
            tab[6][x] = new Cavalo(x, (byte) 6);
            tab[1][x].setCor(true);
            tab[6][x].setCor(false);
        }
         
         //define Bispo    
         for (byte x = 0; x < 8; x += 7) {
            tab[2][x] = new Bispo(x, (byte) 2);
            tab[5][x] = new Bispo(x, (byte) 5);
            tab[2][x].setCor(true);
            tab[5][x].setCor(false);
        }
        
         //define Rei
         tab[0][4] = new Rei((byte)0, (byte) 4);
         tab[0][4].setCor(true);
         tab[7][4] = new Rei((byte)7, (byte) 4);
         tab[0][4].setCor(false);
         
         //define Rainha
         tab[0][3] = new Rainha((byte)0, (byte) 4);
         tab[0][3].setCor(true);
         tab[7][3] = new Rainha((byte)7, (byte) 4);
         tab[7][3].setCor(false);
        
    }

}
