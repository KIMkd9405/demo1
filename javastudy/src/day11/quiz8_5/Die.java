package day11.quiz8_5;

import java.util.Random;

public class Die {

//    변수들
 private int faceValue; //주사위의 현재 면

    public Die(){
        super();
        faceValue = 1;
    }

    public void roll(){
        faceValue= (int)(Math.random()*6)+1;
    }
    //	getFaceValue: 주사위의 현재 면을 반환한다

    public int getFaceValue() {
        return faceValue;
    }
}

    //            메소드들
//	생성자메소드: 새로운 Die 객체를 생성한다


//	roll: 주사위를 던진 후 나온 값을 반환한다


