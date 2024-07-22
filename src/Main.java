import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Methods Method = new Methods();


        //Inicio
        System.out.println("Bem vindo ao pokemon 2.0 cli por favor diga seu nome:");
        Scanner scanner = new Scanner(System.in);
        String playername = scanner.nextLine();

        //Criar o personagem
        Character player = new Character(playername,0,0,1);


    }
}