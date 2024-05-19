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
public class Q3 {

    
    public static void main(String[] args) {
        Stack <Integer> par = new Stack<>();
        Stack <Integer> impar = new Stack<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero");
            int numero = input.nextInt();
            if(numero == 0){
                if(par.isEmpty()){
                    System.out.println("A pilha esta vazia.");
                }else{
                    par.pop();
                }
                
                if(impar.isEmpty()){
                    System.out.println("A pilha esta vazia.");
                }else{
                    impar.pop();
                }
                
               } if( numero % 2 == 0){
                   par.push(numero);
                }else if( numero % 2 != 0){
                       impar.push(numero);
                }else{
                    System.out.println("resposta Invalida");
                }
        }
        
        if(!par.isEmpty()){
            int tam = par.size();
            for (int i = 0; i < tam; i++) {
                System.out.println("Pilha par: " + par.pop());
            }
        }else{
            System.out.println("Pilha vazia");
        }
        
        if(!impar.isEmpty()){
            int tam = impar.size();
            for (int i = 0; i < tam; i++) {
                System.out.println("Pilha Impar: " + impar.pop());
            }
        }else{
            System.out.println("Pilha vazia");
        }
    }
    
}
