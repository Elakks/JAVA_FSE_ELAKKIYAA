package com.example.factory;

import com.example.documents.Document;
import com.example.documents.ExcelDocumentImpl;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocumentImpl();
    }
}
