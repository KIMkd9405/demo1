package day13;

import java.util.Scanner;

public class quiz3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int	numofquestions = 0; //문제수
        int[] key = null; // 정답들의 배열
        int  answer = 0; //사용자의 답
        int numofcorrectanswers = 0; // 맞은 답들의 수
        double score = 0 ; // 점수

//        알고리즘
//        1.	문제 수를 입력받는다.
        System.out.print("문제 수 : ");
        numofquestions = Integer.parseInt(scanner.nextLine());
//        2.	정답들의 배열의 크기를 문제 수로 정한다.
        key = new int[numofquestions];
//        3.	정답을 입력받는다.
        for (int i = 0; i < key.length; i++) {
        System.out.print("정답 "+ (i+ 1)+" : ");
        key[i] = Integer.parseInt(scanner.nextLine());
        }
//        4.	사용자의 답을 입력 받아 정답과 비교한다.
        for (int i = 0; i <key.length; i++) {
            System.out.println("사용자의 답"+(i+1)+" : ");
            answer = Integer.parseInt(scanner.nextLine());
            if (key[i] == answer){
                numofcorrectanswers++;
            }
        }
//        5.	점수를 계산한다.
        score = (double) numofcorrectanswers /numofquestions * 100;
//        6.	결과를 출력한다.
        System.out.printf("맞은답 수%d : ",numofcorrectanswers);
        System.out.printf("점수%f :" , score);




    }

}
