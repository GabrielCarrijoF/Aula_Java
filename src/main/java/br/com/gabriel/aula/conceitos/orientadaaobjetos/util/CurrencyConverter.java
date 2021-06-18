package br.com.gabriel.aula.conceitos.orientadaaobjetos.util;

public class CurrencyConverter {

  public static double IOF = 0.06;

  public static double currencyConverter(double dolarPrice, double totalValue) {

    double totalDolarValue = dolarPrice * totalValue;
    return totalDolarValue + (totalDolarValue * IOF);
  }

}
