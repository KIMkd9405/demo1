package day11.quizl56;

public class RectangleDriver {
    public static void main(String[] args) {
//        변수들
        Rectangle rec = null;  //  객체 참조변수
        double area = 0.0;     //  직사각형의 면적
      	double perm  = 0.0;    //  직사각형의 둘레

//        알고리즘
//        (1)Rectangle 객체를 만들어 rec가 가리키게 한다.
          rec = new Rectangle();
//        (2)rec의 가로를 3.0으로 변경한다.
          rec.setLength(5.0);
//        (3)rec의 세로를 5.0으로 변경한다.
          rec.setWidth(3.0);
//        (4)rec의 면적을 구하여 area에 저장한다.
         area = rec.calculateArea();
//        (5)rec의 둘레를 구하여 perm에 저장한다.
         perm = rec.calculatePerimeter();
//        (6)rec의 가로, 세로, area와 perm을 출력한다.
        System.out.printf("가로:%.f2 \t 세로%.f2 \t 둘레:%.f2 \t 면적%.f2 \t",rec.getLength(),rec.getWidth(),rec.calculateArea(),rec.calculatePerimeter());



    }
}
