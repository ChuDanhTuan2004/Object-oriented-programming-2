import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample8 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("path/to/file.txt");
            int character;
            while ((character = fileReader.read()) != -1) {
                // Xử lý ký tự đã đọc
                System.out.print((char) character);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
