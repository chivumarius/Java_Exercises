/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "EXERCISE 1" ◄◄





 Requirement:

    • Write a "Program" 
        → that "Gets 2 Numbers" 
        → from the "User" 
        → and "Displays" 
        → "Division" and "Remainder".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/

package com.chivumarius.lib;




// ▼ THE "CAR" CLASS ▼

import java.util.Scanner;

public class Exercise1 {

    
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ GETTING "INPUT  DATA" →  FROM  THE  "USERS" ▼
        Scanner scan1 = new Scanner(System.in);



        // ▼ "DISPLAYING" THE "MESSAGE" FOR "USERS" ▼
        System.out.println("Enter the First Number: ");

        // ▼ "GETTING" & "STORING" THE "FIRST NUMBER" ▼
        int num1 = scan1.nextInt();


        // ▼ "DISPLAYING" THE "MESSAGE" FOR "USERS" ▼
        System.out.println("Enter the Second Number: ");

        // ▼ "GETTING" & "STORING" THE "SECOND NUMBER" ▼
        int num2 = scan1.nextInt();



        // ▼ "CALCULATING NUMBER DIVISIONS" ▼
        // ► Converting "int" to "float" by "Type Casting" ("(float)") ◄
        float division = (float) num1 / num2;

        // ▼ "DISPLAYING" THE "DIVISION" ▼
        System.out.println("The division result is: " + division);



        //▼ "CALCULATING THE REMAINDER" ▼
        float remainder = num1 % num2;

        // ▼ "DISPLAYING" THE "DIVISION" ▼
        System.out.println("The remainder is: " + remainder);
    }
}
