/*
Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele. Em 
seguida, através de um laço while, pede ao usuário para que entre com as notas de todos os 
alunos da sala, um por vez. Por fim, o programa mostra a média aritmética da turma. 
 */
package Praticando;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de aluno");
        int alunos = sc.nextInt();
        
        double soma = 0;
        for(int i=1; i<=alunos; i++){
            System.out.println("Digite a nota do aluno " + i+":");
            double nota = sc.nextDouble();
            soma += nota;
        }
        
        double media = soma / alunos;
        
        System.out.println("A media aritmetica da turma é:" + media);
        
    }
    
}
