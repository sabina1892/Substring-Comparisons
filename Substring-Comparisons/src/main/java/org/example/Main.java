package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int k = sc.nextInt();
        char[] arr = s.toCharArray(); // we convert String element to char array
        char max = arr[0];
        char min = arr[0];

        // We must find char elements, which they are max and min position of Unicode
        for(int i = 0; i < len-k; i++){
            if(max < arr[i])
                max = arr[i+1];
        }
        for(int i = 0; i < len-k; i++){
            if(min > arr[i+1])
                min = arr[i+1];
        }
        // Now we find indexOf max and min elements
        int numMax = s.indexOf(max);
        int numMin = s.indexOf(min);

        System.out.println(s.substring(numMin,numMin+k));
        System.out.println(s.substring(numMax,numMax+k));
    }
}