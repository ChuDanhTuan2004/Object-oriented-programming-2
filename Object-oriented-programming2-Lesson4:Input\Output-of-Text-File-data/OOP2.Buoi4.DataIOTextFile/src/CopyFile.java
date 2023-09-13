import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        String sourceFile = "so1";
        String targetFile = "so2";

        // Kiểm tra file nguồn có tồn tại không
        File inputFile = new File(sourceFile);
        if (!inputFile.exists()) {
            System.err.println("Input file does not exist!");
            return;
        }

        // Kiểm tra file đích có tồn tại không
        File outputFile = new File(targetFile);
        if (outputFile.exists()) {
            System.err.println("Output file already exists!");
            return;
        }

        try (Reader reader = new FileReader(inputFile);
             Writer writer = new FileWriter(outputFile)) {

            int character;
            int charCount = 0;

            // Đọc ký tự một cách tuần tự từ file nguồn
            // và ghi vào file đích
            while ((character = reader.read()) != -1) {
                writer.write(character);
                charCount++;
            }

            // In ra số ký tự đã sao chép thành công
            System.out.println("Copied " + charCount + " characters from " + sourceFile + " to " + targetFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
