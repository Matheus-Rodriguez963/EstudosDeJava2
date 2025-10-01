package NivelIntermediario;

public class Uzumaki extends Ninja{

    public void ModoSabioAtivado(){

        System.out.println("Meu nome e " + nome + " Ativei o modo Sabio ");
    }

    /*
    * Polimorfismo: Override do metodo habilidadeEspecial para o uzumaki
    * */

    @Override
    public void habilidadeEspecial(){
        System.out.println("esse e o habilidade especial do uzumaki: " + habilidadeEspecial);
    }
}
