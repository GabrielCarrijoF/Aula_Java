package br.com.gabriel.aula.conceitos.orientadoaobjetos;

import br.com.gabriel.aula.conceitos.orientadoaobjetos.entites.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioTriangulo {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);

    System.out.println("Enter the measures of triangle X");
    Scanner sc = new Scanner(System.in);
    Triangle enterArea = new Triangle();
    enterArea.area1 = sc.nextDouble();
    enterArea.area2 = sc.nextDouble();
    enterArea.area3 = sc.nextDouble();

    System.out.println("Enter the measures of triangle Y");
    Triangle enterArea2 = new Triangle();
    enterArea2.area1 = sc.nextDouble();
    enterArea2.area2 = sc.nextDouble();
    enterArea2.area3 = sc.nextDouble();

    double resultArea = enterArea.area();
    double resultArea2 = enterArea2.area();

    System.out.printf("Triangle X area: %.4f%n ", resultArea);
    System.out.printf("Triangle Y area: %.4f%n ", resultArea2);

    if (resultArea > resultArea2) {
      System.out.println("triangle X is the largest: ");
    } else {
      System.out.println("triangle Y is the largest: ");
    }
    sc.close();
  }
}
