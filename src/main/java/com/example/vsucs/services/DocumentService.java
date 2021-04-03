package com.example.vsucs.services;

import com.example.vsucs.entities.Document;

import java.util.List;

public interface DocumentService {
    Document createDocument(Document document);
    void deleteDocument(long id);
    Document updateDocument(Document document);
    Document getDocumentById(long id);
    List<Document> getAllDocuments ();
}
