/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontana_7_challenge0;

/**
 *
 * @author Redgamer120
 */
public class Fontana_7_challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i < 500; i++) {
           if (isDivisibleBy11(i) & isDivisibleBy5(i)){
               System.out.println("Animate This");
           }else if(isDivisibleBy11(i) & isDivisibleBy3(i)){
               System.out.println("Herr Direktor");
           }else if(isDivisibleBy11(i) & isDivisibleBy2(i)){
               System.out.println("ninja");
           }else if(isDivisibleBy2(i) & isDivisibleBy3(i)){
               System.out.println("chisme");
           }else if(isDivisibleBy2(i)){
               System.out.println("Davis");
           }else if(isDivisibleBy3(i)){
               System.out.println("Claughton");
           }else if(isDivisibleBy5(1)){
               System.out.println("Vidal");
           }else if(isDivisibleBy3(i) & isDivisibleBy5(i)){
               System.out.println("Old School");
           }else if(isDivisibleBy2(i) & isDivisibleBy3(i) & isDivisibleBy5(i)){
               System.out.println("Team Building");
           }
        }
    }
    static boolean isDivisibleBy2(int somenumber){
        return (somenumber % 2 == 0);
    }
    static boolean isDivisibleBy3(int somenumber){
        return (somenumber % 3 == 0);
    }
    static boolean isDivisibleBy5(int somenumber){
        return (somenumber % 5 == 0);
    }
    static boolean isDivisibleBy11(int somenumber){
        return (somenumber % 11 == 0);
    }
    }
    