package day3;

/*1~10까지의 짝수 합을 구하시오
for, while, do~while*/

public class Exam2 {

    public static void sumWithFor() {
        int sum = 0;

        for(int i = 0;i<=10;i=i+2){
            sum = sum + i;
        }
        System.out.println("Forsum=" + sum);
    }

    public static void sumWithWhile() {
        int sum = 0;
        int i = 0;
        while(i<=10){
            sum = sum+i;
            i=i+2;
        }
        System.out.println("whilesum=" +sum);
    }

    public static void sumWithDoWhile() {
        int sum=0;
        int i = 2;
        do{
            sum = sum+i;
            i=i+2;
        }while(i<=10);
        System.out.println("DoWhilesum="+sum);
    }


    public static void main(String[] args){
        sumWithFor();
        sumWithWhile();
        sumWithDoWhile();

    }
}
