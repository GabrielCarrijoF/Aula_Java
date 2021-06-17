package br.com.gabriel.aula.conceitos.orientadaaobjetos;

import br.com.gabriel.aula.conceitos.orientadaaobjetos.entites.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Ex4Employee {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Employee employee = new Employee();

    System.out.print("Name :");
    employee.name = sc.nextLine();

    System.out.print("Gross salary: ");
    employee.grossSalary = sc.nextDouble();

    System.out.print("Tax: ");
    employee.tax = sc.nextDouble();

    System.out.print("Empoyee: " + employee);

    System.out.printf("%nWhich percentage to increase salary?");
    double porcentage = sc.nextDouble();
    employee.increaseSalary(porcentage);

    System.out.print("Updated data: " + employee);

    sc.close();

  }

}
