package com.projects;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //global variables for use in multiple methods
    private final static Scanner keyboard = new Scanner(System.in);
    public static Random random = new Random();
    public static int random_number;
    public static String player_name;

    public static void main(String[] args) {
        enter_name();
        game();
        play_again();
    }

    //method to generate a random number between 1 & 20
    public static void generate_random_number()
    {
        random_number = random.nextInt(20) + 1;
    }

    //method for getting player name
    public static String enter_name()
    {
        System.out.println("Hello! What is your name? ( Max number of allowed characters is 13 )");
        player_name = keyboard.nextLine();

        if ( player_name.length() < 13)
        {
            return "Well, " + player_name + ", I'm thinking of a number between 1 & 20.";
        }
        else
        {
            System.out.println("name too long, try again!");
            return enter_name();
        }
    }

    // main game loop
    public static void game()
    {
        double guess;
        generate_random_number();
        int attempts_made = 1;

        do
        {
            System.out.println("take a guess.");
            guess = keyboard.nextInt();
            if (guess == random_number)
            {
                System.out.println("Good Job, " + player_name + ", you guessed my number in " + attempts_made + " guesses!" );
                play_again();
            }
            else if (guess > random_number && attempts_made <= 6)
            {
                System.out.println("Your guess is too high.");
                attempts_made++;
            }
            else if(attempts_made >= 6)
            {
                System.out.println("Sorry, you didn't guess the correct number, correct number is " + random_number);
                play_again();
            }
            else
            {
                System.out.println("Your guess is too low.");
                attempts_made++;
            }

        } while(guess != random_number && attempts_made <= 6 );

    }

    //method for starting the game again or exiting the game
    public static void play_again()
    {
        Scanner user_input = new Scanner(System.in);
        String yes_or_no;
        System.out.println("Would you like to play again? (Y/N) ");
        yes_or_no = user_input.nextLine();

        if (Objects.equals(yes_or_no, "Y") || Objects.equals(yes_or_no, "yes") || Objects.equals(yes_or_no, "Yes") || Objects.equals(yes_or_no, "y"))
        {
            game();
        }
        else
        {
            System.exit(0);
        }
    }
}
