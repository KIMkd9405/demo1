package com.kh.dic;

import java.util.Map;
import java.util.TreeMap;
public class Dictionary {
    private TreeMap<String, String> dic;

    public Dictionary() {
        this.dic = new TreeMap<>();
        dic.put("student", "학생");
        dic.put("teacher", "선생");
        dic.put("classroom", "교실");
        dic.put("smart", "똑똑한");
        dic.put("lunch", "점심");
    }

    // 저장
    public void save(String word, String meaning) throws DictionaryException {
        // 최대 단어 5개
        if (dic.size() >= 5) {
            throw new DictionaryException("최대 5개 단어만 저장할 수 있습니다.");
        }
        // 중복체크
        if (dic.containsKey(word)) {
            throw new DictionaryException("이미 등록된 단어입니다.");
        }
        // 단어 등록
        dic.put(word, meaning);
        System.out.println("단어가 등록되었습니다.");
    }

    // 검색
    public String search(String word) throws DictionaryException {
        if (!dic.containsKey(word)) {
            throw new DictionaryException("단어를 검색할 수 없습니다.");
        }
        return dic.get(word);
    }

    // 수정
    public void replace(String word, String meaning) throws DictionaryException {
        if (!dic.containsKey(word)) {
            throw new DictionaryException("단어를 검색할 수 없습니다.");
        }
        dic.put(word, meaning);
        System.out.println("단어의 뜻을 수정하였습니다.");
    }

    // 삭제
    public void delete(String word) throws DictionaryException {
        if (!dic.containsKey(word)) {
            throw new DictionaryException("단어를 검색할 수 없습니다.");
        }
        dic.remove(word);
        System.out.println("단어를 삭제하였습니다.");
    }

    // 목록
    public void list(boolean listOrder) {
        if (dic.isEmpty()) {
            System.out.println("단어가 등록 되어있지않습니다");
        } else {
            System.out.println("단어 목록");
            if (listOrder) {
                for (Map.Entry<String, String> entry : dic.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            } else {
                for (Map.Entry<String, String> entry : dic.descendingMap().entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            }
        }
    }

    //색인
    public void index(char startChar){
        System.out.println("단어 색인 : ");
        for (Map.Entry<String,String> entry : dic.entrySet()){
            String word = entry.getKey();
            if (Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(startChar)){
                System.out.println(word);
            }
        }
    }
    //통계
    public void statistics(){
        System.out.println("통계");
        System.out.println("1. 저장된 단어 :" + dic.size());

        int maxCharcount = 0;
        String longest = "";
        for (String word : dic.keySet()) {
            int charCount = word.length();
            if(charCount > maxCharcount){
                maxCharcount = charCount;
                longest = word;
            }
        }
        System.out.println("2. 단어의 문자수가 가장 많은 단어 : " +longest );
        System.out.println("3. 단어 글자수 내림차순 출력 : " );
        for (String word : dic.keySet()){
            System.out.println(word);
        }
    }
 }
