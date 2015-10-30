/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontana_5_number_guessing_game;
import java.util.Random;
import java.util.Scanner;

public class Fontana_5_number_guessing_game {
    
    static String username;
    static boolean answer;
    static int yourguess;
    static int magicnumber;
    static Random Random;
    static boolean playagain = true;
    static int tries;
    
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Random = new Random();
        magicnumber = (Random.nextInt(9)+1);
        
        while (playagain = true){
            playthegame();
        }
    }
    public static void playthegame() {
        if (tries == 3) {
            System.out.println("You ran out of tries! Game Over");
            playagain = false;
        } else {
            Scanner name = new Scanner(System.in);
            Scanner guess = new Scanner(System.in);
            System.out.println("Hello " + username + " please pick a number between 1 and 10.");
            yourguess = guess.nextInt();
            if (yourguess == magicnumber) {
                System.out.println("Yeah, You Win!!");
                playagain = false;
            } else if (yourguess < magicnumber) {
                System.out.println("Darn, You Failed!! Way Too Low");
                tries++;
            } else if (yourguess > magicnumber) {
                System.out.println("Darn, You Failed!! Way Too High");
                tries++;
            }   
        }
    }  
}
