/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package badsubscriptcaught;

/**
 *
 * @author arnol
 */
//Write an application named BadSubscriptCaught in which you declare an array of eight first
//names. Write a try block in which you prompt the user for an integer and display the name in
//the requested position. Create a catch block that catches the potential ArrayIndexOutOfBoundsException thrown 
//when the user enters a number that is out of range. The catch block also should display an error message. 
//Save the file as BadSubscriptCaught.java.

import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] names = { "Hannibal", "Elon", "Kanye", "Christopher", "Kevin", "Trevor", "Jordan", "Likhaya"};
        String integer;
        try {
            System.out.println("Please, enter an integer from 1 to 10 to display a name");
            Scanner input = new Scanner(System.in);
            integer = input.nextLine();
            int i = Integer.parseInt(integer);
            i = i - 1;
            System.out.println(names[i]);
            input.close();
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please comprehend simplicity. Try Again");
        }
    }
}

