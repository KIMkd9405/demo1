package day11.quiz8_5;

public class Main {
    public static void main(String[] args) {
        Die d1 = new Die ();
        Die d2 = new Die();
//        int[] x = new int[] {1,2,3};
//        String[] name = new String[]{"홍길동1,홍길동2"};
//        String[] name2 = new String[]{("홍길동1),(홍길동2")};
        Die[] dies = new Die[2];
        dies[0] = d1;
       dies[1] = d2;

       //사람 생성
        Person p1 = new Person();
        // 사람 -> 주사위
        p1.setDie(dies);

        //사람이 주사위 굴리기
        p1.rollDies();
        dies = p1.getDies();
        for (int i = 0; i < dies.length; i++) {
            System.out.print(dies[i].getFaceValue()+",");
        }

        System.out.println();

        p1.rollDies();
        dies = p1.getDies();
        for (int i = 0; i < dies.length; i++) {
            System.out.print(dies[i].getFaceValue()+",");
        }
        System.out.println();
    }
}
