import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LaptopRepository {
    private Set<Laptop> laptopsSet = new HashSet<>();

    public void addLaptop(Laptop laptop) {
        laptopsSet.add(laptop);
    }

    public Set<Laptop> getAllLaptops() {
        return laptopsSet;
    }

    public Set<Laptop> filterLaptops(Map<String, String> options) {
        Set<Laptop> resSet = new HashSet<>();

        for (Laptop laptop : laptopsSet) {
            for (var op : options.entrySet()) {
                boolean matches = true;
                if (op.getKey() == "brand" && laptop.getBrand() != op.getValue()) {
                    matches = false;
                } else if (op.getKey() == "model" && !laptop.getModel().equals(op.getValue())) {
                    matches = false;
                } else if (op.getKey() == "screenSize" && laptop.getScreenSize() < Double.parseDouble(op.getValue())) {
                    matches = false;
                } else if (op.getKey() == "cpuModel" && !laptop.getCpuModel().equals(op.getValue())) {
                    matches = false;
                } else if (op.getKey() == "ramSize" && laptop.getRamSize() < Integer.parseInt(op.getValue())) {
                    matches = false;
                } else if (op.getKey() == "hardDriveSize"
                        && laptop.getHardDriveSize() < Integer.parseInt(op.getValue())) {
                    matches = false;
                } else if (op.getKey() == "graphicsCardType" && !laptop.getGraphicsCardType().equals(op.getValue())) {
                    matches = false;
                } else if (op.getKey() == "graphicsCardModel" && !laptop.getGraphicsCardModel().equals(op.getValue())) {
                    matches = false;
                } else if (op.getKey() == "operatingSystem" && !laptop.getOperatingSystem().equals(op.getValue())) {
                    matches = false;
                } else if (op.getKey() == "color" && !laptop.getColor().equals(op.getValue())) {
                    matches = false;
                } else if (op.getKey() == "price" && laptop.getPrice() >= Double.parseDouble(op.getValue())) {
                    matches = false;
                }

                if (matches) {
                    resSet.add(laptop);
                }
            }
        }

        return resSet;
    }
}