package br.com.gabriel.aula.conceitos.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o tamanho do vetor ");
    int numberVector = sc.nextInt();
    double[] vect = new double[numberVector];

    for (int i = 0; i < vect.length; i++) {
      System.out.print("Informe o " + (i + 1) + "° valor: ");
      vect[i] = sc.nextDouble();
    }

    double soma = 0.0;

    for (int i = 0; i < vect.length; i++) {
      soma += vect[i];
    }

    double result = soma / numberVector;

    System.out.printf("Avarege Height: %.2f%n", result);
    sc.close();


  }
}
