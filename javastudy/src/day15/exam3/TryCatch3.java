package day15.exam3;

public class TryCatch3 {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            }catch (Exception e){
            }
        }
    }
}
