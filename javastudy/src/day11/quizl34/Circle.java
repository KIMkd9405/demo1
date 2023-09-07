package day11.quizl34;

public class Circle extends Object {

    //변수
   private double radius ;

    Circle(){
        super();  //상위 클래스의 생성자 호출
    }

//    getRadius: 원의 반지름을 반환한다
//    public double getRadius() {
//        return radius;
//    }
//	computeArea: 원의 면적을 계산한다
    public double ComputeArea(){
        return radius * radius * Math.PI;
    }
//	computePerimeter: 원의 둘레를 계산한다

    public  double computePerimeter(){
        return radius * Math.PI;
    }

//	setRadius: 원의 반지름을 주어진 값으로 변경한다

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
