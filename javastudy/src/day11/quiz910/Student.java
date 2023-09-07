package day11.quiz910;
/*
    상속에서 제외되는 맴버:
    1. 상위 클래스의 static 맴버
    2. 상위 클래스의 private 맴버

 */
public class Student extends Person{
//변수들

 private String name;         //Name: 이름
 private String number;       //Number: 학번
 private String department;   //Department: 소속학과

    public Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "이름='" + name + '\'' +
                ", 학번='" + number + '\'' +
                ", 소속학과='" + department + '\'' +
                '}';
    }


    //메소드들

//getName: 이름을 반환한다
//setName: 이름을 주어진 값으로 변경한다
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//getNumber: 학번을 반환한다
//setNumber: 학번을 주어진 값으로 변경한다
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
//getDepartment: 소속학과를 반환한다
//setDepartment: 소속학과를 주어진 값으로 변경한다
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
//toString: 학생의 이름, 학번과 소속학과를 반환한다

}
