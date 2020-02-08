/* 
 Project: Lab 3 - Group
 Purpose Details: Connections
 Course: IST 411
 Author: Ryan Urbanski, Albana Beqo, James Bristow II, Logan Pratt, Fred Aaron
 Date Developed: 2/9/2020
 Last Date Changed:2/6/2020
 Revision: 1
 */
package ist411t1connections;

import java.util.Scanner;

/**
 *
 * @author Ryan Urbanski, Albana Beqo, James Bristow II, Logan Pratt, Fred Aaron
 */
public class Lab3
{

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args)
   {
      Scanner scnr = new Scanner(System.in); //Set up Scanner.

      int ans;
      boolean valid = false;
      while (!valid)
      {
         System.out.println("Enter 1 for BitCoin or 2 for Noaa.");
         ans = scnr.nextInt();
         switch (ans)
         {
            case 1:
               BitCoin coin = new BitCoin();
               valid = true;
               break;
            case 2:
               Noaa noaa = new Noaa();
               valid = true;
               break;
            default:
               System.out.println("Wrong number!");
               break;
         }
      }
   }
}
