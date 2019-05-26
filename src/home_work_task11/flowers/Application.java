package home_work_task11.flowers;

import home_work_task11.flowers.model.*;

public class Application {
    public static final int NUMBER_OF_FLOWERS=10;
    public static void main(String[] args) {

    }




    private static Flowers[] generateSweetsArray() {
        Flowers[] flowers = new Flowers[NUMBER_OF_FLOWERS];

        flowers[0] = new Tulip(10, 12,"medium");
        flowers[1] = new Chamomile(12,15,"small");
        flowers[2] = new Archidea(11,13,"large");
        flowers[3] = new Rose(9,11,"large");
        flowers[4] = new Violet(10, 10,"medium");
        flowers[5] = new Tulip(13,12,"small");
        flowers[6] = new Chamomile(10, 12,"medium");
        flowers[7] = new Rose(11, 11,"large");
        flowers[8] = new Archidea(8,14,"small");
        flowers[9] = new Tulip(9,14,"medium");

        return flowers;
    }
}
