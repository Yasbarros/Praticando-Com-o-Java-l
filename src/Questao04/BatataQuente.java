/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao04;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author ALUNO
 */
public class BatataQuente {
    public static void main(String[]args) throws InterruptedException{
        Queue<String> criancas = new ConcurrentLinkedQueue<>();
        List<String> eliminadas = new ArrayList<>();
        Scanner scan =  new Scanner(System.in);
        System.out.println("Quantas crianças irão compor o circulo?");
        int qtd = scan.nextInt();
        for(int i = 0; i < qtd; i++){
            criancas.add("Criança "+ (i+1));
        }
        System.out.println(criancas);
        Random gerador = new Random();
        int eliminada = 0;
        int tamanho = criancas.size();
        while(true){
            eliminada = gerador.nextInt(tamanho) + 1;
            if(!eliminadas.contains("Criança "+eliminada)){
                if(criancas.size() > 1){
                    System.out.println("Batata...");
                    for(String atual: criancas){
                        new Thread().sleep(3000);
                        if(!atual.endsWith(""+eliminada)){
                            System.out.println("quente");
                        } else {
                            System.out.println("queimou!");
                            System.out.println(atual+ " saiu");
                            eliminadas.add(atual);
                            criancas.remove(atual);
                            System.out.println(criancas);
                            break;
                        }
                    }
                } else {
                    System.out.println(criancas.poll() + " venceu");
                    break;
                }
            }
        }
    }
}
