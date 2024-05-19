/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratica01;

/**
 *
 * @author User
 */
public class Doc {
    private String nome;
    private int paginas;
    
    public Doc(String nome, int paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Doc{" + "nome=" + nome + ", paginas=" + paginas + '}';
    }
    
    
}
