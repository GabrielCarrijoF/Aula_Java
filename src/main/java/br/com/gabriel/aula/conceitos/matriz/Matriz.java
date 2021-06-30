package br.com.gabriel.aula.conceitos.matriz;

import java.util.Scanner;

public class Matriz {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int valorMatriz = sc.nextInt();
    int valor2Matriz = sc.nextInt();

    int[][] matriz = new int[valorMatriz][valor2Matriz];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j] = sc.nextInt();
      }
    }

    int x = sc.nextInt();

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.println("Position " + i + "," + j + ":");

        if (j > 0) {
          System.out.println("Left: " + matriz[i][j - 1]);
        }
        if (i > 0) {
          System.out.println("Up: " + matriz[i - 1][j]);
        }
        if (j < matriz[i].length - 1) {
          System.out.println("Right: " + matriz[i][j + 1]);
        }
        if (i < matriz.length - 1) {
          System.out.println("Down: " + matriz[i + 1][j]);
        }
      }
    }
    sc.close();

  }

}
