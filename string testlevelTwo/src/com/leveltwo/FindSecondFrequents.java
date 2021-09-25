package com.leveltwo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindSecondFrequents {
    public void frequent(String name){

        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

        for (int i = 0; i < name.length(); i++) {
                 Character ch=name.charAt(i);
                 if(map. containsKey(ch)){
                     map.put(ch, map.get(ch)+1);
              }
                 else{
                     map.put(ch,1);
                 }
        }
        int temp=0;
        for (Map.Entry<Character,Integer> test:map.entrySet()) {
           if( test.getValue()>=temp){
               temp=test.getValue();
        }
       for ( Map.Entry<Character,Integer> t:map.entrySet(){
                test.getKey(temp);
            }


        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        String name="successes";
        FindSecondFrequents obj=new FindSecondFrequents();
        obj.frequent(name);

    }
}
