import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;
import java .util.function.Consumer;
//import java.util.function;

record Student(int sid,String name,String course){
    // record class is a special type of class that is used to represent a simple data structure
    };
public class day9_javainference {
    
    public static void main(String args[]){
        int a=10;
        var b=20;
        var c="kiet mca";
        var d=0.0;
        d=38.98;
        String name=new String ("This is a string");
        var name1=new String("This is string with var");
        // int array[]=new int[]{1,2,3,4,5};
        // for(var i:array){
        //     System.out.println(i);
        // }
        // Student s=new Student(1,"Student1","MCA");
        // System.out.println("Sid="+ s.sid());
        // System.out.println("Name="+ s.name());
        // System.out.println("Course="+ s.course());
        // System.out.println(s);

         int data[]=new int[]{23,45,63,12,23};
        List<Integer> listData=Arrays.stream(data).boxed().collect(Collectors.toList());
        //this is java streams to convert int array to list of integers
        System.out.println(listData);
        //listData.forEach((item)->System.out.println(item));
        listData.forEach(System.out::println); // method reference to print each item in the list
        


        
    }
}
// local variable type inference
// var keyword is used for local variable type inference
// cannot initialize var variable with null
// cannot use var for instance variables, method parameters, return types, and lambda parameters
//record class: a record class is a special type of class that is used to represent a simple data structure. It is defined using the record keyword and it automatically generates the constructor, accessor methods, equals(), hashCode(), and toString() methods based on the fields defined in the record. The main advantage of using a record class is that it reduces the boilerplate code and makes the code more concise and readable.
