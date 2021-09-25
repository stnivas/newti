package com.leveltwo;

import java.util.Arrays;

public class Main {

    public StringBuilder replace(String word,String rep ){
        StringBuilder bild=new StringBuilder();
        String words[]=word.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals("fox")){
              words[i]=rep;
            }
            bild.append(words[i]);
            bild.append(" ");
        }
        return  bild ;
    }
    public static void main(String[] args) {
        String words="The quick brown fox jumps over the lazy dog";
        Main obj=new Main();
        String rep="cat";
        StringBuilder answer=obj.replace(words,rep);
        System.out.println(answer);

    }
}
