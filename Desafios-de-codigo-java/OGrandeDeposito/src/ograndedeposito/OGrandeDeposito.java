/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ograndedeposito;

  import java.util.Scanner;
/**
 *
 * @author Mateus
 */
public class OGrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        
        if (valor > 0) {
            System.out.println("Deposito realizado com sucesso! ");
            System.out.printf("Saldo atual: R$ %.2f ", valor);
            //TODO: Imprimir a mensagem de sucesso, formatando o saldo atual (vide Exemplos).
        } else if (valor == 0) {
            
              System.out.println("Encerrando o programa... ");
            //TODO: Imprimir a mensagem de valor inválido.
        } else {
          
       System.out.println("Valor invalido! Digite um valor maior que zero.");
             //TODO: Imprimir a mensagem de encerrar o programa.
        }
    }
}