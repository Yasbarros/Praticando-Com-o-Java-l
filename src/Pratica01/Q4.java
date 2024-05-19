/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratica01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author User
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Queue <String> jogadores = new LinkedList<>();
       List <String> lista = new ArrayList<>();
       
       lista.add("Manu");
       lista.add("Matheuzin");
       lista.add("Yasmim");
       lista.add("Caio");
       Collections.shuffle(lista);
       
       
       for(String nome: lista){
           jogadores.add(nome);
       }
       
        for (int i = 1; i < lista.size() ; i++) {
            System.out.println("Batata quente");
            System.out.println("Quente");
            System.out.println("Quente");
            System.out.println(jogadores.poll() + "Queimou\n");
        }
        
        System.out.println(jogadores + "Ganhou!!");
       
    }
    
}
