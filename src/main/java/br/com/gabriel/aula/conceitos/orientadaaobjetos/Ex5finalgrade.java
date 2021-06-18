package br.com.gabriel.aula.conceitos.orientadaaobjetos;

import br.com.gabriel.aula.conceitos.orientadaaobjetos.entites.FinalGrade;
import java.util.Locale;
import java.util.Scanner;

public class Ex5finalgrade {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    FinalGrade student = new FinalGrade();

    System.out.print("Informe seu nome: ");
    student.name = sc.nextLine();

    System.out.println("Informe suas 3 notas");
    student.firstGrade = sc.nextDouble();
    student.secondGrade = sc.nextDouble();
    student.thirdGrade = sc.nextDouble();
    System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

    if (student.finalGrade() < FinalGrade.PERCENTAGE_OF_SUCCESS) {
      System.out.println("FAILED");
      System.out.printf("MISSING %.2f POINTS%n", student.classification());
    } else {
      System.out.println("PASS");
    }
    sc.close();

  }
}
