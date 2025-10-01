package NivelIntermediario;

public class Ninja {

    String nome;
    String Aldeia;
    int idade;
    String habilidadeEspecial;


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
    
    /*
    * Habilidade Especial Geral para todos os ninjas
    * */

    public void habilidadeEspecial(){
        System.out.println("Meu nome e " + nome + " e tenho a habilidade especial de " + habilidadeEspecial);
    }
}

