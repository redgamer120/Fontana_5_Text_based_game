/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Redgamer120
 */
public class Fontana_counter {
    public static void main(String[] args) {
        int x =0;
        for (int i = 0; i <100; i++){
               if(i % 2 == 0); {
               if (isPrime(i)) {
                //x += 1;
                System.out.println(i + " is prime");
            }    
                x += 1;
                //System.out.println("We have " + x + " evens!");
                }
            }
        System.out.println("We have " + x + " total evens.");
        }
        /*
        A method is like a little program
        A method is an action you want to repeat freqently
        */
        static boolean isEven (int somenumber) {
            return (somenumber % 2 == 0);
        }
        static boolean isOdd (int somenumber) {
            return (somenumber % 2 != 0);
        }
        static boolean isPrime (int somenumber) {
            int divisor = 0;
            for (int i = 2; i < somenumber; i++) {
               if (somenumber % i == 0) {
                   divisor += 1;
               }
        }
        return (divisor == 0);
    }
}