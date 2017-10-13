/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

/**
 *
 * @author victor
 */
public class Cadastro {

    // classe que vai manipular o repositorio.
    IRepositorio r;

    protected void setInfo(Usuario u) {
        String info = this.r.lerDados(u);
        String a[] = info.split(":");
        u.setVitorias(Integer.parseInt(a[1]));
        u.setDerrotas(Integer.parseInt(a[2]));
    }
}
