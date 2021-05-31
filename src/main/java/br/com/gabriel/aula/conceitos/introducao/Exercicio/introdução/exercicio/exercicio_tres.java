package br.com.gabriel.aula.conceitos.introducao.Exercicio.introdução.exercicio;

import java.util.Scanner;

public class exercicio_tres {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int a,b,c,d,dif;

    System.out.println("Informe 4 valores:");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    dif = (a*b) - (c*d);
    System.out.printf("O resultado é "+dif);

    sc.close();
  }

}
