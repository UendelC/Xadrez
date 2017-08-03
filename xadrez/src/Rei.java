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
public class Rei extends Peca {

    private final boolean check;
    private final boolean firstMov;
   

    public Rei(byte x, byte y) {
        super(x,y);
        this.check = false;
        this.firstMov = false;
    }

    @Override
    boolean caminhoValido( byte x, byte y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
