import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods.Clean();

        //Inicio
        System.out.println("Bem vindo ao pokemon 2.0 cli por favor diga seu nome:");
        Scanner scanner = new Scanner(System.in);
        String playername = scanner.nextLine();

        //Criar o personagem
        Character player = new Character(playername,1,1,100,1);

        if (playername.equalsIgnoreCase("cheatcode:godmode")){
            System.out.println("Código detectado");
            player.Level = 9999;
            player.defence = 9999;
            player.Strength = 9999;
            player.hp = 9999;
        }
        Methods.Pause(1000);
        Methods.Clean();
        System.out.printf("Você quer fazer o tutorial?\n [Y] Sim, [N] Não\n");
        Scanner scanner2 = new Scanner(System.in);
        String response = scanner2.nextLine();
        if (response.equalsIgnoreCase("Y")){
            Methods.Tutorial(player);
        }
        else {
            System.out.println("TODO");
        }






    }
}