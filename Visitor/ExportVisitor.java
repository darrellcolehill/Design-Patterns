package Visitor;

public class ExportVisitor {
    public void doOnExcel(ExcelFormat file) {
        System.out.println("Exporting excel");
    }

    public void doOnPdf(PdfFormat file) {
        System.out.println("Exporting pdf");
    }

    public void doOnWord(WordFormat file) {
        System.out.println("Exporting words");
    }
}
