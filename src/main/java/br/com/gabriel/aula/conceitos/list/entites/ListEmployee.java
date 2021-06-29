package br.com.gabriel.aula.conceitos.list.entites;

import br.com.gabriel.aula.conceitos.orientadaaobjetos.entites.Employee;

public class ListEmployee {


  private String name;
  private Double salary;
  private Integer id;

  public ListEmployee(Integer id, Double salary, String name) {
    this.id = id;
    this.salary = salary;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void incraseSalary(double porcentage) {
    salary += salary * porcentage;
  }

  public String toString() {
    return id + ", " + name + ", " + String.format("%.2f", salary);
  }
}


