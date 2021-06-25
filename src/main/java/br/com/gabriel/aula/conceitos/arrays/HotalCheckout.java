package br.com.gabriel.aula.conceitos.arrays;

import java.util.Locale;
import java.util.Scanner;

public class HotalCheckout {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe quantos quartos serao alugados: ");
    int qntroom = Integer.parseInt(sc.nextLine());

    Hotel[] vect = new Hotel[qntroom];

    for (int i = 0; i < qntroom; i++) {

      System.out.println("Quarto #" + i + ":");

      System.out.print("Informe seu nome: ");
      String name = sc.nextLine();

      System.out.print("Informe seu email: ");
      String email = sc.nextLine();

      System.out.print("Informe o quarto que será alugado: ");
      int room = sc.nextInt();

      vect[room] = new Hotel(name, email);
    }

    System.out.println();
    System.out.println("Quartos Ocupados");
    for (int i = 0; i < qntroom; i++) {
      if (vect[i] != null) {
        System.out.printf(i + ":" + vect[i]);
      }
    }
    sc.close();


  }

}
