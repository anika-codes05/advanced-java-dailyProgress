import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class day14_map {
   public static void main(String args[]){
        List<Integer>numbers=Arrays.asList(23,32,45,35,67,89,95);
        System.out.println(numbers);
        List<Integer>result= numbers.stream().map((n)->n+5).toList();
        System.out.println(result);
        // List<Integer> result=numbers.stream().filter((n)->n<40).map((n)->n+8).toList();
        // System.out.println(result);

   } 
}
