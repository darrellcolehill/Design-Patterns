package Visitor;

public class PdfFormat implements IOutputFormat {

    @Override
    public void accept(ExportVisitor Visitor) {
        Visitor.doOnPdf(this);
    }
    
}
