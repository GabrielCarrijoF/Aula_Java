package br.com.gabriel.aula.conceitos.metodosAbstratos.entites;

public abstract class WorkerData {

  private String name;
  private Double anualincome;

  public WorkerData(final String name, final Double anualincome) {
    this.name = name;
    this.anualincome = anualincome;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public Double getAnualincome() {
    return anualincome;
  }

  public void setAnualincome(final Double anualincome) {
    this.anualincome = anualincome;
  }

  public abstract Double tax();

}
