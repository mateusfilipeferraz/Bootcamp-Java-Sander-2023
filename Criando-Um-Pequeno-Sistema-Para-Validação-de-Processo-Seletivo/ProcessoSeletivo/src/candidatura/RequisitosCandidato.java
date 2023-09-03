/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package candidatura;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**@author Mateus*/

public class  RequisitosCandidato {
    
    public static void main(String[] args) {
      imprimirSelecionados();
    }
    static void imprimirSelecionados (){
        System.out.println("Imprimir a lista de candidatos ");
        System.out.println("-----------------------------------------");
             Scanner sc=new Scanner(System.in);
             
         String[] candidatos=new String[5];
         
         
         for (int indice= 0; indice< 5; indice++) {
             System.out.print("Digite um nome: ");
             candidatos[indice]= sc.nextLine();
         }
         //Forma abreviada 
             System.out.println("-----------------------------------------");
             for(String candidato:candidatos){
                     System.out.println("O candidato seleciionado foi " +candidato);
            /*for (int indice = 0; indice < candidatos.length; indice++) {    
             System.out.println("O candidato de n " + (indice +1) + "  "+ candidatos[indice]);
    }*/
             }
    }
     static void selecaoCandidato(){
        String[] candidatos ={"filipe","mateus"};
        
        int candidatosSelecionados =0;
        int candidatoAtual=0;
        double salarioBase=2000.0;
        while (candidatosSelecionados<5 && candidatoAtual<candidatos.length) {            
            String candidato= candidatos[candidatoAtual];
            double salarioPretendido =valorPretendido();
            System.out.printf("O candidato " + candidato + " Solicitou este valor de salário %.2f \n",valorPretendido() );
            if (salarioBase>=salarioPretendido) {
                System.out.println("O candidato "+candidato + " foi selecionado para a vaga");
                System.out.println("");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
     
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2000);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Liga para Candidato ");

        } else if (salarioBase == salarioPretendido) {
            System.out.println(" Liga para Candidato");
        }else{
            System.out.println("Aguardando o resultado do demais candidatos");
        }

    }
    }

