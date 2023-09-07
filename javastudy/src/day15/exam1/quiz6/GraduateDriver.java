package day15.exam1.quiz6;

public class GraduateDriver {
    public static void main(String[] args) {
        //student
        UnGraduate student1 = null;
        Graduate student2 = null;
        Graduate student3 = null;

//        (1)	이름이 ‘길동’이고 학번이 1510인 학부생 객체를 생성하고 student1이 가리키게 한다.
        student1 = new UnGraduate("길동","1510");
//        (2)	student1의 소속동아리명을 '로봇'으로 변경한다
        student1.setClubName("로봇");
//        (3)	student1의 현재 상태를 출력한다.
        System.out.println(student1);
//        (4)	이름이 ‘선남’이고 학번이 1601인 대학원생 객체를 생성하고 student2가 가리키게 한다.
        student2= new Graduate("선남","1681");
//        (5)	student2의 조교유형을 '교육 조교'로 변경한다.
        student2.setAssistentType("교육조교");
//        (6)	student2의 장학금 비율을 1.0으로 변경한다.
        student2.setPayRate(1.0);
//        (7)	student2의 현 상태를 출력한다.
        System.out.println(student2);
//        (8)	이름이 ‘선녀’이고 학번이 1602인 대학원생 객체를 생성하고 student3이 가리키게 한다.
        student3 = new Graduate("선녀", "1602");
//        (9)	Student3의 조교유형을 '연구 조교'로 변경한다.
        student3.setAssistentType("연구조교");
//        (10)	Student3의 장학금 비율을 0.5로 변경한다.
        student3.setPayRate(0.5);
//        (11)	Student3의 현 상태를 출력한다.
        System.out.println(student3);

    }
}












































        //변수들
//	Student1 student1 = null;  //학부생 객체를 가리키는 참조 변수
//	Student2 student2 = null;  //학부생 객체를 가리키는 참조 변수
//	Student3 student3 = null;  //학부생 객체를 가리키는 참조 변수
//	  //대학원생 객체를 가리키는 참조 변수
//     //대학원생 객체를 가리키는 참조 변수
//
//
////                알고리즘
////        (1)	이름이 ‘길동’이고 학번이 1510인 학부생 객체를 생성하고 student1이 가리키게 한다.
//        student1 = new Student1("길동","1510","f");
////        (2)	student1의 소속동아리명을 '로봇'으로 변경한다
//        student1.setClub("로봇");
////        (3)	student1의 현재 상태를 출력한다.
//        System.out.println(student1);
////        (4)	이름이 ‘선남’이고 학번이 1601인 대학원생 객체를 생성하고 student2가 가리키게 한다.
//        student2 = new Student2("선남", "1601", 0.0,null);
////        (5)	student2의 조교유형을 '교육 조교'로 변경한다.
//        student2.setAssistentType("교육 조교");
////        (6)	student2의 장학금 비율을 1.0으로 변경한다.
//        student2.setPayRate(1.0);
////        (7)	student2의 현 상태를 출력한다.
//        System.out.println(student2);
////        (8)	이름이 ‘선녀’이고 학번이 1602인 대학원생 객체를 생성하고 student3이 가리키게 한다.
//        student3 = new Student3("선녀", "1602", 0.0,null);
////        (9)	Student3의 조교유형을 '연구 조교'로 변경한다.
//        student3.setAssistentType("연구 조교");
////        (10)	Student3의 장학금 비율을 0.5로 변경한다.
//        student3.setPayRate(0.5);
////        (11)	Student3의 현 상태를 출력한다.
//        System.out.println(student3);

//    }
//}
