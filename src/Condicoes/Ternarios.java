package Condicoes;

public class Ternarios {

    public static void main(String[] args) {

        /*
        * Ternarios: Sao maneiras para reduzir o codigo
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
        *
        * */

        short numeroDeMissoes = 1;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";

        System.out.println(nivelDoNinja);


    }
}
