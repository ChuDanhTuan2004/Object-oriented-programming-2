import java.io.File;

public class UsingTheFileClass {
    public static void main(String[] args) {
        String fileName = "example.txt"; // tên file cần tạo
        File file = new File(fileName); // tạo đối tượng File

        if (file.exists()) { // Kiểm tra xem file đã tồn tại hay chưa?
            System.out.println("File đã tồn tại.");
        } else {
            try {
                file.createNewFile(); // Tạo file mới
                System.out.println("File đã được tạo mới.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (file.isDirectory()) { // Kiểm tra xem file có phải là thư mục hay không?
            System.out.println("File là thư mục.");
        } else {
            System.out.println("File không phải là thư mục.");
        }

        System.out.println("Đường dẫn của file: " + file.getAbsolutePath()); // Hiển thị đường dẫn
    }
}
