import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Employee{
    int eid;
    String name;
    String dept;
     Employee(int eid, String name, String dept) {
        this.eid = eid;
        this.name = name;
        this.dept = dept;
    }
}
public class day15_mapque {
    public static void main(String args[]){
  List<String>str=Arrays.asList("sachin","rahul","amit");
    System.out.println(str);
    List<String>res=str.stream().map((s)->s.toUpperCase()).toList();
    System.out.println("after converting to uppercase:");
    System.out.println(res);
    List<String>str2=Arrays.asList("A","B","C");
    System.out.println(str2);
    List<String>res2=str2.stream().map((s)->"Item-"+s).toList();
    System.out.println("after appending 'item-':");
    System.out.println(res2);
//problem 7.
ArrayList<Employee>list=new ArrayList<Employee>();
list.add(new Employee(1,"Amit","MCA"));
list.add(new Employee(2,"Ravi","CSE"));
List<String>empName=list.stream().map((e)->e.name).toList();
System.out.println("employee names:");
System.out.println(empName);
    }
}
