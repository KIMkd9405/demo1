package day15.exam3;

/*
 Unchecked Exception : 예외 위엄시 메소드 선언부에 throws 명시 할 필요 없다
 예외처리 2가지 방법
 1/ try-catch-fi
 */

public class TryCatch4 {

    public static void main(String[] args) {
        method1(0);
        try {
            method2(0);
        }catch (Exception e) {


        }
//    try {
//        method3();
//    }catch (InterruptedException e)
    }
    //1. tey-catch-finally
    private static void method1(int i){
        try {
        System.out.println(3/i);
        }catch (Exception e){
        }finally {
        }
    }
      // 2. 예외 위임
    private static void method2(int i)throws ArithmeticException {
        System.out.println(3/i);
    }
    private static void method3() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1000); //unchecked Exception

        }
    }

}
