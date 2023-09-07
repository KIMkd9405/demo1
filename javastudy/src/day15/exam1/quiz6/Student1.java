package day15.exam1.quiz6;

public class Student1 {

    private String name = null;
    private  String number = null;
    private String club = null;

    public Student1(String name, String number, String club) {
        this.name = name;
        this.number = number;
        this.club = club;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", club='" + club + '\'' +
                '}';
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
