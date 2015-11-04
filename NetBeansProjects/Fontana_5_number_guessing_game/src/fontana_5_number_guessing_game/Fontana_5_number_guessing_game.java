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
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
            username = name.nextLine();
        while (playagain == true){
            playthegame();
        }
    }
    public static void playthegame() {
        if (tries == 4) {
            System.out.println("You ran out of tries! Game Over");
            System.out.println("The number you failed to get was " + magicnumber);
            playagain = false;
        } else {
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
