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
public class Fachada {

    protected void imprimirTabuleiro(Tabuleiro t) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (t.tab[i][j] == null) {
                    System.out.print("|    ");
                } else {
                    if (t.tab[i][j].isStatus()) {
                        System.out.print("| " + t.tab[i][j].getId());
                    }
                }
            }
             System.out.println(" |");
        }
    }
}
