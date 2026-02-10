import java.util.ArrayList;

public class day5_1practice {
    public static void main(String args[]){
        ArrayList<Student> studentInfo = new ArrayList<Student>();
        Student s1=new Student("student1","MCA" ,1 );
        s1.setSid(2);
        studentInfo.add(new Student("student2","MCA" ,2 ));
       studentInfo.add(new Student("student3","MCA" ,3 ));
       studentInfo.add(new Student("student4","MCA" ,4 ));

      System.out.println("Student ID\t\t Name \t\tCourse");
      for(Student s:studentInfo){
        String result=String .format("\t%d\t%s\t%s",s.getSid(),s. getName(),s.getCourse());
        System.out.println(result);
      }

        // System.out.println("Sid="+ s1.getSid());
        // System.out.println("Name="+ s1.getName());
        // System.out.println("Course="+ s1.getCourse());

    }
}
