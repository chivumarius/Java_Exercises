/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "EXERCISE 7" ◄◄




 Requirement:

    • Write a "Java Program"
        → to "Count"
        → the "Numbers"
        → of "Even" and "Odd Elements"
        → in a "Given Array"
        → of "Integers".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;


public class Exercise7 {

    
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ "CREATING" THE "ARRAY" ▼
        int[] numbers = { 5, 7, 2, 4, 9};

        // "INITIALIZING" THE "COUNTERS" ▼
        int evenCounter = 0;
        int oddCounter = 0;

        // ▼ "FOR LOOP" ▼
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        System.out.println("The Number of Even Numbers is: " + evenCounter);
        System.out.println("The Number of Odd Numbers is: " + oddCounter);
    }

}
