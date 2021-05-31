package br.com.gabriel.aula.conceitos.introducao.Exercicio.introdução.exercicio;

import java.util.Scanner;

public class exercicio_dois {
  public static void main(String []args){

    Scanner sc = new Scanner(System.in);

    double raio,result;
    double pi;
    pi = 3.14159;

    System.out.println("Qual valor da Raio?");
    raio = sc.nextDouble();

    result = pi * (raio*raio);
    System.out.println("O rsultado da Area: "+result);

    sc.close();

  }

}
