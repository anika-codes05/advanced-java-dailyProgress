import java.util.*;

class Animal{
            String name;
            String sound;
            Animal(){
                this("","");
            }
            Animal(String name,String sound){
                this.name=name;
                this.sound=sound;
            }

            void getInfo(){
                System.out.println("Name =" +name);
                System.out.println("sound="+sound);
            }
            void getInfo(String name,String sounnd,int legs){
                System.out.println("Name="+name);
                System.out.println("Sound="+ sound);
                 System.out.println("no of legs ="+ legs);
            }
        }
        class Cat extends Animal{
            Cat(String name,String sound){
           super(name,sound);
            }
        }

public class day3polymorphism {
    //polymorphism :the ablity of an object to have multiple forms and multiple behaviour in a situation

        
        
    public static void main(String args[]){

    Animal an1=new Animal("dog","bark");
     an1.getInfo();
     an1.getInfo("cat","meow",4);
     Cat c1=new Cat(null, null);

    }
}

