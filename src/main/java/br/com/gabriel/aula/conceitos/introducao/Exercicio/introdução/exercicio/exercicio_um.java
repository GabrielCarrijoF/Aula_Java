package br.com.gabriel.aula.conceitos.introducao.Exercicio.introdução.exercicio;

import java.util.Scanner;

public class exercicio_um {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int A, B, soma;

    A = sc.nextInt();
    B = sc.nextInt();

    System.out.println();
    soma = A + B;
    System.out.println("Ta ai a soma meu kiridu = " + soma);

    sc.close();
  }
}