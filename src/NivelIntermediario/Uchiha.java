package NivelIntermediario;

public class Uchiha extends Ninja {

    public void SharinganAtivado() {

        System.out.println( "Meu nome e: " + nome + ". Ativei o Sharringan, porque sou um uchiha!!");
    }

    /*
    * Polimorfismo: Override do metodo habilidadeEspecial para o uchiha
    * */

    @Override
    public void habilidadeEspecial(){
        System.out.println("esse e o habilidade especial do uchiha: " + habilidadeEspecial);
    }
}
