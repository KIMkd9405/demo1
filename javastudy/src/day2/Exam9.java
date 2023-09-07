package day2;

public class Exam9 {
    public static void main(String[] args){
//        int x = 10;
//        x = x +1; // x++(증감후위), ++x(증감전위)
//        System.out.println("x="+x);
//        x++;  // x=x+1
//        System.out.println("x="+x);
//        ++x;  //x=x+1
//        System.out.println("x="+x);
//        x--;  // X=X-1
//        System.out.println("x="+x);
//        --x;  // x=x-1
//        System.out.println("x="+x);
//
//        int z = 1 + ++x;
//        System.out.println("x="+x);
//        System.out.println("z=" +z);



        int x = 10;
        x = x +1; // x++(증감후위), ++x(증감전위)
        System.out.println("x="+x);
        x++;  // x=x+1
        System.out.println("x="+x);
        ++x;  //x=x+1
        System.out.println("x="+x);
        x--;  // X=X-1
        System.out.println("x="+x);
        --x;  // x=x-1
        System.out.println("x="+x);

        int z = 1 + x++;
        System.out.println("x="+x);
        System.out.println("z=" +z);
}

}