/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "EXERCISE 8" ◄◄




 Requirement:

    • Write a "Program"
        → to "Make" such a "Pattern"
        → like a "Pyramid"
        → with "Number"
        → which will "Repeat"
        → the "Number"
        → in the "Same Row".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;


import java.util.Scanner;

public class Exercise8 {

    
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ GETTING "INPUT  DATA" →  FROM  THE  "USERS" ▼
        Scanner scan = new Scanner(System.in);


        // ▼ ATTRIBUTES DECLARATION ▼
        int i, j, x, number, space;

        // ▼ "DISPLAYING" THE "MESSAGE" FOR "USERS" ▼
        System.out.println("Please enter a Number: ");


        number = scan.nextInt();

        space = number + 4 - 5;


        // ▼ "Loop" for "Rows"
        //      → Create the "Number" of "Rows" ▼
       for (i = 1; i <= number; i++) {

           // ▼ "Loop" for "Spaces"
           //       → Create the "Number" of "Spaces"
           //       → from the "Beginning" of the "Row"
           //       → to the "Starting Position" of the "Numbers"
           for (x = space; x != 0; x--) {
               System.out.print(" ");
           }


           // ▼ "Loop" for "Numbers"
           //       → which will "Display"
           //       → the "Number" of "Digits"
           //       → "According" to the "Digit Value" ▼
           for (j = 1; j <= i; j++) {
               System.out.print(i + " ");
           }

           System.out.println();
           space--;
       }
    }
}
