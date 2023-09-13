
import java.io.FileReader;
import java.io.IOException;
public class FileReaderExample7 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng FileReader
        try {
            FileReader fileReader = new FileReader("path/to/file.txt");
            // Sử dụng fileReader để đọc dữ liệu từ tệp tin
            // ...
            // Đóng fileReader khi không còn sử dụng
            fileReader.close();
        } catch (IOException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }
}
