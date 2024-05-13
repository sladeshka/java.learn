package lesson12.factory;

public class PdfConverterFactory implements DocumentConverterFactory{
    @Override
    public DocumentConverter createConverter() {
        return new PdfConverter();
    }
}
