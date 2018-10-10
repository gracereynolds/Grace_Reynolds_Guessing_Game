package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void YouGuess()
    {
        int num = 0, guess, ans;
        double rand = Math.random();
        ans = (int) (rand*10);
        System.out.print("Guess a number: ");
        guess = input.nextInt();
        while(ans != guess)
        {
            System.out.print("Guess again: ");
            num++;
            guess = input.nextInt();
        }
        System.out.println(guess+" was correct! You made "+num+" guesses");
    }
    public static void main(String[] args) {
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("Hello, "+name+". Who do you want to guess numbers? (Type 'me' or 'computer')");
        String player = input.nextLine();
        if(player.equals("me"))
        {
            YouGuess();
        }
    }
}
