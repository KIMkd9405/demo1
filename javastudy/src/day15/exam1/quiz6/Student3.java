package day15.exam1.quiz6;

public class Student3 {
    private String name;
    private  String number;
    private double	PayRate;
    private String AssistentType;

    public Student3(String name, String number, double payRate, String assistentType) {
        this.name = name;
        this.number = number;
        PayRate = payRate;
        AssistentType = assistentType;
    }

    @Override
    public String toString() {
        return "Student3{" +
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

    public void setPayRate(double payRate) {
        PayRate = payRate;
    }

    public void setAssistentType(String assistentType) {
        AssistentType = assistentType;
    }
}
