package br.com.gabriel.aula.conceitos.estrutura.condicional;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc= new Scanner(System.in);

    double numero = sc.nextDouble();

    if (numero < 0.0 || numero > 100.0){
      System.out.println("Fora De Intervalo");
    }else if (numero <= 25.0){
      System.out.println("Intervalo é de *0,25*");
    }else if (numero <= 50.0){
      System.out.println("Intervalo é de *25,50*");
    }else if (numero <= 75.0){
      System.out.println("Intervalo é de *50.75*");
    }else {
      System.out.println("Intervalo é de *75.100*");
    }

    sc.close();

  }

}
