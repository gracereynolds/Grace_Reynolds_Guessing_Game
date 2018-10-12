package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static String name;
    public static void YouGuess()
    {
        int num = 0, guess, ans;
        double rand = Math.random();
        ans = (int) (rand*10);
        System.out.print("Okay, "+name+", guess a number from 1 to 10: ");
        guess = input.nextInt();
        while(ans != guess)
        {
            if(guess > ans)
            {
                System.out.print("Try something lower: ");
            }
            if(guess < ans)
            {
                System.out.print("Try something higher: ");
            }
            num++;
            guess = input.nextInt();
        }
        System.out.println("Good job, "+name+"! "+guess+" was correct! You guessed "+num+" time(s)");
    }
    public static void CompGuess()
    {
        int num = 0, guess, min = 1, max = 10;
        boolean correct = false;
        String response;
        System.out.println("Okay, "+name+", pick a number from 1 to 10 and then type 'ready'");
        if(input.nextLine().equals("ready"))
        {
            while(!correct)
            {
                if(min == max)
                {
                    guess = max;
                }
                else
                {
                    guess = avg(min,max);
                }
                System.out.println("Is "+guess+" higher, lower, or correct?");
                response = input.nextLine();
                if(!response.equals("correct")&& min == max)
                {
                    System.out.println(name+", you cheater! I said pick a number from 1 to 10! If you can't play fair, then I win!");
                    correct = true;
                }
                else if(response.equals("higher"))
                {
                    max = guess - 1;
                }
                else if(response.equals("lower"))
                {
                    min = guess + 1;
                }
                else
                {
                    correct = true;
                    System.out.println("Yay! Thanks, "+name+", that was fun!");
                }
            }
        }
    }
    private static int avg(int a, int b)
    {
        return (a+b)/2;
    }
    public static void main(String[] args) {
        System.out.println("What's your name?");
        name = input.nextLine();
        System.out.println("Hi, "+name+", I'm Mike. Who do you want to guess numbers? (Type 'me' or 'mike')");
        String player = input.nextLine();
        if(player.equals("me"))
        {
            YouGuess();
        }
        else if(player.equals("mike"))
        {
            CompGuess();
        }
        else
        {
            System.out.println("Sorry, I didn't understand that. Please restart the program, and this time, remember that I'm case sensitive");
        }
    }
}
