package TestDemo;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayTaskSecond{
    static Scanner input=new Scanner(System.in);
    //question 18
    public void findSecondLargeElement(int[] number){
        int temp;
        for(int run=0; run<number.length; run++){
            for(int j=run+1; j<number.length; j++){
                if(number[run]<number[j]){
                    temp=number[run];
                    number[run]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.print("second largest element is="+number[number.length-2]+" ");
    }
    //question 19
    public void segregate(int[]number){
        int temp;
        for(int run=0; run<number.length; run++){
            for(int j=run+1; j<number.length; j++){
                if(number[run]>number[j]){
                    temp=number[run];
                    number[run]=number[j];
                    number[j]=temp;
                }
            }
        }
        for(int run=0; run<number.length; run++){
            System.out.print(number[run]);
        }
    }
    //question20
    public void maxMin(int[] number){
        int temp;p.put(c, map.getOrDefault(c, 0)+1);
        for(int run=0; run<number.length;run++) {
            for (int i = run+1; i < number.length; i++){
                if (number[run]>number[i]) {
                    temp=number[run];
                    number[run]=number[i];
                    number[i]=temp;
                }
            }
        }
        int[]arr=new int[number.length];
        int first=0;
        int last=number.length-1;

        for(int run=0; run<number.length;run++){
            if(run%2==0){
                arr[run]=number[last--];
            }
            else{
                arr[run]=number[first++];
            }
        }
        System.out.println("before array"+Arrays.toString(number));
        System.out.println("after array"+Arrays.toString(arr));
    }
    public static void main(String[] args){
        ArrayTaskSecond obj=new ArrayTaskSecond();
        System.out.println("enter your choice");
        int choice=input.nextInt();

        switch(choice){
            case 1:
                System.out.println("enter your count");
                int count=input.nextInt();
                int[] number=new int[count];
                System.out.println("enter the " +count+ "number");

                for(int run=0; run<count; run++){
                    System.out.println("enter the number");
                    number[run]=input.nextInt();
                }
                obj.findSecondLargeElement(number);
                break;
            case 2:
                System.out.println("enter the count");
                count=input.nextInt();
                number=new int[count];
                System.out.println("enter the" +count+ "number");

                for(int run=0; run<count; run++){
                    System.out.println("enter the 0 or 1 numbers only");
                    number[run]=input.nextInt();
                }
                obj.segregate(number);
            case 3:
                System.out.println("enter the count");
                count=input.nextInt();
                number=new int[count];
                System.out.println("enter the" + count+"number");

                for(int run=0; run<count; run++){
                    System.out.println("enter the  numbers only");
                    number[run]=input.nextInt();
                }
                obj.maxMin(number);

        }
    }
}

