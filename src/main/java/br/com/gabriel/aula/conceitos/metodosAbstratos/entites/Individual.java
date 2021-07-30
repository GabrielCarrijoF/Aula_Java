package br.com.gabriel.aula.conceitos.metodosAbstratos.entites;

public class Individual extends WorkerData {

  private Double healthExpenditures;

  public Individual(final String name, final Double anualincome, final Double healthExpenditures) {
    super(name, anualincome);
    this.healthExpenditures = healthExpenditures;
  }

  public Double getHealthExpenditures() {
    return healthExpenditures;
  }

  public void setHealthExpenditures(final Double healthExpenditures) {
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public Double tax() {
    if (getAnualincome() < 20000.0) {
      return getAnualincome() * 0.15 - healthExpenditures * 0.5;
    } else {
      return getAnualincome() * 0.25 - healthExpenditures * 0.5;
    }
  }
}
