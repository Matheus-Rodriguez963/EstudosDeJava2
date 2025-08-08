package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {


        /*
        * Dados nao primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir metodos a ele.
        * */

        String nome = "Naruto Uzumaki";
        String nomeToUpperCase = nome.toUpperCase(); // toUppercase vai colocar tudo em CAPSLOCK
        System.out.println( "Esse nome esta em CAPSLOCK: " + nomeToUpperCase);
        System.out.println( "Esse nome esta normal: " + nome);

        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaToLowerCase = aldeia.toLowerCase(); // ToLowerCase vai ficar tudo em caixa baixa
        System.out.println("Esse nome esta em caixa baixa: " +  aldeiaToLowerCase);
        System.out.println("Esse nome esta em normal: " + aldeia);
    }


}



