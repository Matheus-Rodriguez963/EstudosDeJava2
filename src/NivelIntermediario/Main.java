package NivelIntermediario;


public class Main {

    public static void main(String[] args) {

        //Criar o ninja Naruto - Naruto e um objeto

        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.Aldeia = "aldeia da Folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();


        // Criar ninja sasuke - sasuke e um objeto

        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke uchiha";
        Sasuke.Aldeia = "aldeia da Folha";
        Sasuke.idade = 18;


        // Criar ninja Sakura Haruno

        Haruno Sakura = new Haruno();

        Sakura.nome = "Sakura Haruno";
        Sakura.Aldeia = "aldeia da Folha";
        Sakura.idade = 17;
        Sakura.AtivarCura();




        //Aplicando metodos os meus objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo =  Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);


        //Criando tempo para um ninja se tornar um hokage

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println( "Voce tem: " + Sasuke.idade + " entao falta no minimo: " + quantoTempoFalta + "  anos para voce se tornar Hokage");



    }
}
