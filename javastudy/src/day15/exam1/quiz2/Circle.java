package day15.exam1.quiz2;

public class Circle extends Point {
//    1.	변수들
 private int radius; // 반지름

 public Circle(){
  super();
 }

//2.	메소드
//	생성자메소드: Circle 객체를 기본 값(x_coordinate = y_coordinate = radius = 0)으로 초기화한다

 public Circle(int radius) {
  this.radius = radius;
 }

//	생성자메소드: Circle 객체를 주어진 중심의 x 좌표 값과 y 좌표 값과 특정 반지름 값으로 초기화한다
 public Circle(int x_coordinate, int y_coordinate, int radius) {
  super(x_coordinate, y_coordinate);
//  this.x_coordinate = x_coordinate;
//  this.y_coordinate = y_coordinate;
  this.radius = radius;
 }
//	getRadius: 현 Circle 객체의 반지름을 반환한다
 public int getRadius() {
  return radius;
 }
//	getArea: 면적을 계산한다

 public double getArea(){
  return radius * radius * Math.PI;
 }

//	printCircle: 원의 중심과 반지름을 출력한다
public void printCircle() {
 printPoint(); //super.printPoint();
 System.out.println("원의 반지름 : " + radius);
}



}
