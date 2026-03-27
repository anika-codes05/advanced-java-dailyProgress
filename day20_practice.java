import java.util.*;
public class day20_practice {
    public static void main(String args[]){
  List<Integer>list= Arrays.asList(10,50,30,20,90,40,24,86,75,12);
  List<Integer>result=list.stream().sorted((a,b)->a-b).limit(3).toList();
  System.out.println(result);
   List<Integer>result1=list.stream().skip(5).limit(3).toList();
    System.out.println(result1);
//13. find minimum
    List<String>list1= Arrays.asList("ram","shyam","amit","zoya","ravi");
    Optional<String>result2=list1.stream().min((a,b)->a.compareTo(b));
    result2.ifPresent(System.out::println);
    //14. remove duplicates
    List<String>list2= Arrays.asList("ram","shyam","amit","zoya","ravi","shyam","ravi");
    List<String>result3=list2.stream().distinct().toList();
    System.out.println(result3);
   
    }
}
