package br.com.gabriel.aula.conceitos.polimorfismo.product;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

  private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  private Date manufactureDate;

  public UsedProduct(final String name, final Double price, final Date manufacturedate) {
    super(name, price);
    this.manufactureDate = manufacturedate;
  }

  public Date getManufactureDate() {
    return manufactureDate;
  }

  public void setManufactureDate(final Date manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  @Override
  public String priceTag() {
    return getName()
        + " (used) $ "
        + String.format("%.2f", getPrice())
        + " (Manufacture date: "
        + sdf.format(manufactureDate)
        + ")";
  }
}