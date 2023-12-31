package day15.exam1.quiz1;

public class MonetaryCoin extends Coin{
// 1. 변수들
//	value// 동전의 액면 금액
    private int value;


//2. 메소드
//	생성자메소드: 액면 금액을 가진 동전 객체를 만든다

    public MonetaryCoin(int value) {
        this.value = value;}

//	setValue: 동전의 액면 금액을 주어진 값으로 변경한다
    public void setValue(int value) {
        this.value = value;
    }

//	getValue: 동전의 액면 금액을 반환한다

    public int getValue() {
        return value;
    }
//	toString: 현 객체의 현재 상태를 문자열로 반환한다


    @Override
    public String toString() {
        return "MonetaryCoin{" +
                "value=" + value + "\t" +
                "face=" + super.toString()+
                '}';
    }
}
