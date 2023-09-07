package day11.quizl34;



public class CircleDriver {
    public static void main(String[] args) {

//        변수들

	Circle cir = null;  // 객체 참조변수
	double area = 0.0 ;        //  원의 면적
	double perm = 0.0;        // 원의 둘레


//        알고리즘
//        (1)	Circle 객체를 만들어 cir가 가리키게 한다.
        cir = new Circle();
//        (2)	cir의 반지름을 5.0으로 변경한다.
        cir.setRadius(5.0);
//        (3)	cir의 면적을 구하여 area에 저장한다.
        area = cir.ComputeArea();
//        (4)	cir의 둘레를 구하여 perm에 저장한다.
        perm = cir.computePerimeter();
//       (5)	area와 perm을 출력한다.
      System.out.printf("둘레: %.2f \t ","면적%.2f \t ",perm,area);
      System.out.println();
     System.out.println(cir.toString());
   }
}
