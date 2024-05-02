package lesson10;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/text.txt");
        File file1 = new File("files/text1.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        InputStream ioS = null;
        OutputStream ouS = null;

        try {
            ioS = new FileInputStream(file);
            ouS = new FileOutputStream(file1);
            while (ioS.available() > 0) {
                ouS.write(ioS.read());
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (ioS != null) {
                    ioS.close();
                }
                if (ouS != null) {
                    ouS.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
        writeData(List.of("Java", "Ok"), file, "files/text1.txt");

        Path path = Paths.get("files");
        File[] files = path.toFile().listFiles();

        if (files != null) {
            for (File fileTemp : files) {
                System.out.println(fileTemp.getName());
            }
        }

        double totalSpace = path.toFile().getTotalSpace() / 1000_000_000.0;
        String totalSpaceF = new DecimalFormat("#.##").format(totalSpace);
        System.out.println(totalSpaceF + "GB");

        double freeSpace = path.toFile().getFreeSpace() / 1000_000_000.0;
        String freeSpaceF = new DecimalFormat("#.##").format(freeSpace);
        System.out.println(freeSpaceF + "GB");
    }

    public static void writeData(List<String> strings, File file, String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            String input = null;
            while (reader.readLine() != null) {
//                writer.write(reader.readLine());
//                for (String string : reader.readLine()) {
//                    writer.write(string);
//                }
            }
        } catch (IOException ignored) {

        }
    }
}
