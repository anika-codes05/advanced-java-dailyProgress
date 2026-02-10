import java.util.ArrayList;
class Student {
    private String name;
    private String course;
    private int sid;

    public Student(String name, String course, int sid) {
        this.name = name;
        this.course = course;
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getSid() {
        return sid;
    }
}
public class day5 {
    public static void main(String []args){
        //add 5 students to arraylist and print the details of students
        //make a method to add students to arraylist and print the details of students
        //and print make 5 objects and print the details use collections
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Student1", "MCA", 1));
        students.add(new Student("Student2", "MCA", 2));
        students.add(new Student("Student3", "MCA", 3));
        students.add(new Student("Student4", "MCA", 4));
        students.add(new Student("Student5", "MCA", 5));


        for(Student s : students){
            System.out.println("Sid="+ s.getSid());
            System.out.println("Name="+ s.getName());
            System.out.println("Course="+ s.getCourse());
        }
        

    }
}
