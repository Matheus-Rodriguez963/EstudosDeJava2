package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {

    public static void main(String[] args) {

        /*
        * SwitchCases: Que servem para gerar casos
        * Objetivo:Perdir para o usuario escolher entre os Ninjas
        * switchCase
        * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // mosrtrar opcoes para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuario escolher uma das opcoes
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Voce digitou o numero:" + escolhaDoUsuario);

        //reacao ao escolher um personagem

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno");
                break;

            default:
                System.out.println("Voce nao digitou uma resposta valida, tente novamente!!");

        }


        //Fechar a Caixa
        scanner.close();
    }

}
