package br.com.gabriel.aula.conceitos.estrutura.repetitivafor;

import java.util.Scanner;

public class DivisaoNumeros {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {

      int som1 = sc.nextInt();
      int som2 = sc.nextInt();

      if (som2 == 0) {
        System.out.println("Divisao impossivel");
      } else {
        double resultado = (double) som1/som2;
        System.out.printf("%.1f%n", resultado);
      }


    }

    sc.close();

  }

}
