package xadrez;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author victor
 */
public class Fachada {

    Jogo j = new Jogo();

    protected boolean setUsuarios() {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("Digite o ID do primeiro jogador");
        name = s.next();
        this.j.u[0] = new Usuario(true, name, 0);
        System.out.println("Digite o ID do segundo jogador");
        name = s.next();
        this.j.u[1] = new Usuario(false, name, 0);
        Cadastro c = new Cadastro();
        c.setInfo(this.j.u[0]);
        c.setInfo(this.j.u[1]);
        return true;
    }

    protected boolean alguem_Venceu(Tabuleiro t) {
        switch (j.analise(t)) {
            case 1:
                System.out.println("O jogador " + this.j.u[0].getNome() + "venceu");
                j.gameOver(0);
                return true;
            case 2:
                System.out.println("O jogador " + this.j.u[1].getNome() + "venceu");
                j.gameOver(1);
                return true;
            default:
                return false;
        }
    }

    protected boolean Movimentar(int a, Tabuleiro t) throws GameException {
        Scanner s = new Scanner(System.in);
        int i, l;
        int j, m;

        System.out.println("Vez do jogador " + this.j.u[a].getNome() + " cor = " + this.j.u[a].isCor());
        System.out.println("Digite a possição da peça a ser movimentada");
        i = s.nextInt();
        String x = s.next();
        j = Character.getNumericValue(x.charAt(0)) - 10;
        i = 8 - i;

        this.j.PreRegraMovimentacao(t.tab[i][j], a);

        System.out.println("Insira a nova posição");
        l = s.nextInt();
        x = s.next();
        m = Character.getNumericValue(x.charAt(0)) - 10;
        l = 8 - l;

        this.j.RegraMovimentacao(t.tab[i][j], (byte) l, (byte) m, t);

        t.tab[i][j].Mover((byte) l, (byte) m, t);

        return true;

    }

    protected void imprimirTabuleiro(Tabuleiro t) {
        for (int i = 0; i < 8; i++) {
            System.out.print(8 - i);
            for (int j = 0; j < 8; j++) {
                if (t.tab[i][j] == null) {
                    System.out.print("|  ");
                } else {
                    if (t.tab[i][j].isStatus()) {
                        System.out.print("| " + t.tab[i][j].getId());
                    }
                }
            }
            System.out.println("|");
        }

        for (int i = 0; i < 8; i++) {
            System.out.printf("  %c", 97 + i);
        }
        System.out.println("");
    }
}
