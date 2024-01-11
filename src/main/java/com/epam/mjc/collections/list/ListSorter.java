package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if((Integer.parseInt(a)*Integer.parseInt(a))*5+3>(Integer.parseInt(b)*Integer.parseInt(b))*5+3){
            return 1;
        }
        return -1;
    }
}
