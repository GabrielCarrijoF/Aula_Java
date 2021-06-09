package br.com.gabriel.aula.conceitos.estrutura.repetitivaFor;

import java.util.Scanner;

public class NumerosImpares {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe um valor:");
    int num1 = sc.nextInt();

    for (int i = 0 ; i <= num1 ;i++){

      if (i % 2 != 0) {
        System.out.println(i);
      }
    }

    sc.close();

  }
}
