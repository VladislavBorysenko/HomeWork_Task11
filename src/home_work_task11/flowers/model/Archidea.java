package home_work_task11.flowers.model;

public class Archidea extends Flowers {
    public Archidea (int price,int stemLength,String freshness){
        super(price,stemLength,freshness);
    }

    @Override
    public String toString() {
        return "Archidea{" +
                "price=" + price +
                ", stemLength=" + stemLength +
                ", freshness='" + freshness + '\'' +
                '}';
    }
}
