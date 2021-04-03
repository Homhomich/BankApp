package com.example.vsucs.services;

import com.example.vsucs.entities.Document;

import java.util.List;
import java.util.Optional;

public interface DocumentService {
    Document createDocument(Document document);
    void deleteDocument(long id);
    Document updateDocument(Document document);
    Optional<Document> getDocumentById(long id);
    List<Document> getAllDocuments ();
}
