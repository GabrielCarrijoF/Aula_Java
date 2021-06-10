package br.com.gabriel.aula.conceitos.estrutura.repetitivafor;

import java.util.Scanner;

public class NumerosInteiros {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num1 = sc.nextInt();
    int out = 0;
    int in = 0;

    for (int i = 0; i < num1; i++) {
      int num2 = sc.nextInt();
      if (num2 >= 10 && num2 <= 20) {
        in = in + 1;
      } else {
        out = out + 1;
      }
    }
    System.out.println(in + " in");
    System.out.println(out + " out");

    sc.close();

  }

}
