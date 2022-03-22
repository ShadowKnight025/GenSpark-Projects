package com.projects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Trystan Meadows - Project 1 : Dragon Cave for GenSpark

        //Scanner object for reading user input
        Scanner userinput = new Scanner(System.in);

        // Game context / intro to player - block notation for better readability
        System.out.println
                (
                        "You are in a land full of dragons. In front of you, you see two caves. \n" +
                                "In one cave, the dragon is friendly, and will share his treasure with you. \n" +
                                "The other dragon is greedy and hungry and will eat you on sight. \n" +
                                "Which cave will you go into? (1 or 2): "
                );


        // String Var for the Bad Ending in which the player is eaten
        String BadEnding = "You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "\n" +
                "Gobbles you down in one bite!";

        // String Var for the Good Ending in which the player is not eaten
        String GoodEnding = "You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "\n" +
                "Offers to share his treasure with you!";

        int answer = userinput.nextInt();

        if (answer == 1)
        {
            System.out.println(BadEnding);
        }
        else
        {
            System.out.println(GoodEnding);
        }
    }
}
