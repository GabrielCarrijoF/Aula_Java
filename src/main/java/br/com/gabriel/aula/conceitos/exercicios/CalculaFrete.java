package br.com.gabriel.aula.conceitos.exercicios;

import java.util.Locale;
import java.util.Scanner;

class CalculaFrete {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double valor;
    System.out.print("Qual o valor do produto? ");
    valor = input.nextDouble();
    valor = valor + 25.00;

    System.out.print(valor);
  }
}
