package Desafios;

/**
 * Classe que representa um ninja básico - Desafio 4
 * Implementa a interface NinjaDesafio4
 */
public class NinjaBasicoDesafio4 implements NinjaDesafio4 {
    
    private String nome;
    private int idade;
    private String habilidade;
    private TipoHabilidadeDesafio4 tipoHabilidade;
    
    /**
     * Construtor da classe NinjaBasico
     * @param nome Nome do ninja
     * @param idade Idade do ninja
     * @param habilidade Habilidade básica do ninja
     * @param tipoHabilidade Tipo da habilidade
     */
    public NinjaBasicoDesafio4(String nome, int idade, String habilidade, TipoHabilidadeDesafio4 tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }
    
    /**
     * Mostra as informações básicas do ninja
     */
    @Override
    public void mostrarInformacoes() {
        System.out.println("=== NINJA BÁSICO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo: " + tipoHabilidade.getNome());
        System.out.println("Descrição: " + tipoHabilidade.getDescricao());
        System.out.println("Nível de Poder: " + tipoHabilidade.getNivelPoder());
        System.out.println("Nível: Básico");
        System.out.println("==================");
    }
    
    /**
     * Executa a habilidade básica do ninja
     */
    @Override
    public void executarHabilidade() {
        System.out.println(nome + " executa: " + habilidade + "!");
        System.out.println("Tipo de habilidade: " + tipoHabilidade.getNome());
        System.out.println("Habilidade básica ativada com sucesso!");
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getHabilidade() {
        return habilidade;
    }
    
    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    
    public TipoHabilidadeDesafio4 getTipoHabilidade() {
        return tipoHabilidade;
    }
    
    public void setTipoHabilidade(TipoHabilidadeDesafio4 tipoHabilidade) {
        this.tipoHabilidade = tipoHabilidade;
    }
}
