package br.com.gabriel.aula.conceitos.polimorfismo;

import br.com.gabriel.aula.conceitos.polimorfismo.entities.Employee;
import br.com.gabriel.aula.conceitos.polimorfismo.entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Company {


  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Employee> list = new ArrayList<>();

    System.out.print("Enter the number of employees:");
    int numberEmployees = sc.nextInt();

    for (int i = 1; i <= numberEmployees; i++) {
      System.out.println("Employee #" + i + " data:");
      System.out.print("Outsourced (y/n)?");
      char outsource = sc.next().charAt(0);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Hours: ");
      int hours = sc.nextInt();
      System.out.print("Value per hours: ");
      double valuePerHours = sc.nextDouble();
      if (outsource == 'y') {
        System.out.print("Additional charge: ");
        double additionalCharge = sc.nextDouble();
        list.add(new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge));
      }
      else {
        list.add(new Employee(name, hours, valuePerHours));
      }
    }

    System.out.println();
    System.out.println("PAYMENTS:");
    for (Employee emp : list) {
      System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.getPayMent()));
    }


    sc.close();

  }
}
