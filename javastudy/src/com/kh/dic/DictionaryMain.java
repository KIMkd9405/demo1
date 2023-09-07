package com.kh.dic;

import java.util.Scanner;

public class DictionaryMain {
    public static void main(String[] args) {


        Dictionary dic = new Dictionary();
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;


        while (!stop) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("메뉴: 1.저장 2.검색 3.수정 4.삭제 5.목록 .6.색인 7.통계 8.종료");
            System.out.println("-----------------------------------------------------------------");
            System.out.print("선택 >> ");

           String word = null; // 단어
            String meaning = null; // 의미

            String menu = scanner.nextLine();

            switch (menu) {
                case "1": // 저장
                    System.out.print("단어 : ");
                     word = scanner.nextLine();
                    System.out.print("뜻 : ");
                   meaning = scanner.nextLine();


                    if (word.isEmpty() || meaning.isEmpty()) {
                        System.out.println("단어와 뜻을 입력해야 합니다.");
                        break;
                    }

                    try {
                        dic.save(word, meaning);
                    } catch (DictionaryException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "2": // 검색
                    System.out.print("단어 : ");
                    word = scanner.nextLine();

                    try {
                        String result = dic.search(word);
                        System.out.println("검색 결과: " + result);
                    } catch (DictionaryException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "3": // 수정
                    System.out.print("단어 : ");
                    word = scanner.nextLine();
                    System.out.print("뜻 : ");
                    meaning = scanner.nextLine();

                    try {
                        dic.replace(word, meaning);
                    } catch (DictionaryException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "4": // 삭제
                    System.out.print("단어 : ");
                    word = scanner.nextLine();

                    try {
                        dic.delete(word);
                    } catch (DictionaryException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "5": // 목록
                    System.out.println("서브메뉴 : 1. 오름차순 2. 내림차순 ");
                    System.out.print(" 선택 >>>>>");
                    String submenu = scanner.nextLine();
                    boolean listOrder = submenu.equals("1");

                    dic.list(listOrder);
                    break;
                case "6": // 색인
                    System.out.println("알파벳을 입력하세요.");
                    String startCharInput = scanner.nextLine();
                    char startChar =startCharInput.charAt(0);

                    dic.index(startChar);
                    break;

                case "7": // 통계
                    dic.statistics();
                    break;
                case "8": // 종료
                    stop = true;
                    break;
                default:
                    System.out.println("1~8번에서 선택하세요.");
            }
        }
        System.out.println("프로그램 실행을 종료합니다.");
    }
}
