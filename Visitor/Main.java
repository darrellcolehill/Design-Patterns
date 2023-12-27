package Visitor;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<IOutputFormat> documents = new ArrayList<IOutputFormat>(3);

        PdfFormat pdf = new PdfFormat();
        WordFormat word = new WordFormat();
        ExcelFormat excel = new ExcelFormat();

        documents.add(pdf);
        documents.add(word);
        documents.add(excel);
        
        ExportVisitor visitor = new ExportVisitor();

        for(int i = 0; i < documents.size(); i++) {
            documents.get(i).accept(visitor);
        }
    }
}
