package com.java.strings;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();
        
        while(scan.hasNextLine()){
            String words = scan.nextLine();
            char[] tempArray = words.toCharArray();
            String even="";
            String odd="";
            String space = "";
            for(int i=0; i < tempArray.length; i++){
                if(i%2 == 0){
                    even = even + tempArray[i];
                }else{
                    odd = odd + tempArray[i];
                }
            }

            for(int a=1; a < num; a++){
                space = space + " ";
            }

            System.out.println(even + space + odd);
        }
    }
}

