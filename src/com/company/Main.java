package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int RandomNum = random.nextInt(11);
        int GuessNum = 11;
        int NumOfGuesses = 0;

        do {
            ++NumOfGuesses;

            try {
                System.out.println("Guess a number between 0 and 10");
                GuessNum = input.nextInt();
            } catch (Exception var7) {
                System.out.println("Something went wrong, try entering an integer");
                input.next();
            }

            int Diff = RandomNum - GuessNum;
            if (Diff < 0) {
                Diff *= -1;
            }

            if (Diff < 3) {
                System.out.println("Hot");
            } else if (Diff < 6) {
                System.out.println("Warm");
            } else {
                System.out.println("Cold");
            }
        } while(RandomNum != GuessNum);

        System.out.println("You got it correct after " + NumOfGuesses + " guesses!");
    }
}
