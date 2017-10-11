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
public class Jogo implements Regra {

    Usuario u[] = new Usuario[2];

    public Jogo() {

    }

    @Override
    public boolean PreRegraMovimentacao(Peca p, int a) throws GameException {

        if (p == null) {
            throw new GameException("Nenhuma peça selecionada");
        }

        if (p.isCor() != this.u[a].isCor()) {
            throw new GameException("Peça pertencente ao oponente");
        }
        return true;
    }

    //retorna a cor do vencedor;
    protected int analise(Tabuleiro t) {
        if (!(t.tab[t.rei[0].posicao[0]][t.rei[0].posicao[1]].isStatus())) {
            return 1;
        }
        if (!(t.tab[t.rei[1].posicao[0]][t.rei[1].posicao[1]].isStatus())) {
            return 2;
        }
        return 3;
    }

    //criar metodo fim de jogo se um dos reis recebeu status  = false;
    protected void gameOver(int n) {

        this.u[n].setVitorias();
        this.u[n].setPercentual();
        if (n == 1) {
            this.u[0].setDerrotas();
            this.u[0].setPercentual();
        } else {
            this.u[0].setDerrotas();
            this.u[0].setPercentual();
        }
    }

    @Override
    public boolean RegraMovimentacao(Peca p, byte i, byte j, Tabuleiro t) throws GameException {
        if (!p.caminhoValido((byte) i, (byte) j, t)) {
            throw new GameException("Este movimento não é valido.");
        }
        return true;
    }

//    public int verificaCheque(Tabuleiro t) {
//        int i = t.rei[0].getPosicao((byte) 0);
//
//        for (int j = 0; j < 8; j++) {
//            if (t.ocupadoAdv((byte) i, (byte) j, t.rei[0])) {
//                t.rei[0].check = true;
//            }
//        }
//    }
}
