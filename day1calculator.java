  import java.util.Scanner;
  class Sum{
    int num1,num2;
    Sum(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    void getSum(){
  int sum=num1+num2;
    System.out.println("substration ="+ sum);
    }
    }
    
  
  class Sub{
    void getSub(int num1,int num2){
    int s=num1-num2;
    System.out.println("substration ="+ s);
    }

  }
  
  public class day1calculator {
    public static void main(String args[]){
     Sum s1 =new Sum(23,45);
     s1.getSum();
     Sub sub1=new Sub();
     sub1.getSub(34,56);
    }
}
