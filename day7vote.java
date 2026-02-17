import java.lang.FunctionalInterface;
class voter{
void voters(int age1){
   if(age1>18){
        System.out.println("eligible");
       }else{
        System.out.println("not eligible");
       }
}
}
@FunctionalInterface
interface vote{
    void age(int num1);
        
    
}
public class day7vote {
    public static void main(String args[]){
    vote a1= num1->{
       if(num1>18){
        System.out.println("eligible");
       }else{
        System.out.println("not eligible");
       }

    };
    a1.age(20);

    voter v1=new voter();
    vote v2= v1::voters;
    v2.age(10);
    }

    //for reverence of the functional interface we can use lambda expression and pass the logic of the function in the lambda expression and call the method of the functional interface to execute the logic.
//
}
