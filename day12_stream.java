import java.util.*;
import java.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class day12_stream {
    public static void main(String args[]){
      List<Integer>list= new ArrayList<Integer>();
      list.add(3);
      list.add(5);
      
      list.addAll(List.of(23,45,78,56,67,49));
      System.out.println(list);
      Stream listStream=list.stream();
     // listStream.forEach((element)->System.out.print(element+" "));
      //listStream.forEach(System.out::println);
      list.stream().forEach(System.out::println);
      List<String>li=new ArrayList<String>();
      li.add("java");
      li.addAll(List.of("cat","dog","rat","bat"));
        li.stream().forEach(System.out::println);
        System.out.println("count="+list.stream().filter((item)->item>60).count());
        System.out.println("count="+li.stream().count());


    }
}
