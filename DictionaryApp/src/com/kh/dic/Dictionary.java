package com.kh.dic;

import java.util.*;
import java.util.stream.Stream;

public class Dictionary extends TreeMap<String , String> {
    private static final int WORD_CAPACITY = 5; // 단어 최대 저장 갯수

    private static final int ASC_UP = 1;     // 1:오름차순 2:내림차순
    private static final int DESC_DOWN = 2;

    public Dictionary(){
        super();
    }

    //저장
    public void save (String word,String meaning) throws DictionaryException {
        String wordToLowerCase = word.toLowerCase();
        //1)단어수 초과
       if (size() == 5){
           throw new DictionaryException("최대 단어 수 초과!");
       }
        //2)) 단어 중복체크
      if (containsKey(wordToLowerCase)){
          throw new DictionaryException("이미 등록되었습니다!");
      }
        put(wordToLowerCase,meaning);
    }

    // 검색
    public Map<String,String> finalByWord(String word){
        String wordToLowerCase = word.toLowerCase();
        Map<String,String> map = new HashMap<>();

        //1) 일치하는 단어를 검색
        if(map.containsKey(wordToLowerCase)){
            String meaning = get(wordToLowerCase);
            map.put(wordToLowerCase,meaning);
            return map;
        }
        //2) 일치하는 단어가 없을 경우. 즉, 범위경색 ex)sm
        String frontWord = wordToLowerCase.substring(0, wordToLowerCase.length() - 1);
        char lastLetter = wordToLowerCase.charAt(wordToLowerCase.length()-1); //단어의 마지막
        char nextLetter = (char)(lastLetter +1); //'t'
        String nextForntWord = frontWord+ String.valueOf(nextLetter);
        map = subMap(wordToLowerCase,true,String.valueOf(frontWord+nextLetter),false);

        //3) 범위검색에도 포함되지 않으면
        if (map.size() == 0){
            throw new DictionaryException("검색하고자 하는 단어가 없습니다.");
        }
        return map;

    }

    //수정
    public void update(String word,String meaning) {
        boolean flag = false;
        String wordToLowerCase = word.toLowerCase();

        if (replace(word, meaning) == null) {
            throw new DictionaryException("수정하고자 하는 단어가 없습니다");
        } else {
            flag = true;
        }
        return flag;
    }

    //삭제
    public boolean delete(String word){
        boolean flag = false;
        String wordToLowerCase = word.toLowerCase();

        if(remove(word) == null){
            throw new DictionaryException("삭제하고자 하는 단어가 없습니다");
        }else {
            flag = true;
        }
        return flag;
    }


    //목록
    public Map<String, String> listAll(int sort){
        Map<String, String> map = null;
        switch (sort){
            case ASC_SORT : //오름차순
                map = this;
                break;
            case DESC_SORT:_SORT : // 내림차순
            map =    this.descendingMap();
                break;
            default:
                throw new DictionaryException("정렬방법이 잘못 지정되었습니다. (1. 오름차순, 2.내림차순)");
        }
        return this;
    }

    //색인
    public Map<String,String> index(char ch){
        char nextLetter = (char) (ch +1);
        Map<String,String> map=subMap(String.valueOf(ch),true,String.valueOf(nextLetter), false);
        if (map.size() == 0){
            throw new DictionaryException("입력된 초성값으로 시작하는 단어가 없습니다");
        }
        return map;
    }

    //통계
    public void showWordStatics(){
        String info = "";
        info += "1. 저장된 단어의 갯수 : " + size() + "\n";
        info += "2. 단어의 문자수가 가장 많은 단어 :" + getMostCharactorCount() + "\n";
        info += "3. 단어 글자수 내림차순 출력(단어만):"+ decendingByLengthofWord() + "\n";

        return info;
    }

    private String decendingByLengthofWord() {
        Set<String> words = keySet();
    }

    //2. 단어의 문자수가 가장 많은 단어
    private String getMostCharactorCount(){
        Set<String> words = keySet();

        int maxLength = 0;
        String theLongestWord = "";
        for (String word : words){
           if (maxLength < word.length()){
               maxLength = word.length();
               theLongestWord = word;
           }
        }
        return  theLongestWord;
    }

    //3. 단어 글자수 내림차순  출력(단어만)
    private String decendingByLengthOfWord() {
        String str = "";
        // TreeMap의 정렬기준을 생성자들 통해 개발자 의도대로 변경할 수 있다.
        TreeMap<String, String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = 1;
                if (o1.length() > o2.length()) {
                    result = -1; // 음수
                } else if (o1.length() < o2.length()) {
                    result = 1; //양수
                }
                return result;
            }
        });
        map.putAll(this);   // 새로 정의된 맵으로 재정렬
        for (String word : map.keySet()) {
            str += word + "\n";
        }
    return str;


    //초기값
    public void init(){
        put("student", "학생");
        put("teacher", "교사");
        put("classroom", "교실");
        put("smart", "현명함");
        put("lunch","교사");
    }

}
