package day14.Person;

public class Main {
    public static void main(String[] args) {

//        Person p = new Person();
        Student s =new Student();
//        Person p = new Student();

        //상위 타입은 하위타입을 참조 할 수 있다.
        Person p = new Student();

        //하위 타입은 상위타입을 참조 할 수 없다
        //Student s2 = new Person)();

        int x =10;
        double y = 20.0;

        y= x; // 상위타입에 하위타입을 대입할 수 있다.
        // x = y; // 하위 타입에 상위타입을 대입 할 수 없다.

        x = (int)y; // 하지만 강제 형변환을 통해 대입 가능(주의 : 값손실방생)

        double z = 222222;

        short a = 10;  //10byte
        byte b = (byte)a; //10byte

        byte c = -123;
        byte d = (byte) -129;
        System.out.println("d="+d);

    }
}
