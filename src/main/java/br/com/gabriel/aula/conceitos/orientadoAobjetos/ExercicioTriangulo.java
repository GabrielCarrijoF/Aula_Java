package br.com.gabriel.aula.conceitos.orientadoAobjetos;

import br.com.gabriel.aula.conceitos.orientadoAobjetos.entites.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioTriangulo {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Triangle enterArea, enterArea2;
    enterArea = new Triangle();
    enterArea2 = new Triangle();

    System.out.println("Enter the measures of triangle X");
    enterArea.area1 = sc.nextDouble();
    enterArea.area2 = sc.nextDouble();
    enterArea.area3 = sc.nextDouble();

    System.out.println("Enter the measures of triangle Y");
    enterArea2.area1 = sc.nextDouble();
    enterArea2.area2 = sc.nextDouble();
    enterArea2.area3 = sc.nextDouble();

    double calculoArea = (enterArea.area1 + enterArea.area2 + enterArea.area3) / 2.0;

    double resultArea = Math.sqrt (calculoArea * (calculoArea - enterArea.area1) * (calculoArea
        - enterArea.area2) * (calculoArea - enterArea.area3));

    double calculoArea2 = (enterArea2.area1 + enterArea2.area2 + enterArea2.area3) / 2.0;

    double resultArea2 = Math.sqrt (calculoArea * (calculoArea - enterArea2.area1) * (calculoArea2
        - enterArea.area2) * (calculoArea2 - enterArea.area3));

    System.out.printf("Triangle X area: %.4f%n ",resultArea);
    System.out.printf("Triangle Y area: %.4f%n ",resultArea2);

    if (resultArea > resultArea2){
      System.out.println("triangle X is the largest");
    }else {
      System.out.println("triangle Y is the largest");
    }
    sc.close();
  }
}
