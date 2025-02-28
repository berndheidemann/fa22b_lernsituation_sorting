package loesung_03_factory.sortingAlgorithms;
import loesung_03_factory.Laptop;
import loesung_03_factory.SortingAlgorithm;

import java.util.List;

public class BubbleSort implements SortingAlgorithm {


    @Override
    public List<Laptop> sort(List<Laptop> laptops) {

        boolean switched=true;
        while(switched) {
            switched=false;
            for(int i=0;i<laptops.size()-1;i++) {
                var currentLaptop=laptops.get(i);
                var nextLaptop=laptops.get(i+1);
                if (currentLaptop.getPrice()>nextLaptop.getPrice()) {
                    laptops.set(i,nextLaptop);
                    laptops.set(i+1,currentLaptop);
                    switched=true;
                }
            }
        }

        return laptops;

    }
}
