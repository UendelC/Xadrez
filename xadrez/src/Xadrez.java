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
        Usuario u[] = new Usuario[2];

        Fachada f = new Fachada();
        Tabuleiro t = new Tabuleiro();

        f.setUsuarios(u);
        
        while (!f.alguem_Venceu(t, u)) {
            for (int i = 0; i < 2; i++) {
                f.imprimirTabuleiro(t);
                if (!f.Movimentar(u[i], t)) {
                    System.out.println("ocorreu um problema");
                    i--;
                }
            }
        }
    }
}
