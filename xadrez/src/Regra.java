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
public interface Regra {

    boolean PreRegraMovimentacao(Peca p, int a) throws GameException;

    boolean RegraMovimentacao(Peca p, byte x, byte y, Tabuleiro t) throws GameException;

}
