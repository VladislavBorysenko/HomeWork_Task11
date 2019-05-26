package home_work_task11.flowers.model;

public class Rose extends Flowers{
    public Rose (int price,int stemLength,String freshness){
        super(price,stemLength,freshness);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "price=" + price +
                ", stemLength=" + stemLength +
                ", freshness='" + freshness + '\'' +
                '}';
    }
}
