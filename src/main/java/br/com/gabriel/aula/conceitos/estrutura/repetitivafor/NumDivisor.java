package br.com.gabriel.aula.conceitos.estrutura.repetitivafor;

import java.util.Scanner;

public class NumDivisor {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();

    for (int i = 1; i <= num1; i++) {
      if (num1 % i == 0) {
        System.out.println(i);
      }
    }
    sc.close();

  }
}
