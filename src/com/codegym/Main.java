package com.codegym;

public class Main {

    public static void main(String[] args) {
	SortedList sortedList = new SortedList();
    sortedList.add("Java");
    sortedList.add("PHP");
    sortedList.add("c#");
    sortedList.add("Python");


    sortedList.setStrategy(new QuickSort());
    sortedList.sort();

    sortedList.setStrategy(new MergeSort());
    sortedList.sort();
    }
}
