package day12.quiz10;

public class Scout {

    private String name; //이름
    private  int boxesSold; //판매 상자 수

    public Scout(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void  updateSales(int boxesSold){
        this.boxesSold += boxesSold;
    }

    @Override
    public String toString() {
        return "Scout{" +
                "name='" + name + '\'' +
                ", boxesSold=" + boxesSold +
                '}';
    }
}
