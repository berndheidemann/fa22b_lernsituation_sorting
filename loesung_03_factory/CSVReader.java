package loesung_03_factory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CSVReader {

    public List<Laptop> readCSV(String path) {

        List<Laptop> laptops = new ArrayList<>();

        // read the file and create a Laptop object for each line
        // add the Laptop object to the list
        try {
            Scanner scanner = new Scanner(new File(path));
            scanner.nextLine(); // skip the header
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String brand = parts[0];
                String processor = parts[1];
                int ram = Integer.parseInt(parts[2]);
                String storage = parts[3];
                String gpu = parts[4];
                double screenSize = Double.parseDouble(parts[5]);
                String resolution = parts[6];
                float batteryLife = Float.parseFloat(parts[7]);
                double weight = Double.parseDouble(parts[8]);
                String operatingSystem = parts[9];
                float price = Float.parseFloat(parts[10]);

                Laptop laptop = new Laptop(brand, processor, ram, storage, gpu, screenSize, resolution, batteryLife, weight, operatingSystem, price);
                laptops.add(laptop);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return laptops;
    }

}
