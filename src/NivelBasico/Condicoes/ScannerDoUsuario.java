package NivelBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {

        /*
         *Scanner  = E um jeito de trazer o usuario par dentro da aplicacao
         * Objetivo: O usuario vai criar o ninja e vamos valor os dados
         * */


        //Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);


        // Recceber nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja e: ");
        System.out.println(nomeDoNinja);


        //Recebe Idade do ninja
        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A ideade do ninja e: " + idadeDoNinja + " anos");

        // tratamento de dados
        if (idadeDoNinja >=18 ){
            System.out.println("Esse ninja pode ir para missao fora da aldeia, pois e maior de idade");

        } else {
            System.out.println("Esse ninja e muito novo para missoes como essa, precisara de mais treinamento");
        }


        // Fechar sempre o Scanner
        caixaDeTexto.close();
    }


}
