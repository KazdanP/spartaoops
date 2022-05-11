package com.sparta.oop.bubbles;

public class Bubbles {

    public static int[] bubbleBubbles(int[] toSort) {

        int counter = 1;

        for (int j = 0; j <= toSort.length; j++) {
            for (int i = 0; i < toSort.length - 1 - j; i++) {
                int first = toSort[i];
                int second = toSort[i + 1];

                if (first > second) {
                    toSort[i]  = second;
                    toSort[i + 1] = first;
                }
                counter++;
            }
        }

        System.out.println("Times ran: " + counter);

        return toSort;
    }

}
