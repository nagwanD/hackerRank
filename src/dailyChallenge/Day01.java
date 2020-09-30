package dailyChallenge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day01 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int j=scan.nextInt();
        double e=scan.nextFloat();
        scan.nextLine();
        String r=scan.nextLine();
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
       
        
            int sum=i+j;
            double sum2=d+e;
            String str = s+r;
        /* Print the sum of both integer variables on a new line. */
            System.out.println(sum);
                    /* Print the sum of the double variables on a new line. */
		 System.out.println( 
      String.format("%.1f", sum2));
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
            System.out.println(str);
        scan.close();
    }
  }
