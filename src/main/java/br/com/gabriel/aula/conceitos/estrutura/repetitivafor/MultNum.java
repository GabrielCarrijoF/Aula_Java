package br.com.gabriel.aula.conceitos.estrutura.repetitivafor;

import java.util.Scanner;

public class MultNum {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    for (int i = 1; i <= num; i++) {

      int pri = i;
      int seg = i * i;
      int terc = i * i * i;
      System.out.printf("%d %d %d%n",pri,seg,terc);
    }

    sc.close();
  }

}
