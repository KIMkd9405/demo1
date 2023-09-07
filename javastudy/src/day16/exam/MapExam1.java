package day16.exam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapExam1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //요소추가
        map.put("홍길동" ,80);
        map.put("홍길서" ,90);
        map.put("홍길남" ,100);
        map.put("홍길동" ,70);
        System.out.println(map);

        //주어진 키와 동일한 요소(entry)가 있는지
        if(map.containsKey("홍길남")){
            System.out.println("있다");
        }else {
            System.out.println("없다");
        }

        //주어진 키의 값을 반환
        Integer score = map.get("홍길남");
        System.out.println("홍길남의 점수 :" + score);

        //컬렉션이 비어져 있는지
        if(map.isEmpty()){
            System.out.println("entry가 없다");
        }else {
            System.out.println("entry가 있다");
        }

        //요소(entry) 의 갯수
        System.out.println("요소의 갯우 : "+ map.size());
//
//        //모든키를 set객체에 담아 반환
//        Set<String> key = map.keySet();
//        System.out.println(keys);
//
//
//        //모든값을 collection에 담아 반환
//        Collection<Integer>values = map.values();
//        System.out.println(values);
//
//        //모든 엔트리(키값의 쌍)을 set 객체에 담아 반환
//        Set<Map.Entry<String,Integer>> entries = map.entrySet();
//        System.out.println(entries);

        //주어진 값과 돌일한 요소(entry)가 있는지
        if(map.containsValue(100)){
            System.out.println("100자가 있다");
        }else {
            System.out.println("100점 학생이 없다");
        }

        //요소삭제
        map.remove("홍길남");
        System.out.println(map);

        //대체
        map.replace("홍길서",100);
        System.out.println(map);
        map.put("홍길서", 90);
        System.out.println(map);
        map.replace("홍길서",90,70);
        System.out.println(map);




        //모든요소 삭제
        map.clear();
        System.out.println(map);

    }
}
