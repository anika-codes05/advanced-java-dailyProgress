
sealed class Shape permits Circle,Rectangle{
    // sealed class is a special type of class that is used to restrict the inheritance of a class
    // it can only be extended by the classes that are specified in the permits clause
    // it is used to create a closed hierarchy of classes
}
final class Circle extends Shape{

}
 non-sealed class Rectangle extends Shape{

}
//class can be final,sealed,non-sealed --IMP concept of sealed class

public class day10_sealed {
    public static void main(String args[]){
      int day=1;
        switch(day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            
            default -> System.out.println("Invalid day");
        }
        String result=switch(day){
            case 1,3,4->{System.out.println("this is a 1,3 and 4");
            yield "monday";
        }
            case 2 ->"tuesday";
            default->"no-day";

        };
        System.out.println(result);
    }
}

// git add .
// git commit -m "Day 4 - Collections practice"
// git push
