package com.test.exam03;

public class Exam2 {
    
    public static void main(String[] args) {
        int gameScore = 150;

        int LastScore1 = gameScore++;
        System.out.println(LastScore1);

        int LastScore2 = gameScore--;
        System.out.println(LastScore2);

        int LastScore3 = --gameScore;
        System.out.println(LastScore3);


    }
}
