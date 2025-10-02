package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] scores = { 20 , 30 , 50 , 98 , 66 ,78 , 55 , 87, 64, 15 };

        int highscore = scores[0];
        int lowscore = scores[0];
        int sum = 0;

        ///  we do for loop to check and see where we are at

        for (int i = 0 ; i < scores.length ; i++){


            if (scores[i] > highscore){
                highscore = scores[i];
            }

            if (scores[i] < lowscore){
                lowscore = scores[i];
            }


            sum += scores[i];


            }
        int average = sum / scores.length;



            System.out.println("High Score: " + highscore);
            System.out.println("Low Score: " + lowscore);
            System.out.println("Average: " + average);







        }



    }
//Step 1
//Create a Java application named TestStatistics. Create an array of 10 test scores.
//Print out the following statistics of your test scores:
//- average
//- high score
//- low score
//BONUS: Calculate and display the median value (what is the difference
//between the average and the median).
//Step 2
//1. Ensure all your changes are committed and pushed to GitHub
//2. Send your repository URL to your Instructor




