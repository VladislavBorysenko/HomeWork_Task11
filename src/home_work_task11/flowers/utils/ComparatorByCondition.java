package home_work_task11.flowers.utils;

import home_work_task11.flowers.model.Flowers;

import java.util.Comparator;

public class ComparatorByCondition implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return  ((Flowers) o1).getFreshness().compareTo(((Flowers) o2).getFreshness());

    }
}
