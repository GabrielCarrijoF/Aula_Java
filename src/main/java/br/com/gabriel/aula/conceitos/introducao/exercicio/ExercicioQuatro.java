package br.com.gabriel.aula.conceitos.introducao.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int number, hors;
    double salaryPerHors, calcSalary;

    number = sc.nextInt();
    hors = sc.nextInt();

    salaryPerHors = sc.nextDouble();

    calcSalary = (hors * salaryPerHors);

    System.out.println("NUMBER: " + number);
    System.out.printf("SALARY = U$ %.2f", calcSalary);

  }
}
