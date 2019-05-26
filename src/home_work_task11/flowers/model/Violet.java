package home_work_task11.flowers.model;

public class Violet extends Flowers{
    public Violet (int price,int stemLength,String freshness) {
        super(price, stemLength, freshness);
    }

    @Override
    public String toString() {
        return "Violet{" +
                "price=" + price +
                ", stemLength=" + stemLength +
                ", freshness='" + freshness + '\'' +
                '}';
    }
}
