import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteDataToATextFile {
    public static void main(String[] args) {
        String filename = "example.txt"; // tên file để đọc và ghi
        String data = "Hello, world! This is an example for file read and write."; // dữ liệu để ghi vào file

        // Ghi dữ liệu vào file
        if (writeToFile(filename, data)) {
            System.out.println("Ghi file thành công.");
        } else {
            System.out.println("Ghi file không thành công.");
        }

        // Đọc dữ liệu từ file
        String content = readFromFile(filename);
        if (content != null) {
            System.out.println("Đọc file thành công, dữ liệu: " + content);
        } else {
            System.out.println("Đọc file không thành công.");
        }

    }

    // Phương thức ghi dữ liệu vào file
    public static boolean writeToFile(String filename, String data) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(data);
            writer.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức đọc dữ liệu từ file
    public static String readFromFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            int character;
            String content = "";
            while ((character = reader.read()) != -1) {
                content += (char) character;
            }
            reader.close();
            return content;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
