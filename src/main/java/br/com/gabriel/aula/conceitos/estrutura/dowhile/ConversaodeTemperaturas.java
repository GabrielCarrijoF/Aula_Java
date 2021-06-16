package br.com.gabriel.aula.conceitos.estrutura.dowhile;

import java.util.Locale;
import java.util.Scanner;

public class ConversaodeTemperaturas {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    String resp;

    do {
      System.out.println("Digite a Temperatura em Celsius");
      double temperaturaCelsius = Double.parseDouble(sc.nextLine());
      double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
      System.out.println("Valor em Fahrenheit:" + temperaturaFahrenheit);
      System.out.println("Deseja continuar (s/n)");
      resp = sc.nextLine();

    } while (resp.equalsIgnoreCase("s"));

    sc.close();
  }
}
