/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratica01;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author User
 */
public class Q2 {

    public static void main(String[] args) {
        Stack <Integer> pilha = new Stack<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            System.out.println("Digite um numero:");
            int numero = input.nextInt();
            if(numero % 2 == 0){
                pilha.push(numero);
            }else{
                if (pilha.isEmpty()) {
                    System.out.println("A pilha esta vazia.");
                    
                }else{
                    pilha.pop();
                }
                
            }
        }
        
        if(!pilha.empty()){
            System.out.println("Os numeros que sobraram na pilha");
            int tam = pilha.size();
            for(int i=0; i < tam; i++){
                System.out.println(pilha.pop());
            }
            
        }else{
            System.out.println("Pilha vazia.");
        }
        
      
    }
    
}
