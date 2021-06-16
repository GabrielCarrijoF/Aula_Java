package br.com.gabriel.aula.conceitos.orientadaaobjetos;

import br.com.gabriel.aula.conceitos.orientadaaobjetos.entites.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class Ex3Retangulo {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Retangulo retangulo = new Retangulo();

    System.out.println("Enter rectangle width and height:");
    retangulo.width = sc.nextDouble();
    retangulo.height = sc.nextDouble();

    System.out.printf("AREA:" + retangulo.area() + ("%n"));
    System.out.printf("PERIMETER: " + retangulo.perimeter() + ("%n"));
    System.out.printf("DIAGONAL: " + retangulo.diagonal() + ("%n"));

    sc.close();
  }
}


