package br.com.gabriel.aula.conceitos.interfaces.model.service;

import br.com.gabriel.aula.conceitos.interfaces.model.entities.CarRental;
import br.com.gabriel.aula.conceitos.interfaces.model.entities.Invoice;

public class RentalService {

  private Double pricePerHour;
  private Double pricePerDay;

  private TaxService taxService;

  public RentalService() {

  }

  public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
    this.pricePerHour = pricePerHour;
    this.pricePerDay = pricePerDay;
    this.taxService = taxService;
  }

  public Double getPricePerHour() {
    return pricePerHour;
  }

  public void setPricePerHour(final Double pricePerHour) {
    this.pricePerHour = pricePerHour;
  }

  public Double getPricePerDay() {
    return pricePerDay;
  }

  public void setPricePerDay(final Double pricePerDay) {
    this.pricePerDay = pricePerDay;
  }


  public void setTaxService(
      final BrazilTaxService taxService) {
    this.taxService = taxService;
  }

  public void processInvoice(CarRental carRental) {
    long tempo1 = carRental.getStart().getTime();
    long tempo2 = carRental.getFinish().getTime();

    double hours = (double) (tempo1 - tempo2) / 1000 / 60 / 60;

    double basicPayment;
    if (hours <= 12.0) {
      basicPayment = Math.ceil(hours) * pricePerHour;
    } else {
      basicPayment = Math.ceil(hours / 24) * pricePerDay;
    }
    double tax = taxService.tax(basicPayment);
    carRental.setInvoice(new Invoice(basicPayment, tax));
  }
}
