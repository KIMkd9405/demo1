package day11.quiz8_1;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(
                "1111","홍길동",90,80,85);
        System.out.println(student);

        student.setScore(1,95);
        student.setScore(2,85);
        student.setScore(3,75);

        System.out.println(student);

      System.out.println(student.getScore(1));
        System.out.println(student.getScore(2));
        System.out.println(student.getScore(3));

        //시험번호가 1~3 사이가 아니면 -1 반환
        int score = student.getScore(4);
        System.out.println(score);
    }
}
