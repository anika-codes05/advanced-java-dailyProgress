import java.util.*;
import java.util.Arrays;
import java.util.List;
public class day16_reduce {
    public static void main(String args[]){
List<Integer> list=Arrays.asList(34,12,45,76,56,54,32);
 double avg =list.stream().reduce(0,(a,b)->a+b)/list.size();
 System.out.println("average= "+avg);
int sum=list.stream().reduce(0,(a,b)->a+b);
System.out.println("sum="+sum);
int product=list.stream().reduce(1,(a,b)->a*b);
System.out.println("product= "+product);
int max=list.stream().reduce(Integer.MIN_VALUE,(a,b)->Math.max(a,b));
System.out.println("max="+max);
List<Integer>li=Arrays.asList(34,12,98,5,76,2);
int small=li.stream().reduce(Integer.MAX_VALUE,(a,b)->Math.min(a,b));
System.out.println("smallest="+ small);
List<Integer>list1=Arrays.asList(10,20,30,40,50,60,70);
int count=list1.stream().reduce(0,(a,b)->list.size());
//to count we have count function
//double count=list1.stream().count();
System.out.println(count);
int even=list.stream().filter((n)->n%2 ==0).reduce(0,(a,b)->a+b);
System.out.println("sum of even numbers="+even);
List<String>list2=Arrays.asList("java","stream","API","Reduce","Functional","check");
String result=list2.stream().reduce("",(a,b)->a+" "+b);
System.out.println("concatenated string= "+result);
int square=list.stream().map((n)->n*n).reduce(0,(a,b)->a+b);
System.out.println("sum of squares="+square);

int max1=list.stream().reduce(Integer.MIN_VALUE,(a,b)->Math.max(a,b));
System.out.println("max="+max1);
int smax=list.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b && a<max1?a:b);
System.out.println("second max="+smax);

//second smallest
int min=list.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
System.out.println("smallest="+min);
int smin=list.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b && a>min?a:b);
System.out.println("second smallest="+smin);

String longest=list2.stream().reduce("",(a,b)->a.length()>b.length()?a:b);
System.out.println("longest string= "+longest);

// List<Integer>list3=Arrays.asList(12,34,56,78);
//IMP
int value= 123456;
System.out.println(String.valueOf(value).chars().map(c->c-'0').reduce(0,(a,b)->a+b));

 



    }
}
