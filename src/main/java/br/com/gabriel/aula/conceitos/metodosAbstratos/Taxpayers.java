package br.com.gabriel.aula.conceitos.metodosAbstratos;

import br.com.gabriel.aula.conceitos.metodosAbstratos.entites.Company;
import br.com.gabriel.aula.conceitos.metodosAbstratos.entites.Individual;
import br.com.gabriel.aula.conceitos.metodosAbstratos.entites.WorkerData;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Taxpayers {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<WorkerData> list = new ArrayList<>();

    System.out.print("Enter the number of tax payers: ");
    int numberPayers = sc.nextInt();

    for (int i = 1; i <= numberPayers; i++) {

      System.out.println("Tax payer #" + i + " data:");
      System.out.print("Individual or company (i/c)?");
      char company = sc.next().charAt(0);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Anual income: ");
      double anualIncome = sc.nextDouble();

      if (company == 'i') {
        System.out.println("Health expenditures: ");
        Double healthExpenditures = sc.nextDouble();
        list.add(new Individual(name, anualIncome, healthExpenditures));
      } else {
        System.out.println("Number of employes: ");
        int numberEmployes = sc.nextInt();
        list.add(new Company(name, anualIncome, numberEmployes));

      }

    }
    double soma = 0.0;
    System.out.println();
    System.out.println("TAXES PAID:");
    for (WorkerData wp : list) {
      double tax = wp.tax();
      System.out.println(wp.getName() + ": $ " + String.format("%.2f", tax));
      soma += tax;
    }
    System.out.println();
    System.out.println("TOTAL TAXES: $ " + String.format("%.2f", soma));

    sc.close();
  }

}
