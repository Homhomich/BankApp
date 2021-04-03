package com.example.vsucs.services.impl;

import com.example.vsucs.entities.Document;
import com.example.vsucs.repositories.DocumentRepository;
import com.example.vsucs.services.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService {
    private DocumentRepository documentRepository;

    @Autowired
    public DocumentServiceImpl(DocumentRepository documentRepository){
        this.documentRepository = documentRepository;
    }

    @Override
    public Document createDocument(Document document) {
        return documentRepository.saveAndFlush(document);
    }

    @Override
    public void deleteDocument(long id) {
        documentRepository.deleteById(id);
    }

    @Override
    public Document updateDocument(Document document) {
        return documentRepository.saveAndFlush(document);
    }

    @Override
    public Optional<Document> getDocumentById(long id) {
        return documentRepository.findById(id);
    }

    @Override
    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }
}
