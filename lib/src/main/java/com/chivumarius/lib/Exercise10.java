/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "EXERCISE 10" ◄◄




 Requirement:

    • Write a "Program"
        → to "Calculate"
        → the "Average Value"
        → of "Array Elements".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;


public class Exercise10 {

    
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ "CREATING" THE "ARRAY" ▼
        int[] numbers = new int[]{1, 2, 5, 7, 9, 8};

        // ▼ "CALCULATING" THE "SUM" OF "ALL ELEMENTS" ▼
        int sum = 0;

       for (int i = 0; i < numbers.length; i++) {
           sum += numbers[i];
       }


        // ▼ "CALCULATING" THE "AVERAGE VALUE" ▼
        double average = (double)sum/numbers.length;

        // ▼ "Displaying" the "Message" ▼
        System.out.println("The Average Value is: " + average);
    }
}
