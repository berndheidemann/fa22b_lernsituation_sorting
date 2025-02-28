package loesung_03_factory.sortingAlgorithms;

import loesung_03_factory.SortingAlgorithm;

public class SortingAlgorithmFactory {

    public static SortingAlgorithm createSortingAlgorithm(String algorithm) {
        switch (algorithm) {
            case "BubbleSort":
                return new BubbleSort();
            case "QuickSort":
                return new QuickSort();
            case "SelectionSort":
                return new SelectionSort();
            case "InsertionSort":
                return new InsertionSort();
            default:
                throw new IllegalArgumentException("Unknown sorting algorithm: " + algorithm);
        }
    }
}
