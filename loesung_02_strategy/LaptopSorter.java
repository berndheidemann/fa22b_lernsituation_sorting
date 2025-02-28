package loesung_02_strategy;

import loesung_02_strategy.sortingAlgorithms.BubbleSort;

import java.util.List;

public class LaptopSorter {

    private SortingAlgorithm laptopSorter;

    public LaptopSorter() {
        this.laptopSorter = new BubbleSort();
    }

    public void setLaptopSorter(SortingAlgorithm laptopSorter) {
        this.laptopSorter = laptopSorter;
    }

    public List<Laptop> sort(List<Laptop> laptops) {
        return laptopSorter.sort(laptops);
    }

}
