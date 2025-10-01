package Desafios;

/**
 * Classe que representa um ninja avançado - Desafio 4
 * Implementa a interface NinjaDesafio4 e possui uma especialidade adicional
 */
public class NinjaAvancadoDesafio4 implements NinjaDesafio4 {
    
    private String nome;
    private int idade;
    private String habilidade;
    private String especialidade;
    private TipoHabilidadeDesafio4 tipoHabilidade;
    private TipoHabilidadeDesafio4 tipoEspecialidade;
    
    /**
     * Construtor da classe NinjaAvancado
     * @param nome Nome do ninja
     * @param idade Idade do ninja
     * @param habilidade Habilidade básica do ninja
     * @param especialidade Especialidade única do ninja avançado
     * @param tipoHabilidade Tipo da habilidade básica
     * @param tipoEspecialidade Tipo da especialidade
     */
    public NinjaAvancadoDesafio4(String nome, int idade, String habilidade, String especialidade, 
                         TipoHabilidadeDesafio4 tipoHabilidade, TipoHabilidadeDesafio4 tipoEspecialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.tipoHabilidade = tipoHabilidade;
        this.tipoEspecialidade = tipoEspecialidade;
    }
    
    /**
     * Mostra as informações completas do ninja avançado
     */
    @Override
    public void mostrarInformacoes() {
        System.out.println("=== NINJA AVANÇADO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo Habilidade: " + tipoHabilidade.getNome());
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Tipo Especialidade: " + tipoEspecialidade.getNome());
        System.out.println("Nível Poder Habilidade: " + tipoHabilidade.getNivelPoder());
        System.out.println("Nível Poder Especialidade: " + tipoEspecialidade.getNivelPoder());
        System.out.println("Nível: Avançado");
        System.out.println("=====================");
    }
    
    /**
     * Executa tanto a habilidade básica quanto a especialidade
     */
    @Override
    public void executarHabilidade() {
        System.out.println(nome + " executa: " + habilidade + "!");
        System.out.println("Tipo: " + tipoHabilidade.getNome());
        System.out.println("E também ativa sua especialidade: " + especialidade + "!");
        System.out.println("Tipo Especialidade: " + tipoEspecialidade.getNome());
        System.out.println("Habilidades avançadas ativadas com poder máximo!");
    }
    
    /**
     * Método específico para executar apenas a especialidade
     */
    public void executarEspecialidade() {
        System.out.println(nome + " concentra sua energia e executa: " + especialidade + "!");
        System.out.println("Tipo: " + tipoEspecialidade.getNome());
        System.out.println("Especialidade única ativada!");
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
    
    public String getEspecialidade() {
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public TipoHabilidadeDesafio4 getTipoHabilidade() {
        return tipoHabilidade;
    }
    
    public void setTipoHabilidade(TipoHabilidadeDesafio4 tipoHabilidade) {
        this.tipoHabilidade = tipoHabilidade;
    }
    
    public TipoHabilidadeDesafio4 getTipoEspecialidade() {
        return tipoEspecialidade;
    }
    
    public void setTipoEspecialidade(TipoHabilidadeDesafio4 tipoEspecialidade) {
        this.tipoEspecialidade = tipoEspecialidade;
    }
}
