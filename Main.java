import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final int PARAMETERS_NUMBER = 12;

    static List<List<String>> readCsv(String path) {
        List<List<String>> laptopList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(path))) {
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            while (scanner.hasNextLine()) {
                laptopList.add(readLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        return laptopList;
    }

    static List<String> readLine(String line) {
        List<String> valuesList = new ArrayList<>();

        try (Scanner scanner = new Scanner(line)) {
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                valuesList.add(scanner.next());
            }
        } catch (Exception e) {
            System.err.println(e);
        }

        return valuesList;
    }

    public static void main(String[] args) {
        List<List<String>> laptopList = readCsv("laptops.csv");
        LaptopRepository laptopRep = new LaptopRepository();

        for (var parameters : laptopList) {
            if (parameters.size() == PARAMETERS_NUMBER) {
                long id = Long.parseLong(parameters.get(0));
                String brand = parameters.get(1);
                String model = parameters.get(2);
                double screenSize = Double.parseDouble(parameters.get(3));
                String cpuModel = parameters.get(4);
                int ramSize = Integer.parseInt(parameters.get(5));
                int hardDriveSize = Integer.parseInt(parameters.get(6));
                String graphicsCardType = parameters.get(7);
                String graphicsCardModel = parameters.get(8);
                String operatingSystem = parameters.get(9);
                String color = parameters.get(10);
                double price = Double.parseDouble(parameters.get(11));

                laptopRep.addLaptop(new Laptop(id, brand, model, screenSize, cpuModel, ramSize,
                        hardDriveSize, graphicsCardType,
                        graphicsCardModel, operatingSystem, color, price));
            }
        }

        UI ui = new UI();
        ui.mainMenu(laptopRep);
        // while (true) {
        // ui.mainMenu(laptopRep);
        // }
    }
}