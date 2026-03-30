import java.util.Arrays;
import java.util.List;

public class day21practice {
    public static void main(String args[]){
        List<Integer>list=Arrays.asList(15,22,8,40,12,35,50,5);
        int result = list.stream().sorted((a,b)->b-a).limit(3).reduce(0, (a,b)->a+b);
        System.out.println("Top 3 numbers: " + result);
       int result1= list.stream().sorted((a,b)->a-b).limit(2).skip(1).findFirst().get();
       System.out.println("2nd smallest number: " + result1);

    }
}
