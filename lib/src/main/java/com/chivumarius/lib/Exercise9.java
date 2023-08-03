/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "EXERCISE 9" ◄◄




 Requirement:

    • Write a "Program"
        → to "Add Two Matrices"
        → of the "Sane Size".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;


import java.util.Scanner;

public class Exercise9 {

    
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ GETTING "INPUT  DATA" →  FROM  THE  "USERS" ▼
        Scanner scan = new Scanner(System.in);


        // ▼ ATTRIBUTES DECLARATION ▼
        int rows, columns, counter, d;

        // ▼ "DISPLAYING" THE "MESSAGE" FOR "USERS" ▼
        System.out.println("Enter the Number of Rows: ");

        // ▼ "STORING" THE "NUMBER" OF "ROWS" ▼
        rows = scan.nextInt();


        // ▼ "DISPLAYING" THE "MESSAGE" FOR "USERS" ▼
        System.out.println("Enter the Number of Columns: ");

        // ▼ "STORING" THE "NUMBER" OF "COLUMNS" ▼
        columns = scan.nextInt();


        // ▼ "CREATING" A "2-DIMENSIONAL ARRAY" ▼
        int[][] array1 = new int[rows][columns];
        int[][] array2 = new int[rows][columns];
        int[][] sumArray = new int[rows][columns];


        // ▼ "GETTING" THE "ELEMENTS" OF "MATRIX 1" ▼
        System.out.println("Enter the Elements of 1st Matrix: ");

        // ▼ "Looping" for "Rows" ▼
        for (counter = 0; counter < rows; counter++){
            // ▼ "Looping" for "Columns" ▼
            for (d = 0; d < columns; d++){
                array1[counter][d] = scan.nextInt();
            }
        }


        // ▼ "GETTING" THE "ELEMENTS" OF "MATRIX 1" ▼
        System.out.println("Enter the Elements of 2nd Matrix: ");

        // ▼ Looping ▼
        // ▼ "Looping" for "Rows" ▼
        for (counter = 0; counter < rows; counter++){
            // ▼ "Looping" for "Columns" ▼
            for (d = 0; d < columns; d++){
                array2[counter][d] = scan.nextInt();
            }
        }


        // ▼ THE "ADDITION" OF THE "2 MATRICES" ▼
        // ▼ "Looping" for "Rows" ▼
        for (counter = 0; counter < rows; counter++){
            // ▼ "Looping" for "Columns" ▼
            for (d = 0; d < columns; d++){
                sumArray[counter][d] = array1[counter][d] + array2[counter][d];
            }
        }


        // ▼ "GETTING" THE "SUMMATION" OF "MATRICES" ▼
        System.out.println("Sum of the Matrices: ");


        // ▼ "Looping" for "Rows" ▼
        for (counter = 0; counter < rows; counter++){
            // ▼ "Looping" for "Columns" ▼
            for (d = 0; d < columns; d++){
                System.out.print(sumArray[counter][d] + "\t");
            }
            System.out.println();
        }
    }
}
