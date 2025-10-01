package Desafios;

/**
 * Classe principal que demonstra o uso de interfaces e polimorfismo
 * com diferentes tipos de ninjas - Desafio 4
 */
public class MainDesafio4 {
    
    public static void main(String[] args) {
        
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE NINJAS ===");
        System.out.println("Demonstrando interfaces e polimorfismo\n");
        
        // Criando ninjas básicos com tipos de habilidade
        NinjaDesafio4 ninja1 = new NinjaBasicoDesafio4("Kakashi", 26, "Chidori", TipoHabilidadeDesafio4.NINJUTSU);
        NinjaDesafio4 ninja2 = new NinjaBasicoDesafio4("Iruka", 25, "Kunai Jutsu", TipoHabilidadeDesafio4.TAIJUTSU);
        
        // Criando ninjas avançados com tipos de habilidade e especialidade
        NinjaDesafio4 ninja3 = new NinjaAvancadoDesafio4("Naruto", 17, "Kage Bunshin", "Modo Sábio", 
                                        TipoHabilidadeDesafio4.NINJUTSU, TipoHabilidadeDesafio4.RINNENGAN);
        NinjaDesafio4 ninja4 = new NinjaAvancadoDesafio4("Sasuke", 17, "Chidori", "Sharingan", 
                                        TipoHabilidadeDesafio4.NINJUTSU, TipoHabilidadeDesafio4.RINNENGAN);
        
        // Array de ninjas para demonstrar polimorfismo
        NinjaDesafio4[] ninjas = {ninja1, ninja2, ninja3, ninja4};
        
        System.out.println("=== DEMONSTRAÇÃO DE POLIMORFISMO ===");
        System.out.println("Todos os ninjas implementam a interface NinjaDesafio4\n");
        
        // Usando polimorfismo - mesmo método, comportamentos diferentes
        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("--- Ninja " + (i + 1) + " ---");
            ninjas[i].mostrarInformacoes();
            ninjas[i].executarHabilidade();
            System.out.println();
        }
        
        System.out.println("=== DEMONSTRAÇÃO DE MÉTODOS ESPECÍFICOS ===");
        
        // Demonstração de métodos específicos da classe NinjaAvancadoDesafio4
        System.out.println("Demonstrando especialidade dos ninjas avançados:");
        
        // Casting para acessar métodos específicos
        if (ninjas[2] instanceof NinjaAvancadoDesafio4) {
            NinjaAvancadoDesafio4 naruto = (NinjaAvancadoDesafio4) ninjas[2];
            naruto.executarEspecialidade();
        }
        
        if (ninjas[3] instanceof NinjaAvancadoDesafio4) {
            NinjaAvancadoDesafio4 sasuke = (NinjaAvancadoDesafio4) ninjas[3];
            sasuke.executarEspecialidade();
        }
        
        System.out.println("\n=== DEMONSTRAÇÃO DO ENUM TIPOHABILIDADE ===");
        System.out.println("Tipos de habilidades disponíveis:");
        for (TipoHabilidadeDesafio4 tipo : TipoHabilidadeDesafio4.values()) {
            System.out.println("- " + tipo.toString());
            System.out.println("  Nível de Poder: " + tipo.getNivelPoder());
            if (tipo.isElemental()) {
                System.out.println("  Habilidade Elemental");
            }
            if (tipo.isDojutsu()) {
                System.out.println(" Dojutsu Supremo");
            }
            System.out.println();
        }
        
    }
}
