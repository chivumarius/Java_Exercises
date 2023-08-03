/*▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀

        ►► "EXERCISE 2" ◄◄




 Requirement:

    • Write a "Program" 
        → that "Gets"
        → from the "User" 
        → the "Radius"
        → and "Print"
        → the "Area" and "Perimeter"
        → of a "Circle"".

▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀*/
package com.chivumarius.lib;


import java.util.Scanner;


public class Exercise2 {

    
    // ▼ The "main()" Method → is the "Entry Point" for the "Program" ▼
    public static void main(String[] args){

        // ▼ GETTING "INPUT  DATA" →  FROM  THE  "USERS" ▼
        Scanner scan1 = new Scanner(System.in);



        // ▼ "DISPLAYING" THE "MESSAGE" FOR "USERS" ▼
        System.out.println("Please enter a radius: ");

        // ▼ "GETTING" & "STORING" THE "RADIUS" ▼
        int radius = scan1.nextInt();




        // ▼ "CALCULATING THE PERIMETER" ▼
        // ► Converting "int" to "float" by "Type Casting" ("(float)") ◄
        float perimeter = (float) (2 * Math.PI * radius); // ► 2 * 3.14 * radius

        //▼ "CALCULATING THE AREA" ▼
        // ► Converting "int" to "float" by "Type Casting" ("(float)") ◄
        float area = (float) (Math.PI * Math.pow(radius, 2)); // ► 3.14 * radius * radius



        // ▼ "DISPLAYING" THE "PERIMETER" ▼
        System.out.println("The Perimeter is: " + perimeter);

        // ▼ "DISPLAYING" THE "AREA" ▼
        System.out.println("The Area is: " + area);
    }
}
