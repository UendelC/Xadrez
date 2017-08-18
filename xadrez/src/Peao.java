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
        if(posicao[1]==y && (x-posicao[0])<2){
            if(firstMov && (x-posicao[0])==2){
                firstMov = false;
                return true;
            } else {
                if((x-posicao[0])==1){
                    return true;
                }
            }
        }
        return false;
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
