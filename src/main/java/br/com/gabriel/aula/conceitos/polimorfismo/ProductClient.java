package br.com.gabriel.aula.conceitos.polimorfismo;

import br.com.gabriel.aula.conceitos.polimorfismo.product.ImportedProduct;
import br.com.gabriel.aula.conceitos.polimorfismo.product.Product;
import br.com.gabriel.aula.conceitos.polimorfismo.product.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProductClient {

  public static void main(String[] args) throws ParseException {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    List<Product> list = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int products = sc.nextInt();

    for (int i = 1; i <= products; i++) {

      System.out.println("Product #" + i + " data:");
      System.out.print("Common, used or imported (c/u/i)?");
      char informationProduct = sc.next().charAt(0);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Price: ");
      double price = sc.nextDouble();

      if (informationProduct == 'c') {
        list.add(new Product(name, price));
      }
      if (informationProduct == 'u') {
        System.out.println("Manufacture date (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.next());
        list.add(new UsedProduct(name, price, date));
      }
      if (informationProduct == 'i') {
        System.out.print("Freight Cost: ");
        Double freightcost = sc.nextDouble();
        list.add(new ImportedProduct(name, price, freightcost));
      }
    }

    System.out.println();
    System.out.println("Price Tags");
    for (Product prod:list){
      System.out.println();
      System.out.println(prod.priceTag());
    }
    sc.close();
  }

}
