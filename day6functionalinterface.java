import java.lang.FunctionalInterface;
//a functional interface : it is a interface where there is only one abstract methods and have special annotation which is functional interface
 @FunctionalInterface
interface Add{
   
    int calculate(int n1,int n2);
  
    
}
public class day6functionalinterface {
    public static void main(String args[]){
  Add a=new Add(){ 
    @Override
    public int calculate(int n1,int n2){
        return (n1+n2);
    }

  };
  System.out.println("Sum="+a.calculate(23,24));
  Add a1=(int n1,int n2)->(n1+n2);//lambda expression
    System.out.println("Sum="+a1.calculate(23,24));

    }
}
//note: lambda  expression is a short form of anonymus function , that reference
//is pass to a functional interface object.
//type of expressions:no parameter , no return type
// (a) ( )-> {} multiple line in functional
//(b)   ()-> Syso("lambda expressions")// single line repesentation

//2. No parameter, no return type:
//a.() ->{
//        write ur lines here ;
//  return 10; } // multiple lines
// () -> 10 // return without return keyword(single line)

//3. with parameter, no return type:
//a. with one parameter:
//  int (num1) -> syso(num1); // with one parameter and datatype
//  (num1)-> syso(num1);// with one parameter without data type
//  num1 -> syso(num1);
//  num1-> {
//  syso("multiple lines");
//  syso(num1)
//}
 
//4. with parameter, with return type:
// (int num1,int num2)-> num1+num2
//(int num1,int num2)->{return num1+num2}
