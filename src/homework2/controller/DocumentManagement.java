package homework2.controller;

import homework2.model.document.Document;
import homework2.model.document.DocumentType;
import homework2.view.DocumentManagementView;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class DocumentManagement {
    public static ArrayList<Document> documents = new ArrayList<Document>();

    public static void addDocument() {
        Document document = DocumentManagementView.getDocument();
        documents.add(document);
    }

    public static void removeDocument(String id) {
        documents.forEach(document -> {
            if (document.hashCode() == id.hashCode()) documents.remove(document);
        });
    }

    public static Optional<Document> getDocument(String id) {
        AtomicReference<Optional<Document>> searchedDocument = new AtomicReference<>(Optional.empty());
        documents.forEach(document -> {
            if (document.hashCode() == id.hashCode()) searchedDocument.set(Optional.of(document));
        });
        return searchedDocument.get();
    }

    public static ArrayList<Document> getDocumentByType(DocumentType documentType) {
        Set<Document> searchedDocuments = new HashSet<Document>();
        documents.forEach(document -> {
            if (document.getDocumentType() == documentType) searchedDocuments.add(document);
        });
        return searchedDocuments;
    }
}
