package br.com.gabriel.aula.conceitos.orientadoaobjetos.entites;

public class Product {

  public String name;
  public double price;
  public int quantity;

  public double totalvalueStock() {
    return price * quantity;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  public String toString() {
    return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalvalueStock());
  }
}