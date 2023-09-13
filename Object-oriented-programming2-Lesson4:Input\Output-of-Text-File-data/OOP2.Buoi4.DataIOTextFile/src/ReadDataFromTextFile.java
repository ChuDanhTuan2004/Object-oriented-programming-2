import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ReadDataFromTextFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên tệp tin: ");
        String filename = scanner.nextLine();
        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            System.out.println("Nhập nội dung vào tệp tin (nhập 'exit' để thoát):");
            String input = scanner.nextLine();
            while (!input.equals("exit")) {
                writer.write(input + "\n");
                input = scanner.nextLine();
            }
            writer.close();
            System.out.println("Đã ghi nội dung vào tệp tin.");
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
        try {
            FileReader reader = new FileReader(file);
            System.out.println("Nội dung của tệp tin:");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}

/**Mô tả các bước thực hiện trong chương trình:

 Yêu cầu người dùng nhập tên của tệp tin.

 Tạo đối tượng `File` từ tên tệp tin vừa nhập.

 Sử dụng lớp `FileWriter` để ghi nội dung vào tệp tin. Sử dụng vòng lặp để cho phép người dùng nhập và ghi nhiều dòng nội dung cho tới khi nhập từ khóa `exit`. Mỗi dòng nội dung người dùng nhập vào sẽ được ghi vào tệp tin và kết thúc bằng ký tự xuống dòng `"\n"`. Sau khi kết thúc vòng lặp, đóng `FileWriter`.

 Nếu việc ghi nội dung vào tệp tin thành công, hiển thị thông báo "Đã ghi nội dung vào tệp tin."

 Sử dụng lớp `FileReader` để đọc nội dung của tệp tin đã ghi. Đọc từng ký tự bằng cách sử dụng vòng lặp `while` và phương thức `read()` của đối tượng `FileReader`. Khi đọc đến cuối tệp tin (EOF), giá trị trả về sẽ là -1. Sử dụng đối tượng `Reader` để đọc từ tệp tin và hiển thị nội dung tệp tin lên màn hình.

 Sau khi hoàn thành việc đọc nội dung, đóng đối tượng `FileReader`.**/