/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "EXERCISE 4" ◄◄




 Requirement:

    • Write a "Program" 
        → to "Count"
        → the "Letters", "Spaces", "Numbers"
        → and "Others Characters"
        → of an "Input String".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;


import java.util.Scanner;


public class Exercise4 {

    
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ GETTING "INPUT  DATA" →  FROM  THE  "USERS" ▼
        Scanner scan1 = new Scanner(System.in);


        // ▼ "DISPLAYING" THE "MESSAGE" FOR "USERS" ▼
        System.out.println("Enter the String: ");




        // ▼ "GETTING" & "STORING" THE "INPUT STRING" ▼
        String inputString = scan1.nextLine();

        // ▼ "CALLING" THE "METHOD" ▼
        countCharacters(inputString);
    }


    // ▼ "COUNT CHARACTERS" METHOD ▼
    public static void countCharacters(String str){
        // ► "Storing" the "String" into an "Array" of "Characters" ◄
        char[] characters = str.toCharArray();


        // ▼ "CHARACTERS INITIALIZATIONS" ▼
        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;


        // ▼ "FOR LOOP" ▼
        // ► In which we "Examine" the  "Characters" Array "String" ◄
        for(int i = 0; i < str.length(); i++){

            // ▼ "IF CONDITION" ▼
            if(Character.isLetter(characters[i])){
                letters++;
            } else if (Character.isSpaceChar(characters[i])){
                spaces++;
            } else if (Character.isDigit(characters[i])){
                numbers++;
            } else {
                others++;
            }
        }


        // ▼ "DISPLAYING" THE "RESULTS" FOR THE "USER" ▼
        System.out.println("Letters: " + letters);
        System.out.println("Spaces: " + spaces);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other: " + others);

    }
}
