package br.com.gabriel.aula.conceitos.estrutura.repetitivafor;

import java.util.Scanner;

public class DivisaoNumeros {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {

      int numero1 = sc.nextInt();
      int numero2 = sc.nextInt();

      if (numero2 == 0) {
        System.out.println("Divisao impossivel");
      } else {
        double resultado = (double) numero1 / numero2;
        System.out.printf("%.1f%n", resultado);
      }
    }
    sc.close();
  }
}
