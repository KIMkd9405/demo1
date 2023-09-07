package day11.quizl56;

import java.lang.*;
public class Rectangle extends Object{


   private double length; //가로
   private double width;  //세로

    public Rectangle(){super();
    }

//	getLength: 가로의 길이를 반환한다
//	getWidth: 세로의 길이를 반환한다
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    //	setLength: 가로의 길이를 주어진 값으로 변경한다
    //	setWidth: 세로의 길이를 주어진 값으로 변경한다
    public void setLength(double length) {
        if (length <= 0)return;
        this.length = length;
    }
    public void setWidth(double width) {
        if (width <= 0)return;
        this.width = width;
    }

//    calculateArea: 면적을 계산한다
//	calculatePerimeter: 둘레를 계산한다
    public double calculateArea(){
        double result = 0.0;
        result = length*width;
        return result;
    }

    public double calculatePerimeter(){
        return  (this.length + this.width)*2.0;

    }

}
