/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontana_7_datatypes;

/**
 *
 * @author Redgamer120
 */
public class Fontana_7_datatypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //space for comments
      //used to explain code
      //code explanation is an expectation
      //in d22
      int i = 1;
      float a = 2.5f;
      double b = 3.87;
      short c = 16;  
      char d1 = ':';
      char d2 = 'y';       
      char d3 = 42;
      char d4 = 145;
      String e = d4 + "";
      String e1 = "Kawaii Reaper <3 Bleach";
      boolean f = true;
      boolean g = i % 2 == 0;
      /*
      here we will look at some mathematical operators
      */
      // + this adds two numbers and more
      // - this subtracts two numbers and more
      // * this multiplies two numbers and more
      // / this divides two numbers and more
      // % this is modulo shows you the remainder
      
//      System.out.println(i + " is an integer");
//      System.out.println(a + " is a float");
//      System.out.println(b + " is a double");
//      System.out.println(c + " is a short");
//      System.out.println(d1 + " is a char");
//      System.out.println(d2 + " is a char");
//      System.out.println(d3 + " is a char");
//      System.out.println(e1 + " is a string");
//      System.out.println(f + " is a boolean");
     for(i = -123; i < 123; i++){
         //System.out.println((char) i);
         System.out.println(i % 3 == 0);
      }
    /* % checks for the remainder
     i % 2 checks if a number is
     even or odd */
    // a number value for char
    // maps to a character
    i = 0;
    a = 0;
    e = "ninja";
    System.out.println(i + a + " an integer /" +
             "plus a float ");
    /*adding an int and a string
    concatenates (combines) the int and
    string as a string*/
    for(i = 0; i < 500; i++) {
    /*if is a conditional (flow)
      statement. If a condition is true
        the following command will be
        executed */    
     if (i % 2 == 0) {
   System.out.println(i + " is even");     
    }else{
   System.out.println(i + "is odd");   
   }
   
    
    
    
    
    
    
    
  }
 }
}
