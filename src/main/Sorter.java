package main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/** Contains static methods to sort Data[] */
public class Sorter {
    
    public static Date[] sortByTime(Date[] dates) {
        Arrays.sort(dates);
        return dates;
    }
}

class TimeComparator implements Comparator<Data> {

    private final String matching;

    TimeComparator(String s) {
        this.matching = s;
    }

    @Override
    public int compare(Data o1, Data o2) {
        return 0;
    }
}