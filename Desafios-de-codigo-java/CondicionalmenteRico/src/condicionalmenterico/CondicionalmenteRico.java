/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalmenterico;

/**
 *
 * @author Mateus
 */
  import java.util.Scanner;

public class CondicionalmenteRico {

  public static void main(String[] args) {

    // Entrada de dados
    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();
    double saldo;
    saldo=+saldoTotal-valorSaque;
      if (saldoTotal>=valorSaque) {
          System.out.printf("Saque realizado com sucesso.Novo saldo:%.0f  " ,saldo); 
      } else {
          
          System.out.println("Saldo insuficiente. Saque nao realizado!");
      }
    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
  }
}