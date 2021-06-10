package br.com.gabriel.aula.conceitos.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe valor do eixo X");
    double x = sc.nextDouble();
    System.out.println("Informe valor do eixo Y");
    double y = sc.nextDouble();

    if (x == 0.0 && y == 0.0) {
      System.out.println("Inicio");
    } else if (x == 0.0) {
      System.out.println("Eixo X");
    } else if (y == 0.0) {
      System.out.println("Eixo Y");
    } else if (x > 0.0 && y > 0.0) {
      System.out.println("-----------------------");
      System.out.println("Pertence a área do [Q1]");
      System.out.println("-----------------------");
    } else if (x < 0.0 && y > 0.0) {
      System.out.println("-----------------------");
      System.out.println("Pertence a área do [Q2]");
      System.out.println("-----------------------");
    } else if (x < 0.0 && y < 0.0) {
      System.out.println("-----------------------");
      System.out.println("Pertence a área do [Q3]");
      System.out.println("-----------------------");
    } else {
      System.out.println("-----------------------");
      System.out.println("Pertence a área do [Q4]");
      System.out.println("-----------------------");
    }

    sc.close();

  }
}
