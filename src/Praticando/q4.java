/*
Escreva um programa em C que solicita 10 números ao usuário, através de um 
laço while, e ao final mostre qual destes números é o maior.
 */
package Praticando;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        
        int menor = 0;
        int maior = 0;
        
        for (int i =0; i<10; i++){
            
            System.out.println("Digite um numero:");
            int numero = sc.nextInt();
            
            
            
            
            if (numero < menor){
                menor = numero;
            }
            if(numero > maior){
                maior=numero;
            }
     
        }
        
        System.out.println("Maior numero:" +maior);
        System.out.println("Menor numero:" +menor);
    }

   
    
}
