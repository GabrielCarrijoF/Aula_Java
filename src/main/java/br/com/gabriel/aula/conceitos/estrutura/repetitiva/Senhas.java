package br.com.gabriel.aula.conceitos.estrutura.repetitiva;

import java.util.Scanner;

public class Senhas {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int senha = 0;

    while (senha != 2002) {
      System.out.println("Digite sua senha??");
      senha = sc.nextInt();
    }

    System.out.println("Senha correta");

    sc.close();
  }

}
