package day2;

public class Exam5 {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = 30;
    int a = 40;

    int max = x;
    
    if (max < y) {
      max = y;

    }
     if (max < z) {
      max = z;

    } if (max < a) {
      max = a;

    }
      System.out.println(max + "가 가장 큽니다");

     System.out.println((int)(Math.random()*45)+1);

    }
}
