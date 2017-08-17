package xadrez;

public class Peao extends Peca{

    boolean firstMov;

    public Peao(byte x, byte y, boolean cor) {
        super(x, y, cor);
        this.firstMov = false;
    }

    private boolean mover() {
        return true;
    }

    @Override
    boolean caminhoValido(byte x, byte y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       @Override
    void putId() {
        if(this.isCor()){
            this.setId("\u2659"); 
        }else{
            this.setId("\u265F");
        }
    }

}
