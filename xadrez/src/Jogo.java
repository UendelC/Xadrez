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
        
        //Usuario user1 = new Usuario("Victoe");
        //Usuario user2 = new Usuario();
        Tabuleiro tab = new Tabuleiro();
        
    }  
    
    private void gameOver(Usuario userwin, Usuario userlose){
        userwin.setVitorias();
        userwin.setPercentual();
        userlose.setDerrotas();
        userlose.setPercentual();
    }
    
    
    
    
}
