package br.com.gabriel.aula.conceitos.orientadaaobjetos.entites;

public class FinalGrade {

  private static final double percetange_of_success = 60.0;
  public double firstGrade;
  public double secondGrade;
  public double thirdGrade;
  public String name;

  public double finalGrade() {
    return firstGrade + secondGrade + thirdGrade;
  }

  public double classification() {
    if (finalGrade() < percetange_of_success) {
      return percetange_of_success - finalGrade();
    } else {
      return 0.0;
    }
  }
}
