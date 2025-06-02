public class Main {
    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer printer = new LegacyPrinterAdapter(legacyPrinter);

        printer.print("Hello, World!");
    }
}
