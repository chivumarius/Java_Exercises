/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "EXERCISE 5" ◄◄




 Requirement:

    • Write a "Program" 
        → to "Revers"
        → a "String".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;


import java.util.Scanner;


public class Exercise5 {

    
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ GETTING "INPUT  DATA" →  FROM  THE  "USERS" ▼
        Scanner scan1 = new Scanner(System.in);


        // ▼ "DISPLAYING" THE "MESSAGE" FOR THE "USER" ▼
        System.out.println("Enter the String to Reverse It: ");


        // ▼ "GETTING" & "STORING" THE "INPUT STRING" ▼
        // ▼ AND "CONVERSING IT" INTO A "CHAR ARRAY" ▼
        char[] inputString = scan1.nextLine().toCharArray();


        // ▼ "FOR LOOP" ▼
        // ► In which we "Examine" the  "Input String Array" and "Reverses It" ◄
        // ► We use "i--" → to "Start" from the "Ending" ◄
        for (int i = inputString.length - 1; i >= 0; i--){
            System.out.print(inputString[i]);
        }
        System.out.println();
    }

}
