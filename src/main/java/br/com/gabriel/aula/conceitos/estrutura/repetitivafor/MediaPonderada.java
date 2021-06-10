package br.com.gabriel.aula.conceitos.estrutura.repetitivafor;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int caso = sc.nextInt();

    for (int i = 0; i < caso; i++) {

      double caso1 = sc.nextDouble();
      double caso2 = sc.nextDouble();
      double caso3 = sc.nextDouble();

      double media = (caso1 * 2.0 + caso2 * 3.0 + caso3 * 5.0) / 10;
      System.out.println("Valores :" + media);
    }

    sc.close();

  }
}
