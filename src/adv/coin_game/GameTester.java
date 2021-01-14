package adv.coin_game;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class GameTester {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        CoinGame cg = new CoinGame("mark", "ben");
        String userAnswer;

        do {
            cg.startGame();
            System.out.println("Play coin ? ");
            userAnswer = scan.nextLine();
        } while ((userAnswer.startsWith("y")) || (userAnswer.startsWith("Y")));
    }
}
