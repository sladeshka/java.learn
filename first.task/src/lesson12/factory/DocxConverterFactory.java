package lesson12.factory;

public class DocxConverterFactory implements DocumentConverterFactory{
    @Override
    public DocumentConverter createConverter() {
        return new DocxConverter();
    }
}
