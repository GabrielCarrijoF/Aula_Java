package br.com.gabriel.aula.conceitos.estrutura.repetitiva.Exercicio;

import java.util.Scanner;

public class Cordenadas {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int cordenada1= sc.nextInt();
    int cordenada2= sc.nextInt();

    while (cordenada1 != 0 && cordenada2 != 0) {
      if (cordenada1 > 0 && cordenada2 > 0) {
        System.out.println("primeiro");
      }
      else if (cordenada1 < 0 && cordenada2 > 0) {
        System.out.println("segundo");
      }
      else if (cordenada1 < 0 && cordenada2 < 0) {
        System.out.println("terceiro");
      }
      else {
        System.out.println("quarto");
      }
      cordenada1 = sc.nextInt();
      cordenada2 = sc.nextInt();

    }

    sc.close();

  }
}
