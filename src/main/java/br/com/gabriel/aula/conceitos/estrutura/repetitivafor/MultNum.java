package br.com.gabriel.aula.conceitos.estrutura.repetitivafor;

import java.util.Scanner;

public class MultNum {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    for (int i = 1; i <= num; i++) {

      int firstNumber = i;
      int secondNumber = i * i;
      int thirdNumber = i * i * i;
      System.out.printf("%d %d %d%n",firstNumber,secondNumber,thirdNumber);
    }

    sc.close();
  }

}
