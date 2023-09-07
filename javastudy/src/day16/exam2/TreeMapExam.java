package day16.exam2;

import java.util.*;

public class TreeMapExam {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for (int i = 20; i > 0; i -= 2) {
            treeMap.put(i, i + "번째 데이터");
        }
        System.out.println(treeMap);

        // key가 8-12구간 추출
        //case1)
        SortedMap<Integer, String>sortedMap=treeMap.subMap(8,14);
        System.out.println(sortedMap);

        //case2)
        sortedMap = treeMap.subMap(8,true,12,false);
        System.out.println(sortedMap);

        sortedMap = treeMap.subMap(8,false,12,false);
        System.out.println(sortedMap);

        //정렬
        NavigableSet<Integer> descendingOfTreeMap = treeMap.descendingKeySet();
        System.out.println(descendingOfTreeMap);

        NavigableMap<Integer, String> descendingOfTreeMap2 = treeMap.descendingMap();
        System.out.println(descendingOfTreeMap2);
        for(Integer key : descendingOfTreeMap2.keySet()){
            System.out.println(key + " : " + treeMap.get(key));
        }


        descendingOfTreeMap2 = descendingOfTreeMap2.descendingMap();
        System.out.println(descendingOfTreeMap2);




//    //1.firstKey()
//        System.out.println(treeMap.firstKey());   // 2
//
//    //2. firstEntry()
//        System.out.println(treeMap.firstEntry());  // 2=2번째 데이터
//
//    //3.lastKey()
//        System.out.println(treeMap.lastKey());    // 20
//
//    //4.lastEntry
//        System.out.println(treeMap.lastEntry());  // 20 = 20번째 데이터
//
//     //5.lowerKey
//        System.out.println(treeMap.lowerKey(11));  //10
//        System.out.println(treeMap.lowerKey(10));  //8
//
//     //6. higherKey
//        System.out.println(treeMap.higherKey(11));  // 12
//        System.out.println(treeMap.higherKey(10));  // 12
//
//     //7. pllFirstEntry()
//        System.out.println(treeMap.pollFirstEntry());
//        System.out.println(treeMap.toString());
//
//    //8. pollLastEntry()
//        System.out.println(treeMap.pollLastEntry());
//        System.out.println(treeMap.toString());
//
//     //9.SortedMap<K, V> headMap(K toKey)
//        SortedMap<Integer, String> sortedMap = treeMap.headMap(8);
//        System.out.println(sortedMap);  // {4=4번쨰 데이터 , 6=6번쨰 데이터}
//
//        //10.NavigableMap<K, V> headMap(K tpKey, boolean inclusive)
//        NavigableMap<Integer,String> navigableMap = treeMap.headMap(8,true);
//        System.out.println(navigableMap); // {4=4번쨰 데이터 , 6=6번쨰 데이터 , 8=8번쨰 데이터}
//
//        //11. SortedMap<K, V> tailMap(K toKey)
//        sortedMap = treeMap.tailMap(14);
//        System.out.println(sortedMap);    //{14=14번쨰 데이터 , 16=16번쨰 데이터 , 18=18번쨰 데이터}
//
//        //12.NavigableMap<K, V> tail Map (K toKey , boolean inclusive)
//        navigableMap = treeMap.tailMap(14,false);
//        System.out.println(navigableMap);  // {16=16번쨰 데이터 , 18=18번쨰 데이터}
//
//        //13. SortedMap<K, V> subMap(K fromKey, K toKey)
//        sortedMap = treeMap.subMap(6,10);
//        System.out.println(sortedMap);
//
//        //14. NavigableMap<K, V> subMap(K fromKey, boolean frominclusive, K toKey, boolean toinclusive)
//        navigableMap = treeMap.subMap(6,false,10,true);
//        System.out.println(navigableMap); // {8 = 8번쨰 데이터 , 10 = 10번쨰 데이터}
//
//        //15.NavigableSet<K> descendingKeySet()
//        NavigableSet<Integer>navigableSet = treeMap.descendingKeySet();
//        System.out.println(navigableSet);                          //[18, 16, 14, ... ,4]
//        System.out.println(navigableSet.descendingSet());         //[4, 6, 8, ..., 18]
//
//        //16. NavigableMap<K, V> descendingMap()
//        navigableMap = treeMap.descendingMap();
//        System.out.println(navigableMap);  // {18=18번쨰 데이터 , 16=16번쨰 데이터... , 4=4번째 데이터}
//
//        System.out.println(navigableMap.descendingMap());
//        // {4=4번쨰 데이터 , 6=6번쨰 데이터... , 18=18번째 데이터}
//
//


    }
}
