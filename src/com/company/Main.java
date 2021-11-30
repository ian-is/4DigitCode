package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    private static int[] randomNum = new int[4];
    public static void computerNumGenerator() {


        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int randomNumber = random.nextInt(10);
            randomNum[i]= randomNumber;
            System.out.print(randomNumber);


        }
        System.out.println();

        /*for (int i = 0; i < 1; i++) {
            randomNum.add(i);*/
        //System.out.println("the computer generated code is" + " " + randomNumber);
        //return randomNumber;

    }



    public static void main(String[] args) {
        System.out.println("you have 12 goes to get the correct digits");
        // delete the computerNum method sp player doesn't know the computers digits
        Scanner input = new Scanner(System.in);
        computerNumGenerator();
        int correct = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.println("please enter a 4 digit code");
                int playerNum = input.nextInt();
                System.out.println("your digits are" + " " + playerNum);

                if (playerNum == randomNum[i]){
                    System.out.println("that digit is correct!");
                    correct ++;
                } else {
                    System.out.println("this digit is incorrect");
            }
            }
            if (correct == 4){
                break;
            }

        }


    }
}

