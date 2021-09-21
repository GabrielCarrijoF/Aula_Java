package br.com.gabriel.aula.conceitos.introducao.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double area, base, altura, triangulo,circulo,trapezio, quadrado, retangulo;

    area = sc.nextDouble();
    base = sc.nextDouble();
    altura = sc.nextDouble();

    triangulo = (base * altura)/2;
    circulo = 3.14159 * Math.pow(area,2);
    trapezio = ((area + base)*altura)/2;
    quadrado = Math.pow(base,2);
    retangulo =base*altura;

    System.out.println("RESULTADO");
    System.out.print("TRIANGULO: "+triangulo);
    System.out.println("CIRCULO:"+ circulo);
    System.out.println("TRAPEZIO: "+ trapezio);
    System.out.println("QUADRADO"+ quadrado);
    System.out.println("RETANGULO"+ retangulo);
  }
}
