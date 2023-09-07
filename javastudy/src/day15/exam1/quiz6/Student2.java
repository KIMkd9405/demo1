package day15.exam1.quiz6;

public class Student2 {

    private String name;
    private  String number;
    private double	PayRate;
    private String AssistentType;

    public Student2(String name, String number, double payRate, String assistentType) {
        this.name = name;
        this.number = number;
        PayRate = payRate;
        AssistentType = assistentType;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", PayRate=" + PayRate +
                ", AssistentType='" + AssistentType + '\'' +
                '}';
    }

    public double getPayRate() {
        return PayRate;
    }

    public String getAssistentType() {
        return AssistentType;
    }

    public void setAssistentType(String assistentType) {
        AssistentType = assistentType;
    }

    public void setPayRate(double payRate) {
        PayRate = payRate;
    }
}
