package Generic;

import java.util.ArrayList;

class Student{
    public String Name;
    public int id;

    public Student(){
        this.Name="Student name";
        this.id=100;
    }
    public void study(){
        System.out.println("student is studing");
    }
}

class EngStudent extends Student{
    public String branch;

    public EngStudent(){
        super();
        this.branch="CSE";
    }
    @Override
    public void study(){
        System.out.println("Engg are studing..");
    }

    public void doProject(){
        System.out.println("Engg are doing project");
    }
}

public class WildCard_Generic {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.study(); // student is studing
        Student s2 = new EngStudent();
        s2.study(); // Engg are studing..
   //     s2.doProject(); // invalid
        EngStudent s3 = new EngStudent();
        s3.doProject();
        s1=s2;
        s1.study(); // Engg are studing..
    //    s1.doProject(); // invalid
        s2=s1;
    //    s2.doProject(); // invalid
        s1 = s3;
    //    s1.doProject(); //ionvalid
        ArrayList<?> a1 = new ArrayList<>();
        ArrayList<EngStudent> a2 = new ArrayList<>();
        a1 = a2;
    }
}
