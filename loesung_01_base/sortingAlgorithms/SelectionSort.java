package loesung_01_base.sortingAlgorithms;

import loesung_01_base.Laptop;
import loesung_01_base.LaptopSorter;

import java.util.List;

public class SelectionSort implements LaptopSorter {


    @Override
    public List<Laptop> sort(List<Laptop> laptops) {
        for (int i = 0; i < laptops.size() - 1; i++) {
            int minIndex = i; // index of the minimum element
            for (int j = i + 1; j < laptops.size(); j++) {
                if (laptops.get(j).getPrice() < laptops.get(minIndex).getPrice()) {
                    minIndex = j;
                }
            }
            // minIndex is now the index of the minimum element
            // swap the elements at i and minIndex
            Laptop temp = laptops.get(i);
            laptops.set(i, laptops.get(minIndex));
            laptops.set(minIndex, temp);
        }
        return laptops;
    }
}
