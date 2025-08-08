package NivelBasico.Condicoes;

public class IfEElse {

    public static void main(String[] args) {

        /*
        * IF e Else - NivelBasico.Condicoes
        * Else If
        * Obejetivo: Tornar o Tony Tony Chopper um medico de acordo com o numero de remedios
        * */

        //Tony Tony Chopper
        String nome = "Chopper";
        int recompensa = 5000;
        int idade = 17;
        boolean medico = false;
        short remedio = 40;

        /*
        * if (condicao) {resultado}
        * else if (Condicao) {resultado}
        * else {resultado caso nada seja verdadeiro}
        *
        * */

        //se (condicao) {faca isso}

        if (recompensa >= 10000 && remedio >= 14 ) {
            System.out.println("Chopper pode ser um medico");
        } else if (remedio >= 40) {
            System.out.println("Chopper nao pode ser um medico agora" );
        } else {
            System.out.println("Chopper passa a ser um aprendiz nivel 2" );

        }


    }



}
