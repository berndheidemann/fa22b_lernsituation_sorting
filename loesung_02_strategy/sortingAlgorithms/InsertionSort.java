package loesung_02_strategy.sortingAlgorithms;

import loesung_02_strategy.Laptop;
import loesung_02_strategy.SortingAlgorithm;

import java.util.List;

public class InsertionSort implements SortingAlgorithm {
    @Override
    public List<Laptop> sort(List<Laptop> laptops) {
        // start at the second element (first element is already sorted)
        for (int i = 1; i < laptops.size(); i++) {
            Laptop toBeMoved = laptops.get(i);
            int j = i - 1; // start comparing with the element before i
            // compare toBeMoved with the elements before it, stop when we reach
            // the beginning of the list or when we find an element that is smaller than toBeMoved
            while (j >= 0 && laptops.get(j).getPrice() > toBeMoved.getPrice()) {
                // move the element at j to the right, to make space for toBeMoved
                laptops.set(j + 1, laptops.get(j));
                j = j - 1;
            }
            // insert toBeMoved in the correct position
            laptops.set(j + 1, toBeMoved);
        }
        return laptops;
    }
}
