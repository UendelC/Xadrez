/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author victor
 */
public class Repositoriotxt implements IRepositorio {

    @Override
    public boolean gravarDados(Usuario u) {
        BufferedWriter buffWrite = null;

        try {
            buffWrite = new BufferedWriter(new FileWriter("dados.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Repositoriotxt.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            buffWrite.append(u.getNome() + ":" + u.getVitorias() + ":" + u.getDerrotas() + "\n");
        } catch (IOException ex) {
            Logger.getLogger(Repositoriotxt.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            buffWrite.close();
        } catch (IOException ex) {
            Logger.getLogger(Repositoriotxt.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    @Override
    public String lerDados(Usuario u) {
        BufferedReader buffRead = null;
        try {
            buffRead = new BufferedReader(new FileReader("dados.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Repositoriotxt.class.getName()).log(Level.SEVERE, null, ex);
        }
        String linha = " ";

        while (true) {
            if (linha != null) {
                String a[];
                a = linha.split(":");
                if (a[0].equals(u.getNome())) {
                    return linha;
                }

            } else {
                break;
            }
            try {
                linha = buffRead.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Repositoriotxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            buffRead.close();
        } catch (IOException ex) {
            Logger.getLogger(Repositoriotxt.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
