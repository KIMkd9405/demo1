package day3;

// for문 연습
// 별표 출력하기 5행 5열//
// 하나씩 증가하며 5열까지

public class Exam5 {

    public static void printStart() {

        for(int i = 0; i <5; i++){
            for(int j=0; j<5;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public static void printStart2() {


        for(int i = 0; i<5; i++){

            for(int j=0; j<i;j++){

                System.out.printf("*");
            }

            System.out.println();
        }
    }

    public static void printStart3() {
        int a=5;

        for(int i = 0; i<5; i++){

            for(int j=0; j<a;j++){

                System.out.printf("*");
            }
            a--;
            System.out.println();
        }
    }

    public static void printStart4() {
        int a=9;
        int b;

        for(int i = 0; i<5; i++){

            for(b = 0; b<i; b++ ){
                System.out.print(" ");
            }


                for (int j = 0; j < a; j++) {



                    System.out.printf("*");
                }


            a=a-2;

            System.out.println();

             }
        }


    public static void main(String[] args) {

        printStart();
        printStart2();
        printStart3();
        printStart4();
    }
}
