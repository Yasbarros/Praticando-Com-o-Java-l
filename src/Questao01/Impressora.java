/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class Impressora {
    public static void main(String[]args) throws InterruptedException{
        Queue<Documento> documentos = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Deseja imprimir um documento (Y/N)");
            String resposta = scan.nextLine().toUpperCase();
            if(resposta.equals("Y")){
                System.out.println("Digite o nome do documento");
                String nome = scan.nextLine();
                System.out.println("Digite a quantidade de páginas");
                int paginas = Integer.parseInt(scan.nextLine());
                Documento novo = new Documento(nome, paginas);
                documentos.add(novo);
            } else if(resposta.equals("N")){
                if(documentos.isEmpty()){
                    System.out.println("Não existem documentos na fila");
                    System.out.println("Deseja desligar a impressora? (Y/N)");
                    resposta = scan.nextLine().toUpperCase();
                    if(resposta.equals("Y")){
                        break;
                    } else if(resposta.equals("N")){
                        continue;
                    } else {
                        System.out.println("Resposta Inválida");
                    }
                } else {
                    Documento atual = documentos.poll();
                    System.out.println("Imprimindo "+ atual);
                    for(int i = 0; i < atual.getQtd(); i++){
                        System.out.println("imprimindo página "+(i+1));
                        new Thread().sleep(5000);                        
                    }
                }
                
            } else {
                System.out.println("Resposta inválida");
            }
        }
    }
}
