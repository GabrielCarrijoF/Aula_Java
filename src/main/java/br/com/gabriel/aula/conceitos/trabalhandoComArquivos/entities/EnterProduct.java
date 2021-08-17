package br.com.gabriel.aula.conceitos.trabalhandoComArquivos.entities;

public class EnterProduct {

  private String name;
  private Double price;
  private Integer quantity;

  public EnterProduct(final String name, final Double price, final Integer quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(final Double price) {
    this.price = price;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(final Integer quantity) {
    this.quantity = quantity;
  }

  public double multProduct(){
    return price * quantity;
  }
}
