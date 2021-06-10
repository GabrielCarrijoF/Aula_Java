package br.com.gabriel.aula.conceitos.introducao.exercicio;

import java.util.Scanner;

public class ExercicioUm {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int soma = a + b;
    System.out.println("Ta ai a soma meu kiridu = " + soma);

    sc.close();
  }
}