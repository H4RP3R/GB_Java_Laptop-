import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UI {
    public void mainMenu(LaptopRepository laptopsRep) {
        Scanner iScanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Show catalog.");
            System.out.println("2. Set search options.");
            System.out.println("3. Exit.");
            System.out.print("Enter menu item number: ");
            String userInput = iScanner.nextLine();

            switch (userInput) {
                case "1":
                    printLaptopSet(laptopsRep.getAllLaptops());
                    break;

                case "2":
                    Map<String, String> filterOptions = getFilterOptions(iScanner);
                    Set<Laptop> filteredResult = laptopsRep.filterLaptops(filterOptions);
                    printLaptopSet(filteredResult);
                    break;

                case "3":
                    iScanner.close();
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }

    public Map<String, String> getFilterOptions(Scanner iScanner) {
        Map<String, String> filtOpt = new HashMap<>();
        System.out.println("\nEnter a value or leave the field blank");

        System.out.print("Brand: ");
        String brand = iScanner.nextLine();
        if (!brand.isEmpty()) {
            filtOpt.put("brand", brand);
        }

        System.out.print("Screen size: ");
        String screenSize = iScanner.nextLine();
        if (!screenSize.isEmpty()) {
            filtOpt.put("screenSize", screenSize);
        }

        System.out.print("CPU model: ");
        String cpuModel = iScanner.nextLine();
        if (!cpuModel.isEmpty()) {
            filtOpt.put("cpuModel", cpuModel);
        }

        System.out.print("RAM size: ");
        String ramSize = iScanner.nextLine();
        if (!ramSize.isEmpty()) {
            filtOpt.put("ramSize", ramSize);
        }

        System.out.print("Hard drive size: ");
        String hardDriveSize = iScanner.nextLine();
        if (!hardDriveSize.isEmpty()) {
            filtOpt.put("hardDriveSize", hardDriveSize);
        }

        System.out.print("OS: ");
        String operatingSystem = iScanner.nextLine();
        if (!operatingSystem.isEmpty()) {
            filtOpt.put("operatingSystem", operatingSystem);
        }

        System.out.print("Color: ");
        String color = iScanner.nextLine();
        if (!color.isEmpty()) {
            filtOpt.put("color", color);
        }

        return filtOpt;
    }

    public void printLaptopSet(Set<Laptop> laptops) {
        System.out.println();

        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
}