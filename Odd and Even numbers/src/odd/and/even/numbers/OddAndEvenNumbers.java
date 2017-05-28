/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.and.even.numbers;

/**
 *
 * @author Otto Justice E
 */
import java.util.Scanner;
 
{
   public static void main(String args[])
   {
      int x;
      System.out.println("Enter an integer to check if it is either odd or even ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      if ( x % 2 == 0 )
         System.out.println("You entered an even number.");
      else
         System.out.println("You entered an odd number.");
   }
}
