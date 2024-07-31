package com.example.test;

import com.example.documents.Document;
import com.example.factory.DocumentFactory;
import com.example.factory.WordDocumentFactory;
import com.example.factory.PdfDocumentFactory;
import com.example.factory.ExcelDocumentFactory;

public class DocumentTest {
    public static void main(String[] args) {
        // Word document factory
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        // PDF document factory
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();

        // Excel document factory
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }
}
