package Desafios;


public class NinjaDesafio {

    String nome;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    int idade;

    public void mostrarInformacoes(){

        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Idade do Ninja: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel da missao: " + nivelDificuldade);
        System.out.println("Status da missao: " + statusMissao);
    }
}
