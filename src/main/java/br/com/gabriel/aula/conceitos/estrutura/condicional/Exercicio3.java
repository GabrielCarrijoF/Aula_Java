package br.com.gabriel.aula.conceitos.estrutura.condicional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio3 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a % b == 0 || b % a == 0) {
      System.out.println("São Multiplos");
    } else {
      System.out.println("Não São Multiplos");
    }

    sc.close();

  }

}
