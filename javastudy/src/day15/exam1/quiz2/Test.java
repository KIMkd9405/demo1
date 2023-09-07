package day15.exam1.quiz2;

public class Test {
    public static void main(String[] args) {


//변수들
        Point p =null;	 //Point 객체 변수
        Circle	cir = null; //Circle 객체 변수
        Cylinder cyl = null; //Cylinder 객체 변수

//        알고리즘
//        1.	Point 객체를 만든다.
        p = new Point(10,10);
//        2.	Circle 객체를 만든다.
        cir = new Circle(10,10,5);
//        3.	Cylinder 객체를 만든다.
        cyl = new Cylinder(10,10,5,10);
//        4.	Point 객체의 현 상태를 출력한다.
        p.printPoint();
//        5.	Circle 객체의 현 상태를 출력한다.
        cir.printCircle();
//        6.	Circle 객체의 면적을 구하여 출력한다.
       System.out.printf("원의 면적 : %.2f \n" , cir.getArea());
//        7.	Cylinder 객체의 현 상태를 출력한다.
        cyl.printCylinder();
//        8.	Cylinder 객체의 표면적과 부피를 구하여 출력한다.
        System.out.printf("실린더 표면적 : %.2f \t 실린더 부피 : %.2f \n", cyl.calculateSurfaceArea(),cyl.calculateVolume());


    }
}
