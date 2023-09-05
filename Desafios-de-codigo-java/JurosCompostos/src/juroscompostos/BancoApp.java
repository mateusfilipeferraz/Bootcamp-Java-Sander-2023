/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juroscompostos;

/**
 *
 * @author Mateus
 */

import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();

       int periodo= scanner.nextInt();
       
      
        double valor=valorInicial*Math.pow(1+ taxaJuros,periodo);

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.


        System.out.printf("Valor final do investimento: R$ %.2f ",valor);
        
        scanner.close();
    }
}