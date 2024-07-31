package com.example.factory;

import com.example.documents.Document;
import com.example.documents.WordDocumentImpl;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocumentImpl();
    }
}
