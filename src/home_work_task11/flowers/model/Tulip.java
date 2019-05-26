package home_work_task11.flowers.model;

public class Tulip extends Flowers {
    public Tulip (int price,int stemLength,String freshness) {
        super(price, stemLength, freshness);
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "price=" + price +
                ", stemLength=" + stemLength +
                ", freshness='" + freshness + '\'' +
                '}';
    }
}
