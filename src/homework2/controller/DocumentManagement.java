package homework2.controller;

import homework2.model.action.Action;
import homework2.model.document.*;
import homework2.view.DocumentManagementView;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class DocumentManagement {
    public static ArrayList<Document> documents = new ArrayList<Document>();

    public static void addDocument() {
        while (true) {
            Optional<Document> document = DocumentManagementView.getDocument();
            if (document.isPresent()) {
                documents.add(document.get());
                break;
            }
        }
    }

    public static void removeDocument() {
        int id = DocumentManagementView.getId();
        documents.forEach(document -> {
            if (document.getId() == id) documents.remove(document);
        });
    }

    public static Optional<Document> getDocument() {
        int id = DocumentManagementView.getId();
        AtomicReference<Optional<Document>> searchedDocument = new AtomicReference<>(Optional.empty());
        documents.forEach(document -> {
            if (document.getId() == id) searchedDocument.set(Optional.of(document));
        });
        return searchedDocument.get();
    }

    public static Optional<ArrayList<Document>> getDocumentByType() {
        DocumentType documentType = DocumentManagementView.getDocumentType();
        switch (documentType) {
            case REPORT -> {
                return Optional.of((ArrayList<Document>) documents.stream().filter(document -> {
                    return document.getClass().equals(Report.class);
                }).collect(Collectors.toList()));
            }
            case MAGAZINE -> {
                return Optional.of((ArrayList<Document>) documents.stream().filter(document -> {
                    return document.getClass().equals(Magazine.class);
                }).collect(Collectors.toList()));
            }
            case BOOK -> {
                return Optional.of((ArrayList<Document>) documents.stream().filter(document -> {
                    return document.getClass().equals(Book.class);
                }).collect(Collectors.toList()));
            }
            default -> {
                return Optional.empty();
            }
        }
    }

    public static void run() {
        boolean isRunning = true;
        while (isRunning) {
            Action action = DocumentManagementView.getAction();
            switch (action) {
                case EXIT -> {
                    isRunning = false;
                    break;
                }
                case GET_DOCUMENT_INFORMATION -> {
                    Optional<Document> document = getDocument();
                }
                case REMOVE_DOCUMENT -> {
                    removeDocument();
                }
                case ADD_DOCUMENT -> {
                    addDocument();
                }
                case GET_DOCUMENTS_BY_TYPE -> {
                    Optional<ArrayList<Document>> documentType = getDocumentByType();
                }
            }
        }
    }
}
