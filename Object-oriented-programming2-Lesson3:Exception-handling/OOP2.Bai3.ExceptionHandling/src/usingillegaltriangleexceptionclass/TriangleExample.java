package usingillegaltriangleexceptionclass;
import java.util.Scanner;

public class TriangleExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập vào độ dài 3 cạnh
            System.out.print("Nhập độ dài cạnh 1: ");
            double side1 = scanner.nextDouble();

            System.out.print("Nhập độ dài cạnh 2: ");
            double side2 = scanner.nextDouble();

            System.out.print("Nhập độ dài cạnh 3: ");
            double side3 = scanner.nextDouble();

            // Kiểm tra tính hợp lệ của tam giác
            if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                throw new IllegalTriangleException("Độ dài cạnh không được âm.");
            }

            if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                throw new IllegalTriangleException("Tổng 2 cạnh không lớn hơn cạnh còn lại.");
            }

            // In kết quả
            System.out.println("Độ dài 3 cạnh của tam giác: " + side1 + ", " + side2 + ", " + side3);
            System.out.println("Đây là một tam giác hợp lệ.");
        } catch (IllegalTriangleException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
