import java.util.Objects;

public class Laptop {
    private long id;
    private String brand;
    private String model;
    private double screenSize;
    private String cpuModel;
    private int ramSize;
    private int hardDriveSize;
    private String graphicsCardType;
    private String graphicsCardModel;
    private String operatingSystem;
    private String color;
    private double price;

    public Laptop(long id, String brand, String model, double screenSize, String cpuModel, int ramSize,
            int hardDriveSize, String graphicsCardType, String graphicsCardModel, String operatingSystem,
            String color, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.cpuModel = cpuModel;
        this.ramSize = ramSize;
        this.hardDriveSize = hardDriveSize;
        this.graphicsCardType = graphicsCardType;
        this.graphicsCardModel = graphicsCardModel;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public String getGraphicsCardType() {
        return graphicsCardType;
    }

    public String getGraphicsCardModel() {
        return graphicsCardModel;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public void setGraphicsCardType(String graphicsCardType) {
        this.graphicsCardType = graphicsCardType;
    }

    public void setGraphicsCardModel(String graphicsCardModel) {
        this.graphicsCardModel = graphicsCardModel;
    }

    public void SetOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String fmtStr = String.format("ID:%d %s %1.1f inches\tRAM: %2d CPU: %s - %1.2f₽", id, model, screenSize,
                ramSize, cpuModel, price);
        return fmtStr;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Laptop l = (Laptop) obj;
        return id == l.id && brand.equals(l.brand) && model.equals(l.model) && screenSize == l.screenSize &&
                cpuModel.equals(l.cpuModel) && ramSize == l.ramSize && hardDriveSize == l.hardDriveSize &&
                graphicsCardType.equals(l.graphicsCardType) && graphicsCardModel.equals(l.graphicsCardModel) &&
                operatingSystem.equals(l.operatingSystem) && color.equals(l.color) && price == l.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, screenSize, cpuModel, ramSize, hardDriveSize, graphicsCardType,
                graphicsCardModel, operatingSystem, color, price);
    }
}