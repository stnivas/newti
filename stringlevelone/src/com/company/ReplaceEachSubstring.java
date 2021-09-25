package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceEachSubstring{

    public String replace(String statement) {
        String[] convertArray=null;
         convertArray=statement.split("\\s");
        for (int i = 0; i < convertArray.length; i++) {
             if( convertArray[i].equals("fox")){
                 convertArray[i]="cat";
             }
        }
        statement=Arrays.toString(convertArray);
     return statement;
     }

    public static void main(String[] args) {
        ReplaceEachSubstring obj=new ReplaceEachSubstring();
        String statement="The quick brown fox jumps over the lazy dog";
        String ans=obj.replace(statement);
        System.out.println(ans);

      }
    }
