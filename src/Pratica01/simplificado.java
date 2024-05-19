/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratica01;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author User
 */
public class simplificado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Doc> documentos = new LinkedList<>();
        Doc novo = new Doc("a1", 2);
        Doc novo2 = new Doc("a2", 6);
        
        documentos.add(novo);
        documentos.add(novo2);
        
        while (!documentos.isEmpty()) {
            Doc atual = documentos.poll();
            System.out.println("Nome do arquivo sendo imprimido " + atual.getNome());
            for (int i = 0; i < atual.getPaginas(); i++) {
                System.out.println("pagina " + (i + 1));
            }                    
        }

    }
    
}
