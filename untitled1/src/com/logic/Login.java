package com.logic;

import com.booking.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Login{

   static  HashMap<Integer,Customer> map=new HashMap<>();
   static List<List<String>> cart =new ArrayList<>();
   public void add(Customer details){
       map.put(details.getUserId(),details);
   }

   public int check (int userId, String password ){
       if(!map.containsKey(userId)){
           return -1;
       }
       Customer customer = map.get(userId);
       String str = customer.getUserPassword();
        if( str.equals(password)){
            return 1;
        }
        return 0;
   }
     public HashMap<String,Integer> hotelsDetailsOne() {
         HashMap<String, Integer> hotels1 = new HashMap<>();

         //morning
         hotels1.put("IDLY", 10);
         hotels1.put("vada", 5);
         hotels1.put("poori", 30);
         //lunch
         hotels1.put("curd", 10);
         hotels1.put("lemon", 5);
         hotels1.put("rice", 30);
         //diner;
         hotels1.put("IDLY", 10);
         hotels1.put("desert", 5);
         hotels1.put("sapathi", 30);
         return hotels1;
     }
    public HashMap<String,Integer> hotelsDetailsTwo() {
        //hotel 2
        //mor
        HashMap<String, Integer> hotels2 = new HashMap<>();
        hotels2.put("dosa", 10);
        hotels2.put("IDLY", 10);
        hotels2.put("dosa", 10);

        //lun
        hotels2.put("curd", 10);
        hotels2.put("rice", 500);
        hotels2.put("biryani", 30);


        //diner;
        hotels2.put("veg rice", 10);
        hotels2.put("dosa", 5);
        hotels2.put("biryani", 100);

        return hotels2;
    }

        public HashMap<String,Integer> hotelsDetailsThree() {
            HashMap<String, Integer> hotels3 = new HashMap<>();
         // hotel 3
         //mor
         hotels3.put("dosa", 10);
         hotels3.put("IDLY", 20);
         hotels3.put("dosa", 10);

         //lun
         hotels3.put("curd" , 10);
         hotels3.put("rice", 500);
         hotels3.put("biryani",30);


         //diner;
         hotels3.put("vegRice" , 100);
         hotels3.put("dosa", 5);
         hotels3.put("biryani",  100);
         return  hotels3 ;
     }
     static public void  confirmOrders(ArrayList<String> list){
       cart.add(list);
     }



}
