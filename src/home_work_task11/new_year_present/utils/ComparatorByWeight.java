package home_work_task11.new_year_present.utils;

import home_work_task11.new_year_present.model.Sweet;

import java.util.Comparator;

public class ComparatorByWeight implements Comparator {

    public int compare(Object o1, Object o2) {
        return (int) (((Sweet) o1).getWeight() - ((Sweet) o2).getWeight());
    }
}