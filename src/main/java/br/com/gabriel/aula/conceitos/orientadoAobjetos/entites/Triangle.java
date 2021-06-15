package br.com.gabriel.aula.conceitos.orientadoAobjetos.entites;

public class Triangle {

  public double area1;
  public double area2;
  public double area3;

  public double area() {

    double area = (area1 + area2 + area3) / 2.0;
    return Math.sqrt(area * (area - area1) * (area - area2) * (area - area3));

  }
}
