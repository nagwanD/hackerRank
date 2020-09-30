package dailyChallenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
char[] binaryArray = Integer.toBinaryString(n).toCharArray();
            
            int max_count=0;
            int count_one=0;
            for(int i=0;i<binaryArray.length;i++)
            {
                if(binaryArray[i] == '1') 
                    {
                    count_one++;
                    }
                else 
                    {
                    count_one=0;
                    }
                
                if(count_one>max_count)
                    {
                    max_count=count_one;
                    }
            }
            System.out.println(max_count);
            scanner.close();
        }
    }

