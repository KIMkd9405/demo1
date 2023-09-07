package day15.exam1.quiz6;

public class Graduate extends Student{
// 변수들
    private String AssistentType; //대학원생의 조교 유형
    private double	PayRate; // 대학원생의 장학금 비율

//-	메소드
//	생성자메소드: 대학원생의 이름, 학번을 각각 주어진 값으로 초기화하면서 Graduate 객체를 생성한다

    public Graduate(String name, String number) {
        super(name,number);
    }

//	getAssistentType: 대학원생의 조교 유형을 반환한다

    public String getAssistentType() {
        return AssistentType;
    }


//	getPayRate: 대학원생의 장학금 비율을 반환한다

    public double getPayRate() {
        return PayRate;
    }

//	toString: 대학원생의 현재 상태를 반환한다

    @Override
    public String toString() {
        return "Graduate{" +
                "이름/학번 =" + super.toString() +
                "AssistentType='" + AssistentType + '\'' +
                ", PayRate=" + PayRate +
                '}';
    }

//	setAssistentType: 대학원생의 조교 유형을 주어진 값으로 변경한다

    public void setAssistentType(String assistentType) {
        AssistentType = assistentType;
    }

//	setPayRate: 대학원생의 장학금 비율을 주어진 값으로 변경한다

    public void setPayRate(double payRate) {
        PayRate = payRate;
    }


}
