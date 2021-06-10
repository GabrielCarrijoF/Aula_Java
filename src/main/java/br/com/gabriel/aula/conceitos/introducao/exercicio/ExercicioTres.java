package br.com.gabriel.aula.conceitos.introducao.exercicio;

import java.util.Scanner;

public class ExercicioTres {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe 4 valores:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    int dif = (a * b) - (c * d);
    System.out.printf("O resultado é " + dif);

    sc.close();
  }

}
