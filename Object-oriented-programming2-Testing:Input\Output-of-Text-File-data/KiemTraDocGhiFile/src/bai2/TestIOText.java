package bai2;

import java.io.*;

public class TestIOText {

    public static void main(String[] args) {
        String fileName = "list_song.txt";
        String[] arraySong = {"Hello california", "We don't talk any more", "Nắng ấm xa dần", "Em của ngày hôm qua", "Thất tình"};

        writeDataToFileWithFileWriter(fileName, arraySong);
        System.out.println("Viet du lieu vao file bang FileWriter thanh cong!");

        String dataFromFile1 = readDataFromFileWithFileReader(fileName);
        System.out.println("Doc du lieu tu file bang FileReader:");
        System.out.println(dataFromFile1);

        writeDataToFileWithBufferedWriter(fileName, arraySong);
        System.out.println("Viet du lieu vao file bang BufferedWriter thanh cong!");

        String dataFromFile2 = readDataFromFileWithBufferedReader(fileName);
        System.out.println("Doc du lieu tu file bang BufferedReader:");
        System.out.println(dataFromFile2);
    }

    public static void writeDataToFileWithFileWriter(String fileName, String[] data) {
        try {
            FileWriter fw = new FileWriter(fileName);
            for (String s : data) {
                fw.write(s + "\n");
            }
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String readDataFromFileWithFileReader(String fileName) {
        StringBuilder data = new StringBuilder();
        try {
            FileReader fr = new FileReader(fileName);
            int character;
            while ((character = fr.read()) != -1) {
                data.append((char) character);
            }
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return data.toString();
    }

    public static void writeDataToFileWithBufferedWriter(String fileName, String[] data) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            for (String s : data) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static String readDataFromFileWithBufferedReader(String fileName){
        StringBuilder data = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine())!= null){
                data.append(line);
                data.append("\n");
            }

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return data.toString();
    }
}

