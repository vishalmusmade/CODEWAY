package com.codewayIntern.tester;


import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Number Guessing Game!");
        int lowerBound = 1;
        int upperBound = 100;
        System.out.println("Enter Maximum Attempt You Want:");
        int maxAttempts = scanner.nextInt();
        int rounds = 0;
        int totalScore = 0;

      

        do {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;

            System.out.println("\nRound " + (rounds + 1) + " - Guess the number between " + lowerBound + " and " + upperBound);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                   // int score = maxAttempts - attempts;
                   // totalScore += score;
                    System.out.println("Score for this round: " + attempts);
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = scanner.next().toLowerCase();
            if (playAgain.equals("y")) {
                rounds++;
            } else {
                break;
            }

        } while (true);

        System.out.println("Game over! Total score: " + totalScore);
        scanner.close();
    }
}

