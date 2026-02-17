import java.util.*;

interface calc{
    void calculate(int n1,int n2);
       default void calculate(int n1,int n2,int n3){
            int s=n1+n2+n3;
            System.out.println("Sum="+s);
            getprivateinfo("Sum="+s);
        }
        static String getInfo(){
            return "This is a calculator interface";
        }
        private void getprivateinfo(String info){
            System.out.println("Private info: "+info);
        
            
        }
        

}class Sum implements calc{
public void calculate(int n1,int n2){
    int s=n1+n2;
    System.out.println("Sum="+s);
}
 public void calculate(int n1,int n2,int n3){
            int s=n1+n2+n3;
            System.out.println("Sum of 3 numbers ="+s);
        }


}
public class day6interface {
    public static void main(String[] args) {
        Sum c= new Sum();
        c.calculate(45,20);
        c.calculate(25, 50, 75);
        System.out.println(calc.getInfo());

       

        
    }//define interface with one abstract method, one default method, one static method and one private method. Implement the interface in a class and call all the methods in main method.
}
