public class LegacyPrinterAdapter implements Printer {
    private final LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String text) {
        legacyPrinter.printText(text);
    }
}
