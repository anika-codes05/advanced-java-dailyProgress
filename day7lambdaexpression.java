import java.lang.FunctionalInterface;
@FunctionalInterface
interface calc{
   // void calculate(int n1,int n2);   //()->{}
    int square(int n1);
}
public class day7lambdaexpression {
    public static void main(String args[]){
// calc a1 = ()->{
//    System.out.println("this is lambda !");
// };
//a1.calculate();
// calc a2=(int n1,int n2)->System.out.println("Sum="+(n1+n2));
// a2.calculate(52,36);
calc a1=(int num)->num*num;
int result=a1.square(20);
System.out.println("the result of square: "+ result);

//System.out.println("Sum=" +a1.calculate(23,24));
    }
    
}
