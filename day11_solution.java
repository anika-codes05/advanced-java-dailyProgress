interface Printer{
    default void print(String msg){
        System.out.println("Default:");
        show(msg);
    }
    default void show(String msg){
        System.out.println(msg.toUpperCase());
    }
}
public class day11_solution {
    public static void main(String args[]){
        Printer p =new Test1();
        p.print("java");
        
    }
}
