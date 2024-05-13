package lesson12.factory;

public class DocxConverter implements DocumentConverter{
    @Override
    public void convertFile() {
        System.out.println("Converting to docx...");
    }
}
