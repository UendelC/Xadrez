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
public interface IRepositorio {
    
    /**
     *
     * @param tab
     * @param u1
     * @param u2
     * @return
     */
    boolean saveGame(Tabuleiro tab, Usuario u1, Usuario u2);
}
