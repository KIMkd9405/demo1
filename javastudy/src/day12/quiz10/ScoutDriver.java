package day12.quiz10;

import java.util.Scanner;

public class ScoutDriver {
    public static void main(String[] args) {

        Scout[] gscout = null; // 단원 배열
        String gscoutname = null; // 단원 이름
        int saleweeks = 0; // 판매 기간
        int saleperweek = 0; //주별 판매 상자수

        Scanner scanner = new Scanner(System.in);
        gscout = new Scout[3];

        //세 명의 스카우트 단원의이름을 들어 3개의 객체생성
        for (int i = 0; i < gscout.length; i++) {
            System.out.println((i+1)+"단원의 이름 :");
            gscoutname = scanner.nextLine();
            gscout[i] = new Scout(gscoutname);
        }

        //2. 과자 판매가 계속되는 주들 의 수를
        System.out.print("판매 기간>>");
        saleweeks = Integer.parseInt(scanner.nextLine());

        //3. 매 주 각 걸스카우트단원이 판매한 과자 상자 수들을 입력
        for (int i = 0; i < saleweeks; i++) {
            System.out.println((i+1)+"번쨰주 판매 상자수 입력하세요");
            for (int j = 0; j < gscout.length; j++) {
                System.out.println(gscout[j].getName()+"님이 판매한 과자 상자 수 :");
                String cntOfBoxStr = scanner.nextLine();
               saleperweek = Integer.parseInt(cntOfBoxStr);
                gscout[j].updateSales(saleperweek);
            }
        }


        //4. 단원의 이름과 총 판매 수 출력
        for (int i = 0; i < gscout.length; i++) {
            System.out.println(gscout[i]);
        }

    }
}

