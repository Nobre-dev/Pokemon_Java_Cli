import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Methods Method = new Methods();


        //Inicio
        System.out.println("Bem vindo ao pokemon 2.0 cli por favor diga seu nome:");
        Scanner scanner = new Scanner(System.in);
        String playername = scanner.nextLine();

        //Criar o personagem
        Character player = new Character(playername,0,0,1,100);



        Method.clean();
        System.out.printf("Você quer fazer o tutorial?\n [Y] Sim, [N] Não\n");
        Scanner scanner2 = new Scanner(System.in);
        String response = scanner2.nextLine();

        if (response.equalsIgnoreCase("Y")){
            Method.Tutorial();
        }
        else-if(response.equalsIgnoreCase("N")) {
            System.out.println("TODO");
        }
        else {}





    }
}