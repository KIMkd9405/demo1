package day3;

import java.util.Scanner;

public class Exam3 {

    /*
    사용자로부터 시작값과 종료값을 입력받아 해당구간의 홀수합, 짝수합, 총합을
    산출하는 프로그램을 작성하시오. 단, 시작값으로 'x'를 입력하면 프로그램종료.
     */



    public static void main(String[] args) {


        Scanner scan1 = new Scanner(System.in);
        for(;;) {
            System.out.print("시작값을 입력하시오(시작값에 X를 입력하면 종료됩니다.) : ");
            String st1 = scan1.nextLine();
            if (st1.equalsIgnoreCase("X")) {
                break;
            }
            int startNum = Integer.parseInt(st1);


            Scanner scan2 = new Scanner(System.in);
            System.out.print("종료값을 입력하시오 : ");
            String st2 = scan2.nextLine();
            int lastNum = Integer.parseInt(st2);

            int sum1 = 0;
            int sum2 = 0;

            int sum = 0;


            //홀수 합 구하기//
            if (startNum % 2 == 1) {
                for (int i1 = startNum; i1 <= lastNum; i1 = i1 + 2) {

                    sum1 = sum1 + i1;
                }
            } else {
                for (int i11 = startNum + 1; i11 <= lastNum; i11 = i11 + 2) {
                    sum1 = sum1 + i11;
                }
            }
            System.out.println("홀수 합은 = " + sum1);


//짝수 합 구하기//
            for (int i2 = startNum; i2 <= lastNum; i2 = i2 + 2) {
                if (startNum % 2 == 0) {
                    sum2 = sum2 + i2;
                } else {
                    i2 = startNum + 1;
                }
            }
            System.out.println("짝수 합은 = " + sum2);


            //총합 구하기//
            for (int i = startNum; i <= lastNum; i = i + 1) {
                sum = sum + i;
            }
            System.out.println("총 합은 = " + sum);
        }



    }
}
