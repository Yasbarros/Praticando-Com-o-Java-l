package Questao02;

import java.util.*;

class Q2 {
  public static void main(String[] args) {
    Stack<Integer> pilha = new Stack<>();
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite 10 números");
    for (int i = 0; i < 10; i++) {
      int num = scan.nextInt();
      if (num % 2 == 0) {
        pilha.push(num);
      } else {
        if (pilha.empty()) {
          System.out.println("A pilha está vazia");
        } else {
          pilha.pop();
        }
      }
    }
    if (!pilha.empty()) {
      System.out.println("Restaram na pilha");
      int tamanho = pilha.size();
      for (int i = 0; i < tamanho; i++) {
        System.out.println(pilha.pop());
      }
    } else {
      System.out.println("A pilha está vazia");
    }
  }
}