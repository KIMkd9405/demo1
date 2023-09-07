package day2;

import java.util.Scanner;

public class Exam7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수1 입력 : ");
        String value1 = scanner.nextLine();
        int v1 = Integer.valueOf(value1);

        System.out.print("정수2 입력 : ");
        String value2 = scanner.nextLine();
        int v2 = Integer.valueOf(value2);

        System.out.print("정수3 입력 : ");
        String value3 = scanner.nextLine();
        int v3 = Integer.valueOf(value3);

        int max = v1;
        if(max < v2) {
            max = v2;
        }
        if(max < v3) {
            max = v3;
        }


        System.out.println("최대값 = " + max);

    }
}
