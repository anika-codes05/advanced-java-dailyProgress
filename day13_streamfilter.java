import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class day13_streamfilter {

   class Student{
    private int sid;
    private String name;
    private int marks;
    public Student(int sid, String name,int marks) {
      this.sid = sid;
      this.name = name;
      this.marks = marks;
    }
    public int getSid() {
        return sid;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
  }
  @Override
  public String toString() {
      return "student{" +
              "sid=" + sid +
              ", name='" + name + '\'' +
              ", marks=" + marks +
              '}';
  }
}
    public static void main(String args[]){
        List<Integer>list= new ArrayList<Integer>();
        list.add(3);
        list.add(5);

        list.addAll(List.of(23,45,78,56,67,49));
        System.out.println(list);
      List<Integer>result= list.stream().filter((n)->n>60 && n<90).toList();
       System.out.println(result);
   //practicalexamples
   //1.
   List<Integer>data=Arrays.asList(12,15,25,30,11,17,16);
   ArrayList<Integer>li=new ArrayList<Integer>();
   li.addAll(data);
   System.out.println(li);



//1.
   List<Integer>num=List.of(10,15,20,25,30,11,17,16);
   System.out.println(num);
   System.out.println("even numbers are:");
   num.stream().filter((n)->n%2==0).forEach((n)->System.out.println(n));

   //2.
   List<String>str=List.of("Amit","Ravi","Anil","Vikas","Ashok","Rahul");
    System.out.println(str);
    System.out.println("names starting with A are:");
    str.stream().filter((s)->s.startsWith("A")).forEach((s)->System.out.print(" "+s));

    //3.
    List<Integer>n1=Arrays.asList(10,60,45,90,30,24,50,76);
    System.out.println("number greater than 50 are:");
    ArrayList<Integer>li1=new ArrayList<Integer>();
    list.addAll(li1);
    n1.stream().filter((n)->n>50 && n<=60).forEach((n)->System.out.println(n));

    //4.
    System.out.println("string length is greater than 4");
    List<String>li3=List.of("Java","Python","C","React","C#","Next.js","Node.js");
    li3.stream().filter((s)->s.length()>4).forEach(System.out::println);
    //5. 
    System.out.println("remove all null valuesfrom the list:");
    List<String>str2=List.of("Java","null","Spring","null","React");
    List<String>result1=str2.stream().filter((s)->s!="null").toList();
  System.out.println(result1);
    //6. 
    System.out.println("print the all odd numbers from the list:");
    List<Integer>oddnum= new ArrayList<Integer>();
    oddnum.addAll(List.of(10,12,15,22,25,36,75));
    oddnum.stream().filter((n->n%2!=0)).forEach(System.out::println);

    //16.
    System.out.println("marks greater than 60:");
    ArrayList<Student>list =new ArrayList<Student>();
    list.add(new Student(1,"Amit",75));
    list.add(new Student(2,"Ravi",55)); 
    list.add(new Student(3,"Anil",80));
    list.add(new Student(4,"Vikas",45));
    list.add(new Student(5,"Ashok",90));
    list.stream().filter((student)->student.getMarks()>60).forEach((student)->{
      String result=String.format("\t\t%d,\t\t %s,\t\t %d", student.getSid(), student.getName(), student.getMarks());
      System.out.println(result);

    });    

    }
    
}
