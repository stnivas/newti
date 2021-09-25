package com.login;

import com.booking.Customer;
import com.logic.Login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("WELCOME TO FOOD ORDER SYSTEM");
        Login log = new Login();
        boolean running = true;
        while (running) {
            System.out.println("1.sign up \n2.login\n3.exit");
            int click = input.nextInt();

            switch (click) {

                case 1:

                    System.out.println("1.enter the name");
                    String name = input.next();
                    System.out.println("2.enter the phone number");
                    long phoneNumber = input.nextLong();
                    System.out.println("3.enter your password");
                    String password = input.next();

                                     //connection
                    Customer details = new Customer();
                    details.setName(name);
                    details.setPhoneNumber(phoneNumber);
                    details.setUserPassword(password);

                    System.out.println("your user id is="+details.getUserId());
                    log.add(details);
                    break;

                case 2:
                    System.out.println("1.enter the userId");
                    int userId = input.nextInt();
                    System.out.println("2.enter your password");
                    password = input.next();

                    int reply = log.check(userId, password);

                    if (reply==1) {
                        System.out.println("login success");

                        System.out.println("1. search hotel\n2. search food");

                         int search=input.nextInt();
                         if(search==1) {
                             System.out.println("1.HOTEL TAJ\n2.HOTEL MURUGAN IDLY SHOP\n3.HOTAL ITC GRANT");

                             int hotelChoice = input.nextInt();

                             if (hotelChoice == 1) {

                                 HashMap<String, Integer> hotelOne = log.hotelsDetailsOne();
                                 System.out.println(hotelOne);
                                 System.out.println("pick your dish hit respective number\n,if you finished enter Finish");
                                 String dish = input.next();
                                 int total = 0;

                                 ArrayList<String> list = new ArrayList<>();
                                 while (!dish.equals("Finish")) {
                                     total = (total + hotelOne.get(dish));
                                     dish = input.next();
                                     list.add(dish);
                                 }
                                 System.out.println("Rs=" + total);
                                 System.out.println(list);
                                 System.out.println("1. confirm your order");
                                 int hit = input.nextInt();
                                 if (hit == 1) {
                                     System.out.println("your cart");
                                     Login.confirmOrders(list);
                                     System.out.println("order conform");
                                 }
                             } else if (hotelChoice == 2) {
                                 ArrayList<String>murugan=new ArrayList<>();
                                 HashMap<String, Integer> hotelTwo = log.hotelsDetailsTwo();
                                 System.out.println(hotelTwo);
                                 System.out.println("pick your dish hit respective number,if you finished enter Finish");
                                 String dish = input.next();
                                 int total = 0;
                                 while (!dish.equals("Finish")) {
                                     total = (total + hotelTwo.get(dish));
                                     dish = input.next();
                                     murugan.add(dish);
                                 }
                                 System.out.println("Rs=" + total);
                                 System.out.println("your cart");
                                 System.out.println(murugan);
                                 Login.confirmOrders(murugan);

                             } else if (hotelChoice == 3) {
                                 ArrayList<String> itc=new ArrayList<>();
                                 HashMap<String, Integer> hotelThree = log.hotelsDetailsTwo();
                                 System.out.println(hotelThree);
                                 System.out.println("pick your dish hit respective number,if you finished enter Finish");
                                 String dish = input.next();
                                 int total = 0;
                                 while (!dish.equals("Finish")) {
                                     total = (total + hotelThree.get(dish));
                                     dish = input.next();
                                     itc.add(dish);
                                 }
                                 System.out.println("Rs=" + total);
                                 System.out.println(itc);
                             }
                         }
                         if(search==2){
                             System.out.println("search your food");
                             String dish=input.next();
                             HashMap<String,Integer> searchOne=log.hotelsDetailsOne();
                             HashMap<String,Integer> searchTwo =log.hotelsDetailsTwo();
                             HashMap<String,Integer> searchThree=log.hotelsDetailsThree();

                            if( searchOne.containsKey(dish)) {
                                System.out.println(searchOne.get(dish));

                            }
                            if(searchTwo.containsKey(dish)){
                                 System.out.println(searchTwo.get(dish));
                             }
                            if(searchThree.containsKey(dish)){
                                System.out.println(searchThree.get(dish));
                            }
                            else if(!searchOne.containsKey(dish)&& searchThree.containsKey(dish)&&searchTwo.containsKey(dish)){
                                System.out.println("not available ");
                            }
                         }
                    }
                    else if(reply==0){
                        System.out.println("in correct password");
                    }
                    else{
                        System.out.println("user id doesn't exist ");
                    }

                    break;

                case 3:
                    System.out.println("your exit");
                    running = false;
                    break;

                default:
                    System.out.println("please enter the valid user name password and user id");
            }

        }
    }
}
