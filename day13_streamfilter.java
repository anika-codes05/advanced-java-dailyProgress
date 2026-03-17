import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class day13_streamfilter {
    public static void main(String args[]){
        List<Integer>list= new ArrayList<Integer>();
        list.add(3);
        list.add(5);

        list.addAll(List.of(23,45,78,56,67,49));
        System.out.println(list);
      List<Integer>result= list.stream().filter((n)->n>60 && n<90).toList();
       System.out.println(result);

    }
}
