import java.util.*;

class Animal{
           static String name; // instance variable   : variable inside the class but outside the method
           static String sound;
            Animal(){ //constructor : a special method that is used to initialize the object and it has the same name as the class and it does not have a return type
                this("Cat1"," ");
            }
            Animal(String name,String sound){
                this.name=name;
                this.sound=sound;
            }

            void getInfo(){
                System.out.println("Name =" +name);
                System.out.println("sound="+sound);
            }
            void getInfo(String name,String sound,int legs){
                System.out.println("Name="+name);
                System.out.println("Sound="+ sound);
                 System.out.println("no of legs ="+ legs);
            }
        }
        class Cat extends Animal{
            Cat(String name,String sound){
           super(name,sound);
            }
            @Override
             void getInfo(){
                System.out.println("cat Name="+name);
                System.out.println("cat Sound="+ sound);
            }
            // void getInfo(String name,String sound){
            //     System.out.println("Name="+name);
            //     System.out.println("Sound="+ sound);
             
            // }
        }
        //law of inheritance : the child class can access the properties and behaviour of the parent class but the parent class cannot access the properties and behaviour of the child class

public class day3polymorphism {
    //polymorphism :the ablity of an object to have multiple forms and multiple behaviour in a situation

        
        
    public static void main(String args[]){

    Animal an1=new Animal("dog","bark");
     an1.getInfo();
     an1.getInfo("cat","meow",4);
     Cat c1=new Cat("cat2","meow");
     c1.getInfo();
     Animal c2=new Cat("cat2","meow");
     c2.getInfo();
//this keyword
        // this is a reference variable that refers to the current object and it is used to access the instance variable and instance method of the current object
        // super keyword : this is a reference variable that refers to the parent class and it is used to access the instance variable and instance method of the parent class
    }//encapsulation : the process of wrapping data and code together as a single unit and it is used to hide the implementation details from the user and it is achieved by using access modifiers like private, protected and public
}

