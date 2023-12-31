package day14.ShoppingCart;

import java.util.Arrays;

public class ShoppingCart {

//    1.	변수들
 private Item[] cart;              //Item 객체들의 배열
 private final int CAPACITY = 10; //장바구니의 최대 크기
 private int	itemCount;         //장바구니에 있는 Item 객체들의 총수
 private int	totalPrice;        //장바구니에 있는  상품들의 총 가격

//    2.	메소드
//	생성자메소드: 크기가 5인 비어 있는 장바구니를 만든다

    public ShoppingCart() {
        cart = new Item[CAPACITY];
    }
//	addToCart: 장바구니에 한 Item 객체를 추가한다
//    public void addToCart(String itemName, int itemPrice, int itemQuantity){
//public void addToCart(Item item){
        public void addToCart( String itemName, int itemPrice, int itemQuantity){
    cart[itemCount] = new Item(itemName, itemPrice, itemQuantity);
//        cart[itemCount] = item;
        itemCount++;
        totalPrice += itemPrice * itemQuantity;
    }
//	toString: 장바구니의 상태를 문자열로 반환한다

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cart=" + Arrays.toString(cart) +
                ", CAPACITY=" + CAPACITY +
                ", itemCount=" + itemCount +
                ", totalPrice=" + totalPrice +
                '}';
    }

//	getTotalPrice: 장바구니에 있는  상품들의 총 가격을 반환한다

    public int getTotalPrice() {
        return totalPrice;
    }
}
