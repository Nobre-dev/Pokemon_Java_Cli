public class Methods {
    static void Clean() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    static void StatusBar(int hp, int level, int strength, int defence){
        System.out.printf(" [HP] : %d |", hp);
        System.out.printf(" [LV] : %d |", level);
        System.out.printf(" [ATQ] : %d |", strength);
        System.out.printf(" [DEF] : %d ", defence);
    }

    static void Pause(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    static void Tutorial(Character player){
        Methods.Clean();
        System.out.println("       | INTERFACE |     ");
        Methods.Pause(1000);
        System.out.println("Primeiro vamos ver como seria a interface de status\n\n");
        Methods.Pause(2000);
        System.out.println("\n A barra de status contem 4 elementos: ");
        System.out.printf("""

                Vida: A quantidade de vida que o jogador tem, se chegar a zero o player morre, neste momento o player tem %d de vida
                Level: O nivel em que o player está, os niveis aumentam a força e defença do player, assim como a vida, neste momentos estás no level %d
                Força: O quanto de dano o player dá, aumenta com os level e itens(TODO) neste momento o player tira %d de danos aos inimigos
                Defença: O quanto o player retira do ataque, exemplo se tiveres uma defença de 10 pontos e tomares 15 pontos de danos, 10 pontos são retirados
                """, player.hp, player.Level,player.Strength);
        System.out.println("É assim que seria:\n");
        Methods.StatusBar(player.hp, player.Level, player.Strength, player.defence);
        Methods.Pause(2000);
        System.out.println("\nAgora que já sabemos quais são e como funcionam os status vamos ver a action bar!!");
        Methods.Clean();
        Methods.Pause(1000);
        System.out.println("""
                A action bar é basicamente o que o player pode fazer, a action bar muda dependendo do que o player está fazendo
                Por agora irei mostrar a actionbar de luta
                """);
        Methods.ActionBar();
        System.out.println("""
                Ela contem 4 ações:
                
                Attack: Ataca o enimigo
                Talk: Tentas conversar com o enimigo
                Itens: -- N feitos --
                Quit: Nome autoexplicativo
                """);

    }

    static void EnemyBar(int hp, int level){
        System.out.printf(" [HP] : %d |", hp);
        System.out.printf(" [LV] : %d |", level);
    }

    static void Battle(Character player, Enemy Enemy){

    }

    static void ActionBar(){
        System.out.println("""
               --------------------------------------------
               | [] Attack | [] Talk | [] Items | [] Quit |
               -------------------------------------------- 
                """);
    }
}
