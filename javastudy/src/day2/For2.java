package day2;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(">>구구단 프로그램<<");
        for(;;) {
            System.out.print(">>단수(종료:X) : ");
            String dansu = scanner.nextLine();

            if(dansu.equalsIgnoreCase("X")){
                break;
            }
            int num = Integer.parseInt(dansu);

            for (int i = 1; i <= 9; i = i + 1) {
                System.out.println(num + " * " + i + " = " + (num * i));
            }
        }

        System.out.println("프로그램 종료!");
    }
}
