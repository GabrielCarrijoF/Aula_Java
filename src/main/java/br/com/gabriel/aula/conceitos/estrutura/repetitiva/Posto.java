package br.com.gabriel.aula.conceitos.estrutura.repetitiva;

import java.util.Scanner;

public class Posto {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int gasolina = 00;
    int alcool = 00;
    int diesel = 00;

    int opc = sc.nextInt();

    while (opc != 4) {
      if (opc == 1) {
        alcool = alcool + 1;
      } else if (opc == 2) {
        gasolina = gasolina + 1;
      } else if (opc == 3) {
        diesel = diesel + 1;
      }
      opc = sc.nextInt();
    }
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);

    sc.close();

  }

  public static class Cordenadas {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int cordenada1 = sc.nextInt();
      int cordenada2 = sc.nextInt();

      while (cordenada1 != 0 && cordenada2 != 0) {
        if (cordenada1 > 0 && cordenada2 > 0) {
          System.out.println("primeiro");
        } else if (cordenada1 < 0 && cordenada2 > 0) {
          System.out.println("segundo");
        } else if (cordenada1 < 0 && cordenada2 < 0) {
          System.out.println("terceiro");
        } else {
          System.out.println("quarto");
        }
        cordenada1 = sc.nextInt();
        cordenada2 = sc.nextInt();

      }

      sc.close();

    }
  }
}
