package Questao03;

import java.util.*;

class Q3 {
  public static void main(String[] args) {
    Stack<Integer> par = new Stack<>();
    Stack<Integer> impar = new Stack<>();
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite 10 números");
    for (int i = 0; i < 10; i++) {
      int num = scan.nextInt();
      if(num == 0){
        if(par.empty() || impar.empty()){
          System.out.println("Uma das pilhas está vazia");
        } else {
          par.pop();
          impar.pop();
        }
      } else if (num % 2 == 0) {
        par.push(num);
      } else {
        impar.push(num);
      }
    }
    if (!par.empty()) {
      System.out.println("Restaram na pilha");
      int tamanho = par.size();
      for (int i = 0; i < tamanho; i++) {
        System.out.println(par.pop());
      }
    } else {
      System.out.println("A pilha par está vazia");
    }
    if (!impar.empty()) {
      System.out.println("Restaram na pilha");
      int tamanho = impar.size();
      for (int i = 0; i < tamanho; i++) {
        System.out.println(impar.pop());
      }
    } else {
      System.out.println("A pilha impar está vazia");
    }
  }
}