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
            boolean matches = true;
            for (var op : options.entrySet()) {
                if (op.getKey().equals("brand") && !laptop.getBrand().equals(op.getValue())) {
                    matches = false;
                } else if (op.getKey().equals("screenSize")
                        && laptop.getScreenSize() < Double.parseDouble(op.getValue())) {
                    matches = false;
                } else if (op.getKey().equals("cpuModel") && !laptop.getCpuModel().equals(op.getValue())) {
                    matches = false;
                } else if (op.getKey().equals("ramSize") && laptop.getRamSize() < Integer.parseInt(op.getValue())) {
                    matches = false;
                } else if (op.getKey().equals("hardDriveSize")
                        && laptop.getHardDriveSize() < Integer.parseInt(op.getValue())) {
                    matches = false;
                } else if (op.getKey().equals("operatingSystem")
                        && !laptop.getOperatingSystem().equals(op.getValue())) {
                    matches = false;
                } else if (op.getKey().equals("color") && !laptop.getColor().equals(op.getValue())) {
                    matches = false;
                }
            }

            if (matches) {
                resSet.add(laptop);
            }
        }

        return resSet;
    }
}