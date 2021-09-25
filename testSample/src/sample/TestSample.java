package sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TestSample {
    static Scanner input=new Scanner(System.in);
//question1
    public void replaceSome (){
        String sentence="The quick brown fox jump over the lazy dog";
        String change=sentence.replaceAll("fox","cat");
        System.out.println(change);
    }
//question 2
    public void change() {
        String sentence = "Hey HoW Are You";

        char[] sen = new char[sentence.length()];
        System.out.println(sentence.length());
        for (int i = 0; i < sentence.length(); i++) {


        }
    }
    //question3
    public void findSecond(){
        String name="succes" ;
        char temp;

        char[] sen=new char[name.length()];
        for (int i=0; i<name.length();i++) {
            for (int j=i+1; j<name.length(); j++) {
                if (sen[i] == sen[j]) {
                    temp=sen[i];

                }
            }
        }
        for (int j=0; j<name.length(); j++) {
            System.out.println(sen[j]);
        }
    }
    public void remove () {
        String name = "geeksforgeeks";
        char[] convert = new char[name.length()];
        HashSet first = new HashSet();
        for (int run = 0; run < name.length(); run++) {
            first.add(convert[run]);
        }
        System.out.println(first);
    }
    public static void main(String[] args){
        System.out.println("enter the choice" );
        TestSample obj=new TestSample();

        int choice=input.nextInt();
        switch (choice){
            case 1:
                   System.out.println("enter any one sentence");
                   String sentence=input.next();
                   char[] sent=new char[sentence.length()];
                   for(int run=0; run<sentence.length();run++){

                   }
                   obj.replaceSome();


        }

    }
}

