import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeat {
    Scanner input=new Scanner(System.in);
    public static void nonRepeating(String name){
        Map<Character, Integer> map = new HashMap<>();
        for(int run=0 ;run<name.length(); run++){
            char c = name.charAt(run);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int run=name.length()-1 ;run>=0; run--){
            if (map.get(name.charAt(run)) == 1) {
                System.out.println(name.charAt(run));
                break;
            }
        }
    }
    public static void main(String[] args) {
        String name = "dhatchinamoorthri";
        nonRepeating(name);
    }
}
