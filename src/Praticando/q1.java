/*
Construa um algoritmo que recebe inteiro e mostra os números pares e ímpares 
(separados), de 1 até esse inteiro
 */
package Praticando;

import java.util.Scanner;



/**
 *
 * @author User
 */
public class q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int numero = sc.nextInt();
        
        for(int i = 0; i<= numero; i++){
            if(i%2==0){
                System.out.println(i + ": É par");
            }else{
                System.out.println(i +": Não é par ");
            }
        }
    }
    
}
