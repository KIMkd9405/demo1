package day11.quiz8_2;

public class CD {
//    변수들
   private  String title; 		//제목
    private  String artist;		//연주자
    private  int  cost;		//구입가격

//           메소드들

//    생성자 메소드: 제목, 연주자와 구입가격을 주어진 값으로 초기화하면서 새로운 CD 객체를 생성한다
    public CD(String title, String artist, int cost) {
        this.title = title;
        this.artist = artist;
        this.cost = cost;
    }

//	setTitle: CD의 제목을 주어진 값으로 변경한다
    public void setTitle(String title) {
        this.title = title;
    }
//	setArtist: CD의 연주자를 주어진 값으로 변경한다
    public void setArtist(String artist) {
        this.artist = artist;
    }
//	setCost: CD의 구입 가격을 주어진 값으로 변경한다
    public void setCost(int cost) {
        this.cost = cost;
    }
//  getTitle: CD의 제목을 반환한다
    public String getTitle() {
        return title;
    }
//	getArtist: CD의 연주자를 반환한다
    public String getArtist() {
        return artist;
    }
//	getCost: CD의 구입 가격을 반환한다
    public int getCost() {
        return cost;
    }
//	toString: 현 CD 객체의 상태를 문자열로 반환한다

    @Override
    public String toString() {
        return "CD{" +
                "제목='" + title + '\'' +
                ", 연주자='" + artist + '\'' +
                ", 가격=" + cost +
                '}';
    }
}
