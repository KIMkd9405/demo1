package day3;
/*
 1~10 까지의 합을 구하시오
 for, while, do~while
 */
public class Exam1 {
    public static void sumWithFor() {
        int sum = 0; //지역변수 : 메소트 내에 선언된 변수
        for(int i=1; i <=10; i++){
            //sum = sum+i;
            sum+=i;
        }
        System.out.println("sum=" +sum);
    }
    public static void sumWithWhile() {
        int sum = 0;
        int i = 1;
        while(i <=10){
            sum+=i;
            i++;
        }
        System.out.println("sum="+sum);

    }
    public static void sumWithDoWhile() {
        int sum = 0;
        int i = 1;

        do{
            sum = sum + i;
            i++;
        } while(i<=10);
        System.out.println("sum=" + sum);

    }

    public static void main(String[] args) {
        sumWithFor();
        sumWithWhile();
        sumWithDoWhile();
    }
}
