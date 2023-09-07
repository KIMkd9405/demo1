package day11.quiz8_3;

public class Book {

//    변수들
 private String title;       // 도서명
    private String	author;  //저자
    private int	price;   // 가격

//            메소드들
//	생성자메소드: 객체 변수들의 값을 주어진 값들로 초기화하면서 새로운 Book 객체를 생성한다

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
//  getTitle: 도서명을 반환한다
    public String getTitle() {
        return title;
    }
//	getAuthor: 저자를 반환한다
    public String getAuthor() {
        return author;
    }
//	getPrice: 가격을 반환한다
    public int getPrice() {
        return price;
    }
    //	setTitle: 도서명을 주어진 값으로 변경한다
    public void setTitle(String title) {
        this.title = title;
    }
//	setAuthor: 저자를 주어진 값으로 변경한다

    public void setAuthor(String author) {
        this.author = author;
    }
//	setPrice: 가격을 주어진 값으로 변경한다

    public void setPrice(int price) {
        this.price = price;
    }
//	toString: 도서의 현 상태를 반환한다.
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
