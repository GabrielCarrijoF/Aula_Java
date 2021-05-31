package br.com.gabriel.aula.conceitos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalculaArea{
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double A, B, C;
    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();

    double rectangleTriangleArea = A * C / 2;
    double pi = 3.14159;
    double elevado = Math.pow(C, 2);
    double circleArea = pi * elevado;
    double trapezeArea = ((A + B) * C) / 2;
    double squareArea = Math.pow(B, 2);
    double rectangleArea = A * B;

    System.out.printf("TRIANGULO: %.3f%n", rectangleTriangleArea);
    System.out.printf("CIRCULO: %.3f%n", circleArea);
    System.out.printf("TRAPEZIO: %.3f%n", trapezeArea);
    System.out.printf("QUADRADO: %.3f%n", squareArea);
    System.out.printf("RETANGULO: %.3f%n", rectangleArea);

    sc.close();
  }
}