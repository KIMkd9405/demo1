package day11.quiz78;

public class Employee {
//    변수들
// name: 이름
    private String name;

// jdn: 주민등록번호
    private String jdn;
// 	position: 직위
    private String position;
// 	hourlyWages: 시간당 임금
    private int hourlyWages;

//    메소드들
// 	getPay: 임금을 계산한다
    public double getPay(int hour) {
        double pay = 0;
        if (hour < 0) return 0;

        if(hour <= 40) {
            pay = hour * hourlyWages;
        }else {
         pay = hour * hourlyWages * 1.5;
        }

        return pay;
    }

// 	raise: 시간당 임금을 증감한다

    public void raise(int hourlyWages ){
        this.hourlyWages += hourlyWages;  // this.hoursWages = this.hoursWages + hoursWages
    }


}
