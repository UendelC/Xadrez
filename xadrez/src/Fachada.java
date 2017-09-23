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

    protected boolean setUsuarios(Usuario[] u) {
        Scanner s = new Scanner(System.in);
        String name;
        System.out.println("Digite o ID do primeiro jogador");
        name = s.next();
        u[0] = new Usuario(true, name, 0);
        System.out.println("Digite o ID do segundo jogador");
        u[1] = new Usuario(false, name, 0);
        return true;
    }

    protected boolean alguem_Venceu(Tabuleiro t, Usuario[] u) {
        switch (j.analise(t)) {
            case 1:
                System.out.println("O jogador " + u[0].getNome() + "venceu");
                j.gameOver(u[0], u[1]);
                return true;
            case 2:
                System.out.println("O jogador " + u[1].getNome() + "venceu");
                j.gameOver(u[1], u[0]);
                return true;
            default:
                return false;
        }
    }

    protected boolean Movimentar(Usuario u, Tabuleiro t) {
        Scanner s = new Scanner(System.in);
        int i, l;
        int j, m;

        System.out.println("Vez do jogador " + u.getNome() + " cor = " + u.isCor());
        System.out.println("Digite a possição da peça a ser movimentada");
        i = s.nextInt();
        String x = s.next();
        j = Character.getNumericValue(x.charAt(0)) - 10;
        i = 8 - i;

        if (t.tab[i][j] == null) {
            System.out.println("Nenhuma peça selecionada");
            return false;
        }

        //NESTA PARTE DEVE SER IMPLEMENTADA TRATAMENTO DE ERROS
        if (t.tab[i][j].cor != u.isCor()) {
            System.out.println("Peça pertencente ao oponente");
            return false;
        }

        System.out.println("Insira a nova posição");
        l = s.nextInt();
        x = s.next();
        m = Character.getNumericValue(x.charAt(0)) - 10;
        l = 8 - l;

        if (t.tab[i][j].Mover((byte) l, (byte) m, t)) {
            t.tab[i][j] = null;
            return true;
        }
        return false;
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
