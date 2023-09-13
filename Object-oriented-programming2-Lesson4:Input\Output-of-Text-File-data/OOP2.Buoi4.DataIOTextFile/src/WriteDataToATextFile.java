import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataToATextFile {
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
            Scanner fileScanner = new Scanner(file);
            System.out.println("Nội dung của tệp tin:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}


/**Mô tả các bước thực hiện trong chương trình:

 Yêu cầu người dùng nhập tên tệp tin cần ghi nội dung.

 Tạo đối tượng `File` từ tên tệp tin vừa nhập.

 Sử dụng lớp `FileWriter` để ghi nội dung vào tệp tin. Sử dụng vòng lặp để cho phép người dùng nhập và ghi nhiều dòng nội dung cho tới khi nhập từ khóa `exit`. Mỗi dòng nội dung người dùng nhập vào sẽ được ghi vào tệp tin và kết thúc bằng ký tự xuống dòng `"\n"`. Sau khi kết thúc vòng lặp, đóng `FileWriter`.

 Nếu việc ghi nội dung vào tệp tin thành công, hiển thị thông báo "Đã ghi nội dung vào tệp tin."

 Sử dụng lớp `Scanner` để đọc nội dung của tệp tin đã ghi. Mở tệp tin và đọc từng dòng nội dung bằng cách sử dụng vòng lặp `while` kiểm tra phương thức `hasNextLine()` của đối tượng `Scanner`.

 Hiển thị nội dung của tệp tin ra màn hình. Sau khi hoàn thành việc đọc nội dung, đóng đối tượng `Scanner`.

 Lưu ý: Trong ví dụ này, chương trình chỉ hỗ trợ việc nhập và ghi các dòng văn bản. Để hỗ trợ ghi các loại dữ liệu khác như số hoặc đối tượng, cần sử dụng định dạng hợp lệ cho từng loại dữ liệu và các phương thức khác của lớp `FileWriter`.**/