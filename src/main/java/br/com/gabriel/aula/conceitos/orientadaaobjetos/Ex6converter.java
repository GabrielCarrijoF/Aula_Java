package br.com.gabriel.aula.conceitos.orientadaaobjetos;

import br.com.gabriel.aula.conceitos.orientadaaobjetos.util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class Ex6converter {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("What is the dollar price? ");
    double dolarPrice = sc.nextDouble();

    System.out.print("How many dollars will be bought?");
    double totalValue = sc.nextDouble();

    System.out.printf("Amount to be paid in reais= %.2f", CurrencyConverter
        .currencyConverter(dolarPrice, totalValue));

    sc.close();
  }

}
