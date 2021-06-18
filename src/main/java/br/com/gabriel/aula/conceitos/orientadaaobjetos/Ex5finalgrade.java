package br.com.gabriel.aula.conceitos.orientadaaobjetos;

import br.com.gabriel.aula.conceitos.orientadaaobjetos.entites.Finalgrade;
import java.util.Locale;
import java.util.Scanner;

public class Ex5finalgrade {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Finalgrade student = new Finalgrade();

    System.out.print("Informe seu nome: ");
    student.name = sc.nextLine();

    System.out.println("Informe suas 3 notas");
    student.note1 = sc.nextDouble();
    student.note2 = sc.nextDouble();
    student.note3 = sc.nextDouble();
    System.out.printf("FINAL GRADE: %.2f%n", student.finalgrade());
    if (student.finalgrade() < 60.0) {
      System.out.println("FAILED");
      System.out.printf("MISSING %.2f POINTS%n", student.classification());
    } else {
      System.out.println("PASS");
    }
    sc.close();

    sc.close();

  }
}
