package loesung_03_factory;

import loesung_03_factory.sortingAlgorithms.BubbleSort;
import loesung_03_factory.sortingAlgorithms.SortingAlgorithmFactory;

import java.util.List;

public class LaptopSorter {

    private SortingAlgorithm laptopSorter;

    public LaptopSorter() {
        this.laptopSorter = SortingAlgorithmFactory.createSortingAlgorithm("BubbleSort");
    }

    public void setLaptopSorter(SortingAlgorithm laptopSorter) {
        this.laptopSorter = laptopSorter;
    }

    public List<Laptop> sort(List<Laptop> laptops) {
        return laptopSorter.sort(laptops);
    }

}
