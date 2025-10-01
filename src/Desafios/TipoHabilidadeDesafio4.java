package Desafios;

/**
 * Enum que define os diferentes tipos de habilidades dos ninjas - Desafio 4
 */
public enum TipoHabilidadeDesafio4 {
    
    TAIJUTSU("Taijutsu", "Artes marciais e combate corpo a corpo"),
    NINJUTSU("Ninjutsu", "Técnicas ninja com manipulação de chakra"),
    GENJUTSU("Genjutsu", "Técnicas de ilusão que afetam a mente"),
    KATON("Katon", "Técnicas de fogo e manipulação de chakra de fogo"),
    RINNENGAN("Rinnegan", "Dojutsu supremo com poderes divinos");
    
    private final String nome;
    private final String descricao;
    
    /**
     * Construtor do enum
     * @param nome Nome da habilidade
     * @param descricao Descrição da habilidade
     */
    TipoHabilidadeDesafio4(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }
    
    /**
     * Retorna o nome da habilidade
     * @return Nome da habilidade
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Retorna a descrição da habilidade
     * @return Descrição da habilidade
     */
    public String getDescricao() {
        return descricao;
    }
    
    /**
     * Retorna uma representação em string da habilidade
     * @return String formatada com nome e descrição
     */
    @Override
    public String toString() {
        return nome + " - " + descricao;
    }
    
    /**
     * Verifica se a habilidade é do tipo elemental
     * @return true se for elemental, false caso contrário
     */
    public boolean isElemental() {
        return this == KATON;
    }
    
    /**
     * Verifica se a habilidade é do tipo dojutsu
     * @return true se for dojutsu, false caso contrário
     */
    public boolean isDojutsu() {
        return this == RINNENGAN;
    }
    
    /**
     * Retorna o nível de poder da habilidade (1-5)
     * @return Nível de poder
     */
    public int getNivelPoder() {
        switch (this) {
            case TAIJUTSU:
                return 1;
            case NINJUTSU:
                return 2;
            case GENJUTSU:
                return 3;
            case KATON:
                return 4;
            case RINNENGAN:
                return 5;
            default:
                return 1;
        }
    }
}
