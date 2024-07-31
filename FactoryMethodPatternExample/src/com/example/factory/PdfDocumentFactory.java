package com.example.factory;

import com.example.documents.Document;
import com.example.documents.PdfDocumentImpl;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocumentImpl();
    }
}
