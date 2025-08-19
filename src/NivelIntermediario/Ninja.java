package NivelIntermediario;

import org.w3c.dom.ls.LSOutput;

public class Ninja {

    String nome;
    String Aldeia;
    int idade;


    // Cria um metodo publico personalizado

    /*
    * O metodo VOID nao retorna valor nenhum!
    * */



    /*
    * Metodo String vai ter que retornar uma String
    * */

    public String euSouUmNinja (){
        return "Oi, eu sou um ninja";

    }

    /*
    * Metodo Int vai ter que retornar um int
    * */

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

}
