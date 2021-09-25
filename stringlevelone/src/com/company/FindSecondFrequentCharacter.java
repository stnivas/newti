package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class FindSecondFrequentCharacter {
    public void findSecond(String words){
        HashMap<Character, Integer> map=new HashMap<>();
        char[]convert=words.toCharArray();
        //Arrays.sort(convert);
        int max=0;
        int count=1;

        for (int i = 0; i < convert.length-1; i++){
                 if(map.containsKey(convert[i])) {
                     map.put(convert[i],map.get(convert[i])+1);
                 }
                 else{
                     map.put(convert[i],1);
                 }
          }
    }
    public void pali(){
        int number=1234321;
        int sum=0;
        int reverse=0;
        while (number!=0){
            int reminder=number%10;
             reverse=reverse*10+reminder;
             number=number/10;
        }
        System.out.println(reverse);
        System.out.println(number);

       if(sum==number){
           System.out.println("it is palindrome");
       }
    }
    public static void main(String[] args) {
        FindSecondFrequentCharacter obj=new FindSecondFrequentCharacter();
         String words="successes";
         obj.findSecond(words);
         obj.pali();

    }
}
