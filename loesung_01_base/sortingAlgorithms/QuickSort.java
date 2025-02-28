package loesung_01_base.sortingAlgorithms;

import loesung_01_base.Laptop;
import loesung_01_base.LaptopSorter;

import java.util.List;

public class QuickSort implements LaptopSorter {

    @Override
    public List<Laptop> sort(List<Laptop> laptops) {
        // sort the list
        quickSort(laptops, 0, laptops.size() - 1);
        return laptops;
    }

    private void quickSort(List<Laptop> laptops, int start, int end) {
        if (start < end) {
            // partition the list in two parts
            // to the left: all laptops with a price less than the pivot
            // to the right: all laptops with a price greater than the pivot
            int pivotIndex = partition(laptops, start, end);
            // sort the left part (recursively)
            quickSort(laptops, start, pivotIndex - 1);
            // sort the right part (recursively)
            quickSort(laptops, pivotIndex + 1, end);
        }
    }

    /**
     * This method partitions the list of laptops into two parts,
     * such that all laptops with a price less than the pivot are on the left side of the pivot,
     * and all laptops with a price greater than the pivot are on the right side of the pivot.
     * The pivot is the last element in the list.
     */
    private int partition(List<Laptop> laptops, int start, int end) {
        Laptop pivot = laptops.get(end);
        // i is the index of the last element with a price less than the pivot
        // at the beginning, there are no elements with a price less than the pivot
        // so we set i to start - 1
        int i = start - 1;
        // iterate over the list, and move all laptops with a price less than the pivot to the left side of the pivot
        for (int j = start; j < end; j++) {
            if (laptops.get(j).getPrice() < pivot.getPrice()) {
                i++;
                swap(laptops, i, j);
            }
        }
        // move the pivot to its correct position
        swap(laptops, i + 1, end);
        return i + 1;
    }

    private void swap(List<Laptop> laptops, int i, int j) {
        Laptop temp = laptops.get(i);
        laptops.set(i, laptops.get(j));
        laptops.set(j, temp);
    }
}
