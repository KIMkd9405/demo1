package day3;

import java.util.Scanner;

public class Exam33 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean stop = false;


        while (!stop){   //boolean 안쓰고 while(true)
            System.out.print("시작 :");
            String start = scanner.nextLine();

            if(start.equalsIgnoreCase("X")){
//                break;
                stop = true;
            }

            int startNumber = Integer.parseInt(start);

            System.out.print("종료 : ");
            String end = scanner.nextLine();
            int endNumber = Integer.parseInt(end);

            int sumOfOdd = 0; //홀수
            int sumOfEven = 0; //짝수
            int total = 0; //총계

            for (int i = startNumber; i <= endNumber; i++) {
                if (i % 2 == 0) {
                    sumOfEven = +i;  //sumOfEven = sumOfEven + i
                } else {
                    sumOfOdd = +i;  //sumOfOdd = sumOfOdd + i
                }

                total = +i; // total = total + i

            }

            System.out.println("시작 : " + startNumber);
            System.out.println("종료 : " + endNumber);
            System.out.println("홀수의 합 =" + sumOfOdd);
            System.out.println("짝수의 합 = " + sumOfEven);
            System.out.println("전체의 합 = " + total);
        }
        System.out.println("프로그램 종료");
    }
}
