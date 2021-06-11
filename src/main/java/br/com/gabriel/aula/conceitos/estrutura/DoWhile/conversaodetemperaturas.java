package br.com.gabriel.aula.conceitos.estrutura.DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class conversaodetemperaturas {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    char resp;

    do {
      System.out.println("Digite a Temperatura em Celsius");
      double tempCelsius = Double.parseDouble(sc.nextLine());
      double temF = (tempCelsius * 1.8) + 32;
      System.out.println("Valor em F:" + temF);
      System.out.println("Deseja continuar (s/n)");
      resp = sc.next().charAt(0);

    } while (resp !='n');

    sc.close();

  }
}
