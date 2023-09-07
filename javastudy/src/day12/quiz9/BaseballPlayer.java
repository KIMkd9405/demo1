package day12.quiz9;

public class BaseballPlayer {

//    변수들
private String	name; // 야구선수의 이름
    private String	position; // 야구선수의 위치
    private int	numHits; // 야구선수의 안타수
    private int numWalks;        //야구선수의 4구수

//            메소드들
//	생성자메소드: 야구선수의 이름을 넘겨 받아 객체를 생성한다

    public BaseballPlayer(String name) {
        this.name = name;
    }
//	getName: 야구선수의 이름을 반환한다
    public String getName() {
        return name;
    }
//	getPosition: 야구선수의 위치를 반환한다
    public String getPosition() {
        return position;
    }
//	getNumHits: 야구선수의 안타수를 반환한다
    public int getNumHits() {
        return numHits;
    }
//	getNumWalks: 야구선수의 4구수를 반환한다
    public int getNumWalks() {
        return numWalks;
    }

//	setName: 야구선수의 이름을 주어진 값으로 변경한다
    public void setName(String name) {
        this.name = name;
    }
//	setPosition: 야구선수의 위치를 주어진 값으로 변경한다
    public void setPosition(String position) {
        this.position = position;
    }
//	setNumHits: 야구선수의 안타수를 주어진 값으로 변경한다
    public void setNumHits(int numHits) {
        this.numHits = numHits;
    }
//	setNumWalks: 야구선수의 4구수를 주어진 값으로 변경한다
    public void setNumWalks(int numWalks) {
        this.numWalks = numWalks;
    }

    @Override
    public String toString() {
        return "BaseballPlayer{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", numHits=" + numHits +
                ", numWalks=" + numWalks +
                '}';
    }
}
