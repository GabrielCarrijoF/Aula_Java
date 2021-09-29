package br.com.gabriel.aula.conceitos.introducao.exercicio;

import java.util.Scanner;

public class ExercicioDois {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double pi = 3.14159;

    System.out.println("Qual valor da Raio?");
    double raio = sc.nextDouble();

    double result = pi * Math.pow(raio,2);

    System.out.println("O rsultado da Area: " + result);

    sc.close();

  }

}
