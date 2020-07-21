package javaBasics;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
    int n;

    public static void fizzBuzz(int n) {
        if (n>0){
        for(int i=3;i<=n;i++){
            if ((i%3==0)&&(i%5==0))
                System.out.println("FizzBuzz");
            else if ((i%3)==0)
                System.out.println("Fizz");
            else if ((i%5)==0)
                System.out.println("Buzz");
            }
        }
    else
        System.out.println("Number should be greaterthan 0");

    }

}

public class HackerRank1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}