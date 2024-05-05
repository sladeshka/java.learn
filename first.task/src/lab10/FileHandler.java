package lab10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileHandler {
    public static List<String> read(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return lines;
    }
    public static void write(String filePath, String text) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedWriter.write(text);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void merge(String filePath1, String filePath2, String mergedFilePath) {
        List<String> Lines1 = read(filePath1);
        List<String> lines2 = read(filePath2);
        Lines1.addAll(lines2);
        StringBuilder mergedContent = new StringBuilder();
        for (String line : Lines1) {
            mergedContent.append(line).append("\n");
        }
        write(mergedFilePath, mergedContent.toString());
    }
    public static void replaceNotTextAndNotNumbersTo$(String filePath) {
        List<String> lines = read(filePath);
        StringBuilder modifiedContent = new StringBuilder();
        for (String line : lines) {
            String modifiedLine = line.replaceAll("[^a-zA-Z0-9]", "\\$");
            modifiedContent.append(modifiedLine).append("\n");
        }
        write(filePath, modifiedContent.toString());
    }
}
