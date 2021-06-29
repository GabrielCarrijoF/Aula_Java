package br.com.gabriel.aula.conceitos.list;

import br.com.gabriel.aula.conceitos.list.entites.ListEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exerciciolist {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<ListEmployee> list = new ArrayList<>();

    System.out.print("How many employees will be registered? ");
    int register = sc.nextInt();

    for (int i = 1; i <= register; i++) {

      System.out.print("Employee #" + i + ":");

      System.out.print("Id: ");
      int id = sc.nextInt();
      while (hasId(list, id)) {
        System.out.print("Id already taken. Try again: ");
        id = sc.nextInt();
      }
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Salary: ");
      double salary = sc.nextDouble();

      list.add(new ListEmployee(id, salary, name));
    }

    System.out.println();
    System.out.println("Enter the employee id that will have salary increase: ");
    int id = sc.nextInt();
    ListEmployee emp = list.stream().filter(X -> X.getId() == id).findFirst().orElse(null);

    if (emp == null){
      System.out.println("This id does not exist!");
    }else {
      System.out.print("Enter the percentage: ");
      double porcentage = sc.nextDouble();
      emp.incraseSalary(porcentage);
    }

    System.out.println();
    System.out.println("List of employees:");
    for (ListEmployee obj : list) {
      System.out.println(obj);
    }

    sc.close();

    }
  public static boolean hasId (List < ListEmployee > list,int id) {
    ListEmployee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    return emp != null;
  }

  }

