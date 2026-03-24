import java.util.*;
public class day18_practice {
    class Employee {
    int id;
    String name;
    double salary;
    String department;

    // Constructor
    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Optional: to print easily
    public String toString() {
        return id + " " + name + " " + salary + " " + department;
    }
}
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,5,33,9,21,1);
        System.out.println(list);
        List<Integer> result=list.stream().sorted((a,b)->a-b).toList();
        System.out.println("ascending order:"+result);
        List<Integer>result1=list.stream().sorted((a,b)->b-a).toList();
        System.out.println("descending order:"+result1);
        List<Integer> list1 = Arrays.asList(18,42,7,91,33,25,60);
        List<Integer> max=list1.stream().sorted((a,b)->b-a).limit(3).toList();
        System.out.println("top 3 numbers:"+max);
        List<Integer>list2=Arrays.asList(14,9,20,7,6,11,32,3);
        List<Integer>result2=list2.stream().filter((n)->n%2==0).sorted().toList();
        System.out.println("even number:"+result2);

        List<Integer>list3=Arrays.asList(55,12,88,34,99,21);
        Integer result3=list3.stream().sorted((a,b)->b-a).toList().get(1);
        System.out.println("second highest:"+result3);

        List<Integer>list4=Arrays.asList(8,26,13,41,19,32,5);
        List<Integer>result4=list4.stream().filter((n)->n>20).sorted().toList();
        System.out.println("numbers greater than 20:"+result4);


        List<String >list5=Arrays.asList("Ravi","Akit","Zoya","Meena","Kunal");
        List<String>result5=list5.stream().sorted().toList();
        System.out.println("sorted names:"+result5);

        List<String >list6=Arrays.asList("Ravi","Akit","Zoya","Meena","Kunal");
        List<String>result6=list6.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println("sorted names:"+result6);


        List<String >list7=Arrays.asList("java","Springboot","API","microvaves","sql");
       List<String>result7=list7.stream().sorted((a,b)->b.length()-a.length()).toList();
       System.out.println("sorted by length:"+result7);
//placement question: question 17
        List<Employee>list8=new ArrayList<Employee>();
        list8.add(new Employee(1,"Rahul",20000,"IT"));
         list8.add(new Employee(2,"anika",55000,"MCA"));
          list8.add(new Employee(3,"pooja",30000,"ece"));
           list8.add(new Employee(50,"kalki",20000,"MCA"));

           List<Employee>result8=list8.stream().sorted((e1,e2)->Double.compare(e2.salary,e1.salary)).toList();
           System.out.println("sorted by salary:"+result8);
           


            





    }
}
