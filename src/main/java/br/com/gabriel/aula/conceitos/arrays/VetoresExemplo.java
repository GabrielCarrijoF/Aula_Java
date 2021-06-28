package br.com.gabriel.aula.conceitos.arrays;

import br.com.gabriel.aula.conceitos.arrays.entites.ArrysProduct;
import java.util.Locale;
import java.util.Scanner;

public class VetoresExemplo {


  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.printf("Informe a quantidade de produtos: ");
    int numerodevetores = sc.nextInt();

    ArrysProduct[] vect = new ArrysProduct[numerodevetores];

    for (int i = 0; i < vect.length; i++) {
      sc.nextLine();
      System.out.print("Informe o nome do produto: ");
      String name = sc.nextLine();
      System.out.printf("Informe o preço do produto: ");
      double price = sc.nextDouble();
      vect[i] = new ArrysProduct(name, price);
    }

    double soma = 0.0;

    for (int i = 0; i < vect.length; i++) {

      soma += vect[i].getPrice();

    }

    double media = soma/numerodevetores;

    System.out.print("A media dos produtos: " + media);


    sc.close();

  }
}
