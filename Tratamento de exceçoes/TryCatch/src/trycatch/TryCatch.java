package trycatch;

import java.util.Scanner;
/*@author Mateus*/

public class TryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Solicitar nome
            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            // Solicitar idade
            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            // Solicitar altura
            System.out.print("Digite sua altura em metros: ");
            double altura = Double.parseDouble(sc.nextLine());

            // Exibir os dados inseridos
            System.out.println("\nDados inseridos:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Altura: " + altura + " metros");

        } catch (NumberFormatException e) {
            System.out.println("Erro de formato: Certifique-se de inserir um número válido para idade e altura.");
        }
        sc.close();
    }
}
