package home_work_task11.flowers.model;

public abstract class Chamomile {
    int price;
    int stemLength;
    String freshness;

    public Chamomile(int price, int stemLength, String freshness) {
        this.price = price;
        this.stemLength = stemLength;
        this.freshness = freshness;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public String getFreshness() {
        return freshness;
    }

    public void setFreshness(String freshness) {
        this.freshness = freshness;
    }


}
