package stringPractise;

import java.util.ArrayList;
import java.util.*;

public class FindCount {
    static Scanner input = new Scanner(System.in);

    //find sum
    public int sumCount(int[] number) {
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] + number[j] == 6) {
                    count++;
                }
            }
        }
        return count;
    }

    //find first non repeating number; d
    public void firstNonRepeat(int[] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (number[i] != number[j]) {
                    System.out.println(number[i]);
                }
            }
        }
    }

    //find leader elements d
    public void findLeader(int[] number) {
        int temp;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] >= number[j]) {

                }
            }
        }
    }

    //find smaller  d
    public void findSmaller(int[] number) {
        int count = 0;
        int[] store = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    count++;
                }
            }
            store[i] = count;
        }
        System.out.println(Arrays.toString(store));
    }

    // find sumarray first case pass
    public int contiguous(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {

            sum = number[i] + sum;
        }
        return sum;
    }

    //maxMin element
    public void maxMin(int[] number) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            } else if (number[i] < min) {
                min = number[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println("find");
    }

    // correct fistr 3 last 3
    public int balanced(int[] number) {
        int sum = 0;
        int sums = 0;
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            sum = number[i] + sum;
        }
        for (int i = number.length - 1; i > number.length - 4; i--) {
            sums = number[i] + sums;
        }
        ans = sums - sum;
        return sum;
    }

    //smaller again;
    public void smaller(int[] number) {
        int[] arr = new int[number.length];
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (number[i] > number[j]) {
                    count++;
                    arr[i] = count;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        FindCount obj = new FindCount();
        System.out.println("enter your choice");
        int choice = input.nextInt();
        switch (choice) {

            case 1:
                System.out.println("enter the count");
                int total = input.nextInt();
                int number[] = new int[total];
                for (int i = 0; i < total; i++) {
                    System.out.println("enter the number");
                    number[i] = input.nextInt();
                }
                int count = obj.sumCount(number);
                System.out.println(count);
                break;
            case 2:
                System.out.println("enter the count");
                total = input.nextInt();
                number = new int[total];

                for (int i = 0; i < total; i++) {
                    System.out.println("enter the number without zero");
                    number[i] = input.nextInt();
                }
                obj.firstNonRepeat(number);
                break;
          /*  case 3:
                System.out.println("enter the count");
                total=input.nextInt();
                number=new int [total];

                for (int i = 0; i < total; i++) {
                    System.out.println("enter the number  zero");
                    number[i]=input.nextInt();
                }
              HashSet set= obj.findLeader(number);
                Iterator <Integer> itr=set.iterator();
                while(itr.hasNext()){
                    System.out.println(itr.next());
                }
                break;*/
            case 4:
                System.out.println("enter the count");
                total = input.nextInt();
                number = new int[total];

                for (int i = 0; i < total; i++) {
                    System.out.println("enter the number  zero");
                    number[i] = input.nextInt();
                }
                obj.findSmaller(number);
            case 5:
                System.out.println("enter the count");
                total = input.nextInt();
                number = new int[total];

                for (int i = 0; i < total; i++) {
                    System.out.println("enter the number  zero");
                    number[i] = input.nextInt();
                }
                int ans = obj.contiguous(number);
                System.out.println(ans);
                break;

            case 6:
                System.out.println("enter the count");
                total = input.nextInt();
                number = new int[total];

                for (int i = 0; i < total; i++) {
                    System.out.println("enter the number  zero");
                    number[i] = input.nextInt();
                }
                obj.maxMin(number);
                break;
            case 7:
                System.out.println("enter the count");
                total = input.nextInt();
                number = new int[total];

                for (int i = 0; i < total; i++) {
                    System.out.println("enter the number  zero");
                    number[i] = input.nextInt();
                }
                int find = obj.balanced(number);
                System.out.println(find);
                break;
            case 8:
                System.out.println("enter the count");
                total = input.nextInt();
                number = new int[total];
                for (int i = 0; i < total; i++) {
                    System.out.println("enter the number  zero");
                    number[i] = input.nextInt();
                    obj.smaller(number);
                    break;

                }
        }
    }
}
