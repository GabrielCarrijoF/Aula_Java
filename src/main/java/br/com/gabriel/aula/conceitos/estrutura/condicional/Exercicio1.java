package br.com.gabriel.aula.conceitos.estrutura.condicional;

import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) {

    System.out.println("Qual valor ?");
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();

    System.out.printf("-----------------------%n");
    System.out.printf("Valor digitado " + X);
    System.out.printf("%n-----------------------%n%n");

    if (X >= 0) {
      System.out.println("NÃO NEGATIVO");
    } else {
      System.out.println("NEGATIVO");
    }

    sc.close();


  }

}