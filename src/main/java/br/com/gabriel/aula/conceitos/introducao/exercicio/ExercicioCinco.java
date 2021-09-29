package br.com.gabriel.aula.conceitos.introducao.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int codigo,peca,codigo2,peca2;

    double valorUnitario, valorUnitario2, calc;

    codigo = sc.nextInt();
    peca = sc.nextInt();
    valorUnitario = sc.nextDouble();

    codigo2 = sc.nextInt();
    peca2 = sc.nextInt();
    valorUnitario2 = sc.nextDouble();

    calc = peca * valorUnitario + peca2 * valorUnitario2;

    System.out.println("VALOR A PAGAR: " + calc);

    sc.close();

  }
}
