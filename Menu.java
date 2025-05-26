package Modelos.src;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        //Menu contendo as perguntas:
        Scanner sc = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("Seja bem vindo ao Conversor de moedas!");
        System.out.println("1) Dólar ==> Peso Argentino");
        System.out.println("2) Peso Argentino ==> Dólar");
        System.out.println("3) Real Brasileiro ==> Dólar");
        System.out.println("4) Dólar ==> Peso Colombiano");
        System.out.println("5) Peso Colombiano ==> Dólar");
        System.out.println("6) Dólar ==> Real Brasileiro");
        System.out.println("7) Sair");

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();

        System.out.print("Escolha sua opção: ");
        int opcao = sc.nextInt();

        /*Chama o metodo conversao de moedas, e saída para o usuário: */


        switch (opcao) {
            case 1:
                System.out.println("Conversão: " + Conversor.conversor("USD", valor,"ARS"));
                break;
            case 2:
                System.out.println("Conversão: " + Conversor.conversor("ARS", valor,"USD"));
                break;

            case 3:
                System.out.println("Conversão: " + Conversor.conversor("BRL", valor,"USD"));
                break;
            case 4:
                System.out.println("Conversão: " + Conversor.conversor("USD", valor,"COP"));
                break;
            case 5:
                System.out.println("Conversão: " + Conversor.conversor("COP", valor,"USD"));
                break;
            case 6:
                System.out.println("Conversão: " + Conversor.conversor("USD", valor,"BRL"));
                break;
            case 7:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        sc.close();
    }
}