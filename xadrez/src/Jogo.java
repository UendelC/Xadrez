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

public class Jogo {

    public Jogo() {
        
    }  
    
    //retorna a cor do vencedor;
    protected int analise(Tabuleiro t){
        if(!(t.tab[t.rei[0][0]][t.rei[0][1]].isStatus())){
            return 1;
        }
        if(!t.tab[t.rei[0][0]][t.rei[0][1]].isStatus()){
            return 0;
        }
        return 3;
    }
    
    //criar metodo fim de jogo se um dos reis recebeu status  = false;
    protected void gameOver(Usuario userwin, Usuario userlose){
        userwin.setVitorias();
        userwin.setPercentual();
        userlose.setDerrotas();
        userlose.setPercentual();
    }
}
