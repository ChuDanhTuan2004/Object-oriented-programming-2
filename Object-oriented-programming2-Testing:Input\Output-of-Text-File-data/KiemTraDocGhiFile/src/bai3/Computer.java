package bai3;

import java.io.*;

public class Computer {
    private String code;
    private String name;
    private String manufacturer;
    private String systemConfig;
    private double price;
    private boolean state;

    public Computer() {
        this.code = "";
        this.name = "";
        this.manufacturer = "";
        this.systemConfig = "";
        this.price = 0;
        this.state = true;
    }

    public Computer(String code, String name, String manufacturer, String systemConfig, double price, boolean state) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.systemConfig = systemConfig;
        this.price = price;
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSystemConfig() {
        return systemConfig;
    }

    public void setSystemConfig(String systemConfig) {
        this.systemConfig = systemConfig;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    // thêm 1 máy tính vào danh sách
    public void addComputerToArray(Computer[] arrayComputers, Computer computer) {
        int length = arrayComputers.length;
        Computer[] largerArray = new Computer[length + 1];
        System.arraycopy(arrayComputers, 0, largerArray, 0, length);
        largerArray[length] = computer;
        arrayComputers = largerArray;
    }

    // lưu 1 máy tính vào file
    public void addComputerToFile(String fileName, Computer computer) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(computer.getCode() + "," + computer.getName() + "," + computer.getManufacturer() + "," +
                    computer.getSystemConfig() + "," + computer.getPrice() + "," + computer.isState());
            printWriter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    // trả về thông tin của 1 file
    public String getDataFromFile(String fileName) {
        StringBuilder data = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                data.append(line + "\n");
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file " + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file " + fileName + "'");
        }
        return data.toString();
    }

    // lưu danh sách máy tính vào file
    public void addComputersToFile(String fileName, Computer[] arrayComputers) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Computer computer : arrayComputers) {
                printWriter.println(computer.getCode() + "," + computer.getName() + "," + computer.getManufacturer() + "," +
                        computer.getSystemConfig() + "," + computer.getPrice() + "," + computer.isState());
            }
            printWriter.close();
        } catch (IOException ex) {
            System.out.println("Error writing to file '" + fileName + "': " + ex.getMessage());
        }
    }

    // đọc và trả về danh sách máy tính trong file
    public Computer[] getAllComputersFromFile(String fileName) {
        Computer[] arrayComputers = new Computer[0];
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] s = line.split(",");
                Computer computer = new Computer(s[0], s[1], s[2], s[3], Double.parseDouble(s[4]), Boolean.parseBoolean(s[5]));
                addComputerToArray(arrayComputers, computer);
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        }
        return arrayComputers;
    }
}

