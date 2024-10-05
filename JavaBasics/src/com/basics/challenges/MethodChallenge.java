package com.basics.challenges;

public class MethodChallenge {

    public static void displayHighScorePosition(String playerName, int position)
    {
        System.out.println(playerName+" managed to get into position "+position+" on the high score list");
    }

    public static int calculateHighScorePosition(int score)
    {
        int position;
        if(score >= 1000){
            position = 1;
        }
        else if(score >= 500){
            position = 2;
        }
        else if(score >= 100){
            position = 3;
        }
        else{
            position = 4;
        }

        return position;
    }

    public static void main(String[] args) {

        displayHighScorePosition("Player 1", calculateHighScorePosition(1500));

        displayHighScorePosition("Player 2", calculateHighScorePosition(1000));

        displayHighScorePosition("Player 3", calculateHighScorePosition(500));

        displayHighScorePosition("Player 4", calculateHighScorePosition(100));

        displayHighScorePosition("Player 5", calculateHighScorePosition(25));

    }


}
