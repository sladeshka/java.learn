package lab10;

import java.util.List;
import java.util.Scanner;

public class lab10 {
    public static void main(String[] args) {
        // first task
        List<String> lines = FileHandler.read("files/text2.txt");
        for (String line: lines) {
            System.out.println(line);
        }
        // second task
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to be inserted into the file: ");
        String text = scanner.nextLine();
        FileHandler.write("files/text2.txt", text);
        // third task
        FileHandler.merge("files/text.txt", "files/text1.txt", "files/text2.txt");
        // fourth task
        FileHandler.replaceNotTextAndNotNumbersTo$("files/text.txt");
    }
}
