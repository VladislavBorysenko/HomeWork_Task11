package home_work_task11.new_year_present.model;

public class Snikers extends ChocolateSweet{

    public Snikers(double weight, double massOfSugar) {
        super(weight, massOfSugar);
    }

    @Override
    public String toString() {
        return "Snikers{" +
                "weight=" + weight +
                ", massOfSugar=" + massOfSugar +
                '}';
    }
}
