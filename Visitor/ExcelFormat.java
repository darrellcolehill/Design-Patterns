package Visitor;

public class ExcelFormat implements IOutputFormat {

    @Override
    public void accept(ExportVisitor Visitor) {
        Visitor.doOnExcel(this);
    }
    
}
