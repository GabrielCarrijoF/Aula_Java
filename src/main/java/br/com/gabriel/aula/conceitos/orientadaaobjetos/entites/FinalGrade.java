package br.com.gabriel.aula.conceitos.orientadaaobjetos.entites;

public class FinalGrade {

  public static final double PERCENTAGE_OF_SUCCESS= 60.0;
  public double firstGrade;
  public double secondGrade;
  public double thirdGrade;
  public String name;

  public double finalGrade() {

    return firstGrade + secondGrade + thirdGrade;
  }

  public double classification() {
    if (finalGrade() < PERCENTAGE_OF_SUCCESS) {
      return PERCENTAGE_OF_SUCCESS - finalGrade();
    } else {
      return 0.0;
    }
  }
}
