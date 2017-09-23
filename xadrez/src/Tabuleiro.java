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
public class Tabuleiro {

    protected final Peca tab[][] = new Peca[8][8];
    protected int rei[][] = new int[2][2];

    //Deve salvar a porsição dos reis para verificar se estão em cheque e para ver se ainda estão vivos;
    // implementar parte grafica.
    public Tabuleiro() {

        //define peoes
        for (byte x = 0; x < 8; x++) {
            tab[1][x] = new Peao(x, (byte) 0, false);
            tab[6][x] = new Peao(x, (byte) 7, true);
        }

        boolean aux = false;
        //define torres
        for (byte x = 0; x < 8; x += 7) {

            tab[0][x] = new Torre((byte) 0, x, false);
            tab[7][x] = new Torre((byte) 7, x, true);

            //define Cavalo     
            tab[x][1] = new Cavalo(x, (byte) 1, aux);
            tab[x][6] = new Cavalo(x, (byte) 6, aux);

            //define Bispo    
            tab[x][2] = new Bispo(x, (byte) 2, aux);
            tab[x][5] = new Bispo(x, (byte) 5, aux);
            aux = true;
        }

        //define Rei
        tab[0][4] = new Rei((byte) 0, (byte) 4, false);
        tab[7][4] = new Rei((byte) 7, (byte) 4, true);
        rei[0][0] = 0;
        rei[0][1] = rei[1][1] = 4;
        rei[1][0] = 7;

        //define Rainha
        tab[0][3] = new Rainha((byte) 0, (byte) 4, false);
        tab[7][3] = new Rainha((byte) 7, (byte) 4, true);
    }

    public boolean ocupado(Peca p, byte x, byte y) {
        if (this.tab[x][y]!=null) {
            return (p.isCor() == this.tab[x][y].isCor());
        }

        return false;
    }

    public void setPeca(Peca p, byte x, byte y) {
        //System.out.println("x = " + x + "y = " + y);
        p.setPosicao(x, y);
        this.tab[x][y] = p;
    }

    private boolean excluirPeca(byte x, byte y) {
        this.tab[x][y].excluir();
        this.tab[x][y].setPosicao((byte) -1, (byte) -1);
        this.tab[x][y] = null;
        return true;
    }
}
