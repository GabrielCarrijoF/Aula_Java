package br.com.gabriel.aula.conceitos.metodosAbstratos.entites;

public class Company extends WorkerData {

  private Integer numberEmployees;

  public Company(final String name, final Double anualincome, final Integer numberEmployees) {
    super(name, anualincome);
    this.numberEmployees = numberEmployees;
  }

  public Integer getNumberEmployees() {
    return numberEmployees;
  }

  public void setNumberEmployees(final Integer numberEmployees) {
    this.numberEmployees = numberEmployees;
  }

  @Override
  public Double tax() {
    if (numberEmployees > 10) {
      return getAnualincome() * 0.16;
    } else {
      return getAnualincome() * 0.14;
    }
  }
}
