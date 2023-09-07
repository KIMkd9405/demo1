package day2;

public class Exam6 {
    public static void main(String[] args){
        int x = (int)(Math.random() * 100) + 1;
        int y = (int)(Math.random() * 100) + 1;
        int z = (int)(Math.random() * 100) + 1;

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);

        int max = x;
        if(max < y) {
            max = y;
        }
        if(max < z) {
            max = z;
        }
        System.out.println("최대값="+max);
    }

}
