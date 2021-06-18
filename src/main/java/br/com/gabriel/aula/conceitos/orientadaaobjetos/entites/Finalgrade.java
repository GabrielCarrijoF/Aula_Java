package br.com.gabriel.aula.conceitos.orientadaaobjetos.entites;

public class Finalgrade {

  public double note1;
  public double note2;
  public double note3;
  public String name;

  public double finalgrade() {
    return note1 + note2 + note3;
  }

  public double classification() {
    if (finalgrade() < 60.0) {
      return 60.0 - finalgrade();
    } else {
      return 0.0;
    }
  }
}
