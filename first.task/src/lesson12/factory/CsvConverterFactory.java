package lesson12.factory;

public class CsvConverterFactory implements DocumentConverterFactory{
    @Override
    public DocumentConverter createConverter() {
        return new CsvConverter();
    }
}
