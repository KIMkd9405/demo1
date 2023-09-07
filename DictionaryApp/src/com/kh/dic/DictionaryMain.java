package com.kh.dic;

import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class DictionaryMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Dictionary dic = new Dictionary();
        boolean stop = false;

        do {
            try {
                System.out.println("1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료 9.비우기");
                System.out.print("선택 >>");
                String menu = scanner.nextLine();
                String word = "";        //단어
                String meaning = "";     //의미
                Map<String, String> findByWords = null;

                switch (menu) {
                    case "1":  //저징
                        System.out.print("단어 입력 : ");
                        word = scanner.nextLine();
                        System.out.print("의미 입력 : ");
                        meaning = scanner.nextLine();
                        //                    try {
                        dic.save(word, meaning);
                        //                    } catch (DictionaryException e) {
                        //                        System.out.println(e.getMessage());
                        //                    }
                        break;
                    case "2":  //검색
                        System.out.println("단어 입력 : ");
                        word = scanner.nextLine();
                        findByWords = dic.finalByWord(word);
                        //case1) keyset
                        Set<String> words = findByWords.keySet();
                        for (String key : words) {
                            System.out.printf("%s : %s", key, findByWords.get(key));
                        }
                        //                    //case2) entry
                        //                    Set<Map.Entry<String, String>> entries = findByWords.entrySet();
                        //                    for (Map.Entry<String,String>entry: entries){
                        //                        System.out.printf("%s : %s", entry.getKey(), entry.getValue());
                        //                    }

                        break;
                    case "3":  //수정
                        System.out.print("단어 입력 : ");
                        word = scanner.nextLine();
                        System.out.print("의미 입력 : ");
                        meaning = scanner.nextLine();
                        if (dic.update(word, meaning)) {
                            System.out.println("수정 하고자 하는 단어가 없습니다");
                        }
                        break;

                    case "4":   //삭제
                        System.out.print("단어 입력 : ");
                        word = scanner.nextLine();
                        if(dic.delete(word)){
                            System.out.println("단어를 삭제하였습니다");
                        }

                        break;
                    case "5":  //목록
                        System.out.print("1.오름차순 2.내림차순");
                        System.out.print("선택 >> ");
                        String submenu = scanner.nextLine();

                        Map<String, String> map = null;
                        switch (submenu){
                            case "1" :
                                map = dic.listAll(Dictionary.ASC_SORT);
                                break;
                            case "2" :
                                map = dic.listAll(Dictionary.DESC_SORT);
                                break;
                        }
                        for (String key : map.keySet()) {
                            System.out.printf("%s : %s\n", key, map.get(key));
                        }

                        break;
                    case "6": //색인
                        do {
                            System.out.print("초성 입력 : ");
                            word = scanner.nextLine();
                      findByWords = dic.index(word.charAt(0));
                      for (String key : findByWords.keySet()){
                          System.out.printf("%s : %s\n",key , findByWords.get(key));
                      }
                        }while (word.length() !=1 );

                        break;
                    case "7": //동계
                        String statics = dic.showWordStatics();
                        System.out.print(statics);
                        break;
                    case "8": //종료
                        stop = true;
                        break;
                    case "9":
                        dic.init();
                        break;
                    case "110":
                        dic.clear();
                        break;
                    default:
                        System.out.println("잘못된 메뉴 선택 1~8");
                }
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        } while (!stop) ;
        System.out.println("영어 단어장을 종료합니다");
    }
}