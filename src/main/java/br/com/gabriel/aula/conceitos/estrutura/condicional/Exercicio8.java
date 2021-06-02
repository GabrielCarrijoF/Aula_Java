package br.com.gabriel.aula.conceitos.estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe seu salario:");

    double salario = sc.nextDouble();
    sc.close();

    double imposto = calculaImposto(salario);

    if (imposto == 0.0) {
      System.out.println("Isento");
      return;
    }
    System.out.printf("Seu imposto é de R$ %.2f%n", imposto);

  }

  private static double calculaImposto(double salario) {
    if (salario <= 2000.00) {
      return 0.0;
    }

    if (salario <= 3000.00) {
      return (salario - 2000) * 0.8;
    }

    if (salario <= 4500.00) {
      return (salario - 3000) * 0.18 + 1000 * 0.8;
    }
    return (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.8;
  }

}
