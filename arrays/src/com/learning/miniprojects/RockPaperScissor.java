package com.learning.miniprojects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static Scanner sc = new Scanner(System.in);
    public static int userScore = 0;
    public static int compScore = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissor Game!!");


        boolean flag = true;
        while(flag){
            System.out.println("Please select your choice 1 for Rock, 2 for Paper and 3 for Scissor and 0 to Quit");
            switch (sc.nextInt()){
                case 0 -> {
                    System.out.println("Thank you for playing ");
                    displayFinalScore();
                    flag = false;
                }
                case 1 -> startGame(1, getComputerInput());
                case 2 -> startGame(2, getComputerInput());
                case 3 -> startGame(3, getComputerInput());
                default -> System.out.println("Please select a valid option");
            }
        }


    }

    private static void startGame(int userInput, int computerInput) {
        String userChoice = getChoiceInString(userInput);
        String compChoice = getChoiceInString(computerInput);

        System.out.println("You chose: "+userChoice);
        System.out.println("Computer chose: "+compChoice);

        if(userChoice.equalsIgnoreCase(compChoice)){
            System.out.println("It's a tie");
            System.out.println("You = 0, Computer = 0");
            displayScore();
        }else if("rock".equalsIgnoreCase(userChoice) && "paper".equalsIgnoreCase(compChoice)  || "paper".equalsIgnoreCase(userChoice) &&  "rock".equalsIgnoreCase(compChoice)){
            if("paper".equalsIgnoreCase(userChoice)){
                userScore++;
                System.out.println("You won !");
                System.out.println("You = 1, Computer = 0");
                displayScore();
            }else {
                compScore++;
                System.out.println("Computer won !");
                System.out.println("You = 0, Computer = 1");
                displayScore();
            }
        }else if("rock".equalsIgnoreCase(userChoice) && "scissor".equalsIgnoreCase(compChoice)  || "scissor".equalsIgnoreCase(userChoice) &&  "rock".equalsIgnoreCase(compChoice)){
            if("rock".equalsIgnoreCase(userChoice)){
                userScore++;
                System.out.println("You won !");
                System.out.println("You = 1, Computer = 0");
                displayScore();
            }else {
                compScore++;
                System.out.println("Computer won !");
                System.out.println("You = 0, Computer = 1");
                displayScore();
            }
        }else if("scissor".equalsIgnoreCase(userChoice) && "paper".equalsIgnoreCase(compChoice)  || "paper".equalsIgnoreCase(userChoice) &&  "scissor".equalsIgnoreCase(compChoice)){
            if("scissor".equalsIgnoreCase(userChoice)){
                userScore++;
                System.out.println("You won !");
                System.out.println("You = 1, Computer = 0");
                displayScore();
            }else {
                compScore++;
                System.out.println("Computer won !");
                System.out.println("You = 0, Computer = 1");
                displayScore();
            }
        }

    }

    private static String getChoiceInString(int choice){
        return switch (choice){
          case 1 -> "rock";
          case 2 -> "paper";
          case 3 -> "scissor";
            default -> "invalid";
        };

    }

    private static int getComputerInput() {
        Random randInt = new Random();
        return randInt.nextInt(1, 4);
    }

    private static void displayScore() {
        System.out.println("Total Scores: ");
        System.out.printf("Your Score = %d, Computer Score = %d%n", userScore, compScore);
    }

    private static void displayFinalScore() {
        System.out.println("Final Scores: ");
        System.out.printf("Your Score = %d, Computer Score = %d%n", userScore, compScore);
        if(userScore > compScore){
            System.out.println("Hurray, You won !!!!!");
        }else if(userScore == compScore){
            System.out.println("It's a tie");
        }else{
            System.out.println("Oh no ! You lose try again");
        }
    }


}
