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
        

        Fachada f = new Fachada();
        Tabuleiro t = new Tabuleiro();

        f.setUsuarios();

        while (!f.alguem_Venceu(t)) {
            for (int i = 0; i < 2; i++) {
                try {
                    f.imprimirTabuleiro(t);
                    f.Movimentar(i, t);
                } catch (GameException e) {
                    System.out.println(e.getMessage());
                    i--;
                }
            }
        }
    }
}
