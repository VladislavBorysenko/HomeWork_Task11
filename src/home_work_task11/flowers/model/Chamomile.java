package home_work_task11.flowers.model;

public  class Chamomile extends Flowers {
    public Chamomile(int price,int stemLength,String freshness){
        super(price,stemLength,freshness);
    }

    @Override
    public String toString() {
        return "Chamomile{" +
                "price=" + price +
                ", stemLength=" + stemLength +
                ", freshness='" + freshness + '\'' +
                '}';
    }
}
