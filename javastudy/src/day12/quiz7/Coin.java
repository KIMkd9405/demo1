package day12.quiz7;

public class Coin {

////변수들
       private static final int HEADS = 1; //앞면을 나타내는 상수
    private final int TAILS = 2;  // 뒷면을 나타내는 상수
    private int face;   //동전의 현재 면 , 1.앞면 2.뒷면

//        메소드들
//        	생성자 메소드: 동전을 던짐으로써 Coin 객체를 생성한다

    public Coin(){
        super(); //Object 클래스의 기본 생성자 호출해서 Object 인스턴스 생성
        flip();
    }
//          flip: 동전의 면을 임의로 선택하기 위해 동전을 던진다
    public void flip(){
        face=(int)(Math.random()*2)+1;
    }
//        	getFace: 동전의 현재 면을 정수로 반환한다

    public int getFace() {
        return face;
    }

//        	toString: 동전의 현재 면을 문자열로 반환한다


    @Override
    public String toString() {
//        String statusOfCoin = "";
        //case1
//        if (face ==1 ){
//            statusOfCoin = "앞면";
//        } else if (face == 2) {
//            statusOfCoin = "뒷면";
//        }
//        //case2
//        statusOfCoin = (face ==1)?"앞면":"뒷면";
//        return "Coin("+ statusOfCoin + ")";
//        return "Coin{" +
//                "face=" + ((face==1)  ?"앞면":"뒷면")+
//                '}';

        return (face == HEADS)?"앞면":"뒷면";
    }
}