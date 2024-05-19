/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratica01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Impressora {

    public static void main(String[] args) {
        Queue <Doc> documento = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Deseja cadastrar documento para impressão:(N/Y)");
            String resposta = input.nextLine().toUpperCase();
            if(resposta.equals("Y")){
                System.out.println("Digite o nome do documento:");
                String nome = input.nextLine();
                System.out.println("Digite o numero de páginas");
                int paginas = input.nextInt();
                Doc novo = new Doc(nome,paginas);
                documento.add(novo);
            }else if(resposta.equals("N")){
                if(documento.isEmpty()){
                    System.out.println("Não tem documento na fila");
                    System.out.println("Deseja desligar a impressora? (N/Y)");
                    String desligar = input.nextLine().toUpperCase();
                    if(desligar.equals("N")){
                    }else if(desligar.equals("Y")){
                        break;
                    }else{
                        System.out.println("Resposta Inválida.");
                    }
                }else{
                    Doc atual = documento.poll();
                    System.out.println("Imprimindo: " + atual);
                    for (int i = 0; i < atual.getPaginas(); i++) {
                        System.out.println("imprimindo página "+(i+1));            
                    }      
                }
                
            }
                    
        }
    }
    
}
