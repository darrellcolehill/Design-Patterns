package Visitor;

public class WordFormat implements IOutputFormat{

    @Override
    public void accept(ExportVisitor Visitor) {
        Visitor.doOnWord(this);
    }
    
}
