package NivelIntermediario;

public class Main {

    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto e um objeto

        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.Aldeia = "aldeia da Folha";
        Naruto.idade = 17;
        Naruto.habilidadeEspecial = "KageBushin no Jutsu";
        Naruto.ModoSabioAtivado();

        // Criar ninja sasuke - sasuke e um objeto

        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke uchiha";
        Sasuke.Aldeia = "aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.habilidadeEspecial = "Sharingan";

        // Criar ninja Sakura Haruno

        Haruno Sakura = new Haruno();

        Sakura.nome = "Sakura Haruno";
        Sakura.Aldeia = "aldeia da Folha";
        Sakura.idade = 17;
        Sakura.AtivarCura();

        // Criando ninja Hinata Hyuuga

        Hyuuga Hinata = new Hyuuga();

        Hinata.nome = "Hinata Hyuuga";
        Hinata.Aldeia = "Aldeia da Folha";
        Hinata.idade = 18;
        Hinata.AtivarByakugan();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Uzumaki";
        Boruto.Aldeia = "Aldeia da Folha";
        Boruto.idade = 9;

        // Criando ninja Boruto
        Boruto.AtivarOKarma();
        Boruto.AtivarJogan();
        Boruto.ModoSabioAtivado();

        // Aplicando metodos os meus objetos Boruto
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chamandoMetodo);

        // Criando tempo para um ninja se tornar um hokage

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Voce tem: " + Sasuke.idade + " entao falta no minimo: " + quantoTempoFalta
                + "  anos para voce se tornar Hokage");

        //////////////////////////////////////////////////////////////
        ///// CRIANDO UM HOKAGE /////////////////////////////////////
        //////////////////////////////////////////////////////////////

        // Criando um hokage utilizando o construtor com argumentos
        Hokages Hashirama = new Hokages("Hashirama Senju", 70, true);

        Hokages Tobirama = new Hokages("Tobirama Senju", 30, true);

        Hokages Hiruzen = new Hokages("Hiruzen Sarutobi", 40, true);

        Hokages Minato = new Hokages("Minato Namikaze", 32, false);

    }
}
