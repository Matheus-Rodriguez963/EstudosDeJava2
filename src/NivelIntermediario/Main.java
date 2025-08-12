package NivelIntermediario;


public class Main {

    public static void main(String[] args) {

        //Criar o ninja Naruto - Naruto e um objeto
        Ninja Naruto = new Ninja();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.Aldeia = "aldeia da Folha";
        Naruto.idade = 17;


        // Criar ninja sasuke - sasuke e um objeto

        Ninja Sasuke = new Ninja();

        Sasuke.nome = "Sasuke uchiha";
        Sasuke.Aldeia = "aldeia da Folha";
        Sasuke.idade = 29;

        //Aplicando metdos os meus objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo =  Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);



       int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println( "Voce tem: " + Sasuke.idade + " entao falta no minimo: " + quantoTempoFalta + "  anos para voce se tornar Hokage");


        // Criar ninja Sakura Haruno

        Ninja Sakura = new Ninja();

        Sakura.nome = "Sakura Jaruno";
        Sakura.Aldeia = "aldeia da Folha";
        Sakura.idade = 17;


    }
}
