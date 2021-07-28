package br.com.gabriel.aula.conceitos.polimorfismo.product;

public class ImportedProduct extends Product{

  private Double freightcost;

  public ImportedProduct(final String name, final Double price, final Double freightcost) {
    super(name, price);
    this.freightcost = freightcost;
  }

  public Double getFreightcost() {
    return freightcost;
  }

  public void setFreightcost(final Double freightcost) {
    this.freightcost = freightcost;
  }

  public Double totalPrice(){
    return getPrice() + freightcost;
  }

  @Override
  public String priceTag() {
    return getName()
        + " $ "
        + String.format("%.2f", totalPrice())
        + " (Freight Cost: $ "
        + String.format("%.2f", freightcost)
        + ")";

  }
}
