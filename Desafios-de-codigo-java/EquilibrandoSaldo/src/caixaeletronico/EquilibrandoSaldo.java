/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caixaeletronico;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();
        
        double conta =+saldoAtual+valorDeposito;
        conta=conta-valorRetirada;
      
        
        
        System.out.println("Saldo atualizado na conta: "+ conta);
       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.

     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
    }
}