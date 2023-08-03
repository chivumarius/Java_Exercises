/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "EXERCISE 6" ◄◄




 Requirement:

    • Write a "Program" 
        → to "Multiply"
        → the "Corresponding Elements"
        → of "Two Arrays"
        → of "Integers".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;


public class Exercise6 {

    
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ "CREATING" THE "ARRAYS" ▼
        int[] array1 = { 1, 3, -5, 4 };
        int[] array2 = { 1, 4, -5, -2 };

        StringBuilder result = new StringBuilder(" ");


        // ▼ "FOR LOOP" ▼
        for (int i = 0; i < array1.length; i++) {
           int num1 = array1[i];
           int num2 = array2[i];

//           result += (num1 * num2) + " ";
           result.append(num1 * num2).append(" ");
        }

        System.out.println("\nResult: " + result);
    }

}
