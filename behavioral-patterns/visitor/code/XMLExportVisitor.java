public class XMLExportVisitor implements Visitor {
    @Override
    public void visitCompoundShape(CompoundShape cs) {
        System.out.println("Eksportowanie do formatu XML...\nWyeksportowano.");
    }
}