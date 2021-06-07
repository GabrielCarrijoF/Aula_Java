package br.com.gabriel.aula.conceitos.estrutura.repetitiva;

import java.util.Scanner;

public class Posto {

  public static void main(String[] args) {

    Scanner sc= new Scanner(System.in);

    int gasolina = 00;
    int alcool   = 00;
    int diesel   = 00;

    int opc = sc.nextInt();

    while (opc !=4){
      if (opc == 1){
        alcool = alcool+1;
      }
      else if (opc == 2){
        gasolina = gasolina+1;
      }
      else if (opc == 3){
        diesel = diesel+1;
      }
      opc = sc.nextInt();
    }
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);

    sc.close();

  }
}
