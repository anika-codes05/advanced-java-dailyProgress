import java.util.*;
import java.util.Comparator;
import java.util.Arrays;

public class day17_sortfun {
    public static void main(String args[]){
 List<Integer>list=Arrays.asList(3,12,1,45,23,76,26,91);
 System.out.println(list);
 //in decending order
 //this is method 2 for sorting in descending order
//  List<Integer>result=list.stream().sorted(Comparator.reverseOrder()).toList();
//  System.out.println(result);
 List<Integer>result=list.stream().sorted((a,b)->b-a).toList();
 System.out.println("descending order:"+result);
 //in ascending order
 List<Integer>result1=list.stream().sorted((a,b)->a-b).toList();
 System.out.println("ascending order: " + result1);

 

     }
}
