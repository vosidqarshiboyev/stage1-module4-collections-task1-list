package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer>a=new LinkedList<>();
        for(Integer i:sourceList){
            if(i%2==0){
                a.addLast(i);
            }
            else {
                a.addFirst(i);
            }
        }
        return a;
    }
}
