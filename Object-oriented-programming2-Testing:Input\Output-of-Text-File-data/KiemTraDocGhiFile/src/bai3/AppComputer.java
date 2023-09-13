package bai3;

import java.util.ArrayList;

public class AppComputer {

    public static void main(String[] args) {
        String fileName = "database.txt";
        Computer[] computerList = new Computer[0];

        Computer c1 = new Computer("001", "Laptop 1", "Dell", "Intel Core i5", 1000, true);
        Computer c2 = new Computer("002", "Laptop 2", "HP", "Intel Core i3", 700, false);
        Computer c3 = new Computer("003", "Desktop 1", "Acer", "Intel Core i7", 1500, true);
        Computer c4 = new Computer("004", "Desktop 2", "Lenovo", "Intel Core i5", 1200, false);
        Computer c5 = new Computer("005", "PC Gaming", "Asus", "Intel Core i9", 3000, true);

        c1.addComputerToFile(fileName, c1);
        c2.addComputerToFile(fileName, c2);
        c3.addComputerToFile(fileName, c3);
        c4.addComputerToFile(fileName, c4);
        c5.addComputerToFile(fileName, c5);

        System.out.println("Du lieu doc duoc tu file:");
        String dataFromFile = c1.getDataFromFile(fileName);
        System.out.println(dataFromFile);

        c1.addComputerToArray(computerList, c1);
        c1.addComputerToArray(computerList, c2);
        c1.addComputerToArray(computerList, c3);
        c1.addComputerToArray(computerList, c4);


        // Lưu mảng đối tượng máy tính vào file database.txt
        c1.addComputersToFile(fileName,computerList);

        // Hiển thị tất cả thông tin của file database.txt
        Computer[] allComputer = new Computer().getAllComputersFromFile(fileName);
        for (Computer computer : allComputer) {
            System.out.println(computer.toString());
        }

    }
}

