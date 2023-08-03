/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "EXERCISE 3" ◄◄




 Requirement:

    • Write a "Program" 
        → that "Convert"
        → a "Decimal Number"
        → to "Binary Number".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;


import java.util.Scanner;


public class Exercise3 {

    
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ CREATING "4 DECIMAL NUMBERS" ▼
        int decimalNumber, quotient, i=1, j;

        // ▼ CREATING A "BINARY ARRAY" ▼
        int[] binaryArray = new int[100];


        // ▼ GETTING "INPUT  DATA" →  FROM  THE  "USERS" ▼
        Scanner scan1 = new Scanner(System.in);


        // ▼ "DISPLAYING" THE "MESSAGE" FOR "USERS" ▼
        System.out.println("Enter the Decimal Number: ");

        // ▼ "GETTING" & "STORING" THE "DECIMAL NUMBER" ▼
        decimalNumber = scan1.nextInt();


        // ▼ "INITIALIZING" THE "QUOTIENT" THE "FIRST NUMBER" ▼
        quotient = decimalNumber;

        // ▼ "WHILE LOOP" ▼
        while (quotient != 0) {
            // ► "Storage" of the "Remainder" of the "Quot"
            //      → in the "binaryArray":
            binaryArray[i] = quotient % 2;
            // ► "Storing" the "Result" of the "New Quotient":
            quotient = quotient / 2;
            i++;
        }

        // ▼ "DISPLAYING" THE "BINARY NUMBER" ▼
        System.out.println("The Binary Number is: ");


        // ▼ "FOR LOOP" ▼
        for(j = i-1; j > 0; j--) {
            System.out.println(binaryArray[j]);
        }

        System.out.println();
    }
}
