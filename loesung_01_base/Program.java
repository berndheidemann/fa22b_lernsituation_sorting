package loesung_01_base;

import loesung_01_base.sortingAlgorithms.BubbleSort;
import loesung_01_base.sortingAlgorithms.InsertionSort;
import loesung_01_base.sortingAlgorithms.QuickSort;
import loesung_01_base.sortingAlgorithms.SelectionSort;

import java.util.List;

public class Program {


    public static void main(String[] args) {
        CSVReader reader = new CSVReader();
        List<Laptop> laptops = reader.readCSV("laptop_prices.csv");


        // measure time
        long start = System.currentTimeMillis();
        LaptopSorter sorter=new QuickSort();
        laptops=sorter.sort(laptops);
        long end=System.currentTimeMillis();
        System.out.println("Time taken: "+(end-start)+" ms");

        for (Laptop laptop : laptops.subList(0, 30)) {
            System.out.println(laptop);
        }
    }
}
