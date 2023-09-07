package day11.quiz8_2;

public class CdMain {
    public static void main(String[] args) {
        CD cd1 = new CD("운명","베토벤",1500);
        System.out.println(cd1);

        CD cd2 = new CD("월광","베토벤", 2000);
        System.out.println(cd2);

        cd1.setArtist("모짜르트");
        System.out.println(cd1);

    }
}
