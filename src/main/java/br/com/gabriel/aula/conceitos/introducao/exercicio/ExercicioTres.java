package br.com.gabriel.aula.conceitos.introducao.exercicio;

import java.util.Scanner;

public class ExercicioTres {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a,b,c,d;

    System.out.println("Informe 4 valores:");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    int calc = (a * b) - (c * d);
    System.out.printf("O resultado é " + calc);

    sc.close();
  }

}
