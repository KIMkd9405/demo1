package day14.Person;

public class Student extends Person{
    public Student(){

    super();
    System.out.println("Student() 호출됨");
    }
    public void study(){
        System.out.println("공부하다");
    }

}
