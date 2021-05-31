package br.com.gabriel.aula.conceitos.introducao;

import java.io.PrintStream;
import java.util.Locale;

public class EX_Saida_de_dados_java {

  public static void main (String[] args){

    String product1 = "Computer";
    String product2 = "Office Desk";

    int age = 30;
    int code = 5478;
    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double measure = 53.89534;

    System.out.println("Product");
    System.out.printf(product1 +" which price $"+ price1 +"%n");
    System.out.printf(product2+", witch price is $"+ price2 +"%n");
    System.out.printf("Record: "+age+", years old, code "+code+ " and gender:"+gender+"%n");

    System.out.printf("Meause witch eight decimal places: " +measure+ "%n");


  }
}
