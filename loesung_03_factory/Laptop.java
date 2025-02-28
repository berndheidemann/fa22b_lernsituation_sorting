package loesung_03_factory;


public class Laptop {

    // Brand,Processor,RAM (GB),Storage,GPU,Screen Size (inch),Resolution,Battery Life (hours),Weight (kg),Operating System,Price ($)
    private String brand;
    private String processor;
    private int ram;
    private String storage;
    private String gpu;
    private double screenSize;
    private String resolution;
    private float batteryLife;
    private double weight;
    private String operatingSystem;
    private float price;


    public Laptop(String brand, String processor, int ram, String storage, String gpu, double screenSize, String resolution, float batteryLife, double weight, String operatingSystem, float price) {
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.batteryLife = batteryLife;
        this.weight = weight;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGpu() {
        return gpu;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public float getBatteryLife() {
        return batteryLife;
    }

    public double getWeight() {
        return weight;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public float getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", gpu='" + gpu + '\'' +
                ", screenSize=" + screenSize +
                ", resolution='" + resolution + '\'' +
                ", batteryLife=" + batteryLife +
                ", weight=" + weight +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
