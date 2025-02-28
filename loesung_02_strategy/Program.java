package loesung_02_strategy;

import loesung_02_strategy.sortingAlgorithms.InsertionSort;
import loesung_02_strategy.sortingAlgorithms.QuickSort;
import loesung_02_strategy.sortingAlgorithms.SelectionSort;

import java.util.List;

public class Program {


    public static void main(String[] args) {
        CSVReader reader = new CSVReader();
        List<Laptop> laptops = reader.readCSV("laptop_prices.csv");

        LaptopSorter sorter=new LaptopSorter();

        long start = System.currentTimeMillis();
        laptops=sorter.sort(laptops);
        long end=System.currentTimeMillis();
        System.out.println("Time taken (Bubble Sort): "+(end-start)+" ms");

        laptops = reader.readCSV("laptop_prices.csv");
        sorter.setLaptopSorter(new SelectionSort());
        start=System.currentTimeMillis();
        laptops=sorter.sort(laptops);
        end=System.currentTimeMillis();
        System.out.println("Time taken (Selection Sort): "+(end-start)+" ms");


        laptops = reader.readCSV("laptop_prices.csv");
        sorter.setLaptopSorter(new InsertionSort());
        start=System.currentTimeMillis();
        laptops=sorter.sort(laptops);
        end=System.currentTimeMillis();
        System.out.println("Time taken (Insertion Sort): "+(end-start)+" ms");


        laptops = reader.readCSV("laptop_prices.csv");
        sorter.setLaptopSorter(new QuickSort());
        start=System.currentTimeMillis();
        laptops=sorter.sort(laptops);
        end=System.currentTimeMillis();
        System.out.println("Time taken (Quick Sort): "+(end-start)+" ms");


        for (Laptop laptop : laptops.subList(0, 30)) {
            System.out.println(laptop);
        }
    }
}
