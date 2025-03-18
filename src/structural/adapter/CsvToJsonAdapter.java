package structural.adapter;

public class CsvToJsonAdapter implements JsonData {
    private CsvData csvData;

    public CsvToJsonAdapter(CsvData csvData) {
        this.csvData = csvData;
    }

    @Override
    public void displayJson() {
        System.out.println("Конвертуємо...");
        csvData.displayCsv();
        System.out.println("Дані у форматі JSON: {\"name\": \"John\", \"age\": 30, \"city\": \"Kyiv\"}");
    }
}
