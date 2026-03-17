//import java.lang.FunctionalInterface;

class Calculator{
    Calculator(){
        System.out.println("this is constructor reference");
    }
    Calculator(int n1,int n2){
        System.out.println("Division: "+ (n1/n2));
    }
    int sub(int n1,int n2){
        return n1-n2;
    }
    static int mul(int n1,int n2){
        return n1*n2;
    }
    }
    @FunctionalInterface
     interface Calc{
        void cal(int n1,int n2);
    
        
    }


public class day8methodreference {
    public static void main(String args[]){
   Calculator c=new Calculator();
   //static method reference
   int r=c.sub(100,25);
   System.out.println("the result of subtraction: "+ r);
   Calc c1= c::sub; // this is the reference to the instance method sub of the Calculator class
//     int r1=c1.cal(100,25);
//    System.out.println("the result of subtraction: "+ r1);
//    Calc c2= Calculator::mul; // this is the reference to the static method mul of the Calculator class
//     int m2=c2.cal(100,25);
//    System.out.println("the result of multiplication: "+ m2);

   //constructor reference
    Calc c3= Calculator::new; // this is the reference to the constructor of the Calculator class
    c3.cal(100,25); // this will call the constructor of the Calculator class with two parameters and print the division result
    }
}








//notes: method referencing is used for code reusebality and to make code more readable. It is a shorthand notation of lambda expression to call a method. There are three types of method referencing:
//1. Static method reference: It is used to refer to a static method of a class. It is denoted by ClassName::methodName.
//2. Instance method reference: It is used to refer to an instance method of a class. It is denoted by instanceName::methodName.
//3. Constructor reference: It is used to refer to a constructor of a class. It is denoted by ClassName::new.   
//encapsulation is the process of wrapping data and code together as a single unit. It is achieved by using access modifiers to restrict access to the data and code. The main advantage of encapsulation is that it helps to protect the data from unauthorized access and modification. It also helps to improve the maintainability and flexibility of the code.

//simple defination of encapsulation: the process of wrapping data and code together as a single unit and it is used to hide the implementation details from the user and it is achieved by using access modifiers like private, protected and public.