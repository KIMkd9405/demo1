package day11.quiz8_4;

public class Item {
//   변수들
	private String name; //상품의 이름
    private String price; // 상품의 가격
    private String quantity; // 상품의 수량

//    메소드들
//	생성자메소드: 객체 변수들의 값을 주어진 값들로 초기화하면서 새로운 Item 객체를 생성한다
    public Item(String name, String price, String quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

//	toString: 상품의 현 상태를 반환한다

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }

//	getName: 상품의 이름을 반환한다
    public String getName() {
        return name;
    }
//	getPrice: 상품의 가격을 반환한다

    public String getPrice() {
        return price;
    }
//	getQuantity: 상품의 수량을 반환한다

    public String getQuantity() {
        return quantity;
    }
    //	setPrice: 상품의 가격을 주어진 값으로 변경한다

    public void setName(String name) {
        this.name = name;
    }
//	setName: 상품의 이름을 주어진 값으로 변경한다

    public void setPrice(String price) {
        this.price = price;
    }
//	setQuantity: 상품의 수량을 주어진 값으로 변경한다

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
