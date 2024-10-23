import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyUtil {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Напишите: java FileCopyUtil <название исходного файла> " +
                    "<название создаваемого файла>");
            return;
        }
        String originalFileName = args[0];
        String finalFileName = args[1];

        long startTime = System.currentTimeMillis();

        try (InputStream inputStream = new FileInputStream(originalFileName);
                OutputStream outputStream = new FileOutputStream(finalFileName)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            long endTime = System.currentTimeMillis();

            System.out.println("Файл скопирован успешно. Время: " + (endTime - startTime));
        } catch (IOException e) {
            System.out.println("Ошибка при копировании файла: " + e.getMessage());
        }
    }
}