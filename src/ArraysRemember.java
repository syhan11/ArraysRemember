/*
 * Get the names of the last presidents in the order they were elected from the user
 * until user enters "history"
 * The program should display their names starting with the most recent.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArraysRemember {
    public static void main(String[] args) {
        boolean contFlag = true;
        ArrayList<String> mainArray = new ArrayList<String>();
        String msg;
        Scanner keyboard = new Scanner(System.in);

        // get and save names of last presidents until user enters "history"
        System.out.println("Kennedy, Johnson, Nixon, Ford, Carter, Reagan, Bush, Clinton, Bush, Obama");
        System.out.println("Enter names or \"history\" to stop:");
        while ( contFlag ) {

            msg = keyboard.next();
            if (msg.compareToIgnoreCase("history") == 0)
                contFlag = false;
            else
                mainArray.add(msg);

        }

        // print out last 10 presidents in reversed order
        for (int i = mainArray.size()-1; i >= 0; i--)
            System.out.println(mainArray.get(i));
    }
}
