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
    protected Rei rei[] = new Rei[2];

    //Deve salvar a porsição dos reis para verificar se estão em cheque e para ver se ainda estão vivos;
    // implementar parte grafica.
    public Tabuleiro() {

        //define peoes
        for (byte x = 0; x < 8; x++) {
            tab[1][x] = new Peao((byte) 1, x, false);
            tab[6][x] = new Peao((byte) 6, x, true);
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
        this.rei[0] = (Rei) tab[0][4];
        this.rei[1] = (Rei) tab[7][4];

        //define Rainha
        tab[0][3] = new Rainha((byte) 0, (byte) 3, false);
        tab[7][3] = new Rainha((byte) 7, (byte) 3, true);
    }

    public boolean vazio(byte i, byte j) {
        return this.tab[i][j] == null;
    }

    public boolean ocupadoAdv(byte i, byte j, Peca p) {
        if (this.tab[i][j] != null) {
            return this.tab[i][j].isCor() == p.isCor();
        }
        return false;
    }

    private boolean excluirPeca(byte i, byte j) {
        this.tab[i][j].excluir();
        this.tab[i][j].setPosicao((byte) -1, (byte) -1);
        this.tab[i][j] = null;
        return true;
    }
}
