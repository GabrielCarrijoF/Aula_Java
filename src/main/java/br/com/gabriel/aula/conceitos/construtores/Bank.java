package br.com.gabriel.aula.conceitos.construtores;

import br.com.gabriel.aula.conceitos.construtores.entites.Account;
import java.util.Locale;
import java.util.Scanner;

public class Bank {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Account account;

    System.out.print("Enter account number :");
    int number = sc.nextInt();

    System.out.print("Enter account holder :");
    sc.nextLine();
    String holder = sc.nextLine();

    System.out.print("Is there na initial deposit (y/n) ?");
    char response = sc.next().charAt(0);
    if (response == 'y') {
      System.out.print("Enter initial deposit value :");
      double initialDeposit = sc.nextDouble();
      System.out.println();
      account = new Account(number, holder, initialDeposit);
    } else {
      account = new Account(number, holder);
    }

    System.out.println();
    System.out.println("Account data:");
    System.out.print(account.tooString());
    System.out.println("Enter a deposit value: ");

    System.out.println();
    System.out.print("Is there na initial deposit (y/n) ?");
    char responseDeposit = sc.next().charAt(0);
    System.out.println();

    if (responseDeposit == 'y') {
      System.out.println("Do you want to make a deposit? ");
      double depositeValue = sc.nextDouble();
      account.deposit(depositeValue);
    }
    else {
      account.tooString();
    }
    System.out.print(account.tooString());

    System.out.println();
    System.out.print("Do you want to withdraw the money (y/n) ?");
    char responseWithdraw = sc.next().charAt(0);

    if (responseWithdraw == 'y') {
      System.out.println("What amount do you want to withdraw?");
      double withdrawValue = sc.nextDouble();
      account.withdraw(withdrawValue);
      account.tooString();
    }
    else {
      account.tooString();
    }
    System.out.print(account.tooString());
    sc.close();
  }

}